package mundopc.modelo;

public class Keyboard extends InputDevice {

  private int idTeclado;
  private static int contadorTeclados = 0;
  private String brand;


  public Keyboard(String inputType, String brand){
    super(inputType,brand);
    this.idTeclado = ++contadorTeclados;
  }

  @Override
  public String toString(){
    return "Keyboard{"+
            idTeclado+
            ", "+
            super.toString()+
            "}";
  }

}
