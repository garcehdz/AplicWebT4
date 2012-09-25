package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.*;
import util.*;

public class ActualizarGrupo extends PageController {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      GrupoRepository grupos = (GrupoRepository)context.getBean("grupoRepository");
    try {
        String id = request.getParameter("id");
        int idGrupo = Integer.parseInt(id);
		
		Grupo grupo  = grupos.findGrupo(idGrupo);
		grupo.setNumero(Integer.parseInt(request.getParameter("numero")));
		grupo.setNombre(request.getParameter("nombre"));
		grupo.setSigla(request.getParameter("sigla"));
		grupo.setAula(request.getParameter("aula"));
		grupo.setHorario(request.getParameter("horario"));
		grupo.setProfesor(Integer.parseInt(request.getParameter("profesor")));
		grupos.updateGrupo(grupo);

        response.sendRedirect("ListaGrupos");
    } catch (Exception e) {
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}