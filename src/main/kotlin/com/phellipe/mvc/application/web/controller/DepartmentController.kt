package com.phellipe.mvc.application.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value = ["/departamentos"])
class DepartmentController {

    @GetMapping("/cadastrar")
    fun cadastrar(): String {
        return "/departamento/cadastro"
    }

    @GetMapping("/listar")
    fun listar(): String {
        return "/departamento/lista"
    }
}
