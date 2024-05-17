import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Programa extends JPanel implements ActionListener {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JTextField jcomp3;
    private JTextField jcomp4;
    private JButton jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JTextArea jcomp8;
    private JButton jcomp9;
    private BusRouteService busRouteService;

    public Programa() {
        busRouteService = new BusRouteService();
        jcomp1 = new JLabel("Latitud:");
        jcomp2 = new JLabel("Longitud:");
        jcomp3 = new JTextField(5);
        jcomp4 = new JTextField(5);
        jcomp5 = new JButton("Buscar");
        jcomp5.addActionListener(this);
        jcomp6 = new JLabel("Rutas");
        jcomp7 = new JLabel("Horario");
        jcomp8 = new JTextArea(5, 5);
        jcomp9 = new JButton("Cerrar");
        jcomp9.addActionListener(this);

        // adjust size and set layout
        setPreferredSize(new Dimension(347, 499));
        setLayout(null);

        // add components
        add(jcomp1);
        add(jcomp2);
        add(jcomp3);
        add(jcomp4);
        add(jcomp5);
        add(jcomp6);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);

        // set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds(60, 25, 100, 25);
        jcomp2.setBounds(60, 75, 100, 25);
        jcomp3.setBounds(130, 25, 100, 25);
        jcomp4.setBounds(130, 75, 100, 25);
        jcomp5.setBounds(130, 135, 100, 25);
        jcomp6.setBounds(95, 200, 100, 25);
        jcomp7.setBounds(210, 200, 100, 25);
        jcomp8.setBounds(70, 240, 215, 170);
        jcomp9.setBounds(130, 455, 100, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jcomp5) {
            try {
                double latitude = Double.parseDouble(jcomp3.getText());
                double longitude = Double.parseDouble(jcomp4.getText());
                BusRoute[] routes = busRouteService.getNearbyRoutes(latitude, longitude);

                StringBuilder sb = new StringBuilder();
                sb.append("Las rutas de autobús más cercanas (")
                  .append(latitude).append(", ").append(longitude).append(") son:\n\n");

                for (BusRoute route : routes) {
                    sb.append(route.getName()).append(" - Horarios: ");
                    sb.append(String.join(", ", route.getSchedule())).append("\n");
                }

                jcomp8.setText(sb.toString());
            } catch (NumberFormatException ex) {
                jcomp8.setText("Por favor, ingrese coordenadas válidas.");
            }
        } else if (e.getSource() == jcomp9) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Programa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Programa());
        frame.pack();
        frame.setVisible(true);
    }
}
