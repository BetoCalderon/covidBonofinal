package com.covid.Negocio;

import com.covid.DAO.ClsBeneficiario;
import com.covid.Entidades.Beneficiario;
import com.covid.Entidades.Persona;

public class clsConsultarDUI {

	public int SoyBeneficiario(Persona person) {
			
		int soy = 0;
		
		ClsBeneficiario clsBeneficiario = new ClsBeneficiario();
		
		var beneficiario = clsBeneficiario.ObtenerBeneficiario(person);
		
		if(beneficiario == true) {
			soy = 1;
		}
		
		return soy;
	}
}
