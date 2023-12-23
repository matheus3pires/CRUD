package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

/*
 * MVC
 * Model
 * View
 * Controller
 */

public class Main {

	public static void main(String[] args) {
		
		// INSERIR OS CONTATO.
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Jose Maria");
		contato.setIdade(35);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		// ATUALIZAR OS CONTATO.
		Contato c1 = new Contato();
		c1.setNome("Jose Maria da Silva");
		c1.setIdade(36);
		c1.setDataCadastro(new Date());
		c1.setId(1);
		
		//contatoDao.update(c1);
		
		// DELETAR OS CONTATOS.
		contatoDao.deleteByID(1);
		
		
		// VISUALIZAÇÃO DOS CONTATOS.
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome() );
		}
		
	}

}
