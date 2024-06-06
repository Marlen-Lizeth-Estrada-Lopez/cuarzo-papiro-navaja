package Vista;
import Controlador.controlador;
import Modelo.elecciones;
import java.util.Scanner;

public class vistaTerminal implements vista {
    public Scanner scanner;

    public vistaTerminal() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarVista(controlador controlador) {
        System.out.println("Van a jugar cuarzo, papiro, navaja por mi viejo sitalon ¡ENFRENTA A PAPALETA!");
        boolean continuarjuego = true;
        while (continuarjuego) {
            controlador.actionPerformed(null);
            System.out.println("¿Quieres jugar otra ronda? Escribe si para continuar o no para terminar: ");
            String eleccion = scanner.nextLine().toLowerCase();
            continuarjuego = eleccion.equals("si");
        }
    }

    @Override
    public void CuarzoPapiroNavajaBot(elecciones elecciondelBot) {
        System.out.println("Elección de papaleta: " + elecciondelBot);
    }

    @Override
    public void CuarzoPapiroNavajaJugador(elecciones elecciondelJugador) {
        System.out.println("Elección del jugador: " + elecciondelJugador);
    }

    @Override
    public elecciones ConseguirEleccionDelJugador() {
        System.out.println("Selecciona tu jugada: CUARZO, PAPIRO O NAVAJA");
        String eleccion = scanner.nextLine().toUpperCase();
        try {
            return elecciones.valueOf(eleccion);
        } catch (IllegalArgumentException e) {
            System.out.println("Lo que dijitaste no es valido, por favor escribe una de las opciones que se te mostraron");
            return ConseguirEleccionDelJugador();
        }
    }

    @Override
    public void VerWins(int winsDelJugador, int winsDelBot) {
        System.out.println("Victorias del jugador: " + winsDelJugador + " --- Victorias de Papaleta: " + winsDelBot);
    }
}