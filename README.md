# customer_search
Prueba técnica fullstack desarrollada con Spring Boot y React. Permite consultar clientes por tipo y número de documento, manejando estados de carga, respuestas exitosas y errores desde el backend, aplicando buenas prácticas y arquitectura limpia.

## Tecnologías utilizadas

### Backend
- Java 17
- Spring Boot 3.5.10
- Spring Data JPA
- Hibernate
- Maven
- Base de datos: H2 

### Frontend
- React 19.2.4
- Vite
- JavaScript (ES6+)
- Fetch API
- CSS básico

### Herramientas
- IntelliJ IDEA
- Visual Studio Code
- Git & GitHub


## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java 17 o superior
- Maven 3.8+
- Node.js 18+
- npm o yarn
- Git

- IntelliJ IDEA (para el backend)
- Visual Studio Code (para el frontend)

##  Instrucciones para ejecutar el proyecto

El repositorio contiene dos aplicaciones independientes:
- **/back** → Backend en Spring Boot
- **/front** → Frontend en React

###  Clonar el repositorio


git clone https://github.com/fermumu/customer_search.git
cd customer_search

##  Frontend
* (Visual)
- cd front
- npm install
- npm run dev

##  Backend
* (Intellij IDEA)
- App run

## 🗄 Base de datos preestablecida

El proyecto cuenta con una **base de datos preconfigurada** que se inicializa automáticamente al arrancar la aplicación.  
Esta contiene información de clientes de prueba para facilitar la validación y el uso inmediato del sistema sin necesidad de insertar datos manualmente.

### Clientes disponibles para prueba

| Nombre    | Apellido | ID Cliente | Nacionalidad | Género | Tipo Doc | Nº Documento | Tipo Doc ID |
|----------|----------|------------|--------------|--------|----------|--------------|-------------|
| Hector   | Muñoz    | M-1        | COL-057      | M      | CC       | 1085247127   | CC-25       |
| Laura    | Gomez    | M-2        | COL-057      | F      | CC       | 1023456789   | CC-25       |
| Carlos   | Ramirez  | M-3        | COL-057      | M      | CC       | 1012345678   | CC-25       |
| Andrea  | Lopez    | M-4        | COL-057      | F      | CC       | 1098765432   | CC-25       |
| Juan    | Perez    | M-5        | COL-057      | M      | CC       | 1009876543   | CC-25       |
| Maria   | Castro   | M-6        | COL-057      | F      | CC       | 1034567890   | CC-25       |
| Santiago| Rojas    | M-7        | COL-057      | M      | CC       | 1045678901   | CC-25       |
| Diana   | Morales  | M-8        | COL-057      | F      | CC       | 1056789012   | CC-25       |
| Felipe  | Torres   | M-9        | COL-057      | M      | CC       | 1067890123   | CC-25       |
| Paula   | Vargas   | M-10       | COL-057      | F      | CC       | 1078901234   | CC-25       |

Estos registros se cargan automáticamente al iniciar el backend mediante un `CommandLineRunner`.


##  Decisiones técnicas

- Se utilizó **Spring Boot** en el backend para exponer una API REST sencilla y escalable, aplicando separación de responsabilidades entre controlador, servicio y repositorio.
- El manejo de errores se realiza de forma centralizada, devolviendo respuestas en formato JSON con mensajes claros y códigos de estado apropiados.
- Se implementó **CommandLineRunner** para precargar datos de clientes y facilitar las pruebas locales.
- En el frontend se utilizó **React** por su enfoque basado en componentes y manejo de estado, permitiendo controlar estados de carga, éxito y error.
- El frontend y el backend se mantienen como aplicaciones independientes para facilitar mantenimiento, despliegue y escalabilidad.