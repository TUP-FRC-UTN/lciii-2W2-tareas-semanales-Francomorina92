package clasecomposicion;

public class ClaseComposicion {

    public static void main(String[] args) {
        int tamanio = 3;
        Municipalidad muni = new Municipalidad(tamanio);
        
        //carga de los datos por parte del usuario
        Plan p = new Plan("christian", 1000, 3);
        
        //Lo agregamos al vector de planes de la municipalidad
        muni.agregarPlan(p);
        
        
        System.out.println("La cantidad de planes pagados totalmente es de " + muni.cantidadPlanesPagados());
        System.out.println("El promedio de intereses pagados por los contribuyentes es de " + muni.promedioIntereses());
    }   
}
