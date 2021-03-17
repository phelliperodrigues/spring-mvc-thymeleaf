package com.phellipe.mvc.domain.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table
@Entity
@Table(name = "enderecos")
data class Endereco(
    @Column(nullable = false)
    val logradouro: String,

    @Column(nullable = false)
    val bairro: String,

    @Column(nullable = false)
    val cidade: String,

    @Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    val uf: UF,

    @Column(nullable = false, length = 9)
    val cep: String,

    @Column(nullable = false, length = 2)
    val numero: Int,

    val complemento: String
) : AbstractEntity<Long>()
