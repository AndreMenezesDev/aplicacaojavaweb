package br.com.projetoweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import br.com.projetoweb.persistencia.entidade.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection(); //CHAMA A CONEXAO E RECEBE UMA CONECTION
	
	public void cadastrar(Usuario usu) {
		
		String sql = "INSERT INTO usuario(nome,login,senha) VALUES (?,?,?)"; //CRIA A ESTRUTURA SQL
		
		//Criando um preparador Statement
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getNome()); //SUBSTITUI O ? PELO DADO DO USUARIO
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			
			//EXECUTANDO O COMANDO SQL NO BANCO
			preparador.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usu) {
		String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE id=? "; //CRIA A ESTRUTURA SQL
		
		//Criando um preparador Statement
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getNome()); //SUBSTITUI O ? PELO DADO DO USUARIO
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4,usu.getId());
			
			//EXECUTANDO O COMANDO SQL NO BANCO
			preparador.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void excluir(Usuario usu) {
		String sql = "DELETE FROM usuario WHERE id=? "; //CRIA A ESTRUTURA SQL
		
		//Criando um preparador Statement
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setInt(1,usu.getId());
			
			//EXECUTANDO O COMANDO SQL NO BANCO
			preparador.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
