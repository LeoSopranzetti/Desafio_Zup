package br.com.desafiozup.RestController;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiozup.Dto.UsuarioDto;
import br.com.desafiozup.Model.Usuario;
import br.com.desafiozup.Repository.AplicacaoVacinaRepository;
import br.com.desafiozup.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private AplicacaoVacinaRepository aplicacaoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	@Transactional
	private UsuarioDto cadastrar(@RequestBody UsuarioDto usuarioDto) {
		Usuario usuario = usuarioDto.salvar();
		usuarioRepository.save(usuario);
		return usuarioDto;
	}
	
	@GetMapping
		private List<Usuario> listar(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}
	
		

}
