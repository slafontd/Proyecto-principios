public class BusRouteService {
    public BusRoute[] getNearbyRoutes(double latitude, double longitude) {
        // Datos simulados para rutas de autobús
        return new BusRoute[]{
            new BusRoute("Ruta 1", new String[]{"08:00", "12:00", "16:00"}),
            new BusRoute("Ruta 2", new String[]{"09:00", "13:00", "17:00"}),
            new BusRoute("Ruta 3", new String[]{"10:00", "14:00", "18:00"})
        };
    }
}
