package br.com.projetoweb;

import br.com.projetoweb.persistencia.entidade.Usuario;
import br.com.projetoweb.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
		
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		//Excluindo Usuário
		usu.setId(2);
		
		//Excluindo usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluído com sucesso!");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		//Criando Usuário
		usu.setNome("José");
		usu.setLogin("Josinho");
		usu.setSenha("1234");
		
		//Cadastrando usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}
	
	public static void testAlterar(){
		
		//Alterar Usuário
		Usuario usu = new Usuario();
		usu.setId(2);
		usu.setNome("Josezinho");
		usu.setLogin("jjalves");
		usu.setSenha("novasenha");
		
		//Alterar usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
	}

}
