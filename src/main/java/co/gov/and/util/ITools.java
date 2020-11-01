package co.gov.and.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Interface funciones comunes que se pueden reutilizar
 * 
 * @author Danny Vergel
 *
 */
public interface ITools {

	/**
	 * Compara si una fecha es mayor, igual o mayor/igual que otra, de acuerdo al
	 * parámetro final. Por defecto es mayor o igual que. Compara a las 00:00 horas
	 * 
	 * @param aFechaA
	 * @param aFechaB
	 * @param aTipoComparacion
	 * @return ok
	 */
	public static boolean isFechaAMayorIgualQueFechaB(Date aFechaA, Date aFechaB, String aTipoComparacion) {
		boolean ok = false;
		if (aFechaA != null && aFechaB != null) {
			if (aTipoComparacion.equals(">")) {
				if (getStringFechaJava(aFechaA).compareTo(getStringFechaJava(aFechaB)) > 0) {
					ok = true;
				}
			} else if (aTipoComparacion.equals("=")) {
				if (getStringFechaJava(aFechaA).compareTo(getStringFechaJava(aFechaB)) == 0) {
					ok = true;
				}
			} else {
				if (getStringFechaJava(aFechaA).compareTo(getStringFechaJava(aFechaB)) >= 0) {
					ok = true;
				}
			}
		}
		return ok;
	}

	/**
	 * Compara si una fecha es menor, igual o menor/igual que otra, de acuerdo al
	 * parámetro final. Por defecto es menor o igual que. Compara a las 00:00 horas
	 * 
	 * @param aFechaA
	 * @param aFechaB
	 * @param aTipoComparacion
	 * @return ok
	 */
	public static boolean isFechaAMenorIgualQueFechaB(Date aFechaA, Date aFechaB, String aTipoComparacion) {
		boolean ok = false;
		if (aFechaA != null && aFechaB != null) {
			if (aTipoComparacion.equals("<")) {
				if (getStringFechaJava(aFechaA).compareTo(getStringFechaJava(aFechaB)) < 0) {
					ok = true;
				}
			} else if (aTipoComparacion.equals("=")) {
				if (getStringFechaJava(aFechaA).compareTo(getStringFechaJava(aFechaB)) == 0) {
					ok = true;
				}
			} else {
				if (getStringFechaJava(aFechaA).compareTo(getStringFechaJava(aFechaB)) <= 0) {
					ok = true;
				}
			}
		}
		return ok;
	}

	/**
	 * Obtiene String de la fecha en formato Colombia (00:00 horas) cuando recibe un
	 * Date como parámetro
	 * 
	 * @param aFecha
	 * @return aFecha
	 */
	public static String getStringFechaColombia(Date aFecha) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return aFecha != null ? formato.format(aFecha) : "";

	}

	/**
	 * Obtiene String de la fecha en formato JAVA (00:00 horas) cuando recibe un
	 * Date como parámetro
	 * 
	 * @param aFecha
	 * @return aFecha
	 */
	public static String getStringFechaJava(Date aFecha) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		return aFecha != null ? formato.format(aFecha) : "";

	}

	/**
	 * Obtiene String de la fecha y la hora:minuto formateada a formato Colombia
	 * 
	 * @return aFechaHora
	 */
	public static String getStringFechaHoraMinutoColombia(Date aFechaHora) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		return aFechaHora != null ? formato.format(aFechaHora) : "";

	}

	/**
	 * Obtiene String de la fecha y la hora:minuto formateada a formato Colombia con
	 * hora militar
	 * 
	 * @param aFechaHora
	 * @return aFechaHora
	 */
	public static String getStringFechaColombiaHoraMinutoMilitar(Date aFechaHora) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return aFechaHora != null ? formato.format(aFechaHora) : "";

	}

}
