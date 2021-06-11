package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.List;

public class RegistroUsuarios {
  private static RegistroUsuarios instancia = null;
  public List<Usuario> usuarios = new ArrayList<>();

  public static RegistroUsuarios instancia() {
    if (instancia == null) {
      instancia = new RegistroUsuarios();
    }
    return instancia;
  }

  public List<Usuario> getUsuarios() {
    return usuarios;
  }
}
