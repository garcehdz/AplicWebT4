package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.*;
import util.*;


public class DetalleGrupo extends PageController {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      GrupoRepository Grupos = (GrupoRepository) context.getBean("grupoRepository");
    try {
      String id = request.getParameter("id");
      int idGrupo = Integer.parseInt(id);
      Grupo grupo = Grupos.findGrupo(idGrupo);
      GrupoDTO dto = GrupoAssembler.CreateDTO(grupo);
      request.setAttribute("grupo",dto);
	  setProfesores(request);
      forward("/detalleGrupo.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
  
	public void setProfesores(HttpServletRequest request){
		ProfesorRepository profesores = (ProfesorRepository) context.getBean("profesorRepository");
		Collection lista = profesores.findAllProfesor();
			List data = new ArrayList();
			Iterator itr = lista.iterator();
			while (itr.hasNext()) {
				Profesor prof = (Profesor)itr.next();
				ProfesorDTO dto = ProfesorAssembler.CreateDTO(prof);
				data.add(dto);
			}
		  request.setAttribute("profesores",data);
	}
}