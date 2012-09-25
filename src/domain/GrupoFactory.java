package domain;

public class GrupoFactory {
  public Grupo Create(int id, int numero, String nombre,
	String sigla, String aula, String horario, int profesor) {
    try {
      Grupo grupo = new Grupo();
      grupo.setId(id);
      grupo.setNumero(numero);
      grupo.setNombre(nombre);
      grupo.setSigla(sigla);
      grupo.setAula(aula);
      grupo.setHorario(horario);
	  grupo.setProfesor(profesor);
      return grupo;
    } catch (Exception e) {
      return null;
    }
  }
}