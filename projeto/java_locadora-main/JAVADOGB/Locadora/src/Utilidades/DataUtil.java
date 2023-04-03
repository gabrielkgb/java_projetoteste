package Utilidades;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {

	public static Date adicionarDias(Date data, int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		
		return calendar.getTime();
	}
	
	public static Date obterDatecomDiferençaDias(int dias) {
		return adicionarDias(new Date(), dias);
	}
	
	public static Date obterData(int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.YEAR, ano);
		
		return calendar.getTime();
		
	}
	
	public static boolean isMesmaData(Date data1, Date data2) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(data1);
		Calendar calendar2 = Calendar.getInstance();
		calendar1.setTime(data2);
		return (calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH))
		&& (calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH))
		&& (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR));
	}
	
	public static boolean verificarDiaSemana(Date data, int diasemana) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		return calendar.get(Calendar.DAY_OF_WEEK) == diasemana;
	}
}
