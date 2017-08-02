package pe.com.tss.runakuna.domain.model.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.com.tss.runakuna.domain.model.entities.Job;
import pe.com.tss.runakuna.domain.model.entities.JobEjecucion;

@Repository
public interface JobEjecucionJpaRepository extends CrudRepository<JobEjecucion, Long>, JpaRepository<JobEjecucion, Long>{
	
	
	
		
	

}
