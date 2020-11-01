package co.gov.and.util;

/**
 * Interface donde ser radican parámetros que pueden
 * cambiar a futuro y sea más fácil su mantenimiento
 * 
 * @author Humberto Ruiz
 *
 */
public interface IConstantes {


	// configuraciones para mapeos y dtos
	public static final String PATTERN_DATE_CLIENTE = "yyyy-MM-dd";

	// variables para consultas
	public static final Integer MAXIMOS_REGISTROS_CONSULTA = 100;
	public static final String COMODIN = "*";
	public static final String PORCENTAJE = "%";

	// para errores
	public static final String TIPO_WARNING = "warning";
	public static final String TIPO_ERROR = "error";

	// para configuraciones de cors
	public static final String VALIDAR_DNS_IP = null; // IP, DNS, null
	public static final Integer PUERTO_WEB_DEFAULT = 80;
	public static final Integer PUERTO_FRONT_ANGULAR_REMOTO = null;
	public static final Integer PUERTO_FRONT_ANGULAR_LOCAL = 4200;

	public static final String PUERTO_URL = (PUERTO_FRONT_ANGULAR_REMOTO != null
			&& PUERTO_FRONT_ANGULAR_REMOTO.intValue() != PUERTO_WEB_DEFAULT.intValue()
					? ":" + PUERTO_FRONT_ANGULAR_REMOTO
					: "");

	public static final String URL_LOCAL = "http://localhost:" + PUERTO_FRONT_ANGULAR_LOCAL;

}
