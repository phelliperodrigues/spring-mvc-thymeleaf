package com.phellipe.mvc.domain.services

import com.phellipe.mvc.domain.entities.Departamento
import com.phellipe.mvc.resources.repositories.DepartamentoRespository
import org.springframework.stereotype.Service

@Service
class DepartamentoService(
    private val repository: DepartamentoRespository
) {

    fun save(departamento: Departamento) { repository.save(departamento) }
    fun edit(departamento: Departamento) {
        departamento.id?.let { it ->
            repository.findById(it).let {
                val new = it.get()
                new.cargos = departamento.cargos
                new.nome = departamento.nome
                repository.save(new)
            }
        }
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }
    fun findById(id: Long): Departamento = repository.findById(id).get()
    fun getAll(): List<Departamento> = repository.findAll()
    fun temCargo(id: Long): Boolean = findById(id).cargos?.isNotEmpty()!!
}
