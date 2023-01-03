
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologia = request.getParameter("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica = request.getParameter("musica");
        String comentario = request.getParameter("comentario");
        
        
       
        
        //De lado del servidor
        System.out.println("usuario:  " + usuario );
        System.out.println("password: " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El usuario es: " + usuario);
        out.print("<br/>");
        out.print("La contrasena es: " + password);
        out.print("<br/>");
        out.print("respuesta: " );
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
    
}
