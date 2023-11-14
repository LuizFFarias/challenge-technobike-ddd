package br.com.fiap.technobike.model.entity;

import javax.swing.JOptionPane;

/*** Classe com atributos e métodos sobre os arquivos que serão enviados para análise
 * @author Igor Ribeiro
 * @author Rafaella Bastos
 * @version 2.0
 */

public class MidiaVistoria {
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
	
	//Construtor vazio
	public MidiaVistoria() {
		
	}

	//Getters e setters 
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
	
	/*** Método confirmar arquivo que confirma se o usuário enviou ou não
	 * No momento ainda não é possível enviar, de fato, os arquivos
	 * @author Igor Ribeiro
	 * @author Rafaella Bastos
	 */
	
	//Método
	public void confirmarArquivo(String arquivoRecebido){
		if (arquivoRecebido != "nao") {
			JOptionPane.showMessageDialog(null, "Arquivo recebido");
		} else {
			JOptionPane.showMessageDialog(null, "Arquivo não recebido. Tente novamente");
		}	
	}
}
