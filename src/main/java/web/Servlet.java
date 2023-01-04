package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //Leer los parametros html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologias");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musicas[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentario");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Datos del Formulario</h1>");
        out.println("<p>Usuario: " + usuario + "</p>");
        out.println("<p>Contraseña: " + password + "</p>");
        out.print("<p>Tecnologías: ");
        for (String tecnologia : tecnologias) {
            out.print(" " + tecnologia + " ");
        }
        out.print("</p>");
        out.println("<p>Género: " + genero + "</p>");
        out.println("<p>Ocupación: " + ocupacion + "</p>");

        out.println("<p>Música: ");
        if (musicas != null) {
            for (String musica : musicas) {
                out.print(" " + musica + " ");
            }
        }else{out.print("no selecciono musica");}
        out.println("</p");
        if(comentario!=null){
        out.println("<p>Comentario: " + comentario + "</p>");
        }else{out.println("<p>Comentario:  </p>");}
        out.println("</body>");
        out.println("</html>");

        out.close();
    }

}
