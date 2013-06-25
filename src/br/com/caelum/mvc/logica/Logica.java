package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	/** @return o nome da JSP
	 * 
	 * @param req
	 * @param res
	 * @throws Exception
	 */
	void executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception;
}
