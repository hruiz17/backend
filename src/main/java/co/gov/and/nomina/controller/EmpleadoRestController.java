package co.gov.and.nomina.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.and.nomina.model.Empleado;
import co.gov.and.nomina.service.interfaces.IEmpleadoService;

/**
 * Clase controladora para los empleados de la agencia nacional digital
 * 
 * @author Humberto Ruiz
 * @since 1.0
 *
 */	
@RestController
@RequestMapping("/api/empleado")
@CrossOrigin("*")
public class EmpleadoRestController {

	@Autowired
	private IEmpleadoService empleadoService;

	@GetMapping("/all")
	public ResponseEntity<List<Empleado>> findAll() {
		List<Empleado> empleadoList = empleadoService.findAll();
		if (empleadoList.isEmpty()) {
			return new ResponseEntity<>(empleadoList, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(empleadoList, HttpStatus.OK);
	}

	@GetMapping("/activos")
	public ResponseEntity<List<Empleado>> findActivos() {
		List<Empleado> empleadoList = empleadoService.findByFechaDesdeAndFechaHastaOrNulo(new Date());
		if (empleadoList.isEmpty()) {
			return new ResponseEntity<>(empleadoList, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(empleadoList, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public Empleado find(@PathVariable("id") Long aId) {
		return empleadoService.get(aId);
	}

	@PostMapping("/save")
	public ResponseEntity<Empleado> createEmpleado(@Valid @RequestBody Empleado aEmpleado) {
		this.empleadoService.save(aEmpleado);
		return new ResponseEntity<>(aEmpleado, HttpStatus.CREATED);
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<Empleado> delete(@PathVariable("id") Long aId) {
		Empleado persona = empleadoService.get(aId);
		if (persona != null) {
			empleadoService.delete(aId);
		} else {
			return new ResponseEntity<Empleado>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Empleado>(persona, HttpStatus.OK);
	}
}
