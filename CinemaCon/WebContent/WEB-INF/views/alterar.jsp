<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
				<div class="col-md-12">
					<h1>Adicionar Filme</h1>
				</div>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">


					<form role="form" action="alterarFilme" method="post">

						<input type="hidden" name="id" value="${filme.id}"></input>
						<div class="form-group">
							<label class="control-label" for="nomeFilme">Nome do
								filme</label> <input class="form-control" type="text" name="nome"
								value="${filme.nome}">
						</div>
						<div class="form-group">
							<label class="control-label" for="categoriaFilme">Duracao</label>
							<input class="form-control" name="duracao" type="text"
								value="${filme.duracao}">
						</div>
						<div class="form-group">
							<label class="control-label">Genero</label>
							<textarea class="form-control" name="genero">${filme.genero}</textarea>
						</div>
						<div class="form-group">
							<label class="control-label">Distribuidora</label>
							<textarea class="form-control" name="distribuidora">${filme.distribuidora}</textarea>
						</div>
						<div class="form-group">
							<label class="control-label">Idioma</label>
							<div class="radio">
								<label class="radio-inline">
										<input type="radio" name="idioma" id="ingles" value="Ingles" ${filme.idioma=='Ingles' ? 'checked' : ''}>Ingl�s&nbsp;</label>
								<label class="radio-inline"> 
										<input type="radio" name="idioma" id="espanhol"
											value="Espanhol" ${filme.idioma=='Espanhol' ? 'checked' : ''}>Espanhol&nbsp;</label>
								<label class="radio-inline">
										<input type="radio" name="idioma" id="portugues"
											value="Portugues" ${filme.idioma=='Portugues' ? 'checked' : ''}>Portugu�s&nbsp;</label>
								<label class="radio-inline"></label>
									<input type="radio" name="idioma" id="italiano"
										value="Italiano" ${filme.idioma=='Italiano' ? 'checked' : ''}>Italiano&nbsp;
								<label class="radio-inline"></label>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label">Sinopse</label>
							<textarea class="form-control" name="sinopse">${filme.sinopse}</textarea>
						</div>
						<div class="form-group">
							<label class="control-label" for="Classificacao">Classifica��o</label>
							<div class="radio">
								<label class="radio-inline"> <input type="radio"
									name="classificacao" id="10Anos" value="10" ${filme.classificacao==10 ? 'checked' : ''}>10&nbsp;
								</label> <label class="radio-inline"> <input type="radio"
									name="classificacao" id="12Anos" value="12" ${filme.classificacao==12 ? 'checked' : ''}>12&nbsp;
								</label> <label class="radio-inline"> <input type="radio"
									name="classificacao" id="14Anos" value="14" ${filme.classificacao==14 ? 'checked' : ''}>14&nbsp;
								</label> <label class="radio-inline"> <input type="radio"
									name="classificacao" id="16Anos" value="16" ${filme.classificacao==16 ? 'checked' : ''}>16&nbsp;
								</label> <label class="radio-inline"> <input type="radio"
									name="classificacao" id="18Anos" value="18" ${filme.classificacao==18 ? 'checked' : ''}>18&nbsp;
								</label>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label" for="adicionarPessoa">Pessoa</label>
							<div class="input-group">
								<span class="input-group-addon"> <i class="fa fa-check"></i>
								</span> <input type="text" class="form-control"> <span
									class="input-group-btn"> <a class="btn btn-info"
									type="submit">Adicionar</a>
								</span>
							</div>
						</div>
						<button type="submit" class="btn btn-primary">Adicionar</button>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>