<%-- 
    Document   : contenido
    Created on : 22-oct-2012, 10:22:28
    Author     : aalugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contenido Usuario Registrado</title>
    </head>
    <body>
        <h1>Zona de usuarios registrados</h1>
        <% if(session.getAttribute("usuario_nombre")!= null){ %>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>index.jsp"><b>Inicio</b></a> | <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>UsuarioControlador?accion=salir"><b>Cerrar sesi&oacute;n</b></a>
        <br>Bienvenido usario: <%=session.getAttribute("usuario_nombre")%>
        <%} else {%>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>index.jsp"><b>Ingresar</b></a><br/>
        <b>Zona no autorizada por favor identifiquese</b>
        <%}%>
        <h1></h1>
    </body>
</html>
