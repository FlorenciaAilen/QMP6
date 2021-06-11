package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.List;

public abstract class Notificador {
  public abstract void nuevasAlertasMeteorologicas(List<AlertaMeteorologica> alertas);
  List<Usuario> usuariosSuscriptos = new ArrayList<>();

  public void suscribirUsuario(Usuario usuario) {
    usuariosSuscriptos.add(usuario);
  }
  public void desuscribirUsuario(Usuario usuario) {
    usuariosSuscriptos.remove(usuario);
  }
}
