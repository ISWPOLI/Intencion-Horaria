/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.UsuarioDAO;


/**
 *
 * @author aalugo
 */
public class UsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if (request.getParameter("accion").equals("registrar")) {
                Usuario usuario = new Usuario();
                usuario.setNuip(Integer.parseInt(request.getParameter("txt_nuip")));
                usuario.setNombre_usuario((String) request.getParameter("txt_nombre"));
                usuario.setApellido_usuario((String) request.getParameter("txt_apellido"));
                usuario.setEmail_usuario((String) request.getParameter("txt_email"));
                usuario.setClave((String) request.getParameter("txt_clave"));

                UsuarioDAO usuariodao = new UsuarioDAO();
                Integer estado_resultado = 0;
                try {
                    usuariodao.conectar();
                    estado_resultado = usuariodao.agregarUsuario(usuario);
                    usuariodao.desconectar();
                    request.getRequestDispatcher("vista/registrar.jsp?estado=" + estado_resultado).forward(request, response);
                } catch (Exception e) {
                    //out.println("Ocurrio la sig exception: " +e);                    
                    request.getRequestDispatcher("vista/registrar.jsp?estado=" + estado_resultado).forward(request, response);
                }
            } else if (request.getParameter("accion").equals("ingresar")) {
                Usuario usuario = new Usuario();
                UsuarioDAO usuariodao = new UsuarioDAO();
                try {
                    usuariodao.conectar();
                    usuario = usuariodao.consultarUsuario(Integer.parseInt(request.getParameter("txt_nuip")), (String) request.getParameter("txt_clave"));
                    usuariodao.desconectar();
                    HttpSession session = request.getSession();
                    if (usuario != null) {
                        session.setAttribute("usuario_nombre", usuario.getNombre_usuario());
                        session.setAttribute("usuario_user", usuario.getNuip());
                        session.setAttribute("usuario_clave", usuario.getClave());
                        //request.getRequestDispatcher("vista/contenido.jsp?estado=ut").forward(request, response);
                    }
                    request.getRequestDispatcher("vista/contenido.jsp").forward(request, response);
                } catch (Exception e) {
                    out.println("Ocurrio la sig exception: " +e);
                    request.getRequestDispatcher("index.jsp?estado=unautoriced").forward(request, response);
                }
            } else if (request.getParameter("accion").equals("evaluar")) {
                Usuario usuario = new Usuario();
                UsuarioDAO usuariodao = new UsuarioDAO();
                try {
                    usuariodao.conectar();
                    usuario = usuariodao.comprobarUsuario((String) request.getParameter("txt_usuario"));
                    usuariodao.desconectar();
                    if(usuario != null){
                        request.getRequestDispatcher("vista/cambiar_clave.jsp?usuario_nombre="+usuario.getNuip()).forward(request, response);
                    } else {
                        request.getRequestDispatcher("vista/recordar.jsp?estado=fail_user").forward(request, response);
                    }
                } catch (Exception e) {
                    out.println("Ocurrio la sig exception: " +e);
                }
            } else if (request.getParameter("accion").equals("actualizar")) {
                Usuario usuario = new Usuario();
                usuario.setNombre_usuario((String) request.getParameter("txt_nombre"));
                usuario.setNuip(Integer.parseInt(request.getParameter("txt_usuario")));
                usuario.setClave((String) request.getParameter("txt_clave"));

                UsuarioDAO usuariodao = new UsuarioDAO();
                Integer estado_resultado = 0;
                try {
                    usuariodao.conectar();
                    estado_resultado = usuariodao.agregarUsuario(usuario);
                    usuariodao.desconectar();
                    request.getRequestDispatcher("vista/cambiar_clave.jsp?estado=" + estado_resultado).forward(request, response);
                } catch (Exception e) {
                    //out.println("Ocurrio la sig exception: " +e);                    
                    request.getRequestDispatcher("vista/cambiar_clave.jsp?estado=" + estado_resultado).forward(request, response);
                }
            } else if (request.getParameter("accion").equals("salir")) {
                HttpSession session = request.getSession();
                session.invalidate();
                request.getRequestDispatcher("index.jsp?estado=ut").forward(request, response);
            } else {
                out.println("No se ha determinado accion");
            }
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
