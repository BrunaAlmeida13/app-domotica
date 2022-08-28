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
	<div class="container mt-3">
		<br>
		<h3>Classe: Comodo</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">ID</th>
					<th scope="col">Tipo</th>
					<th scope="col">Nome</th>
					<th scope="col">Lista de aparelhos</th>
					<th scope="col">Responsavel</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listagem}">
					<tr class="table-dark">
						<td>${c.id}</td>
						<td>${c.tipo}</td>
						<td>${c.nome}</td>
						<td>${c.listaAparelhos.size()}</td>
						<td>${c.responsavel.login}</td>
						<td><a href="/comodo/${c.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>