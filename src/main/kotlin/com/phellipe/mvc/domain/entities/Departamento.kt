package com.phellipe.mvc.domain.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "departamentos")
data class Departamento(
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    var nome: String? = null,
    @OneToMany(mappedBy = "departamento")
    var cargos: List<Cargo>? = null
) : AbstractEntity<Long>()
