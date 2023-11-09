package br.com.fiap.technobike.model.entity;

public class DadosVistoria {
	private String cpf;
	private int opcSeguro;
	private String bikeInteira;
	private String numSerie;
	private String roda;
	private String freios;
	private String guidao;
	private String pedais;
	private String corrente;
	private String clienteBike;
	private String bikeFrente;
	private String acessorios;
	private String videoBike;
	private String videoPartes;
	private String analiseVistoria;
	
	public DadosVistoria() {
	}
	
	public DadosVistoria(String cpf, int opcSeguro, String bikeInteira, String numSerie, String roda, String freios,
			String guidao, String pedais, String corrente, String clienteBike, String bikeFrente, String acessorios,
			String videoBike, String videoPartes, String analiseVistoria) {
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
