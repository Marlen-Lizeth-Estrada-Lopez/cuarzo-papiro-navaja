package Controlador;
import Vista.vista;
import Vista.vistaGui;
import Modelo.modelo;
import Modelo.elecciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class controlador implements MouseListener, ActionListener{
    private modelo modelo;
    private vista vista;

    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mostrarVista(){
        vista.mostrarVista(this);
    }

    public void IniciarCuarzoPapiroNavaja() {
        elecciones eleccionDelBot = modelo.InteligenciaDelBot();
        elecciones eleccionDelJugador = vista.ConseguirEleccionDelJugador();
        vista.CuarzoPapiroNavajaBot(eleccionDelBot);
        vista.CuarzoPapiroNavajaJugador(eleccionDelJugador);
        modelo.DefinirWins(eleccionDelJugador, eleccionDelBot);
        byte victoriasJugador = modelo.getWinsDelJugador();
        byte victoriasBot = modelo.getWinsDelBot();
        vista.VerWins(victoriasJugador, victoriasBot);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() != null){
            if (e.getSource() == vistaGui.papiro){
                vistaGui.eleccionesDeLaGui = elecciones.PAPIRO;
            }
            else if (e.getSource() == vistaGui.cuarzo){
                vistaGui.eleccionesDeLaGui = elecciones.CUARZO;
            }
            else if (e.getSource() == vistaGui.navaja){
                vistaGui.eleccionesDeLaGui = elecciones.NAVAJA;
            }
            IniciarCuarzoPapiroNavaja();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        IniciarCuarzoPapiroNavaja();
    }
}
