package br.edu.infnet.appdomotica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdomotica.model.domain.ArCondicionado;
import br.edu.infnet.appdomotica.model.domain.Fechadura;

@Repository
public interface ArCondicionadoRepository extends CrudRepository<ArCondicionado, Integer> {
}
