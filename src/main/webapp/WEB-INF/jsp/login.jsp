<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
		<h2>Login</h2>
		<form action="/login" method="post">
			<div class="mb-3 mt-3">
				<label for="email">Email</label> <input type="email"
					class="form-control" placeholder="Digite seu e-mail..."
					name="email">
			</div>
			<div class="mb-3">
				<label for="pwd">Senha</label> <input type="password"
					class="form-control" placeholder="Digite sua senha..."
					name="senha">
			</div>
			<button type="submit" class="btn btn-dark">Submit</button>
		</form>
	</div>
</body>

</html>