package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.GrupoRepository;
import domain.Grupo;
import util.GrupoDTO;
import util.GrupoAssembler;

public class AgregarGrupo extends PageController {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GrupoRepository Grupos = (GrupoRepository)context.getBean("grupoRepository");
		
		try {
			Grupo grupo = new Grupo();

			grupo.setNumero(Integer.parseInt(request.getParameter("numero")));
			grupo.setNombre(request.getParameter("nombre"));
			grupo.setSigla(request.getParameter("sigla"));
			grupo.setAula(request.getParameter("aula"));
			grupo.setHorario(request.getParameter("horario"));
			grupo.setProfesor(Integer.parseInt(request.getParameter("profesor")));
			
			Grupos.insertGrupo(grupo);
			response.sendRedirect("ListaGrupos");
		} 
		catch (Exception e) {
			request.setAttribute("mensaje",e.getMessage());
			forward("/paginaError.jsp",request,response);
		}
	}

}