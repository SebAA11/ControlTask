import CONEXION.CConexion;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnLogin;

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtUsuario = new JTextField(15);
        txtContrasena = new JPasswordField(15);
        btnLogin = new JButton("Iniciar sesión");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuario:"));
        panel.add(txtUsuario);
        panel.add(new JLabel("Contraseña:"));
        panel.add(txtContrasena);
        panel.add(btnLogin);

        add(panel);

        btnLogin.addActionListener(e -> verificarUsuario());
    }

    private void verificarUsuario() {
        String usuario = txtUsuario.getText();
        String contrasena = new String(txtContrasena.getPassword());

        CConexion conexion = new CConexion();
        Connection con = conexion.estableceConexion();

        String sql = "SELECT rol FROM usuarios WHERE ingresoUsuario = ? AND ingresoContraseña = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String rol = rs.getString("rol");

                switch (rol.toLowerCase()) {
                    case "admin":
                        new MenuAdmin().setVisible(true);
                        break;
                    case "usuario":
                        new MenuUsuario().setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Rol no reconocido");
                        return;
                }

                this.dispose(); // Cierra login

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error en la base de datos: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
