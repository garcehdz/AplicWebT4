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

public class EliminarGrupo extends PageController {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GrupoRepository Grupos = (GrupoRepository) context.getBean("grupoRepository");
		
		try {
			String id = request.getParameter("id");
			int idProf = Integer.parseInt(id);
			Grupo prof = Grupos.findGrupo(idProf);
			Grupos.deleteGrupo(prof);
			response.sendRedirect("ListaGrupos");
		} 
		catch (Exception e) {
			request.setAttribute("mensaje",e.getMessage());
			forward("/paginaError.jsp",request,response);
		}
	}
}