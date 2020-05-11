
package equipocomposicion;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        String nombreEquipo;
        int cantidadJugadores;
        
            System.out.println("Ingrese el nombre del Equipo");
            nombreEquipo=sc.next();
            System.out.println("Ingrese la cantidad de jugadores");
            cantidadJugadores=sc.nextInt();
            
            Equipo e = new Equipo(nombreEquipo, cantidadJugadores);
            
            for (int i = 0; i < cantidadJugadores; i++) {
                System.out.println("Ingrese el nombre del jugador");
                String nombre=sc.next();
                System.out.println("Ingrese la Posicion: 1=Arquero 2=Defensor 3=Mediocampo 4=Delantero");
                int posicion=sc.nextInt();
                System.out.println("Ingrese el Numero camiseta");
                int numero=sc.nextInt();
                System.out.println("Ingrese la Cantidad Partidos");
                int cantidadPartidos=sc.nextInt();
                System.out.println("Ingrese la Condicion");
                int condicion=sc.nextInt();
                
                Jugador nuevo=new Jugador(nombre,posicion,numero,cantidadPartidos,condicion);
                
                e.agregarJugador(nuevo);
            }
            System.out.println("Cantidad de jugadores con menos de 10 partidos: "+ e.cantidadMenos10());
            System.out.println("Nombre jugador con ayor cantidad de partidos " + e.nombreMayorPartidos());
            System.out.println("Promedio estado fisico " + e.promedioEquipo());
            System.out.println("Promedio de partidos jugador de los jugadores de cada posicion " + e.partidosPosicion());
            
            
        }
        
}
