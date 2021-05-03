package com.covid.Negocio;

import com.covid.DAO.ClsPersona;

public class clsValidarLogin {

	public int AccesoLogin(String Usuario, String Contrasenia) {
		
		int Acceso = 0;
		ClsPersona clsPersona = new ClsPersona();
		
		var validar = clsPersona.LoguinPersona(Usuario, Contrasenia);
		
		if(validar == true) {
			Acceso = 1;
		}
		
		return Acceso;
	}
}
