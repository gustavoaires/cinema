<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<title>Alterar Pessoa</title>
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
					<li><a href="listarPessoa">Listar Pessoas</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form role="form" method="post" action="alteraPessoaFormulario">
						<div class="form-group">
							<input class="form-control" name="id" 
							type="hidden" value="${pessoa.id}">
						<div/>
					
						<div class="form-group">
							<label class="control-label" for="nome">Nome</label>
							<input class="form-control" name="nome"
								value="${pessoa.nome}" type="text">
						</div>
						<div class="form-group">
							<label class="control-label" for="sobrenome">Sobrenome</label>
							<input class="form-control" name="sobrenome"
								value="${pessoa.sobrenome}" type="text">
						</div>
						<div class="form-group">
							<label class="control-label">Data de nascimento</label> 
							<input
								class="form-control" type="text" name="dataNascimento" 
								value="${pessoa.dataNascimento}">
						</div>
						<div class="form-group">
							<label class="control-label">Local de nascimento</label> 
							<input
								class="form-control" type="text" name="localNascimento"
								value="${pessoa.localNascimento}">
						</div>
						<div class="form-group">
							<label class="control-label">Descrição</label>
							<textarea class="form-control" name="descricao" value="${pessoa.descricao}"></textarea>
						</div>
						<button type="submit" class="btn btn-lg btn-primary">Alterar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>