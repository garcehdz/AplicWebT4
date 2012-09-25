package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.ProfesorRepository;
import domain.Profesor;
import util.ProfesorDTO;
import util.ProfesorAssembler;

public class AgregarProfesor extends PageController {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfesorRepository profesores = (ProfesorRepository)context.getBean("profesorRepository");
		
		try {
			Profesor prof = new Profesor();

			prof.setCedula(request.getParameter("cedula"));
			prof.setNombre(request.getParameter("nombre"));
			prof.setTitulo(request.getParameter("titulo"));
			prof.setArea(request.getParameter("area"));
			prof.setTelefono(request.getParameter("telefono"));
			
			profesores.insertProfesor(prof);
			response.sendRedirect("ListaProfesores");
		} 
		catch (Exception e) {
			request.setAttribute("mensaje",e.getMessage());
			forward("/paginaError.jsp",request,response);
		}
	}

}