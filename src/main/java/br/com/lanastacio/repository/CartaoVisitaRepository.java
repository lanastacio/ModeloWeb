package br.com.lanastacio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lanastacio.model.CartaoVisita;

@Repository
public interface CartaoVisitaRepository extends CrudRepository<CartaoVisita, Long> {
	
	List<CartaoVisita> findAll();
	
}
