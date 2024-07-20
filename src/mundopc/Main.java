package mundopc;

import mundopc.modelo.*;
import mundopc.service.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<InputDevice> lista = new ArrayList<>();
    Mouse mouse = new Mouse("Gaming mouse", "Razer");
    Keyboard keyboard = new Keyboard("Ergonomic","Logitec");
    Monitor monitor = new Monitor("ACO", "22'");

    // create the computer object
    Computer pc = new Computer("Gaming all in one", monitor,keyboard,mouse);

    Order order = new Order();
    order.addComputer(pc);
    order.listComputers();
  }
}