package com.mercubuana.uts_luthfir_aulia;

import java.util.ArrayList;

public class HandlerKurir {
	
	static ArrayList<Kurir> daftarKurir = new ArrayList<Kurir>();
	
	static void rekamDataKurir( int idKurir, 
								String namaKurir, 
								int nomorTelpon, 
								String tujuanPengiriman, 
								char tipePengiriman){
		
		Kurir k = new Kurir(idKurir, namaKurir, nomorTelpon, tujuanPengiriman, tipePengiriman);
		
		daftarKurir.add(k);
		
	}
}
