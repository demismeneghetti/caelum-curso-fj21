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

	public String executa(req, res){
		Long id = Long.parseLong(textoId);
		
		Contato c = new Contato();
		c.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.atualiza(c);
		
		RequestDispatcher rd  = req.getRequestD
		
		
	}
	
	public void executa(HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {
            
        Contato contato = new Contato();
        long id = Long.parseLong(request
                .getParameter("id"));
        contato.setId(id);
        contato.setNome(request.getParameter("nome"));
        contato.setEndereco(request
                .getParameter("endereco"));
        contato.setEmail(request.getParameter("email"));

        //Converte a data de String para Calendar          
        String dataEmTexto = request
                .getParameter("dataNascimento");
        Date date = new SimpleDateFormat("dd/MM/yyyy")
                .parse(dataEmTexto);
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(date);
        
        contato.setDataNascimento(dataNascimento);
        
        ContatoDao dao = new ContatoDao();
        dao.atualiza(contato);

        RequestDispatcher rd = request
                .getRequestDispatcher("/lista-contatos-elegante.jsp");
        rd.forward(request, response);
        System.out.println("Alterando contato ..." +
                contato.getNome());
    }
}