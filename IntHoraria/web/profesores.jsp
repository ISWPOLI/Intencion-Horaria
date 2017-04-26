<%-- 
    Document   : index
    Created on : 2/03/2017, 12:26:13 PM
    Author     : santi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>Intencion Horaria</title>
    </head>
       <body>
        <h1>Bienvenido a la intencion horaria profesor</h1>
        <div>
            
            
            
            <form action="#" method="post">
                <h1>Por favor escoja la materia que desea dictar </h1>
                <br />
                <input name="cbipeliculas" type="checkbox" />m1
                <br />
                <input name="cbilibros" type="checkbox" checked="checked" />m2
                <br />
                <input name="cbiinternet" type="checkbox" />m3   
                
                 <!-- actulizar formulario con la conexion a base de datos **preguntar**  -->
                 
                 <?
                 while($row=  mysql_fetch_array($result2))
                 {
                  echo '<input type="checkbox" name="'.$row["materias"].'" value="'.$row["nombre"].'">'.$row["codigo"];
                 }
                 ?>
                 <!-- actulizar formulario con la conexion a base de datos **preguntar**  -->
                 
                <p><input type="submit" name="Aceptar" id="Aceptar" value="Aceptar"/></p> 
                
            </form>            
        </div>
    </body>
</html>
