package br.com.fiap.technobike.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.technobike.model.entity.DadosVistoria;

public class VistoriaRepository extends Repository {
	
	public static ArrayList<DadosVistoria> findAll(){
		ArrayList<DadosVistoria> dados = new ArrayList<DadosVistoria>();
		String sql = "select * from challenge_vistoria";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				DadosVistoria dado = new DadosVistoria();
				dado.setCpf(rs.getString("cpf"));
				dado.setOpcSeguro(rs.getInt("opcSeguro"));
				dado.setBikeInteira(rs.getString("bikeInteira"));
				dado.setNumSerie(rs.getString("numSerie"));
				dado.setRoda(rs.getString("roda"));
				dado.setFreios(rs.getString("freios"));
				dado.setGuidao(rs.getString("guidao"));
				dado.setPedais(rs.getString("pedais"));
				dado.setCorrente(rs.getString("corrente"));
				dado.setClienteBike(rs.getString("clienteBike"));
				dado.setBikeFrente(rs.getString("bikeFrente"));
				dado.setAcessorios(rs.getString("acessorios"));
				dado.setVideoBike(rs.getString("videoBike"));
				dado.setVideoPartes(rs.getString("videoPartes"));
				dado.setAnaliseVistoria(rs.getString("analiseVistoria"));
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		}
		finally {
			closeConnection();
		}
		return dados;
	}
	
	
//	
//	public static ArrayList<DadosVistoria> findAll(){
//		ArrayList<DadosVistoria> vistoria = new ArrayList<DadosVistoria>();
//		
//		DadosVistoria cliente1 = new DadosVistoria();
//		cliente1.setCpf("12345678910");
//		cliente1.setOpcSeguro(2);
//		cliente1.setBikeInteira("aa");
//		cliente1.setNumSerie("aa");
//		cliente1.setRoda("aa");
//		cliente1.setFreios("aa");
//		cliente1.setGuidao("aa");
//		cliente1.setPedais("aa");
//		cliente1.setCorrente("aa");
//		cliente1.setClienteBike("aa");
//		cliente1.setBikeFrente("aa");
//		cliente1.setAcessorios("aa");
//		cliente1.setVideoBike("aa");
//		cliente1.setVideoPartes("aa");
//		
//		vistoria.add(cliente1);
//		return vistoria;
//	}
	
}
