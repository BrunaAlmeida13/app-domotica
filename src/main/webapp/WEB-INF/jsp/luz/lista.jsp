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
		<h3>Classe: Luz estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Nome</th>
					<th scope="col">Status</th>
					<th scope="col">Timer Inicio</th>
					<th scope="col">Timer Fim</th>
					<th scope="col">Cor</th>
					<th scope="col">Intensidade</th>
					<th scope="col">Volume Som</th>
					<th scope="col">Power</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>Luz quarto Nina</td>
					<td>Ligado</td>
					<td>null</td>
					<td>null</td>
					<td>Azul</td>
					<td>2</td>
					<td>50</td>
					<td>Ligada</td>
				</tr>
				<tr class="table-dark">
					<td>Luz quarto suíte</td>
					<td>Ligada</td>
					<td>null</td>
					<td>null</td>
					<td>Vermelho</td>
					<td>3</td>
					<td>20</td>
					<td>Ligada</td>
				</tr>
				<tr class="table-dark">
					<td>Luz Cozinha</td>
					<td>Desligada</td>
					<td>null</td>
					<td>null</td>
					<td>null</td>
					<td>0</td>
					<td>0</td>
					<td>Desligada</td>
				</tr>
			</tbody>
		</table>
		<br>
	</div>
</body>

</html>