<%-- 
    Document   : index
    Created on : 21 nov. 2023, 13:01:57
    Author     : Roque
--%>

<%@page import="com.integradorjspjpa.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.integradorjspjpa.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Integrador</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">        
    </head>
    <body>
        <div class="container mt-4">
            <h2>Formulario Equipo</h2>
            <form action="SvEquipos" method="POST">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre_equipo" name="nombre_equipo">
                </div>
                <div class="form-group">
                    <label for="ciudad">Ciudad:</label>
                    <input type="text" class="form-control" id="ciudad_equipo" name="ciudad_equipo">
                </div>                
                
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
            
            <hr>
            <form action="SvEquipos" method="GET">    
                <button type="submit" class="btn btn-primary">Ver equipos</button>
            </form>             
            
            <br>
            <!-- Resultados en tabla EQUIPOS -->
            <div class="results-table">
                <% if (request.getAttribute("equipos") != null) { %>
                    <h3>Equipos registrados:</h3>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Ciudad</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Equipo equipo : (List<Equipo>) request.getAttribute("equipos")) { %>
                                <tr>
                                    <td><%= equipo.getId() %></td>
                                    <td><%= equipo.getNombre() %></td>
                                    <td><%= equipo.getCiudad() %></td>
                                </tr>
                            <% } %>
                        </tbody>
                    </table>
                <% } %>
            </div>      
            
            
            
            <br>
            <br>            
            <hr>
            <h2>Formulario Partido</h2>
            <form action="SvPartidos" method="POST">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" id="fecha_partido" name="fecha_partido">
                </div>     
                <div class="form-group">
                    <label for="equipo1">Id equipo 1:</label>
                    <input type="text" class="form-control" id="id_equipo1" name="id_equipo1">
                </div>                
                <div class="form-group">
                    <label for="equipo2">Id equipo 2:</label>
                    <input type="text" class="form-control" id="id_equipo2" name="id_equipo2">
                </div>                
                <div class="form-group">
                    <label for="resultadoequipo1">Resultado equipo 1:</label>
                    <input type="text" class="form-control" id="resultado_equipo1" name="resultado_equipo1">
                </div>                 
                <div class="form-group">
                    <label for="resultadoequipo2">Resultado equipo 2:</label>
                    <input type="text" class="form-control" id="resultado_equipo2" name="resultado_equipo2">
                </div>                  
                
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>            
            <hr>
            <form action="SvPartidos" method="GET">    
                <button type="submit" class="btn btn-primary">Ver partidos</button>
            </form>               
            
            <br>
            <!-- Resultados en tabla PARTIDOS -->
            <div class="results-table">
                <% if (request.getAttribute("partidos") != null) { %>
                    <h3>Partidos registrados:</h3>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Fecha</th>
                                <th>Equipo 1</th>
                                <th>Equipo 2</th>
                                <th>Resultado Equipo 1</th>
                                <th>Resultado Equipo 2</th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) { %>
                                <tr>
                                    <td><%= partido.getFechaFormateada()%></td>
                                    <td><%= partido.getEquipo1().getNombre()%></td>
                                    <td><%= partido.getEquipo2().getNombre()%></td>   
                                    <td><%= partido.getResultadoEquipo1()%></td>
                                    <td><%= partido.getResultadoEquipo2()%></td>
                                </tr>
                            <% } %>
                        </tbody>
                    </table>
                <% } %>
            </div>                
            
        </div>        
    </body>
</html>
