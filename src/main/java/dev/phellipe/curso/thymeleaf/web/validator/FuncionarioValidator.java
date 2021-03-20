package dev.phellipe.curso.thymeleaf.web.validator;


import dev.phellipe.curso.thymeleaf.domain.Funcionario;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

public class FuncionarioValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Funcionario.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Funcionario f = (Funcionario) obj;
        LocalDate entrada = f.getDataEntrada();
        if (f.getDataSaida() != null ){
            if (f.getDataSaida().isBefore(entrada)){
                errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
            }

        }
    }
}
