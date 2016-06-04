<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
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
					<li><a href="listarPessoa">Listar Pessoas</a></li>
					<li><a href="cadastrarPessoa">Cadastrar Pessoa</a></li>
					<li><a href="cadastrarFilmeFormulario">Cadastrar Filme</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1 class="text-center">Filmes</h1>
				</div>
			</div>

			<div class="section">
				<div class="row">
					<div class="col-md-4">
						<form role="form" class="text-left" action="buscaFilme"
							method="post">
							<div class="form-group">
								<div class="input-group">
									<input type="text" class="form-control" name="nome"> <span
										class="input-group-btn"> <a class="btn btn-primary"
										type="submit">Buscar Filme</a>
									</span>
								</div>
							</div>
						</form>
					</div>
				</div>
				</form>
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<h3 class="text-left">Nome do filme</h3>
						</div>
					</div>
					<div class="row">
						<div class="col-md-offset-3 col-md-6"></div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<div class="input-group">
									<a href="cadastrarFilmeFormulario"><button
											class="btn btn-primary">Cadastrar</button></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<a href="listarFilme"><button class="btn btn-primary">Listar
					Filme</button></a>
</body>
</html>