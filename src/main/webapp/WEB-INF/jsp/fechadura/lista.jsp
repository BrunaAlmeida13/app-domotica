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
	<br>
	<div class="container mt-3">
		<h3>Classe: Fechadura estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
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
				<tr class="table-dark">
					<td>Fechadura sala</td>
					<td>Trancada</td>
					<td>2022/08/14 19:00:00</td>
					<td>2022/08/15 6:00:00</td>
					<td>8745</td>
					<td>Trancada</td>
					<td>Ligado</td>
				</tr>
				<tr class="table-dark">
					<td>Fechadura cozinha</td>
					<td>Destrancada</td>
					<td>null</td>
					<td>null</td>
					<td>6489</td>
					<td>Destrancada</td>
					<td>Desligado</td>
				</tr>
				<tr class="table-dark">
					<td>Fechadura portão garagem</td>
					<td>Trancada</td>
					<td>2022/08/14 7:00:00</td>
					<td>2022/08/14 19:00:00</td>
					<td>4215</td>
					<td>Trancada</td>
					<td>Desligado</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>

</html>