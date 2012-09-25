package util;
import domain.Grupo;

public class GrupoAssembler {
  public static GrupoDTO CreateDTO(Grupo grupo) {
    GrupoDTO dto = new GrupoDTO();
    dto.setId(grupo.getId());
    dto.setNumero(grupo.getNumero());
    dto.setNombre(grupo.getNombre());
    dto.setSigla(grupo.getSigla());
    dto.setAula(grupo.getAula());
    dto.setHorario(grupo.getHorario());
	dto.setProfesor(grupo.getProfesor());
    return dto;
  }
  public static void Update(Grupo grupo, GrupoDTO dto) {
    try {
      grupo.setId(dto.getId());
      grupo.setNumero(dto.getNumero());
      grupo.setNombre(dto.getNombre());
      grupo.setSigla(dto.getSigla());
      grupo.setAula(dto.getAula());
      grupo.setHorario(dto.getHorario());
	  grupo.setProfesor(dto.getProfesor());
    } catch (Exception e) {
    }
  }
}