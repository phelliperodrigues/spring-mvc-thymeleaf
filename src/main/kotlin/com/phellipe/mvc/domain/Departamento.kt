package com.phellipe.mvc.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "departamentos")
data class Departamento(
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    val name: String,
    @OneToMany(mappedBy = "departamento")
    val cargos: List<Cargo>
) : AbstractEntity<Long>()
