package br.com.monteiro.springDesktop.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDao {

	@Autowired
	private EnderecoDao enderecoDao;
	
	public void imprimeEnderecoDoUsuario(){
		System.out.println("Endereço: " + enderecoDao.buscaEndereco());
	}
	
}
