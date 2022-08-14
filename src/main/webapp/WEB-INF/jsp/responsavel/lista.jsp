<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
		<h3>Classe: Responsavel</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Login</th>
					<th scope="col">Senha</th>
					<th scope="col">CPF</th>
					<th scope="col">Telefone</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>responsavel1@email.com</td>
					<td>usu1</td>
					<td>658487891269</td>
					<td>61456987263</td>
				</tr>
				<tr class="table-dark">
					<td>responsavel2@email.com</td>
					<td>usu2</td>
					<td>658484578969</td>
					<td>61547548263</td>
				</tr>
				<tr class="table-dark">
					<td>responsavel3@email.com</td>
					<td>usu3</td>
					<td>658487565869</td>
					<td>61548467963</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>

</html>