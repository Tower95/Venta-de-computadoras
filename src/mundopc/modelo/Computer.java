package mundopc.modelo;

public class Computer {

  // Properties
  private int idComputer;
  private static int computerCounter = 0;
  private String name;
  private Monitor monitor;
  private Keyboard keyboard;
  private Mouse mouse;


  // Constructors
  private Computer(){
    this.idComputer = ++computerCounter ;
  }

  public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse){
    this();
    this.name = name;
    this.monitor = monitor;
    this.keyboard = keyboard;
    this.mouse = mouse;
  }

  // getters and setters

  public String getName() {
    return name;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public Keyboard getKeyboard() {
    return keyboard;
  }

  public Mouse getMouse() {
    return mouse;
  }

  public int getIdComputer() {
    return idComputer;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }

  public void setKeyboard(Keyboard keyboard) {
    this.keyboard = keyboard;
  }

  public void setMouse(Mouse mouse) {
    this.mouse = mouse;
  }

  // To String mehtod
  @Override
  public String toString() {
    return "Computer{\n" +
            "idComputer=" + idComputer +
            "\n, name='" + name + '\'' +
            "\n, monitor=" + monitor +
            "\n, keyboard=" + keyboard +
            "\n, mouse=" + mouse +
            '}';
  }
}

