<%@ page import="java.util.*" %>
<%@ page import="display.*" %>
<%@ page import="util.*" %>
<html>
  <head>
    <title>Sistema Universitario</title>
  </head>

  <h1>Sistema Universitario</h1>
  <h2>Listado de Grupos</h2>
	
<% List grupos = (List)request.getAttribute("grupos"); %>
  <table>
	<tr><th>Numero</th><th>Sigla</th><th>Nombre</th><th>Horario</th><th>Aula</th><th>Profesor</th><th/></tr>
    <% for(int i = 0, n = grupos.size(); i < n; i++) {
		GrupoDTO grupo = (GrupoDTO)grupos.get(i); %>
	<tr>
		<td><%= grupo.getNumero()%></td>
		<td><%= grupo.getSigla()%></td>
		<td><%= grupo.getNombre()%></td>
		<td><%= grupo.getHorario()%></td>
		<td><%= grupo.getAula()%></td>
		<td><%= grupo.getProfesor()%></td>
		<td>
			<a href="/universidad/DetalleGrupo?id=<%= grupo.getId()%>">
				<button>Detalle</button>
			</a>
			<a href="/universidad/EliminarGrupo?id=<%= grupo.getId()%>"><button>Eliminar</button></a>
		</td>
	</tr>
	<%}%>
  </table>
	<a href="/universidad/NuevoGrupo"><button>Agregar</button></a><br/>
</html>