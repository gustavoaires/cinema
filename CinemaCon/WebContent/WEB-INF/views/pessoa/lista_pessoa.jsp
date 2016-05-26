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
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table">
						<tbody>
							<c:forEach var="p" items="${pessoas}">
								<tr>
									<td>${ p.nome }</td>
									<td>${ p.sobrenome }</td>
									<td>${ p.dataNascimento }</td>
									<td>${ p.localNascimento }</td>
									<td>${ p.descricao }</td>
									<td><a href="visualizarPessoa?id=${ p.id }">VISUALIZAR</a></td>
									<td><a href="alterarPessoa?id=${ p.id }">ALTERAR</a></td>
									<td><a href="apagarPessoa?id=${ p.id }"></a>REMOVER</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>

</html>