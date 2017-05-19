    <%-- 
    Document   : registrar
    Created on : 20-oct-2012, 19:14:53
    Author     : Alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO DE USUARIOS</title>
    </head>
    <body>
        <a href="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>index.jsp"><b>Incio</b></a>
        <h1>Registro de usuario</h1>
        <form id="frm_registro" name="frm_registro" method="POST" action="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>UsuarioControlador?accion=registrar" >
            <label>Número de identificacion personal</label>
            <input type="number" name="txt_nuip" id="txt_nuip" /><br>
            <label>Nombre</label>
            <input type="text" name="txt_nombre" id="txt_nombre" /><br>
            <label>Apellido</label>
            <input type="text" name="txt_apellido" id="txt_apellido" /><br>
            <label>Email</label>
            <input type="email" name="txt_email" id="txt_email" /><br>
            <label>Contrase&ntilde;a</label>
            <input type="password" name="txt_clave" id="txt_clave" /><br>
            <label>Verificar Contrase&ntilde;a</label>
            <input type="password" name="txt_verif_clave" id="txt_verif_clave" /><br><br>
            <input type="button" name="btn_registrar" id="btn_registrar" value="Ingresar" onclick="validar()" />
        </form>
        <br><br>
        <script type="text/javascript">
            function validar(){
                var i=0, contador=0;
                for(i=0;i<document.forms[0].elements.length;i++){
                    if(document.forms[0].elements[i].value=="")
                    {
                        contador++;
                    }
                }
                
                if(contador==0 && (document.getElementById("txt_clave").value == document.getElementById("txt_verif_clave").value))
                {
                    document.forms[0].submit();
                }
                else{
                    alert("Por favor rellene todos los campos y verifique que la contraseña sea igual");
                }
            }
        </script>
        <%
            if ("1".equals((String) request.getParameter("estado"))) {
                out.println("<br><b style='color: #006633'>El usuario ha sido registrado correctamente, espere a ser activado</b>");
            } else if("0".equals((String) request.getParameter("estado"))){
                out.println("<br><b style='color: #CC0000'>El usuario se encuentra registrado, si no recuerda la contraseña recuperera <a href='http://www.google.com.co'>aqui</a></b>");
            }
        %>
    </body>
</html>