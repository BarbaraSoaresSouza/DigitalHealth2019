package com.digitalhealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.digitalhealth.credenciais.CredenciaisPaciente;
import com.digitalhealth.domain.Paciente;

@Repository
public interface TodosPacientes extends JpaRepository<Paciente, Long> {

	
	@Query ("from Paciente where credenciaisPaciente =:credenciaisPaciente")
	Paciente buscarUsuario(@Param("credenciaisPaciente")CredenciaisPaciente credenciaisPaciente);
	
}
