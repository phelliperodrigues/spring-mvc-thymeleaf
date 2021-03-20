package dev.phellipe.curso.thymeleaf.dao;

import org.springframework.stereotype.Repository;

import dev.phellipe.curso.thymeleaf.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
