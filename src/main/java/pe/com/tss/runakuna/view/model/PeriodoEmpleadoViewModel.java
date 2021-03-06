package pe.com.tss.runakuna.view.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.com.tss.runakuna.json.JsonDateSimpleDeserializer;
import pe.com.tss.runakuna.json.JsonDateSimpleSerializer;

public class PeriodoEmpleadoViewModel extends AuditingEntityViewModel{

	private Long idPeriodoEmpleado;
	private Long idEmpleado;
	private String periodo;
	private Integer permisosUsados;
	private Integer permisosPermitidos;
	private Integer diasVacacionesDisponibles;
	private Integer diasVacacionesAcumulado;
	private Integer permisosDisponibles;
	
	@JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	private Date fechaInicio;
	
	@JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	private Date fechaFin;
	
	public Long getIdPeriodoEmpleado() {
		return idPeriodoEmpleado;
	}
	public void setIdPeriodoEmpleado(Long idPeriodoEmpleado) {
		this.idPeriodoEmpleado = idPeriodoEmpleado;
	}
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Integer getPermisosUsados() {
		return permisosUsados;
	}
	public void setPermisosUsados(Integer permisosUsados) {
		this.permisosUsados = permisosUsados;
	}
	public Integer getPermisosPermitidos() {
		return permisosPermitidos;
	}
	public void setPermisosPermitidos(Integer permisosPermitidos) {
		this.permisosPermitidos = permisosPermitidos;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Integer getDiasVacacionesDisponibles() {
		return diasVacacionesDisponibles;
	}
	public void setDiasVacacionesDisponibles(Integer diasVacacionesDisponibles) {
		this.diasVacacionesDisponibles = diasVacacionesDisponibles;
	}
	public Integer getDiasVacacionesAcumulado() {
		return diasVacacionesAcumulado;
	}
	public void setDiasVacacionesAcumulado(Integer diasVacacionesAcumulado) {
		this.diasVacacionesAcumulado = diasVacacionesAcumulado;
	}
	public Integer getPermisosDisponibles() {
		return permisosDisponibles;
	}
	public void setPermisosDisponibles(Integer permisosDisponibles) {
		this.permisosDisponibles = permisosDisponibles;
	}
	
	
}
