package com.phellipe.mvc.domain.entities

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.CascadeType.ALL
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "funcionarios")
data class Funcionario(
    @Column(nullable = false, unique = true)
    var nome: String,

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    var salario: BigDecimal,

    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    var dataEntrada: LocalDate,

    @Column(name = "data_saida", columnDefinition = "DATE")
    var dataSaida: LocalDate,

    @OneToOne(cascade = [ALL])
    @JoinColumn(name = "endereco_id_fk")
    var endereco: Endereco,

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    var cargo: Cargo

) : AbstractEntity<Long>()
