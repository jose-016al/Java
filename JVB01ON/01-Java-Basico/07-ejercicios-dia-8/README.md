### Ejercicio Nº 1 - JDBC - Individual

Crear una aplicación para **gestionar una lista de estudiantes** en una **base de datos**. Los estudiantes tendrán atributos como id, nombre, edad y calificación.

- El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos y mostrar su información.
    
- Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas coincidan con los atributos de la clase estudiante.
    
- Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.
    
---

### Ejercicio Nº 2 - JPA - Individual

Un restaurante necesita un programa para almacenar en una base de datos sus diferentes **platillos** del menú. De cada uno de estos se almacena: id, nombre, receta, precio.

Sabiendo esto:

- Crear una base de datos llamada **restaurante**. Dejarla completamente vacía.
    
- Realizar las configuraciones necesarias para implementar JPA en el proyecto. Esto incluye:
    
    - Mapeo mediante annotations
        
    - Creación de la unidad de persistencia
        
    - Creación de los paquetes para representar capas (logica y persistencia)
        
    - Creación de las clases controladoras: para la lógica y para la persistencia.
        
    - Creación de los respectivos JPA Controller.
        
    - Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
        
    - Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
        
    - Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.
        

**Recomendación:** _Para este ejercicio te recomendamos utilizar MAVEN como gestor de dependencias para obtener de forma más sencilla las dependencias necesarias de JPA y MySql. Recuerda que si todo sale bien, la tabla platillo se creará de forma automática._

---
