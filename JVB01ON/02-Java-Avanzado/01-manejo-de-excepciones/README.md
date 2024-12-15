## Excepciones

### Ejercicio Nº 3 - Reserva de Vuelos

Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje y número de asientos deseados. Tu tarea es implementar una función de reserva de vuelos que valide los datos ingresados y maneje excepciones si los datos son incorrectos o si no hay suficientes asientos disponibles en el vuelo.

Debes crear una excepción personalizada, por ejemplo, `ReservaInvalidaException`, que se lance en situaciones excepcionales, como cuando un usuario intenta reservar más asientos de los disponibles o si falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.


### Ejercicio Nº 4 - **Manejo de Inventarios en un Comercio

Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.

Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea personalizada) o de utilizar los tipos correctos de excepción en cada caso.  


### Ejercicio Nº 5 - Vectores y excepciones

Estás desarrollando una aplicación de **gestión de datos** en la que puedes almacenar información en un vector y acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:

1. Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño fijo para simplificar el ejercicio.
    
2. Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando un índice.
    
3. Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
    
4. Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder a una posición inválida en el vector.

