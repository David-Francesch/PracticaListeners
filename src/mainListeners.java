import javax.swing.*;

import org.w3c.dom.events.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

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

                String user = "david";
                String pass = "12345";

                boolean passTrue = Arrays.equals(pass.toCharArray(), passtx.getPassword());
                boolean userTrue = usertx.getText().equals(user);

                if ((userTrue) && (passTrue)){
                    JOptionPane.showMessageDialog(log, "El usuario y contraseña es correcto", "pulsado", 3);
                }
                if (!(userTrue) && !(passTrue)) {
                    JOptionPane.showMessageDialog(log, "El usuario y contraseña son incorrectos", "pulsado", 2);
                }else if (!(userTrue)) {
                    JOptionPane.showMessageDialog(log, "El usuario es incorrecto", "pulsado", 2);
                }else if (!(passTrue)) {
                    JOptionPane.showMessageDialog(log, "La contraseña es incorrecta", "pulsado", 2);
                }
            }
        };

        ActionListener register = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame registroVentana = new JFrame("Formulario de Registro");
                registroVentana.setSize(450, 350);
                registroVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
                JPanel panelRegistro = new JPanel();
                registroVentana.add(panelRegistro);
                registroVentana(panelRegistro);
                registroVentana.setVisible(true);
            }
    
        };

        usertx.addActionListener(comppass);
        passtx.addActionListener(comppass);
        log.addActionListener(comppass);
        reg.addActionListener(register);
        }

        public static void registroVentana(JPanel panel){
            panel.setLayout(null);
    
            JLabel titulo = new JLabel("Ventana de Registro");
            titulo.setBounds(95, 5, 250, 25);
            panel.add(titulo);
            
            JLabel userLabel = new JLabel("Usuario");
            userLabel.setBounds(5, 45, 80, 25);
            panel.add(userLabel);
    
            JTextField userName = new JTextField(50);
            userName.setBounds(100, 45, 200, 25);
            panel.add(userName);
    
            JLabel passLabel = new JLabel("Contraseña");
            passLabel.setBounds(5, 80 , 80, 25);
            panel.add(passLabel);
    
            JPasswordField passField = new JPasswordField(20);
            passField.setBounds(100, 80, 200, 25);
            panel.add(passField);
    
            JButton acceptButton = new JButton("Aceptar");
            acceptButton.setBounds(5, 120, 100, 25);
            panel.add(acceptButton);
    
            JButton cancelButton = new JButton("Cancelar");
            cancelButton.setBounds(200, 120, 100, 25);
            panel.add(cancelButton);
    
            
        }
    }

