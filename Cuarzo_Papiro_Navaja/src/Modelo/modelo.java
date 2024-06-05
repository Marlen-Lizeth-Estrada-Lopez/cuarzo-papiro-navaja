package Modelo;
import java.util.Random;

public class modelo{
    private byte winsDelJugador;
    private byte winsDelBot;

    public modelo() {
        winsDelJugador = 0;
        winsDelBot = 0;
    }

    public byte getWinsDelJugador() {
        return winsDelJugador;
    }

    public byte getWinsDelBot() {
        return winsDelBot;
    }


public elecciones InteligenciaDelBot() {
    Random random = new Random();
    int numeroAlAzar = random.nextInt(3);
    return elecciones.values()[numeroAlAzar];
}

public void DefinirWins(elecciones eleccionDelJugador, elecciones eleccionDelBot) {
    if (eleccionDelJugador.equals(eleccionDelBot)) {} 
    else if ((eleccionDelJugador.equals(elecciones.CUARZO) && eleccionDelBot.equals(elecciones.NAVAJA))
            || (eleccionDelJugador.equals(elecciones.PAPIRO) && eleccionDelBot.equals(elecciones.CUARZO))
            || (eleccionDelJugador.equals(elecciones.NAVAJA) && eleccionDelBot.equals(elecciones.PAPIRO))) {
        winsDelJugador++;
    } else {
        winsDelBot++;
    }
}
}