package mundopc.modelo;

public class InputDevice {
  private String inputType;
  private String brand;

  // Constructor
  InputDevice(String inputType, String brand){
    this.inputType = inputType;
    this.brand = brand;
  }

  //getter
  public String getInputType(){
    return this.inputType;
  }

  @Override
  public String toString() {
    return "InputDevice{" +
            "inputType='" + inputType + '\'' +
            ", brand='" + brand + '\'' +
            '}';
  }
}
