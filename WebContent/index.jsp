<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
    prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags"
    prefix="caelum" %>
    <c:import url="cabecalho.jsp" />

<html>
	<head>
		<title>Projeto Caelum Curso FJ21 - Agenda</title>
	</head>
	<body>
		Primeira pagina do projeto caelum-curso-FJ21
		<br />
		<br />
		<a href="http://localhost:8080/caelum-curso-fj21/adiciona-contato.jsp"> - Adicionar contato</a>
		<br />
		<a href="http://localhost:8080/caelum-curso-fj21/altera-contato.jsp"> - Altera contato</a>
		<br />
		<a href="http://localhost:8080/caelum-curso-fj21/lista-contatos.jsp"> - Lista contatos</a>
	</body>
</html>

<c:import url="rodape.jsp" />