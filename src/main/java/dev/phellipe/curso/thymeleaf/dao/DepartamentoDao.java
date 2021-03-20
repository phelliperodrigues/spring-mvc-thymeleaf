package dev.phellipe.curso.thymeleaf.dao;

import java.util.List;

import dev.phellipe.curso.thymeleaf.domain.Departamento;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
