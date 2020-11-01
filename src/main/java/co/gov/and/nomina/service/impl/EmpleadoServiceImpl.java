package co.gov.and.nomina.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.gov.and.nomina.model.Empleado;
import co.gov.and.nomina.repository.IEmpleadoRepository;
import co.gov.and.nomina.service.interfaces.IEmpleadoService;

/**
 * Implementación de la interface de servicio de la tabla empleado
 * 
 * @author Humberto Ruiz
 * @since 1.0
 *
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired	
	private IEmpleadoRepository empleadoRepository;

	/**
	 * Este método obtiene todos los objetos de la tabla empleado y los ordena por
	 * la columna nombre
	 */
	@Override
	public List<Empleado> findAll() {
		List<Empleado> empleadoList = this.empleadoRepository.findAll();
		Collections.sort(empleadoList, (obj1, obj2) -> obj1.getNombre().compareTo(obj2.getNombre()));
		return empleadoList;
	}

	/**
	 * Este método obtiene todos los objetos de la tabla empleado que se encuentran
	 * vigentes a una fecha y los ordena por el nombre
	 */
	@Override
	public List<Empleado> findByFechaDesdeAndFechaHastaOrNulo(Date aFechaRevision) {
		List<Empleado> empleadoList = this.empleadoRepository.findByFechaDesdeAndFechaHastaOrNulo(aFechaRevision);
		Collections.sort(empleadoList, (obj1, obj2) -> obj1.getNombre().compareTo(obj2.getNombre()));
		return empleadoList;
	}

	@Override
	public Empleado get(Long id) {
		Optional<Empleado> empleado = this.empleadoRepository.findById(id);
		if (empleado.isPresent()) {
			return empleado.get();
		}
		return null;
	}

	@Override
	@Transactional
	public Empleado save(Empleado aPersonaEmbarazo) {
		this.empleadoRepository.save(aPersonaEmbarazo);
		return aPersonaEmbarazo;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		this.empleadoRepository.deleteById(id);
	}

}
