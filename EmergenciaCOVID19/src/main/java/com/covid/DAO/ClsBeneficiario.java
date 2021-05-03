package com.covid.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.covid.Conexion.ConexionBD;
import com.covid.Entidades.Beneficiario;
import com.covid.Entidades.Persona;

public class ClsBeneficiario {

	ConexionBD claseConectar = new ConexionBD();
    Connection conectar = claseConectar.RetornarConexion();
    
    public boolean ObtenerBeneficiario(Persona person){
    	
    	boolean soybeneficiario = false;
    	try {
			CallableStatement statement = conectar.prepareCall("call Sp_S_AmIBeneficiary(?)");
			statement.setString("PDUI", person.getDUI());
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				soybeneficiario = true;
			}
		} catch (Exception e) {
			System.out.println("> Ocurrió un error" + e);
		}
    	return soybeneficiario;
    }
    
    public String MostrarBeneficiario(Persona person) {
    	
    	String fullname = "";
    	try {
			CallableStatement statement = conectar.prepareCall("call Sp_S_AmIBeneficiary(?)");
			statement.setString("PDUI", person.getDUI());
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				fullname = result.getString("Fullname");
			}
		} catch (Exception e) {
			System.out.println("> Ocurrió un error" + e);
		}
    	return fullname;
    }
}
