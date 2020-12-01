package edu.usal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Restricciones {
	
	public static int leerAlianza(){
		int numero = IOGeneral.leerInt("Ingrese Alianza (1-Oneworld 2-SkyTeam 3-Star Alliance)", "Debe ingresar un entero");
		while(numero<1||numero>3){
			IOGeneral.pritln("no es una opcion correcta");
			numero = IOGeneral.leerInt("Ingrese alianza nuevamente", "Debe ingresar un entero");
		}
		return numero;
	}
	public static String leerDoc(String string){
		
		char[] dni = IOGeneral.leerLinea("Ingrese DNI/CUIT/CUIL del cliente").toCharArray();
		int resp=-1;
		int num=0;
		int special=0;
		int guion=0;
		do {
			num=0;
			special=0;
			guion=0;
			for (int i = 0; i < dni.length; i++) {
				switch(dni[i]) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 0:num++;
				break;
				case '-':guion++;
				break;
				default: special++;	
				}
			}
			if(special==0) {
				if(dni.length==8&&num==8 && guion==0) {
					IOGeneral.pritln("DNI valido");
					return string;
				}else if(dni.length==11&&guion==2){
					IOGeneral.pritln("CUIT Valido");
				}	
			}else {
				IOGeneral.pritln("Mal ingreso de datos");
			}
		}while(resp!=0);
		return string;
	}
	
	public static String leerFecha(String string) {
		return string;
	}
	public static void CalcularTiempo() {
		Calendar fechaI= new GregorianCalendar(2018, 9, 9, 12, 30);
		Calendar fechaF= new GregorianCalendar(2018, 9, 9, 22, 10);
		long tiempo=fechaF.getTimeInMillis()-fechaI.getTimeInMillis();
		long segsMilli = 1000;
		long minsMilli = segsMilli * 60;
		long horasMilli = minsMilli * 60;
		long diasMilli = horasMilli * 24;
		
		long diasTranscurridos = tiempo / diasMilli;
		tiempo = tiempo % diasMilli;
		long horasTranscurridos = tiempo / horasMilli;
		tiempo = tiempo % horasMilli;
		long minutosTranscurridos = tiempo / minsMilli;
		tiempo = tiempo % minsMilli;
		long segsTranscurridos = tiempo / segsMilli;
		
		System.out.println("diasTranscurridos: " + diasTranscurridos + " , horasTranscurridos: " +
		horasTranscurridos +
		" , minutosTranscurridos: " + minutosTranscurridos + " , segsTranscurridos: "
		+ segsTranscurridos);
	}
}
