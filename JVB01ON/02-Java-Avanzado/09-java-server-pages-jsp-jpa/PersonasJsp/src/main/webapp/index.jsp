<%@page import="java.util.List"%>
<%@page import="org.example.logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulario Persona</title>
    <!-- Agregar estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2>Formulario Persona</h2>
        <form action="PersonaSv" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
            </div>
            <div class="form-group">
                <label for="apellido">Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido">
            </div>
            <div class="form-group">
                <label for="telefono">Teléfono:</label>
                <input type="text" class="form-control" id="telefono" name="telefono">
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>

        <hr>

        <h2>Consultar por Apellido</h2>
        <form action="PersonaSv" method="get">
            <div class="form-group">
                <label for="consultaApellido">Consultar por Apellido:</label>
                <input type="text" class="form-control" id="consultaApellido" name="consultaApellido">
            </div>
            <button type="submit" class="btn btn-primary">Buscar</button>
        </form>
   
    <br>
    <br>
    <!-- Resultados en tabla -->
    <div class="results-table">
        <% if (request.getAttribute("resultados") != null) { %>
            <h3>Resultados:</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Teléfono</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Persona persona : (List<Persona>) request.getAttribute("resultados")) { %>
                        <tr>
                            <td><%= persona.getNombre() %></td>
                            <td><%= persona.getApellido() %></td>
                            <td><%= persona.getTelefono() %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } %>
    </div>
 </div>
    <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>