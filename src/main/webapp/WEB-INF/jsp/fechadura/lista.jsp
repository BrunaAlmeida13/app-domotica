<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Software Domótica</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<nav class="navbar navbar-expand-sm bg-secondary navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/comodo/lista">Comodo</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/responsavel/lista">Responsavel</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/arcondicionado/lista">ArCondicionado</a></li>
				<li class="nav-item"><a class="nav-link" href="/luz/lista">Luz</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/fechadura/lista">Fechadura</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<div class="container mt-3">
		<h3>Classe: Fechadura estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col">Status</th>
					<th scope="col">Timer Inicio</th>
					<th scope="col">Timer Fim</th>
					<th scope="col">Senha</th>
					<th scope="col">Trancada</th>
					<th scope="col">Alarme</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="f" items="${listagem}">
					<tr class="table-dark">
						<td>${f.id}</td>
						<td>${f.nome}</td>
						<td>${f.status}</td>
						<td>${f.timerInicio}</td>
						<td>${f.timerFim}</td>
						<td>${f.senha}</td>
						<td>${f.trancada}</td>
						<td>${f.alarme}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>