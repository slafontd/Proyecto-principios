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

public class Usuario {

    private String idUsuario;
    private String nombre;
    private Ubicacion ubicacionActual;
    private Preferencias preferencias;

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.ubicacionActual = null;
        this.preferencias = new Preferencias();
    }

    public void iniciarSesion(Ubicacion ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public void cerrarSesion() {
        this.ubicacionActual = null;
    }

    public ListaRutas buscarRutas(Ubicacion destino) {
       
        return new ListaRutas(); 
    }

    public Ruta personalizarRuta(Ruta ruta) {
        
        return ruta; 
    }

public class Ubicacion {

    private double latitud;
    private double longitud;
    private String nombre;

    public Ubicacion(double latitud, double longitud, String nombre) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                ", nombre='" + nombre + '\'' +
                '}';
    }



    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class Preferencias {

    private String medioTransportePredilecto;
    private int tiempoMaximoViaje;
    private int cantidadCaminataMaxima;

    public Preferencias() {
        this.medioTransportePredilecto = "Autobús";
        this.tiempoMaximoViaje = 30;
        this.cantidadCaminataMaxima = 15;
    }

    public void actualizarPreferencias(String medioTransporte, int tiempoMaximo, int cantidadCaminata) {
        this.medioTransportePredilecto = medioTransporte;
        this.tiempoMaximoViaje = tiempoMaximo;
        this.cantidadCaminataMaxima = cantidadCaminata;
    }



    public String getMedioTransportePredilecto() {
        return medioTransportePredilecto;
    }

    public void setMedioTransportePredilecto(String medioTransportePredilecto) {
        this.medioTransportePredilecto = medioTransportePredilecto;
    }

    public int getTiempoMaximoViaje() {
        return tiempoMaximoViaje;
    }

    public void setTiempoMaximoViaje(int tiempoMaximoViaje) {
        this.tiempoMaximoViaje = tiempoMaximoViaje;
    }

    public int getCantidadCaminataMaxima() {
        return cantidadCaminataMaxima;
    }


