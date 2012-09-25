package domain;

public class Grupo {
  private int id;
  private int numero;
  private int profesor;
  private String nombre;
  private String sigla;
  private String aula;
  private String horario;

  public Grupo () {};
  public void setId(int id) {this.id=id;}
  public void setNumero(int numero) {this.numero=numero;}
  public void setProfesor(int profesor) {this.profesor=profesor;}
  public void setNombre(String nombre) {this.nombre=nombre;}
  public void setSigla(String sigla){
      this.sigla=sigla;
  }
  public void setAula(String aula) {this.aula=aula;}
  public void setHorario(String horario) {this.horario=horario;}
  public int getId() {return id;}
  public int getNumero() {return numero;}
  public int getProfesor() {return profesor;}
  public String getNombre() {return nombre;}
  public String getSigla() {return sigla;}
  public String getAula() {return aula;}
  public String getHorario() {return horario;}
}