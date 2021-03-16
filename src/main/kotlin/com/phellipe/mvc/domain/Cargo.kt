package com.phellipe.mvc.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "cargos")
data class Cargo(
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    val name: String,

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    val departamento: Departamento,

    @OneToMany(mappedBy = "cargo")
    val funcionarios: List<Funcionario>

) : AbstractEntity<Long>()
