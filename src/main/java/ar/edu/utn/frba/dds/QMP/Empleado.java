package ar.edu.utn.frba.dds.QMP;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
  RegistroUsuarios registroUsuarios = RegistroUsuarios.instancia();
  private List<Usuario> usuarios = new ArrayList<>();

  public void calculoSugerenciasDiarias() {
    registroUsuarios.getUsuarios().forEach(usuario -> usuario.calcularSugerenciaDiaria());
  }
}
