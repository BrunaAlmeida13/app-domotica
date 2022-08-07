<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Software Dom�tica</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<body class="table-light">
	<div class="container mt-3">
		<h2 align="center"><b>AppDomotica</b></h2>
		<h4>Software para controle de uma casa automatizada</h4>
		<br>
		<h3>Classe: Comodo</h3>
		<table class="table table-striped table-dark">
			<thead class="thead-dark">
				<tr class="table-secondary">
					<th scope="col">Atributo</th>
					<th scope="col">Tipo</th>
					<th scope="col">Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>tipo</td>
					<td>String</td>
					<td>Tipo do c�modo</td>
				</tr>
				<tr class="table-dark">
					<td>nome</td>
					<td>String</td>
					<td>Nome do comodo</td>
				</tr>
				<tr class="table-dark">
					<td>Aparelho</td>
					<td>List<Aparelho></td>
					<td>Uma lista dos aparelhos que cont�m no quarto</td>
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
					<th scope="col">Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-dark">
					<td>login</td>
					<td>String</td>
					<td>Usu�rio para acesso ao aplicativo</td>
				</tr>
				<tr class="table-dark">
					<td>senha</td>
					<td>String</td>
					<td>Senha para acesso ao aplicativo</td>
				</tr>
				<tr class="table-dark">
					<td>nome</td>
					<td>String</td>
					<td>Nome do usu�rio</td>
				</tr>
				<tr class="table-dark">
					<td>cpf</td>
					<td>String</td>
					<td>CPF do usu�rio</td>
				</tr>
				<tr class="table-dark">
					<td>telefone</td>
					<td>String</td>
					<td>Telefone celular do usu�rio</td>
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
					<th scope="col">Descri��o</th>
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
					<td>Hora marcada para t�rmino do funcionamento do aparelho</td>
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
					<th scope="col">Descri��o</th>
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
					<th scope="col">Descri��o</th>
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
					<th scope="col">Descri��o</th>
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
					<td>Indicador de se porta(s) est�(�o) trancada(s)</td>
				</tr>
				<tr class="table-dark">
					<td>alarme</td>
					<td>boolean</td>
					<td>Regulagem para ativa��o e desativa��o do alarme</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>

</html>