package mundopc.service;

import mundopc.modelo.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private final int idOrder;
  private final List<Computer> computers;
  private static int orderCount = 0;

  public Order(){
    idOrder = ++orderCount;
    computers = new ArrayList<>();
  }

  public void addComputer(Computer computer){
    computers.add(computer);
  }

  public void listComputers(){

    System.out.println("Order #: " + idOrder);
    System.out.println("Total Computers: "+ computers.size() );
    System.out.println();

    computers.forEach(System.out::println);

  }

}
