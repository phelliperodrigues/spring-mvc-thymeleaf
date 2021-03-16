package com.phellipe.mvc.application.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/cargos")
class CargoController {

    @GetMapping("/cadastrar")
    fun cadastrar(): String {
        return "/cargo/cadastro"
    }

    @GetMapping("/listar")
    fun listar(): String {
        return "/cargo/lista"
    }
}
