# Clean Architecture en SpringBoot

```
src/main/java/uceva/cleanarchitecture
│
├── domain
│   ├── entity/
│   │   ├── User.java
│   │   ├── Product.java
│   │   └── Personaje.java
│   │
│   └── repository/
│       ├── UserRepository.java
│       ├── ProductRepository.java
│       └── PersonajeRepository.java
│
├── application
│   └── usecase/
│       ├── GetAllUsersUseCase.java
│       ├── GetAllProductsUseCase.java
│       └── GetAllPersonajesUseCase.java
│
├── infrastructure
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── ProductController.java
│   │   └── PersonajeController.java
│   │
│   ├── repository/
│   │   ├── UserRepositoryImpl.java
│   │   ├── ProductRepositoryImpl.java
│   │   └── PersonajeRepositoryImpl.java
│   │
│   └── datasource/
│       ├── UserDatasource.java
│       ├── ProductDatasource.java
│       └── PersonajeDatasource.java
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
└── Personaje.java
```

## Paso 2 - Crear Repositorios

```
src/main/java/uceva/cleanarchitecture/domain/repository/
├── UserRepository.java
├── ProductRepository.java
└── PersonajeRepository.java
```

## Paso 3 - Crear Casos de Uso

```
src/main/java/uceva/cleanarchitecture/application/usecase/
├── GetAllUsersUseCase.java
├── GetAllProductsUseCase.java
└── GetAllPersonajesUseCase.java
```

## Paso 4 - Crear Controllers


```
src/main/java/uceva/cleanarchitecture/infrastructure/controller/
├── UserController.java
├── ProductController.java
└── PersonajeController.java
```

## Paso 5 - Crear Repositorios Implementadores

```
src/main/java/uceva/cleanarchitecture/infrastructure/repository/
├── UserRepositoryImpl.java
├── ProductRepositoryImpl.java
└── PersonajeRepositoryImpl.java
```

## Paso 6 - Agregar la Inyección de Dependencias

```
src/main/java/uceva/cleanarchitecture/config/
└── AppConfig.java
```

# Funcionamiento del Backend

## Urls Consumo
```
http://localhost:3000/api/swagger-ui/index.html
http://localhost:8080/api/users/{countUsers}
http://localhost:8080/api/products/{countProducts}
http://localhost:8080/api/personajes/{countPersonajes}
```
# Clean Architecture en SpringBoot

```
src/main/java/uceva/cleanarchitecture
│
├── domain
│   ├── entity/
│   │   ├── User.java
│   │   └── Product.java
│   │
│   └── repository/
│       ├── UserRepository.java
│       └── ProductRepository.java
│
├── application
│   └── usecase/
│       ├── GetAllUsersUseCase.java
│       └── GetAllProductsUseCase.java
│
├── infrastructure
│   ├── controller/
│   │   ├── UserController.java
│   │   └── ProductController.java
│   │
│   ├── repository/
│   │   ├── UserRepositoryImpl.java
│   │   └── ProductRepositoryImpl.java
│   │
│   └── datasource/
│       ├── UserDatasource.java
│       └── ProductDatasource.java
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
└── Product.java
```

## Paso 2 - Crear Repositorios

```
src/main/java/uceva/cleanarchitecture/domain/repositories/
├── UserRepository.java
└── ProductRepository.java
```

## Paso 3 - Crear Casos de Uso

```
src/main/java/uceva/cleanarchitecture/application/usecase/
├── GetAllUsersUseCase.java
└── GetAllProductsUseCase.java
```

## Paso 4 - Crear Controllers


```
src/main/java/uceva/cleanarchitecture/infrastructure/controllers/
├── UserController.java
└── ProductController.java
```

## Paso 5 - Crear Repositorios Implementadores

```
src/main/java/uceva/cleanarchitecture/infrastructure/repository/
├── UserRepositoryImpl.java
└── ProductRepositoryImpl.java
```

## Paso 6 - Agregar la Inyección de Dependencias

```
src/main/java/uceva/cleanarchitecture/config/
└── AppConfig.java
```

# Funcionamiento del Backend

## Ejecutar Backend
```bash
./gradlew bootRun
```

## Urls Consumo
```
http://localhost:8080/api/swagger-ui/index.html
http://localhost:8080/api/users/{countUsers}
http://localhost:8080/api/products/{countProducts}
http://localhost:8080/api/junglers/{countJunglers}
```

## Módulo: Junglers (League of Legends)
Módulo implementado con Clean Architecture y Spring Boot que expone información de los 20 campeones emblemáticos de la jungla de League of Legends con datos en memoria.

- **Entidad de Dominio:** `uceva.cleanarchitecture.domain.entity.Jungler`
- **Contrato del Repositorio:** `uceva.cleanarchitecture.domain.repository.JunglerRepository`
- **Caso de Uso:** `uceva.cleanarchitecture.application.usecase.GetAllJunglersUseCase`
- **Datasource en Memoria:** `uceva.cleanarchitecture.infrastructure.datasource.JunglerDatasource`
- **Implementación del Repositorio:** `uceva.cleanarchitecture.infrastructure.repository.JunglerRepositoryImpl`
- **Controlador REST:** `uceva.cleanarchitecture.infrastructure.controller.JunglerController`
- **Configuración de Dependencias:** `uceva.cleanarchitecture.config.AppConfig`
- **Configuración OpenAPI / Swagger:** `uceva.cleanarchitecture.config.OpenApiConfig`
