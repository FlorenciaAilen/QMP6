package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.List;

public class Notificacion extends Notificador{
  List<Usuario> usuariosInteresados = new ArrayList<>();

  @Override
  public void nuevasAlertasMeteorologicas(List<AlertaMeteorologica> alertas) {

    if(alertas.contains(AlertaMeteorologica.TORMENTA)){
      usuariosInteresados.forEach(usuario -> this.notificar("Esta pronosticado una tormenta, te sugerimos salir con paraguas"));
    }else	if(alertas.contains(AlertaMeteorologica.GRANIZO)) {
      usuariosInteresados.forEach(usuario -> this.notificar("Esta pronosticado granizo, no salgas del auto"));
    }
  }

  void notificar(String mensaje){
    // la idea seria disparar la notificacion a los usuarios interesados
  }
}
