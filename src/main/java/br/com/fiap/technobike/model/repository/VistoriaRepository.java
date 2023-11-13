package br.com.fiap.technobike.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.technobike.model.entity.DadosVistoria;
import br.com.fiap.technobike.model.entity.Feedback;

public class VistoriaRepository extends Repository {
	
	public static ArrayList<DadosVistoria> findAll(){
		ArrayList<DadosVistoria> dados = new ArrayList<DadosVistoria>();
		String sql = "select * from challenge_vistoria";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					DadosVistoria dado = new DadosVistoria();
				dado.setCpf(rs.getString("cpf"));
				dado.setOpcSeguro(rs.getInt("opc_Seguro"));
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
				dado.setAnaliseVistoria(rs.getString("status_vistoria"));
				dados.add(dado);
				}
				
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
	
	public static ArrayList<DadosVistoria> findOne(String cpf){
		ArrayList<DadosVistoria> dados = new ArrayList<DadosVistoria>();
		String sql = "select * from challenge_vistoria where cpf = ?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					DadosVistoria dado = new DadosVistoria();
					dado.setCpf(rs.getString("cpf"));
					dado.setOpcSeguro(rs.getInt("opc_Seguro"));
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
					dado.setAnaliseVistoria(rs.getString("status_vistoria"));
				dados.add(dado);
				}
				
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

	
	public static DadosVistoria save(DadosVistoria dado) {
		String sql = "insert into challenge_vistoria values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'Em Análise')";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, dado.getCpf());
			ps.setInt(2, dado.getOpcSeguro());
			ps.setString(3, dado.getBikeInteira());
			ps.setString(4, dado.getNumSerie());
			ps.setString(5, dado.getRoda());
			ps.setString(6, dado.getFreios());
			ps.setString(7, dado.getGuidao());
			ps.setString(8, dado.getPedais());
			ps.setString(9, dado.getCorrente());
			ps.setString(10, dado.getClienteBike());
			ps.setString(11, dado.getBikeFrente());
			ps.setString(12, dado.getAcessorios());
			ps.setString(13, dado.getVideoBike());
			ps.setString(14, dado.getVideoPartes());
			if(ps.executeUpdate() > 0) {
				return dado;
			}
			else {
				return null;
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		}
		finally {
			closeConnection();
		}
		return null;	
	}
	public static Feedback saveFb(Feedback feedback) {
		String sql = "insert into challenge_feedback values(?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, feedback.getTempo());
			ps.setInt(2, feedback.getServicos());
			ps.setInt(3, feedback.getProblemas());
			ps.setInt(4, feedback.getAtendimentos());
			ps.setInt(5, feedback.getDuvidas());
			
			if(ps.executeUpdate() > 0) {
				return feedback;
			}
			else {
				return null;
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		}
		finally {
			closeConnection();
		}
		return null;	
	}

}
