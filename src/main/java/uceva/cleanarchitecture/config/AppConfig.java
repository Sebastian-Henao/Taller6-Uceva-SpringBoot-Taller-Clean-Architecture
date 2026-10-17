package uceva.cleanarchitecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uceva.cleanarchitecture.application.usecase.CreateSongUseCase;
import uceva.cleanarchitecture.application.usecase.DeleteSongUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllProductsUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllSongsUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllUsersUseCase;
import uceva.cleanarchitecture.application.usecase.GetSongByIdUseCase;
import uceva.cleanarchitecture.application.usecase.UpdateSongUseCase;
import uceva.cleanarchitecture.domain.repository.ProductRepository;
import uceva.cleanarchitecture.domain.repository.SongRepository;
import uceva.cleanarchitecture.domain.repository.UserRepository;
import uceva.cleanarchitecture.infrastructure.datasource.ProductDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.SongDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.UserDatasource;
import uceva.cleanarchitecture.infrastructure.repository.ProductRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.SongRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.UserRepositoryImpl;

@Configuration
public class AppConfig {

    @Bean
    UserDatasource userDatasource(){
        return new UserDatasource();
    }

    @Bean
    ProductDatasource productDatasource(){
        return new ProductDatasource();
    }

    @Bean
    SongDatasource songDatasource() {
        return new SongDatasource();
    }

    @Bean
    UserRepository userRepository(UserDatasource userDatasource) {
        return new UserRepositoryImpl(userDatasource);
    }

    @Bean
    ProductRepository productRepository(ProductDatasource productDatasource) {
        return new ProductRepositoryImpl(productDatasource);
    }

    @Bean
    SongRepository songRepository(SongDatasource songDatasource) {
        return new SongRepositoryImpl(songDatasource);
    }

    @Bean
    GetAllUsersUseCase getAllUsersUseCase(UserRepository userRepository) {
        return new GetAllUsersUseCase(userRepository);
    }

    @Bean
    GetAllProductsUseCase getAllProductsUseCase(ProductRepository productRepository) {
        return new GetAllProductsUseCase(productRepository);
    }

    @Bean
    GetAllSongsUseCase getAllSongsUseCase(SongRepository songRepository) {
        return new GetAllSongsUseCase(songRepository);
    }

    @Bean
    GetSongByIdUseCase getSongByIdUseCase(SongRepository songRepository) {
        return new GetSongByIdUseCase(songRepository);
    }

    @Bean
    CreateSongUseCase createSongUseCase(SongRepository songRepository) {
        return new CreateSongUseCase(songRepository);
    }

    @Bean
    UpdateSongUseCase updateSongUseCase(SongRepository songRepository) {
        return new UpdateSongUseCase(songRepository);
    }

    @Bean
    DeleteSongUseCase deleteSongUseCase(SongRepository songRepository) {
        return new DeleteSongUseCase(songRepository);
    }

}
