package ar.edu.utn.frba.dds.QMP;

import java.util.List;

public class Usuario {
  public String correo;
  public AsesorDeImagen asesorDeImagen = new AsesorDeImagen();
  public Sugerencia sugerenciaDiaria;

  public Sugerencia getSugerenciaDiaria(){
    return this.sugerenciaDiaria;
  }

  public void calcularSugerenciaDiaria() {
    this.sugerenciaDiaria = calcularSugerencia();
  }

  private Sugerencia calcularSugerencia() {
    asesorDeImagen.generarSugerencia();
  }

  public void suscribirseNotificaro(Notificador notificador){
    notificador.suscribirUsuario(this);
  }

  public void dessuscribirseNotificaro(Notificador notificador){
    notificador.desuscribirUsuario(this);
  }

  public String getCorreo(){
    return this.correo;
  }


}
