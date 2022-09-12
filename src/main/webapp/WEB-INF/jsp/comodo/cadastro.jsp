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
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Cadastro de um cômodo</h2>

		<form action="/comodo/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Tipo</label> <input type="text" class="form-control"
					name="tipo">
			</div>
			<div class="mb-3 mt-3">
				<label>Nome</label> <input type="text" class="form-control"
					name="nome">
			</div>
			<div class="mb-3 mt-3">
				<label>Aparelhos</label> <select name="listaAparelhos">
					<option value="luz">Luz</option>
					<option value="arCondicionado">Ar Condicionado</option>
					<option value="fechadura">Fechadura</option>
				</select>
			</div>
			<div class="mb-3 mt-3">
				<label>Responsável</label> <select name="responsavel">
					<option value="responsavel1">Responsavel1</option>
					<option value="responsavel2">Responsavel2</option>
				</select>
			</div>
			<br>
			<button type="submit" class="btn btn-dark">Cadastrar</button>
		</form>
	</div>
</body>

</html>