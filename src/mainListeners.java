import javax.swing.*;

import org.w3c.dom.events.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class mainListeners extends JFrame {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Login");

        mapa(frame);

        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void mapa(JFrame frame) {

        JPanel panel = new JPanel();
        JLabel user = new JLabel("User");
        JLabel pass = new JLabel("Password");
        panel.setLayout(null);

        frame.add(panel);

        user.setBounds(50, 50, 100, 30);
        pass.setBounds(50, 100, 100, 30);

        JTextField usertx = new JTextField();
        JPasswordField passtx = new JPasswordField();

        usertx.setBounds(150, 55, 150, 20);
        passtx.setBounds(150, 105, 150, 20);

        JButton log = new JButton("Login");
        JButton reg = new JButton("Register");

        log.setBounds(50, 150, 100, 20);
        reg.setBounds(200, 150, 100, 20);

        panel.add(log);
        panel.add(reg);
        panel.add(user);
        panel.add(pass);
        panel.add(usertx);
        panel.add(passtx);

        ActionListener comppass = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // String pass = String.copyValueOf(passtx.getPassword());

                if (usertx.getText() != "david") {
                    JOptionPane.showMessageDialog(null, "Usuario correcto","Usuario correcto", JOptionPane.INFORMATION_MESSAGE);
                }

                    // if ((user.getText() != "david") && (pass != "12345")) {
                    //     JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos","Usuario y contraseña incorrectos", JOptionPane.ERROR_MESSAGE);
                    // } else if (user.getText() != "david") {
                    //     JOptionPane.showMessageDialog(null, "Usuario incorrecto", "Usuario incorrecto", JOptionPane.ERROR_MESSAGE);
                    // } else if (pass != "12345") {
                    //     JOptionPane.showMessageDialog(null, "Contraseña incorrecto", "Contraseña incorrecto", JOptionPane.ERROR_MESSAGE);
                    // }
                }
            };

        usertx.addActionListener(comppass);
        passtx.addActionListener(comppass);
        log.addActionListener(comppass);
        }
        // public static void comprobarDatos(JTextField user, JPasswordField pass,
        // KeyEvent e) {
        // public static void comprobarDatos(KeyEvent e) {

        //     JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos", "Usuario y contraseña incorrectos",
        //             ERROR);
        //     // String passw = pass.getPassword().toString();
        //     // if (e.getKeyChar() == KeyEvent.VK_ENTER) {
        //     // if ((user.getText() != "david") && (passw != "12345")) {
        //     // JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos",
        //     // "Usuario y contraseña incorrectos", ERROR);
        //     // } else if (user.getText() != "david") {
        //     // JOptionPane.showMessageDialog(null, "Usuario incorrecto", "Usuario
        //     // incorrecto", ERROR);
        //     // } else if (passw != "12345") {
        //     // JOptionPane.showMessageDialog(null, "Contraseña incorrecto", "Contraseña
        //     // incorrecto", ERROR);
        //     // }
        //     // e.consume();
        //     // }
        // }
    }

