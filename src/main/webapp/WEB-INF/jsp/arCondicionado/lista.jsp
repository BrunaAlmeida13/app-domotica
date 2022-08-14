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
		<h3>Classe: ArCondicionado estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Nome</th>
					<th scope="col">Status</th>
					<th scope="col">Timer Inicio</th>
					<th scope="col">Timer Fim</th>
					<th scope="col">Temperatura</th>
					<th scope="col">Ventilacao</th>
					<th scope="col">Power</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>A.C. quarto suíte</td>
					<td>Ligado</td>
					<td>2022/08/14 8:30:00</td>
					<td>2022/08/14 18:30:00</td>
					<td>22.0</td>
					<td>Ligado</td>
					<td>Ligado</td>
				</tr>
				<tr class="table-dark">
					<td>A.C. quarto Nina</td>
					<td>Ligado</td>
					<td>2022/08/14 9:30:00</td>
					<td>2022/08/14 17:30:00</td>
					<td>20.0</td>
					<td>Desligado</td>
					<td>Ligado</td>
				</tr>
				<tr class="table-dark">
					<td>A.C. Sala</td>
					<td>2022/08/14 7:30:00</td>
					<td>2022/08/14 16:00:00</td>
					<td>temperatura</td>
					<td>22.0</td>
					<td>Ligado</td>
					<td>Ligado</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>