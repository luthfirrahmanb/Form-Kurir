package com.mercubuana.uts_luthfir_aulia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormTampilkanKurir {

	private JFrame frmFormTampilkanKurir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormTampilkanKurir window = new FormTampilkanKurir();
					window.frmFormTampilkanKurir.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormTampilkanKurir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormTampilkanKurir = new JFrame();
		frmFormTampilkanKurir.setTitle("Form Tampilkan Kurir - PT. Kurir ABC");
		frmFormTampilkanKurir.setBounds(100, 100, 450, 300);
		frmFormTampilkanKurir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmFormTampilkanKurir.getContentPane().setLayout(null);
		
		JButton btnTampilkanDataKurir = new JButton("Tampilkan Data Kurir");
		btnTampilkanDataKurir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String daftarKurir = "";
				
				daftarKurir = HandlerTampilkanKurir.getDaftarKurir();
				
				JOptionPane.showMessageDialog(null, daftarKurir);
			}
		});
		btnTampilkanDataKurir.setBounds(133, 100, 164, 26);
		frmFormTampilkanKurir.getContentPane().add(btnTampilkanDataKurir);
	}

}
