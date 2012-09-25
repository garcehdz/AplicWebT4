package util;

public class GrupoDTO {
  private int id;
  private int numero;
  private String nombre;
  private String sigla;
  private String aula;
  private String horario;
  private int profesor;

  public int getId() {return id;}
  public int getNumero() {return numero;}
  public String getNombre() {return nombre;}
  public String getSigla() {return sigla;}
  public String getAula() {return aula;}
  public String getHorario() {return horario;}
  public int getProfesor() {return profesor;}
  public void setId(int id) {this.id=id;}
  public void setNumero(int num) {numero=num;}
  public void setNombre(String nom) {nombre=nom;}
  public void setSigla(String sig) {sigla=sig;}
  public void setAula(String au) {aula=au;}
  public void setHorario(String hor) {horario=hor;}
  public void setProfesor(int prof) {profesor=prof;}
}