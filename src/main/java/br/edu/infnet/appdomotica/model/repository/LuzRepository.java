package br.edu.infnet.appdomotica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdomotica.model.domain.Luz;

@Repository
public interface LuzRepository extends CrudRepository<Luz, Integer> {
	
	
}
