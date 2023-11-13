package br.com.fiap.technobike.model.entity;

import javax.swing.JOptionPane;

/*** Classe com atributos e métodos sobre os feedbacks que o cliente dará
 * Atributos sobre os tipos de feedbacks e método que envia o feedback
 * @author Rafaella Bastos
 * @version 3.0
 */

public class Feedback {
	private int tempo;
	private int servicos;
	private int problemas;
	private int atendimentos;
	private int duvidas;
	

	// Construtor vazio
	public Feedback() {

	}

	// Getters e setters
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getServicos() {
		return servicos;
	}

	public void setServicos(int servicos) {
		this.servicos = servicos;
	}

	public int getProblemas() {
		return problemas;
	}

	public void setProblemas(int problemas) {
		this.problemas = problemas;
	}

	public int getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(int atendimentos) {
		this.atendimentos = atendimentos;
	}

	public int getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(int duvidas) {
		this.duvidas = duvidas;
	}
	
	/*** Método enviar feedback que envia de uma vez os feedbacks dados pelo cliente
	 * @author Rafaella Bastos
	 */
	//Métodos
	public void enviarFeedback() {
		JOptionPane.showMessageDialog(null, "Feedback enviado com sucesso");
	}
	
	/*** Método calcular média que faz a média dos feedbacks enviados
	 * @author Rafaella Bastos
	 */
	public void calcularMedia(int tempo, int servicos, int problemas, int atendimento, int duvidas) {
		int somaFeed = (tempo + servicos + problemas + atendimentos + duvidas);
		double mediaFeed = (somaFeed/ 5);
		
		JOptionPane.showMessageDialog(null, "A sua média de satisfação com a TechnoBike é de " + mediaFeed);
	}
}



