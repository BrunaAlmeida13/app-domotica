<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Software Dom�tica</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<br>
	<div class="container mt-3">
		<h3>Classe: ArCondicionado estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col">Status</th>
					<th scope="col">Timer Inicio</th>
					<th scope="col">Timer Fim</th>
					<th scope="col">Temperatura</th>
					<th scope="col">Ventilacao</th>
					<th scope="col">Power</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${listagem}">
					<tr class="table-dark">
						<td>${a.id}</td>
						<td>${a.nome}</td>
						<td>${a.status}</td>
						<td>${a.timerInicio}</td>
						<td>${a.timerFim}</td>
						<td>${a.temperatura}</td>
						<td>${a.ventilacao}</td>
						<td>${a.power}</td>
						<td><a href="/arcondicionado/${a.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="nav-link"	href="/arCondicionado/incluir">Cadastrar um Ar Condicionado</a>
	</div>
</body>
</html>