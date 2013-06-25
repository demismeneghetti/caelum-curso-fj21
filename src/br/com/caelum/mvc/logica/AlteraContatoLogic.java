package br.com.caelum.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogic implements Logica {
	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Contato contato = new Contato();

		String id = req.getParameter("id");
		contato.setId(Long.parseLong(id));

		contato.setNome(req.getParameter("nome"));
		contato.setEndereco(req.getParameter("endereco"));
		contato.setEmail(req.getParameter("email"));

		// Converte a data de string para calendar
		String dataEmTexto = req.getParameter("dataNascimento");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		contato.setDataNascimento(dataNascimento);

		ContatoDao dao = new ContatoDao();
		dao.atualiza(contato);

		RequestDispatcher rd = req
				.getRequestDispatcher("/lista-contatos-elegante.jsp");
		rd.forward(req, res);

	}
}
