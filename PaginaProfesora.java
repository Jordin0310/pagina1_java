import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class PaginaProfesora extends JFrame {

    public PaginaProfesora() {
        setTitle("Página Web Profesor");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Encabezado superior
        JLabel header = new JLabel("Página de la Profesora", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.decode("#333333"));
        header.setForeground(Color.WHITE);
        header.setFont(new Font("SansSerif", Font.BOLD, 24));
        header.setPreferredSize(new Dimension(600, 50));
        add(header, BorderLayout.NORTH);

        // Panel central con contenido
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("Doctora Erika Yunuen Morales Mateos", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 22));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel subtitulo = new JLabel("La Doctora Erika, Docente de la universidad UJAT en la División de Tecnologías de la Información", SwingConstants.CENTER);
        subtitulo.setFont(new Font("Serif", Font.PLAIN, 16));
        subtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel parrafo = new JLabel("<html><div style='text-align: center;'>Durante su trayectoria como docente ha impartido diversas asignaturas en esta división, <br>siendo la programación una de sus asignaturas más fuertes.</div></html>");
        parrafo.setFont(new Font("Arial", Font.PLAIN, 18));
        parrafo.setForeground(Color.BLUE);
        parrafo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel imagen = new JLabel();
        ImageIcon icon = new ImageIcon("avatar1.jpg"); // Asegúrate de tener esta imagen en tu proyecto
        imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(340, -1, Image.SCALE_SMOOTH)));
        imagen.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(titulo);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(subtitulo);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(parrafo);
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(imagen);
        centerPanel.add(Box.createVerticalStrut(20));

        add(centerPanel, BorderLayout.CENTER);

        // Panel de enlaces
        JPanel enlacesPanel = new JPanel();
        enlacesPanel.setLayout(new BoxLayout(enlacesPanel, BoxLayout.Y_AXIS));
        enlacesPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);

        enlacesPanel.add(createLinkButton("Ir a Tiktok", "https://www.tiktok.com"));
        enlacesPanel.add(createLinkButton("Ir a Facebook", "https://www.facebook.com"));
        enlacesPanel.add(createLinkButton("Ir a Instagram", "https://www.instagram.com"));
        enlacesPanel.add(createLinkButton("Ir a Correo", "https://www.gmail.com"));

        add(enlacesPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null); // Centra la ventana
        setVisible(true);
    }

    private JButton createLinkButton(String text, String url) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.RIGHT_ALIGNMENT);
        button.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "No se pudo abrir el enlace.");
            }
        });
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PaginaProfesora());
    }
}
