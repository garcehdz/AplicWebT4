<%@ page import="java.util.*" %>
<%@ page import="display.*" %>
<%@ page import="util.*" %>
<html>
  <head>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Nuevo Grupo</h2>
  <% List profs = (List)request.getAttribute("profesores"); %>
  <% GrupoDTO grupo = (GrupoDTO)request.getAttribute("grupo");%>
  
  <form name="RegistrarGrupo" action="/universidad/ActualizarGrupo" method="get">
  
  <table>
	<input type="hidden" name="id" value="<%=grupo.getId()%>"/>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%=grupo.getNombre()%>"/></td></tr>
    <tr><td>Codigo:</td><td><input type="text" name="sigla" value="<%=grupo.getSigla()%>"/></td></tr>
    <tr><td>Numero:</td><td><input type="text" name="numero" value="<%=grupo.getNumero()%>"/></td></tr>
    <tr><td>Aula:</td><td><input type="text" name="aula" value="<%=grupo.getAula()%>"/></td></tr>
    <tr><td>Horario:</td><td><input type="text" name="horario" value="<%=grupo.getHorario()%>"/></td></tr>
	<tr>
		<td>Profesor:</td>
		<td>
			<Select name="profesor">
				<% for(int i = 0, n = profs.size(); i < n; i++) {
					ProfesorDTO prof = (ProfesorDTO) profs.get(i); %>
					<option value="<%=prof.getId()%>" <%= prof.getId() == grupo.getProfesor() ? "selected" : "" %>><%=prof.getNombre()%></option>
				<%}%>
			</select>
		</td>
	</tr>
    <tr><td></td><td><input type="submit" value="Guardar" /></td></tr>
  </table>
	
  </table>
  </form>
</html>