# Clean Architecture en SpringBoot

```
src/main/java/uceva/cleanarchitecture
│
├── domain
│   ├── entity/
│   │   ├── User.java
│   │   ├── Product.java
│   │   └── Song.java
│   │
│   └── repository/
│       ├── UserRepository.java
│       ├── ProductRepository.java
│       └── SongRepository.java
│
├── application
│   └── usecase/
│       ├── GetAllUsersUseCase.java
│       ├── GetAllProductsUseCase.java
│       ├── GetAllSongsUseCase.java
│       ├── GetSongByIdUseCase.java
│       ├── CreateSongUseCase.java
│       ├── UpdateSongUseCase.java
│       └── DeleteSongUseCase.java
│
├── infrastructure
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── ProductController.java
│   │   └── SongController.java
│   │
│   ├── repository/
│   │   ├── UserRepositoryImpl.java
│   │   ├── ProductRepositoryImpl.java
│   │   └── SongRepositoryImpl.java
│   │
│   └── datasource/
│       ├── UserDatasource.java
│       ├── ProductDatasource.java
│       └── SongDatasource.java
│
├── config
│   └── AppConfig.java
│
└── UcevaSprinBootTallerCleanArchitectureApplication.java
```


## Paso 1 - Crear Entidades

```
src/main/java/uceva/cleanarchitecture/domain/entity
├── User.java
├── Product.java
└── Song.java
```

## Paso 2 - Crear Repositorios

```
src/main/java/uceva/cleanarchitecture/domain/repository/
├── UserRepository.java
├── ProductRepository.java
└── SongRepository.java
```

## Paso 3 - Crear Casos de Uso

```
src/main/java/uceva/cleanarchitecture/application/usecase/
├── GetAllUsersUseCase.java
├── GetAllProductsUseCase.java
├── GetAllSongsUseCase.java
├── GetSongByIdUseCase.java
├── CreateSongUseCase.java
├── UpdateSongUseCase.java
└── DeleteSongUseCase.java
```

## Paso 4 - Crear Controllers


```
src/main/java/uceva/cleanarchitecture/infrastructure/controller/
├── UserController.java
├── ProductController.java
└── SongController.java
```

## Paso 5 - Crear Repositorios Implementadores

```
src/main/java/uceva/cleanarchitecture/infrastructure/repository/
├── UserRepositoryImpl.java
├── ProductRepositoryImpl.java
└── SongRepositoryImpl.java
```

## Paso 6 - Agregar la Inyección de Dependencias

```
src/main/java/uceva/cleanarchitecture/config/
└── AppConfig.java
```

# Funcionamiento del Backend

## Ejecución

Requisitos: JDK 25. Desde la raíz del proyecto:

```powershell
.\gradlew.bat bootRun
```

Para ejecutar las pruebas:

```powershell
.\gradlew.bat test
```

## Módulo de canciones

La API está disponible bajo el contexto `/api` y permite crear, consultar,
actualizar y eliminar canciones. Los datos se almacenan en memoria y se
reinician al detener la aplicación. `artistId` y `albumId` deben ser enteros
positivos; la API no verifica su existencia en otros módulos.

| Método | Ruta | Descripción |
| --- | --- | --- |
| `GET` | `/api/songs` | Listar canciones |
| `GET` | `/api/songs/{id}` | Consultar una canción |
| `POST` | `/api/songs` | Crear una canción (`201 Created`) |
| `PUT` | `/api/songs/{id}` | Actualizar una canción |
| `DELETE` | `/api/songs/{id}` | Eliminar una canción (`204 No Content`) |

Ejemplo de cuerpo para crear o actualizar:

```json
{
  "title": "Numb",
  "durationSeconds": 185,
  "genre": "Rock",
  "artistId": 1,
  "albumId": 2
}
```

Swagger UI y el documento OpenAPI están disponibles en:

```text
http://localhost:8080/api/swagger-ui/index.html
http://localhost:8080/api/v3/api-docs
```

Los endpoints existentes también están disponibles en `/api/users/{countUsers}`
y `/api/products/{countProducts}`.