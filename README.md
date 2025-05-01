# Star Wars API - Consulta de Películas

Este proyecto permite consultar información sobre las películas de Star Wars utilizando la **SWAPI** (Star Wars API). El programa solicita un número de película (del 1 al 6), obtiene los detalles de la película desde la API, y los guarda en un archivo JSON.

## Estructura del Proyecto

- **Principal**: Clase principal que ejecuta el programa. Solicita al usuario un número de película y muestra la información en consola.
- **ConsultaPelicula**: Realiza la consulta HTTP a la API de SWAPI y devuelve los datos de la película.
- **Pelicula**: Representa los detalles de una película de Star Wars. Es un **record** con los atributos `title`, `episode_id`, `opening_crawl`, `director`, `producer`, `release_date`.
- **GeneradorDeArchivo**: Guarda los datos de la película en un archivo JSON con formato legible.

## Requisitos

- **Java 17 o superior**
- **Gson** (para manejar JSON)
- **Acceso a la API de SWAPI**: [https://swapi.dev/](https://swapi.dev/)

## Instrucciones de Uso

1. **Clonar el Repositorio:**

   ```bash
   git clone <repositorio_url>
