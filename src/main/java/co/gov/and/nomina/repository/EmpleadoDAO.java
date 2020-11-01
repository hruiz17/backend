package co.gov.and.nomina.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.gov.and.nomina.dto.EmpleadoDTO;
import co.gov.and.nomina.model.Empleado;
import co.gov.and.util.IConstantes;

/**
 * DAO de Implementación de consultas DINAMICAS de empleados
 * 
 * @author Humberto Ruiz
 * @since 1.0
 *
 */
@Repository
public class EmpleadoDAO {

	/**
	 * Atributo que permite emplear el entity manager del aplicativo
	 */
	@Autowired
	protected EntityManager em;

	/**
	 * Obtiene una lista de documentos de personas. Se limita al máximo permitido
	 * 
	 * @param aEmpleadoDTO: objeto que contiene clase plana con los valores a
	 *                      consultar
	 * @return objetos
	 */
	public List<Empleado> getEmpleadosRangoFecha(EmpleadoDTO aEmpleadoDTO) {
		List<Empleado> objetos = new ArrayList<>();
		Map<String, Object> parametros = new HashMap<>();
		try {
			if (aEmpleadoDTO == null) {
				throw new NullPointerException();
			}
			StringBuilder jpql = new StringBuilder();

			jpql.append(" SELECT p");
			jpql.append(" FROM Empleado p");
			jpql.append(" WHERE 1=1 ");

			if (aEmpleadoDTO != null && aEmpleadoDTO.getFechaInicio() != null) {
				jpql.append("p.fechaDesde >= :aFechaInicio AND a.fechaDesde <= :aFechaFin");
				parametros.put("aFechaInicio", aEmpleadoDTO.getFechaInicio());
				parametros.put("aFechaFin", aEmpleadoDTO.getFechaFin());
			}

			TypedQuery<Empleado> consulta = em.createQuery(jpql.toString(), Empleado.class);
			consulta.setMaxResults(IConstantes.MAXIMOS_REGISTROS_CONSULTA);

			for (String p : parametros.keySet()) {
				consulta.setParameter(p, parametros.get(p));
			}

			objetos = consulta.getResultList();

		} catch (Exception e) {

			throw e;

			// falta definir los logs

		} finally {
			em.close();
		}

		return objetos;
	}

}
