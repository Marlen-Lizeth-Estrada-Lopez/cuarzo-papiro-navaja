package Vista;
import Modelo.elecciones;
import Controlador.controlador;

public interface vista {
    void mostrarVista(controlador controlador);
    void CuarzoPapiroNavajaJugador(elecciones elecciondelJugador);
    void CuarzoPapiroNavajaBot(elecciones elecciondelBot);
    elecciones ConseguirEleccionDelJugador();
    void VerWins(int winsDelJugador, int winsDelBot);
}