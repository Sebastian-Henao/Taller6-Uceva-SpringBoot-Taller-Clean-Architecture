# Backend Spring Boot con Clean Architecture

Backend REST construido con Spring Boot y organizado en capas de dominio,
aplicación e infraestructura. Incluye módulos para usuarios, productos,
personajes, junglers de League of Legends y canciones.

## Requisitos

- JDK 22

## Ejecución

Desde la raíz del repositorio:

```powershell
.\gradlew.bat bootRun
```

Ejecutar las pruebas:

```powershell
.\gradlew.bat test
```

## Documentación OpenAPI

Con la aplicación en ejecución:

- Swagger UI: <http://localhost:8080/api/swagger-ui/index.html>
- Especificación OpenAPI: <http://localhost:8080/api/v3/api-docs>

## Endpoints

Las rutas usan el prefijo `/api`.

| Método | Ruta | Descripción |
| --- | --- | --- |
| `GET` | `/api/users/{countUsers}` | Genera la cantidad indicada de usuarios |
| `GET` | `/api/products/{countProducts}` | Genera la cantidad indicada de productos |
| `GET` | `/api/personajes/{countPersonajes}` | Genera la cantidad indicada de personajes |
| `GET` | `/api/junglers/{countJunglers}` | Genera la cantidad indicada de campeones junglers |
| `GET` | `/api/songs` | Lista las canciones |
| `GET` | `/api/songs/{id}` | Consulta una canción por ID |
| `POST` | `/api/songs` | Crea una canción (`201 Created`) |
| `PUT` | `/api/songs/{id}` | Actualiza una canción |
| `DELETE` | `/api/songs/{id}` | Elimina una canción (`204 No Content`) |

Los datos de canciones se almacenan en memoria y se reinician al detener la
aplicación. `artistId` y `albumId` deben ser enteros positivos; la API no
verifica su existencia en otros módulos.

Ejemplo de cuerpo para crear o actualizar una canción:

```json
{
  "title": "Numb",
  "durationSeconds": 185,
  "genre": "Rock",
  "artistId": 1,
  "albumId": 2
}
```

Las solicitudes de canciones inválidas responden `400 Bad Request`; cuando no
existe el ID solicitado, la API responde `404 Not Found`.

## Arquitectura

Cada módulo sigue el patrón Clean Architecture:

- `domain`: entidades y contratos de repositorio.
- `application`: casos de uso.
- `infrastructure`: controladores REST, fuentes de datos y adaptadores de
  repositorio.
- `config`: configuración de dependencias e integración OpenAPI.
