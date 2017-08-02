package pe.com.tss.runakuna.view.model;

import java.math.BigDecimal;

public class EmpleadoCompensacionViewModel {
	
	private Long idEmpleadoCompensacion;
	private Long idEmpleado;
	private BigDecimal horasPendientesTotal;
	private BigDecimal horasPendientesMesActual;
	private BigDecimal horasPendientesHastaMesAnterior;
	
	private BigDecimal horasTardanzaIngreso;
	private BigDecimal horasTardanzaSalida;
	private BigDecimal horasDemoraAlmuerzo;
	private BigDecimal horasTrabajadas;
	private String tardanzas;
	private BigDecimal horarioHorasTrabajo;
	private Integer vacaciones;
	private Integer licencias;
	private Integer inasistencias;
	
	public Long getIdEmpleadoCompensacion() {
		return idEmpleadoCompensacion;
	}
	public void setIdEmpleadoCompensacion(Long idEmpleadoCompensacion) {
		this.idEmpleadoCompensacion = idEmpleadoCompensacion;
	}
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public BigDecimal getHorasPendientesTotal() {
		return horasPendientesTotal;
	}
	public void setHorasPendientesTotal(BigDecimal horasPendientesTotal) {
		this.horasPendientesTotal = horasPendientesTotal;
	}
	public BigDecimal getHorasPendientesMesActual() {
		return horasPendientesMesActual;
	}
	public void setHorasPendientesMesActual(BigDecimal horasPendientesMesActual) {
		this.horasPendientesMesActual = horasPendientesMesActual;
	}
	public BigDecimal getHorasPendientesHastaMesAnterior() {
		return horasPendientesHastaMesAnterior;
	}
	public void setHorasPendientesHastaMesAnterior(BigDecimal horasPendientesHastaMesAnterior) {
		this.horasPendientesHastaMesAnterior = horasPendientesHastaMesAnterior;
	}
	public BigDecimal getHorasTardanzaIngreso() {
		return horasTardanzaIngreso;
	}
	public void setHorasTardanzaIngreso(BigDecimal horasTardanzaIngreso) {
		this.horasTardanzaIngreso = horasTardanzaIngreso;
	}
	public BigDecimal getHorasTardanzaSalida() {
		return horasTardanzaSalida;
	}
	public void setHorasTardanzaSalida(BigDecimal horasTardanzaSalida) {
		this.horasTardanzaSalida = horasTardanzaSalida;
	}
	public BigDecimal getHorasDemoraAlmuerzo() {
		return horasDemoraAlmuerzo;
	}
	public void setHorasDemoraAlmuerzo(BigDecimal horasDemoraAlmuerzo) {
		this.horasDemoraAlmuerzo = horasDemoraAlmuerzo;
	}
	public BigDecimal getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(BigDecimal horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public String getTardanzas() {
		return tardanzas;
	}
	public void setTardanzas(String tardanzas) {
		this.tardanzas = tardanzas;
	}
	public BigDecimal getHorarioHorasTrabajo() {
		return horarioHorasTrabajo;
	}
	public void setHorarioHorasTrabajo(BigDecimal horarioHorasTrabajo) {
		this.horarioHorasTrabajo = horarioHorasTrabajo;
	}
	public Integer getVacaciones() {
		return vacaciones;
	}
	public void setVacaciones(Integer vacaciones) {
		this.vacaciones = vacaciones;
	}
	public Integer getLicencias() {
		return licencias;
	}
	public void setLicencias(Integer licencias) {
		this.licencias = licencias;
	}
	public Integer getInasistencias() {
		return inasistencias;
	}
	public void setInasistencias(Integer inasistencias) {
		this.inasistencias = inasistencias;
	}
}
