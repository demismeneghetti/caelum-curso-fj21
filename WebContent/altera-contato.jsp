<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
    prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags"
    prefix="caelum" %>
    <c:import url="cabecalho.jsp" />
        Formulário para alteração de contatos:<br/>
        
        <form action="mvc" method="POST">
            Id:  
                <input type="text" name="id"/><br/>
            Nome:
                <input type="text" name="nome"/><br/>
            E-mail:
                <input type="text" name="email"/><br/>
            Endereço:
                <input type="text" name="endereco"/><br/>
            Data de Nascimento: 
                <caelum:campoData id="dataNascimento" />
  <input type="hidden"
                  name="logica" value="AlteraContatoLogic"/>
                <input type="submit" value="Enviar"/>
        </form>
<c:import url="rodape.jsp" />