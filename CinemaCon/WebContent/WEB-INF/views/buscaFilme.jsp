<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h2>Filme Encontrado</h2>
	<table>
		<tr>
			<td>ID</td>
			<td>NOME</td>
			<td>GENERO</td>
			<td>DESCRICAO</td>
		</tr>
		<tr>
			<td>${busca.idSala}</td>
			<td>${busca.idCinema}</td>
			<td>${busca.nome}</td>
			<td>${busca.tipoSala}</td>
			<td>${busca.nAcentos}</td>
		</tr>
	</table>
</body>
</html>