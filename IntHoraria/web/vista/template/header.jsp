<%-- 
    Document   : head
    Created on : 15/05/2017, 12:09:57 PM
    Author     : alugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <h1>Zona de usuarios registrados</h1>
        <% if(session.getAttribute("usuario_nombre")!= null){ %>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>index.jsp"><b>Inicio</b></a> | <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>UsuarioControlador?accion=salir"><b>Cerrar sesi&oacute;n</b></a>
        <br>Bienvenido usario: <%=session.getAttribute("usuario_nombre")%>
        <%} else {%>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>index.jsp"><b>Ingresar</b></a><br/>
        <b>Zona no autorizada por favor identifiquese</b>
        <%}%>
