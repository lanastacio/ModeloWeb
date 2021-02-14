package br.com.lanastacio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lanastacio.model.CartaoVisita;
import br.com.lanastacio.repository.CartaoVisitaRepository;

@Controller
@RequestMapping(value = "/cartaoVisita")
public class CartaoVisitaController {
	
	@Autowired
	private CartaoVisitaRepository repositorio;
	
	@GetMapping(value = "")
	public String listagem(Model model) {
		
		List<CartaoVisita> listagem = repositorio.findAll();
		model.addAttribute("listagem", listagem);

		return "cartaoVisita/listagem";
	}

	@GetMapping(value = "/novoCartao")
	public String listagem(CartaoVisita cartaoVisita) {
		return "cartaoVisita/cadastro";
	}
	
	
	
	@PostMapping(value = "/salvarCartao")
	public String listagem(CartaoVisita cartaoVisita, Model model) {
		
		repositorio.save(cartaoVisita);
		
		return "redirect:/cartaoVisita";
	}
	
}
