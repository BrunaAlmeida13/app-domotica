package br.edu.infnet.appdomotica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdomotica.model.domain.Responsavel;

@Repository
public interface ResponsavelRepository extends CrudRepository<Responsavel, Integer> {

}
