<%@page import="com.mycompany.servlet.logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registradods</h1>
        <% 
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            
            for (Usuario user : listaUsuarios) {
                
        %>    
                <h2><b>Usuario Nº <%=cont%></b></h2>
                <p>DNI: <%=user.getDni()%></p>
                <p>Nombre: <%=user.getNombre()%></p>
                <p>Apellido: <%=user.getApellido()%></p>
                <p>Telefono: <%=user.getTelefono()%></p>
                <p>-------------------------------------</p>
                <% cont = cont + 1; %>
        <% } %>
        
    </body>
</html>
