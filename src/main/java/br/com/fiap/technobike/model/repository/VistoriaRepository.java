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
				while (rs.next()) {
					DadosVistoria dado = new DadosVistoria();
				dado.setCpf(rs.getString("cpf"));
				dado.setOpcSeguro(rs.getInt("opc_Seguro"));
				dado.setBikeInteira(rs.getString("ft_bk_inteira"));
				dado.setNumSerie(rs.getString("ft_bk_nmserie"));
				dado.setRoda(rs.getString("ft_bk_rodas"));
				dado.setFreios(rs.getString("ft_bk_freios"));
				dado.setGuidao(rs.getString("ft_bk_guidao"));
				dado.setPedais(rs.getString("ft_bk_pedais"));
				dado.setCorrente(rs.getString("ft_bk_corrente"));
				dado.setClienteBike(rs.getString("ft_bk_selfie"));
				dado.setBikeFrente(rs.getString("ft_bk_frente"));
				dado.setAcessorios(rs.getString("ft_bk_acessorio"));
				dado.setVideoBike(rs.getString("vd_bk_geral"));
				dado.setVideoPartes(rs.getString("vd_bk_partes"));
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
	
	public static DadosVistoria update(DadosVistoria dado) {
		String 	sql = "update challenge_vistoria set opc_seguro = ?, ft_bk_inteira = ?, ft_bk_nmserie = ?, "
				+ "ft_bk_rodas = ?, ft_bk_freios = ?, ft_bk_guidao = ?, ft_bk_pedais = ?, "
				+ "ft_bk_corrente = ?, ft_bk_selfie = ?, ft_bk_frente = ?, ft_bk_acessorio = ?, "
				+ "vd_bk_geral = ?, vd_bk_partes = ? "
				+ "where cpf = ?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, dado.getOpcSeguro());
			ps.setString(2, dado.getBikeInteira());
			ps.setString(3, dado.getNumSerie());
			ps.setString(4, dado.getRoda());
			ps.setString(5, dado.getFreios());
			ps.setString(6, dado.getGuidao());
			ps.setString(7, dado.getPedais());
			ps.setString(8, dado.getCorrente());
			ps.setString(9, dado.getClienteBike());
			ps.setString(10, dado.getBikeFrente());
			ps.setString(11, dado.getAcessorios());
			ps.setString(12, dado.getVideoBike());
			ps.setString(13, dado.getVideoPartes());
			ps.setString(14, dado.getCpf());
			if(ps.executeUpdate() > 0) {
				return dado;
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar: " + e.getMessage());
		}finally {
			closeConnection();
		}
		return null;
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
	

}
