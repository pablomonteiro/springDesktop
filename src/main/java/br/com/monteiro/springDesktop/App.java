package br.com.monteiro.springDesktop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import br.com.monteiro.springDesktop.modelo.UsuarioDao;


@Component
public class App {
	
	@Autowired
	private UsuarioDao pessoaDao;

	public void testeApp(){
		pessoaDao.imprimeEnderecoDoUsuario();
	}
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		App app = appContext.getBean(App.class);
		app.testeApp();
	}
}
