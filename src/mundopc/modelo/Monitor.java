package mundopc.modelo;

public class Monitor {

  private final int idMonitor;
  private static int monitorCount = 0;
  private String brand;
  private String size;

  //Constructor
  public Monitor(String brand, String size) {
    this.brand = brand;
    this.size = size;
    this.idMonitor = ++monitorCount;
  }

  // Getter setters
  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getSize() {
    return this.size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public String toString(){
    return "Monitor{"+
            "idMonitor=" + idMonitor+
            ", marca'" + brand +'\''+
            ", tamaño=" +size + '\''+
            '}';
  }
}
