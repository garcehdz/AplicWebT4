package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.*;
import util.*;

public class DetalleProfesor extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      ProfesorRepository profesores =
        (ProfesorRepository) context.getBean("profesorRepository");
    try {
      String id = request.getParameter("id");
      int idProf = Integer.parseInt(id);
      Profesor prof = profesores.findProfesor(idProf);
      ProfesorDTO dto = ProfesorAssembler.CreateDTO(prof);
      request.setAttribute("profesor",dto);
	  setGrupos(request);
      forward("/detalleProfesor.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
  
	public void setGrupos(HttpServletRequest request){
		GrupoRepository Grupos = (GrupoRepository) context.getBean("grupoRepository");
		Collection lista = Grupos.findAllGrupo();
        List data = new ArrayList();
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Grupo grupo = (Grupo)itr.next();
            GrupoDTO dto = GrupoAssembler.CreateDTO(grupo);
            data.add(dto);
        }
		request.setAttribute("grupos",data);
	}
}