package br.com.projetoweb;

import br.com.projetoweb.persistencia.entidade.Usuario;
import br.com.projetoweb.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
		
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		//Excluindo Usu�rio
		usu.setId(2);
		
		//Excluindo usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Exclu�do com sucesso!");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		//Criando Usu�rio
		usu.setNome("Jos�");
		usu.setLogin("Josinho");
		usu.setSenha("1234");
		
		//Cadastrando usuario no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}
	
	public static void testAlterar(){
		
		//Alterar Usu�rio
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
