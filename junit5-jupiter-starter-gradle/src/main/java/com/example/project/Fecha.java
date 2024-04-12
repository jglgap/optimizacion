package com.example.project;

public class Fecha {
	private int dia;

	private int mes;

	private int anio;

	public Fecha(int dia, int mes, int anio) {

	this.dia = dia;

	this.mes = mes;

	this.anio = anio;

	}
	public boolean valida() {
		if (dia < 1 || dia > 31)

			return false;

			if (mes < 1 || mes > 12)

			return false;
			
			int diasMes=0;
			int [] caso1= {1,3,5,7,8,10,12};
			int[] caso2= {4,6,9,11};
			if(leerArray(caso1)) {
				diasMes=31;
			}else if(leerArray(caso2)) {
				diasMes=30;
			}else if(esBisiesto(mes)) {
				diasMes=29;
			}else {
				diasMes=28;
			}
			if (dia > diasMes)

				return false;

				else return true;
			
	}
	public boolean leerArray(int []array) {
		for(int i =0; i<array.length;i++) {
			if(mes==array[i]) {
				return true;
			}
		}
		return false;
	}
	public boolean esBisiesto(int mes) {
		return ( (anio % 400 == 0) ||( (anio % 4 == 0) && (anio % 100 != 0) ) );
	}
}
