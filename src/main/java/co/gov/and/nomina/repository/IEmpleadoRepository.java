package co.gov.and.nomina.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.gov.and.nomina.model.Empleado;

/**
 * Repositorio de la tabla empleado
 * 
 * @author Humberto Ruiz
 * @since 1.0
 */
@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

	/**
	 * Este método consulta el listado de empleados vigente a una fecha indicada
	 * 
	 * @param aFecha
	 * @return
	 */
	@Query("SELECT a FROM Empleado a WHERE a.fechaDesde <= :aFecha AND (a.fechaHasta >= :aFecha OR a.fechaHasta IS NULL) ")
	public List<Empleado> findByFechaDesdeAndFechaHastaOrNulo(@Param("aFecha") Date aFecha);
}
