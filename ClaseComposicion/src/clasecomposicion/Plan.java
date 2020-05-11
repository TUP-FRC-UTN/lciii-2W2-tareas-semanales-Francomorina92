
package clasecomposicion;

public class Plan {
    private String nombre;
    private double deuda;
    private int cuotas;
    private Pago[] pagos;

    public Plan(String nombre, double deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        pagos = new Pago[cuotas];
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }
    
    public void agregarPago(Pago p)
    {
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i] == null)
            {
                pagos[i] = p;
                break;
            }
        }
    }
    
    public boolean estaPagadoTotalmente()
    {
        boolean estaPago = true;
        
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i] == null)
            {
                estaPago = false;
                break;
            }
        }
        
        return estaPago;
    }
    
    public double sumaInteresesCobrados()
    {
        double sumaIntereses = 0;
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i] != null)
            {
                if(pagos[i].getDemora() > 0)
                    sumaIntereses += pagos[i].getDemora() * pagos[i].getInteresesAdicionales() * pagos[i].getImporte();
            }
        }
        
        return sumaIntereses;
    }
}
