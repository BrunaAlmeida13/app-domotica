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
		<h2 align="center">
			<b>AppDomotica</b>
		</h2>
		<h4>Software para controle de uma casa automatizada</h4>
		<br>
		<h3>Classe: Comodo</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>tipo</td>
					<td>String</td>
					<td>Tipo do cômodo</td>
				</tr>
				<tr class="table-dark">
					<td>nome</td>
					<td>String</td>
					<td>Nome do comodo</td>
				</tr>
				<tr class="table-dark">
					<td>Aparelho</td>
					<td>List<Aparelho></td>
					<td>Uma lista dos aparelhos que contém no quarto</td>
				</tr>
			</tbody>
		</table>
		<br>
		<h3>Classe: Responsavel</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>login</td>
					<td>String</td>
					<td>Usuário para acesso ao aplicativo</td>
				</tr>
				<tr class="table-dark">
					<td>senha</td>
					<td>String</td>
					<td>Senha para acesso ao aplicativo</td>
				</tr>
				<tr class="table-dark">
					<td>nome</td>
					<td>String</td>
					<td>Nome do usuário</td>
				</tr>
				<tr class="table-dark">
					<td>cpf</td>
					<td>String</td>
					<td>CPF do usuário</td>
				</tr>
				<tr class="table-dark">
					<td>telefone</td>
					<td>String</td>
					<td>Telefone celular do usuário</td>
				</tr>
			</tbody>
		</table>
		<br>
		<h3>Classe: Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>nome</td>
					<td>String</td>
					<td>Nome do aparelho</td>
				</tr>
				<tr class="table-dark">
					<td>status</td>
					<td>String</td>
					<td>Estado do aparelho</td>
				</tr>
				<tr class="table-dark">
					<td>timerInicio</td>
					<td>LocalDateTime</td>
					<td>Hora marcada para inicio do funcionamento do aparelho</td>
				</tr>
				<tr class="table-dark">
					<td>timerFim</td>
					<td>LocalDateTime</td>
					<td>Hora marcada para término do funcionamento do aparelho</td>
				</tr>
			</tbody>
		</table>
		<br>
		<h3>Classe: ArCondicionado estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>temperatura</td>
					<td>double</td>
					<td>Regulagem de temperatura do A.C.</td>
				</tr>
				<tr class="table-dark">
					<td>ventilacao</td>
					<td>boolean</td>
					<td>Regulagem do modo ventilador no A.C.</td>
				</tr>
				<tr class="table-dark">
					<td>power</td>
					<td>boolean</td>
					<td>Regulagem para ligar ou desligar o A.C.</td>
				</tr>
			</tbody>
		</table>
		<br>
		<h3>Classe: Luz estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>cor</td>
					<td>String</td>
					<td>Regulagem RGB para luz</td>
				</tr>
				<tr class="table-dark">
					<td>intensidade</td>
					<td>int</td>
					<td>Regulagem da intensidade da luz</td>
				</tr>
				<tr class="table-dark">
					<td>volumeSom</td>
					<td>int</td>
					<td>Regulagem do volume do som, da luz</td>
				</tr>
			</tbody>
		</table>
		<br>
		<h3>Classe: Fechadura estende Aparelho</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>senha</td>
					<td>String</td>
					<td>Senha para abertura da(s) porta(s)</td>
				</tr>
				<tr class="table-dark">
					<td>trancada</td>
					<td>boolean</td>
					<td>Indicador de se porta(s) está(ão) trancada(s)</td>
				</tr>
				<tr class="table-dark">
					<td>alarme</td>
					<td>boolean</td>
					<td>Regulagem para ativação e desativação do alarme</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>

</html>