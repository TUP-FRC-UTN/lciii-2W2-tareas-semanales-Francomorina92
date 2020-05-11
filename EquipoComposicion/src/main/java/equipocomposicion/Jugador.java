
package equipocomposicion;

public class Jugador {
    
    private String nombre;
    private int posicion;
    private int numeroCamiseta;
    private int cantidadPartidos;
    private int estadoFisico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(int cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public Jugador(String nombre, int posicion, int numeroCamiseta, int cantidadPartidos, int estadoFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.cantidadPartidos = cantidadPartidos;
        this.estadoFisico = estadoFisico;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", numeroCamiseta=" + numeroCamiseta + ", cantidadPartidos=" + cantidadPartidos + ", estadoFisico=" + estadoFisico + '}';
    }
    
    
}


