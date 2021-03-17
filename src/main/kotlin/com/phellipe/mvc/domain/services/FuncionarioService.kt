package com.phellipe.mvc.domain.services

import com.phellipe.mvc.domain.entities.Funcionario
import com.phellipe.mvc.resources.repositories.FuncionarioRespository
import org.springframework.stereotype.Service

@Service
class FuncionarioService(
    private val repository: FuncionarioRespository
) {
    fun save(funcionario: Funcionario) { repository.save(funcionario) }
    fun edit(funcionario: Funcionario) {
        funcionario.id?.let { it ->
            repository.findById(it).let {
                val new = it.get()
                new.dataEntrada = funcionario.dataEntrada
                new.cargo = funcionario.cargo
                new.dataSaida = funcionario.dataSaida
                new.endereco = funcionario.endereco
                new.nome = funcionario.nome
                new.salario = funcionario.salario
                repository.save(new)
            }
        }
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }
    fun findById(id: Long): Funcionario = repository.findById(id).get()
    fun getAll(): List<Funcionario> = repository.findAll()
}
