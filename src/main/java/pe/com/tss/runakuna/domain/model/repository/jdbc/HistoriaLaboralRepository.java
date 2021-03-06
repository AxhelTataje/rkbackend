package pe.com.tss.runakuna.domain.model.repository.jdbc;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import pe.com.tss.runakuna.view.model.EmpleadoCompensacionViewModel;
import pe.com.tss.runakuna.view.model.EmpleadoViewModel;
import pe.com.tss.runakuna.view.model.HistoriaLaboralViewModel;
import pe.com.tss.runakuna.view.model.LicenciaEmpleadoViewModel;

public interface HistoriaLaboralRepository {
	
	List<HistoriaLaboralViewModel> obtenerHistoriaLaboral(Long idEmpleado);
	List<HistoriaLaboralViewModel> obtenerIdHistoriaLaboral(Long idHistorialLaboral);
	HistoriaLaboralViewModel obtenerHistoriaLaboralActual(EmpleadoViewModel empleado);
	
	List<HistoriaLaboralViewModel> obtenerHistoriasLaboralesActualPorEmpleado(EmpleadoViewModel empleado);
	
	HistoriaLaboralViewModel obtenerUltimoCargo(Long idEmpleado);
	
	HistoriaLaboralViewModel obtenerPrimerCargo(Long idEmpleado);
	
	Long obtenerCantidadCargos(Long idEmpleado);
	
	HistoriaLaboralViewModel obtenerHistoriaLaboralLicencia(LicenciaEmpleadoViewModel licenciaEmpleadoD);
	
	List<HistoriaLaboralViewModel> obtenerHistoriasLaboralesPorEmpleado(Long idEmpleado) ;
	HistoriaLaboralViewModel obtenerHistoriaLaboralVigenteFecha(EmpleadoViewModel empleado, Date fecha);
	
	List<HistoriaLaboralViewModel> obtenerHistoriasLaboralesPorEmpleadoContrato(Long idEmpleado);
	
	EmpleadoCompensacionViewModel obtenerHorasPorCompensarPorEmpleado(Long idEmpleado);
	
}
