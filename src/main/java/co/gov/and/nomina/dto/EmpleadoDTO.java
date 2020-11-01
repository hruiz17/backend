package co.gov.and.nomina.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para consultar y devolver resultados de y hacia la interfaz de consulta
 * de empleados en el front
 * 
 * @author Humberto Ruiz
 * @since 1.0
 * 
 *
 */

@Data
@NoArgsConstructor
public class EmpleadoDTO implements Serializable {

	private static final long serialVersionUID = -6472249444360115322L;
	private String numeroDocumento;
	private Long idPersona;
	private String nombres;
	private String nombre;
	private String apellido;
	private Date fechaInicio;
	private Date fechaFin;	
}
