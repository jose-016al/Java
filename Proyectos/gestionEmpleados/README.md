# Prueba técnica 1 - Sistema de gestión de empleados
## Funcionamiento
Al ejecutar la aplicación, se mostrará un menú que nos pedirá introducir una opción. Deberemos ingresar un número entre 1 y 6 para interactuar con las distintas situaciones que ofrece el sistema.
```bash
-----Menú-----
1. Agregar un nuevo empleado
2. Listar empleados
3. Actualizar información de un empleado
4. Eliminar un empleado
5. Buscar empleados por cargo
6. Salir
Introduce una de las opciones entre 1 y 6: 
```
 ⚠️ **Aviso:** El menú seguirá repitiéndose al finalizar las distintas opciones, hasta que se seleccione el número 6 para salir y dar por finalizado el programa.
### Agregar un nuevo empleado
Si seleccionamos la primera opción, podremos agregar la información de un nuevo empleado. El sistema solicitará el nombre, apellidos, cargo, salario y fecha de inicio, validando que los datos ingresados sean correctos. Al finalizar, se mostrará un mensaje confirmando si el empleado se añadió correctamente, junto con su información.
```bash
-----Agregar empleado-----
Introduce el nombre del empleado: Jose
Introduce el apellido de Jose: Almiron
Introduce el cargo de Jose: Developer
Introduce el salario: 1500
Introduce la fecha de inicio (dd/MM/yyyy): 03/11/2023

-----Empleado agregado-----
Empleado{ID: 1, Nombre: Jose, Apellido: Almiron, Cargo: Developer, Salario: 1500.0, Fecha de inicio: 03/11/2023}
```
### Listar empleados
Con la opción 2 se mostrará una lista con todos los empleados. Si en ese momento no hay empleados en la base de datos, se mostrará un mensaje indicándolo.
```bash
-----Lista de empleados-----
No hay empleados
```
Por otro lado, al agregar varios empleados adicionales.
```bash
-----Lista de empleados-----
Empleado{ID: 1, Nombre: Jose, Apellido: Almiron, Cargo: Developer, Salario: 1500.0, Fecha de inicio: 03/11/2023}
Empleado{ID: 2, Nombre: Sophia, Apellido: Martinez, Cargo: Software Engineer, Salario: 72000.0, Fecha de inicio: 12/09/2021}
Empleado{ID: 3, Nombre: Liam, Apellido: Garcia, Cargo: Data Analyst, Salario: 67000.0, Fecha de inicio: 14/01/2020}
Empleado{ID: 4, Nombre: Olivia, Apellido: Hernandez, Cargo: Software Engineer, Salario: 75000.0, Fecha de inicio: 18/06/2022}
Empleado{ID: 5, Nombre: Noah, Apellido: Wilson, Cargo: Product Manager, Salario: 88000.0, Fecha de inicio: 23/08/2019}
Empleado{ID: 6, Nombre: Emma, Apellido: Lopez, Cargo: HR Specialist, Salario: 56000.0, Fecha de inicio: 30/10/2020}
Empleado{ID: 7, Nombre: James, Apellido: Clark, Cargo: Software Engineer, Salario: 74000.0, Fecha de inicio: 15/03/2021}
Empleado{ID: 8, Nombre: Isabella, Apellido: Lewis, Cargo: Data Analyst, Salario: 66000.0, Fecha de inicio: 05/12/2018}
Empleado{ID: 9, Nombre: Benjamin, Apellido: Walker, Cargo: Product Manager, Salario: 87000.0, Fecha de inicio: 22/04/2022}
Empleado{ID: 10, Nombre: Charlotte, Apellido: Hall, Cargo: DevOps Engineer, Salario: 79000.0, Fecha de inicio: 10/11/2020}
Empleado{ID: 11, Nombre: Ethan, Apellido: Allen, Cargo: DevOps Engineer, Salario: 77000.0, Fecha de inicio: 01/01/2023}
Empleado{ID: 12, Nombre: Mia, Apellido: Young, Cargo: HR Specialist, Salario: 58000.0, Fecha de inicio: 07/07/2021}
Empleado{ID: 13, Nombre: Lucas, Apellido: King, Cargo: Software Engineer, Salario: 71000.0, Fecha de inicio: 03/05/2019}
Empleado{ID: 14, Nombre: Amelia, Apellido: Scott, Cargo: Data Analyst, Salario: 64000.0, Fecha de inicio: 21/09/2022}
Empleado{ID: 15, Nombre: Logan, Apellido: Adams, Cargo: Product Manager, Salario: 90000.0, Fecha de inicio: 25/03/2023}
Empleado{ID: 16, Nombre: Ava, Apellido: Baker, Cargo: HR Specialist, Salario: 57000.0, Fecha de inicio: 19/08/2020}
```
### Actualizar la información de un empleado
Con la tercera opción podremos actualizar la información de un empleado. Será necesario introducir su ID. Si no conoces el ID, puedes consultarlo fácilmente utilizando la segunda opción del menú para ver la lista de empleados.
```bash
-----Actualizar información del empleado-----
Introduce el ID del empleado (puedes consultarlo en la opción 2 del menú): 1
Introduce el nombre del empleado: Alberto
Introduce el apellido de Alberto: Fernandez
Introduce el cargo de Alberto: Cibersecurity
Introduce el salario: 2300
Introduce la fecha de inicio (dd/MM/yyyy): 02/10/2020

-----Empleado modificado-----
Empleado{ID: 1, Nombre: Alberto, Apellido: Fernandez, Cargo: Cibersecurity, Salario: 2300.0, Fecha de inicio: 02/10/2020}
```
### Eliminar un empleado
Con la cuarta opcion eliminaremos un empleado, al igual que con la anterior opcion necesitaremos saber el id del empleado, si no lo sabemos lo podemos consultar con la opcoin dos del menu, donde nos listara todos los empleados
```bash
-----Eliminar empleado-----
Introduce el ID del empleado (puedes consultarlo en la opción 2 del menú): 1

-----Empleado eliminado-----
Empleado{ID: 1, Nombre: Alberto, Apellido: Fernandez, Cargo: Cibersecurity, Salario: 2300.0, Fecha de inicio: 02/10/2020}
```
### Buscar empleado por cargo
Con la última opción podremos filtrar la lista de empleados para obtener únicamente aquellos que ocupen un cargo específico.
```bash
-----Lista de empleados segun un cargo-----
Introduce un cargo: Software Engineer

-----Lista de Software Engineer-----
Empleado{ID: 2, Nombre: Sophia, Apellido: Martinez, Cargo: Software Engineer, Salario: 72000.0, Fecha de inicio: 12/09/2021}
Empleado{ID: 4, Nombre: Olivia, Apellido: Hernandez, Cargo: Software Engineer, Salario: 75000.0, Fecha de inicio: 18/06/2022}
Empleado{ID: 7, Nombre: James, Apellido: Clark, Cargo: Software Engineer, Salario: 74000.0, Fecha de inicio: 15/03/2021}
Empleado{ID: 13, Nombre: Lucas, Apellido: King, Cargo: Software Engineer, Salario: 71000.0, Fecha de inicio: 03/05/2019}
```
