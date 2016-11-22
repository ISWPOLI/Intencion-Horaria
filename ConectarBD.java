package basededatos;
import java.io.IOException;
import java.sql.*;

public class ConectarBD {
    static String bd = "bdintencionhoraria";
    private static String login = "root";
    private static String password = "123";
    private static String url = "jdbc:mysql://localhost/bdintencionhoraria";
    private static Connection conexion;
    
    public ConectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url,login,password);
            System.out.println("Conexión a base de datos "+url+" ... exitosa");
        }        
        catch(SQLException | ClassNotFoundException e){
        	System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
        }        
    }
    
    public Connection getConnection(){
    	return conexion;
    }
    
    public boolean validarLogin(String codigo, String identificacion, String sede)  throws IOException {
        try {
        	Statement instruccionSQL = conexion.createStatement();
            ResultSet resultadosConsulta = instruccionSQL.executeQuery ("SELECT * FROM estudiante WHERE idCodigo='"+codigo+"' AND identificacion='"+identificacion+"' AND sede='"+sede+"'");
            if( resultadosConsulta.first() )
            	return true;
            else
                return false;        
                 
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        } 
    }

	public int getPrograma(String codigo, String identificacion, String sede)  throws IOException {
		 try {
	        	Statement instruccionSQL = conexion.createStatement();
	            ResultSet rs = instruccionSQL.executeQuery ("SELECT * FROM estudiante WHERE idCodigo='"+codigo+"' AND identificacion='"+identificacion+"' AND sede='"+sede+"'");
	            while(rs.next()){
	            		int id=rs.getInt("idPrograma");    
	            		return id;
	            }    
	        } 
		 catch (Exception e){
	            e.printStackTrace();	            
	        } 		
		 return 0;
	}
} 