<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>${pessoa.nome} ${pessoa.sobrenome}</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<h2>${pessoa.nome}</h2>
					<h2>${pessoa.sobrenome}</h2>
					<h4>
						<b>Data de Nascimento: </b>${pessoa.dataNascimento} <br>Local
						de Nascimento: ${pessoa.localNascimento}
					</h4>
					<h3><p>${pessoa.descricao}</p></h3>
				</div>
			</div>
		</div>
	</div>
	<c:if test="${not empty pessoa.filmes}">
		<h1 class="text-center">Filmes que ${pessoa.nome} participou</h1>
		<div class="section">
			<div class="container table-responsive">
				<div class="row">
					<div class="col-md-12">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Filme</th>
									<th>Genero</th>
									<th>Sinopse</th>
									<th>Classificação</th>
									<th>Duração</th>
								</tr>
							</thead>
							<c:forEach var="f" items="${pessoa.filmes}">
								<tr>
									<td><a href="visualizarFilmes?id=${f.id}">${f.nome}</a></td>
									<td>${f.genero}</td>
									<td>${f.sinopse}</td>
									<td>${f.classificacao}</td>
									<td>${f.duracao}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</div>
	</c:if>
	<c:if test="${empty pessoa.filmes}">
		<h2 class="text-warning col-md-offset-3">Esta pessoa ainda não possui filmes no sistema :(</h2>
	</c:if>
	
</body>
</html>