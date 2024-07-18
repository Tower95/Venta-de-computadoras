package mundopc.modelo;

public class Mouse extends InputDevice {

  private final int idRaton;
  private static int contadorRaton = 0;

  public Mouse(String inputType, String brand) {
    super(inputType, brand);
    this.idRaton = ++contadorRaton;
  }

  @Override
  public String toString() {
    return "Raton{" +
            idRaton + ", " +
            "{"+
            super.toString()+
            "}";
  }

}
