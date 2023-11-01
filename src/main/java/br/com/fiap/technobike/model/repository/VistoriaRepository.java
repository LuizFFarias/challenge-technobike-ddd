package br.com.fiap.technobike.model.repository;

import java.util.ArrayList;

import br.com.fiap.technobike.model.entity.DadosVistoria;

public class VistoriaRepository {
	
	public static ArrayList<DadosVistoria> findAll(){
		ArrayList<DadosVistoria> vistoria = new ArrayList<DadosVistoria>();
		
		DadosVistoria cliente1 = new DadosVistoria();
		cliente1.setCpf("12345678910");
		cliente1.setOpcSeguro(2);
		cliente1.setBikeInteira("aa");
		cliente1.setNumSerie("aa");
		cliente1.setRoda("aa");
		cliente1.setFreios("aa");
		cliente1.setGuidao("aa");
		cliente1.setPedais("aa");
		cliente1.setCorrente("aa");
		cliente1.setClienteBike("aa");
		cliente1.setBikeFrente("aa");
		cliente1.setAcessorios("aa");
		cliente1.setVideoBike("aa");
		cliente1.setVideoPartes("aa");
		
		vistoria.add(cliente1);
		return vistoria;
	}
	
}
