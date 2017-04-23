package com.mercubuana.uts_luthfir_aulia;

public class Kurir {
	
	private int idKurir = 0;
	private String namaKurir = "";
	private int nomorTelpon = 0;
	private String tujuanPengiriman = "";
	private char tipePengiriman = 'R';
	public Kurir(int idKurir, String namaKurir, int nomorTelpon, String tujuanPengiriman, char tipePengiriman) {
		super();
		this.idKurir = idKurir;
		this.namaKurir = namaKurir;
		this.nomorTelpon = nomorTelpon;
		this.tujuanPengiriman = tujuanPengiriman;
		this.tipePengiriman = tipePengiriman;
	}
	
	public int getIdKurir() {
		return idKurir;
	}
	public void setIdKurir(int idKurir) {
		this.idKurir = idKurir;
	}
	public String getNamaKurir() {
		return namaKurir;
	}
	public void setNamaKurir(String namaKurir) {
		this.namaKurir = namaKurir;
	}
	public int getNomorTelpon() {
		return nomorTelpon;
	}
	public void setNomorTelpon(int nomorTelpon) {
		this.nomorTelpon = nomorTelpon;
	}
	public String getTujuanPengiriman() {
		return tujuanPengiriman;
	}
	public void setTujuanPengiriman(String tujuanPengiriman) {
		this.tujuanPengiriman = tujuanPengiriman;
	}
	public char getTipePengiriman() {
		return tipePengiriman;
	}
	public void setTipePengiriman(char tipePengiriman) {
		this.tipePengiriman = tipePengiriman;
	}
		

}
