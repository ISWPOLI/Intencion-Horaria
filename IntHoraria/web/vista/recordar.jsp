<%-- 
    Document   : recordar
    Created on : 20-oct-2012, 22:13:00
    Author     : Alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RECORDAR USUARIO</title>
    </head>
    <body>
        <h2>Recuperar contrase&ntilde;a</h2>
        <form id="frm_recuperar" name="frm_recuperar" action="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>UsuarioControlador?accion=evaluar" method="POST">
            <label>Digite su nombre de usuario para recuperar la contraseña</label><br>
            <input type="text" id="txt_usuario" name="txt_usuario" /><br>
            <input type="button" id="btn_recordar" name="btn_recordar" value="Recordar" onclick="validar()" />
        </form>
        <%
            if("fail_user".equals((String)request.getParameter("estado"))){
                out.println("<br><b style='color: #CC0000'>El usuario no existe, si desea hacer uso de nuestros servicios por favor registrese</b>");
                out.println("<a href='registrar.jsp'>aquí</a><br>");
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
                    alert("Por favor rellene todos los campos");
                }
            }
        </script>
    </body>
</html>