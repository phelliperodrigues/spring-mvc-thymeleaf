package com.phellipe.mvc.resources.repositories

import com.phellipe.mvc.domain.entities.Cargo
import org.springframework.data.jpa.repository.JpaRepository

interface CargoRespository : JpaRepository<Cargo, Long>
