package co.gov.and.nomina.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase para el manejo de los empleados de la agencia nacional digital
 * 
 * @author Humberto Ruiz
 * @since 1.0
 *
 */
@Entity
@Data	
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = -1147604695020196954L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private String direccion;

	@Column
	private String telefono;

	@Column(name = "FECHA_DESDE")
	@Temporal(TemporalType.DATE)
	private Date fechaDesde;

	@Column(name = "FECHA_HASTA")
	@Temporal(TemporalType.DATE)
	private Date fechaHasta;

}
