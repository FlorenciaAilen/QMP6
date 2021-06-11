package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.List;

public class Mail extends Notificador{
  RegistroUsuarios registroUsuarios = RegistroUsuarios.instancia();
  List<Usuario> usuariosInteresados = new ArrayList<>();

  @Override
  public void nuevasAlertasMeteorologicas(List<AlertaMeteorologica> alertas) {
    usuariosInteresados.forEach(usuario -> this.enviarCorreoAlertas(usuario.getCorreo(),"Hay nuevas alertas meteorologias disponibles",alertas));
  }

  void enviarCorreoAlertas(String correo, String mensaje,List<AlertaMeteorologica> alertas){
    apiMailSender.send(correo,mensaje,alertas); // ejemplo de que se conectaria con una api para mandar el msj a un correo
  }
}
