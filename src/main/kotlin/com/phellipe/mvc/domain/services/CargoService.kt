package com.phellipe.mvc.domain.services

import com.phellipe.mvc.domain.entities.Cargo
import com.phellipe.mvc.resources.repositories.CargoRespository
import org.springframework.stereotype.Service

@Service
class CargoService(
    private val repository: CargoRespository
) {

    fun save(cargo: Cargo) { repository.save(cargo) }
    fun edit(cargo: Cargo) {
        cargo.id?.let { it ->
            repository.findById(it).let {
                val novoCargo = it.get()
                novoCargo.departamento = cargo.departamento
                novoCargo.funcionarios = cargo.funcionarios
                novoCargo.name = cargo.name
                repository.save(novoCargo)
            }
        }
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }
    fun findById(id: Long): Cargo = repository.findById(id).get()

    fun getAll(): List<Cargo> = repository.findAll()
}
