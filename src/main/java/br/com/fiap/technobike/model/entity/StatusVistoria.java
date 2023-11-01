package br.com.fiap.technobike.model.entity;

import javax.swing.JOptionPane;

/*** Classe com atributos e métodos sobre o status da vistoria
 * Atributos sobre os tipos de status que o cliente pode receber
 * @author Luiz Fillipe
 * @version 3.0
 */

public class StatusVistoria {
	private boolean faltaDocs = false;
	private boolean aprovado = false;
	private boolean reprovado = false;
	private boolean emAnalise = true;
	
	//Construtor vazio
	public StatusVistoria() {
		
	}

	//Getters e setters
	public boolean isFaltaDocs() {
		return faltaDocs;
	}

	public void setFaltaDocs(boolean faltaDocs) {
		this.faltaDocs = faltaDocs;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public boolean isReprovado() {
		return reprovado;
	}

	public void setReprovado(boolean reprovado) {
		this.reprovado = reprovado;
	}

	public boolean isEmAnalise() {
		return emAnalise;
	}

	public void setEmAnalise(boolean emAnalise) {
		this.emAnalise = emAnalise;
	}
	
	//Métodos
	
	/*** Método resultado que verifica o atual status da vistoria
	 * @author Luiz Fillipe
	 * @author Rafaella Bastos
	 */
	public void resultado() {
		if (faltaDocs == true) {
			JOptionPane.showMessageDialog(null, "Estão faltando arquivos na vistoria! Olhe novamente");
		} else if (aprovado == true) {
			JOptionPane.showMessageDialog(null, "Parabéns! Sua vistoria foi aprovada");
		} else if (reprovado == true) {
			JOptionPane.showMessageDialog(null, "Foram encontradas inconsistências e sua vistoria foi reprovada!");
		} else if (emAnalise == true) {
			JOptionPane.showMessageDialog(null, "Aguarde um pouco. Seus arquivos estão em análise!");
		}
	}

}
