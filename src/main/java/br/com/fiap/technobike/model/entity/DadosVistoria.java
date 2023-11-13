package br.com.fiap.technobike.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class DadosVistoria {
	@NotBlank
	private String cpf;
	@NotNull
	@Positive
	private int opcSeguro;
	@NotNull
	private String bikeInteira;
	@NotNull
	private String numSerie;
	@NotNull
	private String roda;
	@NotNull
	private String freios;
	@NotNull
	private String guidao;
	@NotNull
	private String pedais;
	@NotNull
	private String corrente;
	@NotNull
	private String clienteBike;
	@NotNull
	private String bikeFrente;
	@NotNull
	private String acessorios;
	@NotNull
	private String videoBike;
	@NotNull
	private String videoPartes;
	@NotNull
	private String analiseVistoria;
	
	public DadosVistoria() {
	}
	
	public DadosVistoria(@NotBlank String cpf, @Positive @NotNull int opcSeguro,@NotNull String bikeInteira,@NotNull String numSerie,@NotNull String roda,@NotNull String freios,
			@NotNull String guidao,@NotNull String pedais,@NotNull String corrente,@NotNull String clienteBike,@NotNull String bikeFrente,@NotNull String acessorios,
			@NotNull String videoBike,@NotNull String videoPartes,@NotNull String analiseVistoria) {
		this.cpf = cpf;
		this.opcSeguro = opcSeguro;
		this.bikeInteira = bikeInteira;
		this.numSerie = numSerie;
		this.roda = roda;
		this.freios = freios;
		this.guidao = guidao;
		this.pedais = pedais;
		this.corrente = corrente;
		this.clienteBike = clienteBike;
		this.bikeFrente = bikeFrente;
		this.acessorios = acessorios;
		this.videoBike = videoBike;
		this.videoPartes = videoPartes;
		this.analiseVistoria = analiseVistoria;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getOpcSeguro() {
		return opcSeguro;
	}
	public void setOpcSeguro(int opcSeguro) {
		this.opcSeguro = opcSeguro;
	}
	public String getBikeInteira() {
		return bikeInteira;
	}
	public void setBikeInteira(String bikeInteira) {
		this.bikeInteira = bikeInteira;
	}
	public String getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	public String getRoda() {
		return roda;
	}
	public void setRoda(String roda) {
		this.roda = roda;
	}
	public String getFreios() {
		return freios;
	}
	public void setFreios(String freios) {
		this.freios = freios;
	}
	public String getGuidao() {
		return guidao;
	}
	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}
	public String getPedais() {
		return pedais;
	}
	public void setPedais(String pedais) {
		this.pedais = pedais;
	}
	public String getCorrente() {
		return corrente;
	}
	public void setCorrente(String corrente) {
		this.corrente = corrente;
	}
	public String getClienteBike() {
		return clienteBike;
	}
	public void setClienteBike(String clienteBike) {
		this.clienteBike = clienteBike;
	}
	public String getBikeFrente() {
		return bikeFrente;
	}
	public void setBikeFrente(String bikeFrente) {
		this.bikeFrente = bikeFrente;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	public String getVideoBike() {
		return videoBike;
	}
	public void setVideoBike(String videoBike) {
		this.videoBike = videoBike;
	}
	public String getVideoPartes() {
		return videoPartes;
	}
	public void setVideoPartes(String videoPartes) {
		this.videoPartes = videoPartes;
	}

	public String getAnaliseVistoria() {
		return analiseVistoria;
	}

	public void setAnaliseVistoria(String analiseVistoria) {
		this.analiseVistoria = analiseVistoria;
	}
	
	
	
	
	
}
