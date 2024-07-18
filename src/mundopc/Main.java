package mundopc;

import mundopc.modelo.InputDevice;
import mundopc.modelo.Keyboard;
import mundopc.modelo.Mouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<InputDevice> lista = new ArrayList<>();
    Mouse mouse = new Mouse("Gaming mouse", "Razer");
    Keyboard keyboard = new Keyboard("Ergonomic","Logitec");

    lista.add(mouse);
    lista.add(keyboard);
    
    lista.forEach(System.out::println);
  }
}