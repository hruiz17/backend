package co.gov.and.nomina.service.interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import co.gov.and.nomina.model.Empleado;

/**
 * Interface de servicio de la tabla empleado
 * 
 * @author Humberto Ruiz
 * @since 1.0
 */	
@Service
public interface IEmpleadoService {

	public List<Empleado> findAll();

	public List<Empleado> findByFechaDesdeAndFechaHastaOrNulo(Date aFechaRevision);
	
	public Empleado get(Long id);
	
	public Empleado save(Empleado aEmpleado);
	
	public void delete(Long id);
}
