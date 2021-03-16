package com.phellipe.mvc.application.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/funcionarios")
class FuncionarioController {

    @GetMapping("/cadastrar")
    fun cadastrar(): String {
        return "/funcionario/cadastro"
    }

    @GetMapping("/listar")
    fun listar(): String {
        return "/funcionario/lista"
    }
}
