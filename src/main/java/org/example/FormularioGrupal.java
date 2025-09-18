package org.example;

import javax.swing.*;
import java.awt.*;

public class FormularioGrupal extends JFrame {
    public FormularioGrupal() {
        setTitle("Formulario Grupal");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Imagen de fondo
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));

        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelFondo.setLayout(new GridBagLayout());

        // Colores de texto
        Color textoColor = Color.WHITE;
        Font fuente = new Font("Arial", Font.BOLD, 14);

        // Configuración del GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // más espacio
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        // Campos con tamaño uniforme
        Dimension campoDimension = new Dimension(200, 30);

        JLabel labelNombre = new JLabel("Nombre del grupo:");
        labelNombre.setForeground(textoColor);
        labelNombre.setFont(fuente);
        JTextField textNombre = new JTextField();
        textNombre.setPreferredSize(campoDimension);

        JLabel labelIntegrantes = new JLabel("Integrantes:");
        labelIntegrantes.setForeground(textoColor);
        labelIntegrantes.setFont(fuente);
        JTextArea textIntegrantes = new JTextArea(4, 20);
        textIntegrantes.setLineWrap(true);
        textIntegrantes.setWrapStyleWord(true);
        JScrollPane scrollIntegrantes = new JScrollPane(textIntegrantes);
        scrollIntegrantes.setPreferredSize(new Dimension(200, 80));

        JLabel labelProyecto = new JLabel("Proyecto:");
        labelProyecto.setForeground(textoColor);
        labelProyecto.setFont(fuente);
        JTextField textProyecto = new JTextField();
        textProyecto.setPreferredSize(campoDimension);

        JLabel labelFecha = new JLabel("Fecha de inicio:");
        labelFecha.setForeground(textoColor);
        labelFecha.setFont(fuente);
        JTextField textFecha = new JTextField();
        textFecha.setPreferredSize(campoDimension);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setPreferredSize(new Dimension(100, 35));

        // Agregar componentes
        gbc.gridx = 0; gbc.gridy = 0;
        panelFondo.add(labelNombre, gbc);
        gbc.gridx = 1;
        panelFondo.add(textNombre, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panelFondo.add(labelIntegrantes, gbc);
        gbc.gridx = 1;
        panelFondo.add(scrollIntegrantes, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panelFondo.add(labelProyecto, gbc);
        gbc.gridx = 1;
        panelFondo.add(textProyecto, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panelFondo.add(labelFecha, gbc);
        gbc.gridx = 1;
        panelFondo.add(textFecha, gbc);

        gbc.gridx = 1; gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panelFondo.add(btnEnviar, gbc);

        add(panelFondo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioGrupal formulario = new FormularioGrupal();
            formulario.setVisible(true);
        });
    }
}
