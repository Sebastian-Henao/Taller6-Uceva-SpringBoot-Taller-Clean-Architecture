package uceva.cleanarchitecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UcevaSpringBootTallerCleanArchitectureApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    void songsApiSupportsCrudAndReportsInvalidRequests() throws Exception {
        String songJson = """
                {
                  "title": "Numb",
                  "durationSeconds": 185,
                  "genre": "Rock",
                  "artistId": 1,
                  "albumId": 2
                }
                """;

        mockMvc.perform(post("/songs")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(songJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Numb"));

        mockMvc.perform(get("/songs"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1));

        mockMvc.perform(get("/songs/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Numb"));

        mockMvc.perform(put("/songs/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(songJson.replace("Numb", "In the End")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("In the End"))
                .andExpect(jsonPath("$.id").value(1));

        mockMvc.perform(delete("/songs/1"))
                .andExpect(status().isNoContent());

        mockMvc.perform(get("/songs/1"))
                .andExpect(status().isNotFound());

        mockMvc.perform(put("/songs/999")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(songJson))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$").value("No se encontró una canción con el ID 999"));

        mockMvc.perform(delete("/songs/999"))
                .andExpect(status().isNotFound());

        mockMvc.perform(post("/songs")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(songJson.replace("185", "0")))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$").value("La duración debe ser mayor que cero"));
    }

    @Test
    void openApiDocumentIncludesSongsApi() throws Exception {
        mockMvc.perform(get("/v3/api-docs"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.paths['/songs']").exists())
                .andExpect(jsonPath("$.paths['/songs/{id}']").exists())
                .andExpect(jsonPath("$.paths['/songs'].post.responses['201'].description")
                        .value("Canción creada"))
                .andExpect(jsonPath("$.paths['/songs/{id}'].delete.responses['204'].description")
                        .value("Canción eliminada"));
    }
}
