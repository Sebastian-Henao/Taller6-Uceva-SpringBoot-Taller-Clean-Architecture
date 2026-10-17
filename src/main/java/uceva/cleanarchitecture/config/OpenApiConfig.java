package uceva.cleanarchitecture.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración global de Swagger / OpenAPI con Springdoc.
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Client Server Spring Boot - Clean Architecture")
                        .version("1.0.0")
                        .description("Documentación OpenAPI interactiva de los servicios REST de usuarios, productos, personajes, junglers de League of Legends y canciones.")
                        .contact(new Contact().name("UCEVA Software Architecture")));
    }
}
