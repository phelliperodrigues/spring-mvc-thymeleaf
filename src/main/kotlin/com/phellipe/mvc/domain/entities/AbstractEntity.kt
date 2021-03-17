package com.phellipe.mvc.domain.entities

import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class AbstractEntity<ID : Serializable>(
    @Id @GeneratedValue(strategy = IDENTITY)
    var id: ID? = null
) : Serializable
