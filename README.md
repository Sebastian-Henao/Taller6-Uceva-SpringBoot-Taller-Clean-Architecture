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