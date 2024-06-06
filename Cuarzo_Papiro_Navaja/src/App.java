import Controlador.controlador;
import Modelo.modelo;
import Vista.vistaGui;
import Vista.vistaTerminal;


public class App {
    public static void main(String[] args) {
        modelo modelo = new modelo();
        vistaGui gui = new vistaGui();
        vistaTerminal vista = new vistaTerminal();
        controlador controladorGui = new controlador(modelo, gui);
        controlador controladorTerminal = new controlador(modelo, vista);
        controladorGui.mostrarVista();
        controladorTerminal.mostrarVista();

    }
}
