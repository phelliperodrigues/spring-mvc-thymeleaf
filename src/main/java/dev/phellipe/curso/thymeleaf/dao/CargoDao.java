package dev.phellipe.curso.thymeleaf.dao;

import java.util.List;

import dev.phellipe.curso.thymeleaf.domain.Cargo;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
