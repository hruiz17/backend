package co.gov.and.util;

/**
 * Interface de mensajes que serán lanzados al cliente
 * 
 * @author Danny Vergel
 *
 */
public interface IMensajes {

	// excepciones
	public static final String VALORES_NULOS = "Problemas internos del aplicativo (Valores nulos). Intente luego.";
	public static final String VALORES_INVALIDOS_BD = "Los valores ingresados o seleccionados no cumplen las condiciones de base de datos.";
	public static final String VALORES_INVALIDOS_ANTES_BD = "Los valores ingresados o seleccionados no cumplen las validaciones para realizar la transacción.";
	public static final String MENSAJE_TRANSACCION_NO_EXITOSA = "Transacción no exitosa";
	public static final String MENSAJE_VALIDACION_NO_EXITOSA = "No se ha superado las validaciones. Revise el formulario e intente de nuevo";
	public static final String FECHA_PERSONAL_INVALIDA = "inválida; no se encuentra dentro del rango permitido";

	// variables para mensajes
	public static final String NO_SE_CUMPLEN_VALIDACIONES = "No se cumplen las siguientes validaciones:";
	public static final String DEBE_SER_MAYOR_O_IGUAL = "debe ser mayor o igual a";
	public static final String DEBE_SER_MAYOR = "debe ser mayor a";
	public static final String DEBE_SER_MENOR_O_IGUAL = "debe ser menor o igual a";
	public static final String DEBE_SER_MENOR = "debe ser menor a";
	public static final String DEBE_SER_MAXIMO = "debe ser máximo";
	public static final String HOY = "hoy";

	public static final String NECESARIA_PARA_DILIGENCIAR = "es necesaria para poder diligenciar";
	public static final String MINIMO_Y_MAXIMO_CARACTERES = "número de caracteres debe estar entre {min} y {max}";
	public static final String MAXIMO_CARACTERES = "máximo {max} carcateres";
	public static final String NO_ES_POSIBLE_CORREO_INSTUCIONAL = "En este momento no es posible registrar correos institucionales. Intente luego.";
	public static final String DOMINIOS_ACEPTADOS = "Dominio inválido para correo institucional; los posibles dominios aceptados son: ";

	// labels campos
	public static final String FECHA_NACIMIENTO = "Fecha de nacimiento";
	public static final String FECHA_EXPEDICION_DOCUMENTO = "Fecha expedición de documento";
	public static final String FECHA_VENCIMIENTO_DOCUMENTO = "Fecha vencimiento de documento";

}
