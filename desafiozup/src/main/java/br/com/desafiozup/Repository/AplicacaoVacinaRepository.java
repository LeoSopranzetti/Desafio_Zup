package br.com.desafiozup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafiozup.Model.AplicacaoVacina;

@Repository
public interface AplicacaoVacinaRepository extends JpaRepository<AplicacaoVacina, Long> {
	
	

}
