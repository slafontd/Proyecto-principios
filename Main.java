import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Programa principal");
    ubicacion();
    Panel();
    alertas();
  }
  public static void ubicacion(){
    Scanner sc = new Scanner(System.in);
    int lat, log;
    System.out.println("Ingrese latitud:");
    lat = sc.nextInt();
    System.out.println("Ingrese longitud:");
    log = sc.nextInt();
  }
  public static void Panel() {
    String[] horario = {"Horario 1", "Horario 2", "Horario 3"};
    String[] rutas = {"Ruta 1", "Ruta 2", "Ruta 3"};
  }
  public static void alerta(){
    String alertas;
    alertas = ("alertas");
    System.out.println(alertas); 
  }
}
