package com.phellipe.mvc.resources.repositories

import com.phellipe.mvc.domain.entities.Funcionario
import org.springframework.data.jpa.repository.JpaRepository

interface FuncionarioRespository : JpaRepository<Funcionario, Long>
