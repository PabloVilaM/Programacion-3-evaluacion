package boletin27;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;


public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField lineaTexto1, lineaTexto2;
    JLabel etiqueta1, etiqueta2;
    JTextArea zonaTexto;
    String contra;
    String nombre;
    
    
    
    public void compoñentes(String tipo){
        
        marco = new JFrame(tipo);
        marco.setSize(900, 800);
        panel = new JPanel();
        panel.setLayout(null);
        boton1 = new JButton( "Premer");
        boton1.setBounds(150, 600, 200, 50);
        boton2 = new JButton("Limpar");
        boton2.setBounds(550, 600, 200, 50);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        etiqueta1 = new JLabel("NOME");
        etiqueta1.setBounds(150, 80, 100, 75);
        
        etiqueta2 = new JLabel("PASSWORD");
        etiqueta2.setBounds(150, 150, 100, 75);
        
        lineaTexto1 = new JTextField();
        lineaTexto1.setBounds(250, 90, 500, 50);
        
        lineaTexto2 = new JTextField();
        lineaTexto2.setBounds(250, 160, 500, 50);
        
        zonaTexto = new JTextArea("Area de texto");      
        zonaTexto.setBounds(150, 250, 600, 250);
        
    }
    
    public void pecharVentana(){
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
    public void vent(){
        this.compoñentes("Ventana");
        marco.add(panel);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(zonaTexto);
        panel.add(lineaTexto1);
        panel.add(lineaTexto2);
        this.pecharVentana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object b = e.getSource();
        if (b == boton1){
            nombre = lineaTexto1.getText();
            contra = lineaTexto2.getText();
            zonaTexto.setText("Hola "+ nombre + " tu contraseña es: " + contra);
        }
        else if (b == boton2){
            zonaTexto.setText("");
        }
    }
}
