package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.List;

public class RegistroAlertas {
  List<AlertaMeteorologica> alertasActualizadas = new ArrayList<>();
  List<Notificador> notificadores = new ArrayList<>();

  public void actualizarAlertasPublicadas() {
    this.alertasActualizadas = new ServicioMeteorologicoAccuWeather().getAlertasMeteorologicas();
    this.notificarAlertas(this.alertasActualizadas);
  }

  public void notificarAlertas(List<AlertaMeteorologica> alertas){
    notificadores.forEach(notificador -> notificador.nuevasAlertasMeteorologicas(alertas));
  }

  public List<AlertaMeteorologica> getAlertasActualizadas() {
    return alertasActualizadas;
  }
}
