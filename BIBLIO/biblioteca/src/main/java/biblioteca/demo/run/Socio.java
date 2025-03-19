package biblioteca.demo.run;

import java.time.LocalDate;

public class Socio {
	private int numSocio;
	private String nomCompleto;
	private int trabajador;
	private LocalDate fechaNacimiento;
	private String masInfo;
	
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	public String getNomCompleto() {
		return nomCompleto;
	}
	public void setNomCompleto(String nomCompleto) {
		this.nomCompleto = nomCompleto;
	}
	
	public int getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(int trabajador) {
		this.trabajador = trabajador;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getMasInfo() {
		return masInfo;
	}
	public void setMasInfo(String masInfo) {
		this.masInfo = masInfo;
	}
	
}

