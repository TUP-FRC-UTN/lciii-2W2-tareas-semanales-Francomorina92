
package clasecomposicion;

public class Municipalidad {
    private Plan [] planes;
    
    public Municipalidad(int tamanio)
    {
        planes = new Plan[tamanio];
    }
    
    public void agregarPlan(Plan p)
    {
        for (int i = 0; i < planes.length; i++) {
            if(planes[i] == null)
            {
                planes[i] = p;
                break;
            }
        }
    }
    
    public int cantidadPlanesPagados()
    {
        int cantidad = 0;
        
        /*for (int i = 0; i < planes.length; i++) {
            if(planes[i] != null && planes[i].estaPagadoTotalmente())
                cantidad++;
        }*/
        
        for (int i = 0; i < planes.length; i++) {
            if(planes[i] != null)
            {
                if(planes[i].estaPagadoTotalmente())
                    cantidad++;
            }   
        }
        
        return cantidad;
    }
    
    public double promedioIntereses()
    {
        double totalIntereses = 0;
        int contadorPlanes = 0;
        for (int i = 0; i < planes.length; i++) {
            if(planes[i] != null)
            {
                totalIntereses += planes[i].sumaInteresesCobrados();
                contadorPlanes++;
            }
        }
        
        return totalIntereses / contadorPlanes;
    }
}
