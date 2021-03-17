package com.phellipe.mvc.resources.repositories

import com.phellipe.mvc.domain.entities.Departamento
import org.springframework.data.jpa.repository.JpaRepository

interface DepartamentoRespository : JpaRepository<Departamento, Long>
