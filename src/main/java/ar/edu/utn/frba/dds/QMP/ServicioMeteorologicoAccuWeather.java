package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather extends ServicioMeteorologico {

  private List<AlertaMeteorologica> listaDeAlertasAEnum(List<String> alertas) {
    List<AlertaMeteorologica> enumAlertasMeteorologicas = new ArrayList<AlertaMeteorologica>(EnumSet.allOf(AlertaMeteorologica.class));
    return enumAlertasMeteorologicas;
  }

  public List<AlertaMeteorologica> getAlertasMeteorologicasApi() {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    Map<String, Object> alertas = apiClima.getAlertas("Buenos Aires");
    return listaDeAlertasAEnum((List<String>) alertas.get("CurrentAlerts"));
  }

  public List<AlertaMeteorologica> getAlertasMeteorologicas() {
    return getAlertasMeteorologicasApi();
  }
}
