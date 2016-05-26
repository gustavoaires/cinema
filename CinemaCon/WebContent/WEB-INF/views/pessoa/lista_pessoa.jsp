<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<title>Listar Pessoas</title>
</head>

<body>
	<div class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-ex-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>CinemaCon</span><br></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-ex-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="cadastrarPessoa">Cadastrar Pessoa</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table">
						<tbody>
							<c:if test="${empty pessoas}">
								<h2 class="text-warning col-md-offset-4">N�o h� nenhuma pessoa!</h2>
							</c:if>
							<c:if test="${not empty pessoas}">
								<c:forEach var="p" items="${pessoas}">
									<tr>
										<td>${ p.nome }</td>
										<td>${ p.sobrenome }</td>
										<td>${ p.dataNascimento }</td>
										<td>${ p.localNascimento }</td>
										<td>${ p.descricao }</td>
										<td><a href="visualizarPessoa?id=${ p.id }">VISUALIZAR</a></td>
										<td><a href="alterarPessoa?id=${ p.id }">ALTERAR</a></td>
										<td><a href="apagarPessoa?id=${ p.id }">REMOVER</a></td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>

</html>