package com.mercubuana.uts_luthfir_aulia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormKurir {

	private JFrame frmFormKurir;
	private JTextField txtIdKurir;
	private JTextField txtNamaKurir;
	private JTextField txtNomorTelpon;
	private JTextField txtTujuanPengiriman;
	private JComboBox cmbTipePengiriman;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormKurir window = new FormKurir();
					window.frmFormKurir.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormKurir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormKurir = new JFrame();
		frmFormKurir.setTitle("Form Kurir - PT. Kurir ABC");
		frmFormKurir.setBounds(100, 100, 450, 300);
		frmFormKurir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmFormKurir.getContentPane().setLayout(null);
		
		JLabel lblIdKurir = new JLabel("Id Kurir:");
		lblIdKurir.setBounds(12, 12, 55, 16);
		frmFormKurir.getContentPane().add(lblIdKurir);
		
		JLabel lblNamaKurir = new JLabel("Nama Kurir:");
		lblNamaKurir.setBounds(12, 40, 83, 16);
		frmFormKurir.getContentPane().add(lblNamaKurir);
		
		JLabel lblNomorTelepon = new JLabel("Nomor Telepon:");
		lblNomorTelepon.setBounds(12, 68, 91, 16);
		frmFormKurir.getContentPane().add(lblNomorTelepon);
		
		JLabel lblTujuanPengeriman = new JLabel("Tujuan Pengiriman:");
		lblTujuanPengeriman.setBounds(12, 96, 120, 16);
		frmFormKurir.getContentPane().add(lblTujuanPengeriman);
		
		JLabel lblTipePengeriman = new JLabel("Tipe Pengiriman:");
		lblTipePengeriman.setBounds(12, 124, 105, 16);
		frmFormKurir.getContentPane().add(lblTipePengeriman);
		
		txtIdKurir = new JTextField();
		txtIdKurir.setBounds(127, 10, 114, 20);
		frmFormKurir.getContentPane().add(txtIdKurir);
		txtIdKurir.setColumns(10);
		
		txtNamaKurir = new JTextField();
		txtNamaKurir.setColumns(10);
		txtNamaKurir.setBounds(127, 38, 114, 20);
		frmFormKurir.getContentPane().add(txtNamaKurir);
		
		txtNomorTelpon = new JTextField();
		txtNomorTelpon.setColumns(10);
		txtNomorTelpon.setBounds(127, 66, 114, 20);
		frmFormKurir.getContentPane().add(txtNomorTelpon);
		
		txtTujuanPengiriman = new JTextField();
		txtTujuanPengiriman.setColumns(10);
		txtTujuanPengiriman.setBounds(127, 94, 114, 20);
		frmFormKurir.getContentPane().add(txtTujuanPengiriman);
		
		cmbTipePengiriman = new JComboBox();
		cmbTipePengiriman.setModel(new DefaultComboBoxModel(new String[] {"Reguler", "Express"}));
		cmbTipePengiriman.setBounds(127, 120, 114, 25);
		frmFormKurir.getContentPane().add(cmbTipePengiriman);
		
		JButton btnRekamDataKurir = new JButton("Rekam Data Kurir");
		btnRekamDataKurir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idKurir = 0;
				String namaKurir = "";
				int nomorTelpon = 0;
				String tujuanPengiriman = "";
				char tipePengiriman = 'R';
				
				idKurir = Integer.parseInt(txtIdKurir.getText());
				namaKurir = txtNamaKurir.getText();
				nomorTelpon = Integer.parseInt(txtNomorTelpon.getText());
				tujuanPengiriman = txtTujuanPengiriman.getText();
				if (cmbTipePengiriman.getSelectedIndex()==1){
					tipePengiriman = 'E';
				}
				
				HandlerKurir.rekamDataKurir(idKurir, namaKurir, nomorTelpon, tujuanPengiriman, tipePengiriman);
				JOptionPane.showMessageDialog(null, "Data Kurir berhasil direkam!");
			}
		});
		btnRekamDataKurir.setBounds(5, 157, 158, 26);
		frmFormKurir.getContentPane().add(btnRekamDataKurir);
	}
}
