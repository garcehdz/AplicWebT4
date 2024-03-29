<%@ page import="java.util.*" %>
<%@ page import="display.*" %>
<%@ page import="util.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Detalle de Profesor</h2>
  <% ProfesorDTO prof = (ProfesorDTO)request.getAttribute("profesor"); %>
  <% List grupos = (List)request.getAttribute("grupos"); %>
  <form name="ActualizarProfesor" action="/universidad/ActualizarProfesor" method="get">
  <input type="hidden" name="id" value="<%= prof.getId() %>"/>
  <table>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%= prof.getNombre() %>"/></td></tr>
    <tr><td>C&eacute;dula:</td><td><input type="text" name="cedula" value="<%= prof.getCedula() %>"/></td></tr>
    <tr><td>T&iacute;tulo:</td><td><input type="text" name="titulo" value="<%= prof.getTitulo() %>"/></td></tr>
    <tr><td>Area:</td><td><input type="text" name="area" value="<%= prof.getArea() %>"/></td></tr>
    <tr><td>Tel&eacute;fono:</td><td><input type="text" name="telefono" value="<%= prof.getTelefono() %>"/></td></tr>
    <tr><td></td><td><input type="submit" value="Actualizar" /></td></tr>
  </table>
  </form>
  <br/>
  <h2>Grupos del Profesor</h2>
  <table>
	<tr><tr><th>Numero</th><th>Sigla</th><th>Nombre</th><th>Horario</th><th>Aula</th><th/></tr></tr>
	<% for(int i = 0, n = grupos.size(); i < n; i++) {
		GrupoDTO grupo = (GrupoDTO)grupos.get(i); 
		if(prof.getId() == grupo.getProfesor()){%>
	<tr>
		<td><%= grupo.getNumero()%></td>
		<td><%= grupo.getSigla()%></td>
		<td><%= grupo.getNombre()%></td>
		<td><%= grupo.getHorario()%></td>
		<td><%= grupo.getAula()%></td>
		<td>
			<a href="/universidad/DetalleGrupo?id=<%= grupo.getId()%>">
				<button>Detalle</button>
			</a>
			<a href="/universidad/EliminarGrupo?id=<%= grupo.getId()%>"><button>Eliminar</button></a>
		</td>
	</tr>
	<%}}%>
  </table>
  
  
</html>