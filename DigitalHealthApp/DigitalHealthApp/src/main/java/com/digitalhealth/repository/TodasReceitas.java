package com.digitalhealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.digitalhealth.domain.Receita;



@Repository
public interface TodasReceitas extends JpaRepository<Receita,Long> {

	
	@Query("select o from Receita o where o.dataReceita =:dataReceita and o.dataValidade =:dataValidade")
	public  Receita buscarReceita(@Param("dataReceita") String dataReceita, @Param("dataValidade") String dataValidade);
}
