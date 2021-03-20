package dev.phellipe.curso.thymeleaf.service;

import java.util.List;

import dev.phellipe.curso.thymeleaf.domain.Cargo;
import dev.phellipe.curso.thymeleaf.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
}
