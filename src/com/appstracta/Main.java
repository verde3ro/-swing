package com.appstracta;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class Main {

	private JFrame frame;

	public Main() {
		inicializar();
	}

	public static void main(String[] args) {
		System.out.println("Hilo principal");

		// Se lanaza la ventana
		EventQueue.invokeLater(() -> {
			System.out.println("Hilo de la ventana ");
			try {
				Main window = new Main();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	private void inicializar() {
		// Creamos ventana
		frame = new JFrame("Hola Mundo");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creamos botón
		JButton btnSaludo = new JButton("HOLA");
		frame.getContentPane().add(btnSaludo, BorderLayout.CENTER);

		// Creamos etiqueta
		JLabel lblSaludo = new JLabel();
		frame.getContentPane().add(lblSaludo, BorderLayout.SOUTH);

		// Evento con clase anonima
		btnSaludo.addActionListener(actionEvent -> lblSaludo.setText("Hola Mundo...."));
	}

}
