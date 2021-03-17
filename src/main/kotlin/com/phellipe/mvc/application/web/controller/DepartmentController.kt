package com.phellipe.mvc.application.web.controller

import com.phellipe.mvc.domain.entities.Departamento
import com.phellipe.mvc.domain.services.DepartamentoService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.mvc.support.RedirectAttributes

@Controller
@RequestMapping(value = ["/departamentos"])
class DepartmentController(
    val service: DepartamentoService
) {

    @GetMapping("/cadastrar")
    fun cadastrar(departamento: Departamento): String {
        return "/departamento/cadastro"
    }

    @GetMapping("/listar")
    fun listar(model: ModelMap): String {
        model.addAttribute("departamentos", service.getAll())
        return "/departamento/lista"
    }

    @PostMapping("/salvar")
    fun salvar(departamento: Departamento, attr: RedirectAttributes): String {
        try {
            service.save(departamento)
            attr.addFlashAttribute("success", "Departamento editado com sucesso.")
        } catch (ex: Throwable) {
            attr.addFlashAttribute("fail", "Departamento ja existe.")
        }

        return "redirect:/departamentos/listar"
    }

    @GetMapping("/editar/{id}")
    fun getById(@PathVariable("id") id: Long, model: ModelMap): String {
        val departamento = service.findById(id)
        model.addAttribute("departamento", departamento)
        return "/departamento/cadastro"
    }

    @PostMapping("/editar")
    fun editar(departamento: Departamento, attr: RedirectAttributes): String {
        service.edit(departamento)
        attr.addFlashAttribute("success", "Departamento editado com sucesso.")
        return "redirect:/departamentos/listar"
    }

    @GetMapping("/excluir/{id}")
    fun excluir(@PathVariable("id") id: Long, attr: RedirectAttributes): String {
        if (service.temCargo(id)) {
            attr.addFlashAttribute("fail", "Departamento não removido, possi cargos vinculados")
        } else {
            service.delete(id)
            attr.addFlashAttribute("success", "Departamento excluido com sucesso")
        }
        return "redirect:/departamentos/listar"
    }
}
