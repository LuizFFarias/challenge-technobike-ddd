package br.com.fiap.technobike.model.view;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.technobike.model.entity.DadosVistoria;
import br.com.fiap.technobike.model.entity.Feedback;
import br.com.fiap.technobike.model.entity.MidiaVistoria;
import br.com.fiap.technobike.model.entity.RegistroSeguro;
import br.com.fiap.technobike.model.entity.StatusVistoria;
import br.com.fiap.technobike.model.repository.VistoriaRepository;

public class UsaTechnobike {
	public static void main(String[] args) {
		
	
	int opcaoMenu = 0;
	int mostrarStatus;
	int opcSeguro;
	
	int tempo;
	int servicos;
	int problemas;
	int atendimentos;
	int duvidas;
	
	String aux;
	String escolha = "sim";
	String cpf = null;
	boolean cpfInvalido = true;
	int tentativas;
	
	int tpSeguro;
	String bikeInteira;
	String numSerie;
	String roda;
	String freios;
	String guidao;
	String pedais;
	String corrente;
	String clienteBike;
	String bikeFrente;
	String acessorios;
	String videoBike;
	String videoPartes;
	
	while (escolha.equalsIgnoreCase("sim")) {	
		opcaoMenu = 0;
		try {
			aux = JOptionPane.showInputDialog("Olá, em que a Technobike pode te ajudar?" 
											+ "\n1 - Tipos de seguro"
											+ "\n2 - Iniciar processo de vistoria" 
											+ "\n3 - Conferir status da vistoria" 
											+ "\n4 - Feedback" 
											+ "\n5 - Encerrar");
			opcaoMenu = Integer.parseInt(aux);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Resposta inválida!");
		}
		 
		switch (opcaoMenu) {

		//Tipos de seguro
		case 1:
			JOptionPane.showMessageDialog(null, "Essas são as opções de seguro disponibilizadas pela nossa empresa: "
											+ "\n1- Para ciclistas que pedalam na rua"
											+ "\n2- Para ciclistas de maratona"
											+ "\n3- Para ciclistas que pedalam em montanhas"
											+ "\n4- Para ciclistas que pedalam em pedras e rochas"
											+ "\n5- Para ciclistas que pedalam em terra e mato"
											+ "\n6- Para ciclistas por hobbie"
											+ "\n7- Para ciclistas que viajam com a bike");
			break;
			
			
		//Iniciar processo de vistoria	
		case 2:
			//Identificar cliente
//			cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
//			VistoriaRepository vistoria = new VistoriaRepository();
//			System.out.println(vistoria.findOne(cpf));
//			
//			JOptionPane.showMessageDialog(null, "O CPF " + cpf + " foi encontrado. Seja bem vindo!");
      
				tentativas = 0;
				cpfInvalido = true;
				
				while (cpfInvalido == true) {
					cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
					
					if (cpf.length() != 11) {
						JOptionPane.showMessageDialog(null, "Digite um cpf válido!");
						tentativas += 1;
					} else {
						cpfInvalido = false;
					}
				
					if (tentativas == 3) {
						cpfInvalido = false;
					}
				}
				
				if (tentativas == 3) {
					JOptionPane.showMessageDialog(null, "Limite de tentativas alcançado!");
					break;
				}
				//Registrar tipo de seguro
				DadosVistoria dados = new DadosVistoria();
				RegistroSeguro regSeg = new RegistroSeguro();
				
				aux = JOptionPane.showInputDialog("Selecione um tipo de seguro: "
												+ "\n1- Para ciclistas que pedalam na rua"
												+ "\n2- Para ciclistas de maratona" 
												+ "\n3- Para ciclistas que pedalam em montanhas"
												+ "\n4- Para ciclistas que pedalam em pedras e rochas"
												+ "\n5- Para ciclistas que pedalam em terra e mato"
												+ "\n6- Para ciclistas por hobbie" 
												+ "\n7- Para ciclistas que viajam com a bike");				
				opcSeguro = Integer.parseInt(aux);
				
				dados.setCpf(cpf);
				dados.setOpcSeguro(opcSeguro);
				regSeg.setOpcSeguro(opcSeguro);
				regSeg.selecionaSeguro();
				
				//Receber as mídias da vistoria
				JOptionPane.showMessageDialog(null, "Para finalizar a vistoria é necessário que sejam tiradas: "  
			            						+ "\n-Foto da bike inteira de lado"
			            						+ "\n-Foto do número de série"
			            						+ "\n-Foto da roda"
			            						+ "\n-Foto dos freios"
			            						+ "\n-Foto do guidão"
			            						+ "\n-Foto dos pedais"
			            						+ "\n-Foto da corrente"
			            						+ "\n-Foto sua com a bike"
			            						+ "\n-Foto da bike de frente"
			            						+ "\n-Foto dos acessórios (se for visível)"
			            						+ "\n-Vídeo mostrando a bike completa"
			            						+ "\n-Vídeo mostrando com mais ênfase cada ponto chave que foi tirado foto");
				
				JOptionPane.showMessageDialog(null, "Aviso: ainda não é possível enviar, de fato, arquivos");
				
				MidiaVistoria arqVis = new MidiaVistoria();
				
				arqVis.confirmarArquivo(bikeInteira = JOptionPane.showInputDialog("Envie a foto da bike inteira: "));
				arqVis.confirmarArquivo(numSerie = JOptionPane.showInputDialog("Envie a foto do número de série: "));
				arqVis.confirmarArquivo(roda = JOptionPane.showInputDialog("Envie a foto das rodas: "));
				arqVis.confirmarArquivo(freios = JOptionPane.showInputDialog("Envie a foto dos freios: "));
				arqVis.confirmarArquivo(guidao = JOptionPane.showInputDialog("Envie a foto do guidão: "));
				arqVis.confirmarArquivo(pedais = JOptionPane.showInputDialog("Envie a foto dos pedais: "));
				arqVis.confirmarArquivo(corrente = JOptionPane.showInputDialog("Envie a foto da corrente: "));
				arqVis.confirmarArquivo(clienteBike =JOptionPane.showInputDialog("Envie uma foto sua junto com a bike: "));
				arqVis.confirmarArquivo(bikeFrente = JOptionPane.showInputDialog("Envie uma foto da bike de frente: "));
				arqVis.confirmarArquivo(acessorios = JOptionPane.showInputDialog("Envie uma foto dos acessórios: "));
				arqVis.confirmarArquivo(videoBike = JOptionPane.showInputDialog("Envie um vídeo mostrando a bike no geral: "));
				arqVis.confirmarArquivo(videoPartes = JOptionPane.showInputDialog("Envie um vídeo completo da bike mostrando todas as partes ditas anteriormente: "));
				
				dados.setBikeInteira(bikeInteira);
				dados.setNumSerie(numSerie);
				dados.setRoda(roda);
				dados.setFreios(freios);
				dados.setGuidao(guidao);
				dados.setPedais(pedais);
				dados.setCorrente(corrente);
				dados.setClienteBike(clienteBike);
				dados.setBikeFrente(bikeFrente);
				dados.setAcessorios(acessorios);
				dados.setVideoBike(videoBike);
				dados.setVideoPartes(videoPartes);
				
				
				System.out.println(VistoriaRepository.save(dados));
				
				//Segmento
				JOptionPane.showMessageDialog(null, "Os seus dados foram enviados para vistoria. Você pode acompanhar o atual status" 
													+ " da análise pelo seu e-mail ou aqui pelo site.");
				aux = JOptionPane.showInputDialog("Deseja conferir o status da análise da vistoria?" 
												+ "\n1. Sim" 
												+ "\n2. Não");
				mostrarStatus = Integer.parseInt(aux);
				
				if (mostrarStatus == 1) {
					StatusVistoria andamento = new StatusVistoria();
					andamento.resultado();
				} else if (mostrarStatus == 2) {
					JOptionPane.showMessageDialog(null, "Ok. Acompanhe no seu e-mail ou nessa tela o atual status da sua vistoria para" 
														+ "saber as informações de como prosseguir!");
				} else {
					JOptionPane.showMessageDialog(null, "Opção incorreta");
				}
				
				break;
	
		//Conferir status da vistoria
		case 3:
			//Identificar cliente
//			try {
				boolean cpfEncontrado = false;
				tentativas = 0;
				cpfInvalido = true;
				
				while (cpfEncontrado == false) {
					
					while (cpfInvalido == true) {
						cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
						
						if (cpf.length() != 11) {
							JOptionPane.showMessageDialog(null, "Digite um cpf válido!");
							tentativas += 1;
						} else {
							cpfInvalido = false;
						}
					
						if (tentativas == 3) {
							cpfInvalido = false;
						}
					}
					
					if (tentativas == 3) {
						JOptionPane.showMessageDialog(null, "Limite de tentativas alcançado!");
						break;
					}
					
//					ArrayList<String> consulta = cliente.buscaCliente(cpf);
//					if (consulta == null) {
//						JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
//						tentativas += 1;
//						break;
//					} else {
//						JOptionPane.showMessageDialog(null, "Cpf encontrado: " + consulta.get(0));
//						cpfEncontrado = true;
//					}
				}
				
				//Status da vistoria
				if (cpfEncontrado == true) {
					StatusVistoria andamento = new StatusVistoria();
					andamento.resultado();
				}
				
//			} catch (SQLException e) {
//				JOptionPane.showMessageDialog(null, e.getMessage());
//			}
//			 catch (ClassNotFoundException e) {
//				JOptionPane.showMessageDialog(null, e.getMessage());
//			}
				break;
				
		//Feedback
		case 4: 
				//Tempo
				aux = JOptionPane.showInputDialog("Digite seu feedback para tempo");
				tempo = Integer.parseInt(aux);
				
				//Serviços
				aux = JOptionPane.showInputDialog("Digite seu feedback para serviços prestados");
				servicos = Integer.parseInt(aux);
				
				//Problemas
				aux = JOptionPane.showInputDialog("Digite seu feedback para problemas");
				problemas = Integer.parseInt(aux);
				
				//Atendimentos
				aux = JOptionPane.showInputDialog("Digite seu feedback para atendimento");
				atendimentos = Integer.parseInt(aux);
				
				//Problemas
				aux = JOptionPane.showInputDialog("Digite seu feedback para problemas");
				problemas = Integer.parseInt(aux);
				//Atendimentos
				aux = JOptionPane.showInputDialog("Digite seu feedback para atendimento");
				atendimentos = Integer.parseInt(aux);
        
				//Dúvidas
				aux = JOptionPane.showInputDialog("Digite seu feedback para resolução de duvidas");
				duvidas = Integer.parseInt(aux);
				
				Feedback opiniao = new Feedback();

				opiniao.enviarFeedback();

				opiniao.calcularMedia(tempo, servicos, problemas, atendimentos, duvidas);
				break;
			
		//Encerrar
		case 5:
			break;
			
		//Opção inválida
		default:
			JOptionPane.showMessageDialog(null, "Digite uma opção válida");
		}
		
		if (escolha != "não") {				
			escolha = JOptionPane.showInputDialog("Deseja continuar? ");
		}
	}
	JOptionPane.showMessageDialog(null, "Fim de programa, até a próxima");
}
}

