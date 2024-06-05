package Vista;
import Modelo.elecciones;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Container;

public class vistaGui extends JFrame implements vista{

    Container container;
    GridLayout layout1;
    GridLayout layout2; 
    GridLayout layout3;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    JPanel panel7;
    public static Icon cuarzoJugador = new ImageIcon(new ImageIcon("src/Vista/elecciones/cuarzo.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon papiroJugador = new ImageIcon(new ImageIcon("src/Vista/elecciones/papiro.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon navajaJugador =new ImageIcon(new ImageIcon("src/Vista/elecciones/navaja.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon cuarzoBot = new ImageIcon(new ImageIcon("src/Vista/elecciones/cuarzo.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon papiroBot = new ImageIcon(new ImageIcon("src/Vista/elecciones/papiro.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon navajaBot = new ImageIcon(new ImageIcon("src/Vista/elecciones/navajaBot.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static JLabel papiro = new JLabel(papiroJugador);
    public static JLabel cuarzo = new JLabel(cuarzoJugador);
    public static JLabel navaja = new JLabel(navajaJugador);
    public static elecciones eleccionesDeLaGui;
    JLabel mitadDelBot = new JLabel("Papaleta");
    JLabel bot = new JLabel();
    JLabel mitadDelJugador = new JLabel("Jugador");
    JLabel jugador = new JLabel();

    public vistaGui(){
        container = getContentPane();
        layout1 = new GridLayout(2,1);
        container.setLayout(layout1);
        Border borde = new LineBorder(Color.PINK, 4);
        layout2 = new GridLayout(1,2);
        panel1 = new JPanel();
        panel1.setLayout(layout2);    
        panel1.setBorder(borde);
        panel1.setBackground(Color.RED);
        panel2 = new JPanel();
        layout3 = new GridLayout(1,3);
        panel2.setLayout(layout2);
        panel2.setBorder(borde);
        panel2.setBackground(Color.RED); 
        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.setBorder(borde);
        panel3.setBackground(Color.RED);
        panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.setBorder(borde);
        panel4.setBackground(Color.RED);
        panel5 = new JPanel();
        panel5.setBorder(borde);
        panel5.setBackground(Color.RED);
        panel6 = new JPanel();
        panel6.setBorder(borde);
        panel6.setBackground(Color.RED);
        panel7 = new JPanel();
        panel7.setBorder(borde);
        panel7.setBackground(Color.RED);
        panel3.add(mitadDelJugador);
        panel3.add(jugador);
        panel4.add(mitadDelBot);
        panel4.add(bot);
        panel5.add(cuarzo);
        panel6.add(papiro);
        panel7.add(navaja);
        panel1.add(panel3);
        panel1.add(panel4);
        panel2.add(panel5);
        panel2.add(panel6);
        panel2.add(panel7);
        container.add(panel1);
        container.add(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setTitle("Van a jugar cuarzo, papiro, navaja por mi viejo sitalon");
        setLocationRelativeTo(null);
        setResizable(false);

    }

}