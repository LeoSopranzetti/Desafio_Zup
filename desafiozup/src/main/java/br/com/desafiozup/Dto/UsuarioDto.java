package br.com.desafiozup.Dto;

import br.com.desafiozup.Model.Usuario;

public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	
	public UsuarioDto() {
		
	}
	
	
	
	public UsuarioDto(Usuario user) {
		super();
		this.id = user.getId();
		this.nome = user.getNome();
		this.email = user.getEmail();
		this.cpf = user.getCpf();
		this.dataNascimento = user.getDataNascimento();
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Usuario salvar() {
		return new Usuario(id, nome, email, cpf, dataNascimento);
	}
	
	
}
