package com.miltonDAO;

import org.springframework.data.repository.CrudRepository;

import com.milton.Entidades.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{ //para hacer consultas a una vase de Datos 

}
