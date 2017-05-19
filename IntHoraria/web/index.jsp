<%-- 
    Document   : index
    Created on : 20-oct-2012, 16:59:53
    Author     : Alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("usuario_nombre")== null){ %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MODULO DE ACCESO A USUARIOS</title>
    </head>
    <body>
        <h1>Login</h1>
        <form id="frm_usuario" name="frm_usuario" action="UsuarioControlador?accion=ingresar" method="POST">
            <label>Nuip</label>
            <input type="text" name="txt_nuip" id="txt_nuip" /><br>
            <label>Contrase&ntilde;a</label>
            <input type="password" name="txt_clave" id="txt_clave" /><br><br>
            <input type="button" name="btn_login" id="btn_login" value="Ingresar" onclick="validar()" />
        </form>
        <br><br>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>vista/recordar.jsp">¿Olvido su contrase&ntilde;a?</a><br>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>vista/registrar.jsp">Registrese</a><br>
        <%
            if ("ok".equals((String) request.getParameter("estado"))) {
                out.println("<br><b style='color: #006633'>El usuario ha sido registrado correctamente</b>");
            } else if ("reg".equals((String) request.getParameter("estado"))) {
                out.println("<br><b style='color: #CC0000'>Se ha generado un error, este usuario ya estaba registrado</b>");
            } else if ("fail_user".equals((String) request.getParameter("estado"))) {
                out.println("<br><b style='color: #CC0000'>El usuario no existe, si desea hacer uso de nuestros servicios por favor registrese</b>");
            } else if ("fail_pass".equals((String) request.getParameter("estado"))) {
                out.println("<br><b style='color: #CC0000'>La contraseña utilizada no coincide, si no la recuerda cambiela por favor</b>");
            }
        %> 
        <script type="text/javascript">
            function validar(){
                var i=0, contador=0;
                for(i=0;i<document.forms[0].elements.length;i++){
                    if(document.forms[0].elements[i].value=="")
                    {
                        contador++;
                    }
                }
                
                if(contador==0)
                {
                    document.forms[0].submit();
                }
                else{
                    alert("Por favor diligencie todos los campos");
                }
            }
        </script>
    </body>
</html>
<% } else { 
    response.sendRedirect("vista/contenido.jsp");
}%>
