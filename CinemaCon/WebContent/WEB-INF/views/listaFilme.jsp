<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css" rel="stylesheet" type="text/css">
    </head>
<body>
	<table border="1">
		<c:forEach var="l" items="${listaFilme}">
			<tr>
				<td>${l.nome}</td>
				<td>${l.genero}</td>
				<td>${l.sinopse}</td>
				<td><a href="apagarFilme?id=${l.id}">APAGAR</a></td>
				<td><a href="alterarFilmeFormulario?id=${l.id}">ALTERAR</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>