<%-- 
    Document   : index
    Created on : 07-sep-2012, 18:43:19
    Author     : ESTACION 9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO DE USUARIOS</title>
    </head>
    <body>
        <h1>Cambiar contrase&ntilde;a</h1>
        <form id="frm_cambiar" name="frm_cambiar" method="POST" action="<%="http://"+request.getServerName()+":"+request.getLocalPort()+request.getContextPath()+"/" %>UsuarioControlador?accion=actualizar" >
            <input type="hidden" name="txt_usuario" id="txt_usuario" value="<%=(String)request.getParameter("usuario_nombre")%>" />
            <label>Contrase&ntilde;a</label>
            <input type="password" name="txt_clave" id="txt_clave" /><br>
            <label>Verificar Contrase&ntilde;a</label>
            <input type="password" name="txt_verif_clave" id="txt_verif_clave" /><br><br>
            <input type="button" name="btn_registrar" id="btn_registrar" value="Cambiar contraseña" onclick="validar()" />
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
                out.println("<br><b style='color: #006633'>La clave sa ha cambiado, inicie sesión por favor  <a href='http://'+request.getServerName()"+":"+request.getLocalPort()+request.getContextPath()+"/>aquí</a></b>");
            } else if("0".equals((String) request.getParameter("estado"))){
                out.println("<br><b style='color: #CC0000'>La clave no se ha podido cambiar por favor intentelo mas tarde</b>");
            }
        %>
    </body>
</html>
