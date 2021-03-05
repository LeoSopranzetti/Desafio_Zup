package br.com.desafiozup.Dto;

public class AplicacaoVacinaDto {

	private Long id;
	private String nomeVacina;
	private String email;
	private String dataVacinacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataVacinacao() {
		return dataVacinacao;
	}
	public void setDataVacinacao(String dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}
	
	
}
