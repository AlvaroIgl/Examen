package examen;

/**
 * Clase que comprueba una fecha dada.
 * @author Alvaro Iglesias
 *@version 1.0
 */
public class Fecha {
	/**
	 * Metodo que recoge la fecha y comprueba si es valida(true) o no (false)
	 * @param anio
	 * @param mes
	 * @param dia
	 * @return fechaValida
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		boolean fechaValida = fechaValida();
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
/** 
 * @Hidden
 */
	public static boolean fechaValida() {
		boolean fechaValida = false;
		return fechaValida;
	}
}