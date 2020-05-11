
package equipocomposicion;


public class Equipo {
    private String nombreEquipo;
    private Jugador[] jugadores;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Equipo(String nombreEquipo, int cantidad) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores=new Jugador[cantidad];
    }
    
    public void agregarJugador(Jugador nuevo){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i]==null) {
                jugadores[i]=nuevo;
                return;
            }            
        }
    }
    public int cantidadMenos10(){
        int c=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i]!=null && jugadores[i].getCantidadPartidos()<10) {
                c++;
            }            
        }
        return c;
    }
    public String nombreMayorPartidos(){
            String nombre="";
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i]!=null) {
                if (i!=0&&jugadores[i].getCantidadPartidos()>jugadores[i-1].getCantidadPartidos()) {
                    nombre=jugadores[i].getNombre();
                }    
            }            
        }
        return nombre;
    }
    public float promedioEquipo(){
        int promedio=0;
        int cantidad=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i]!=null) {
                promedio+=jugadores[i].getEstadoFisico();
                cantidad++;
            }            
        }
        return(float)promedio/cantidad;
    }
    public String partidosPosicion(){
        
        int c[]=new int[4];
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i]!=null) {
                if (jugadores[i].getPosicion()==1) {
                    c[0]++;
                }else if(jugadores[i].getPosicion()==2){
                    c[1]++;
                }else if(jugadores[i].getPosicion()==3){
                    c[2]++;
                }else if(jugadores[i].getPosicion()==4){
                    c[3]++;
                }
            }            
        }
        return "De Arquero se jugaron " + c[0] + " partidos" + "\n" + "De Defensor se jugaron " + c[1] + " partidos" + "\n" + "De Mediocampo se jugaron " + c[2] + " partidos" + "\n" +"De  Delantero se jugaron " + c[3] + " partidos" + "\n" ;
    }
}
