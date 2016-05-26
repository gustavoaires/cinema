<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Cadastrar Pessoa</title>
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
                    <li><a href="#">Contacts</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <form role="form" method="post" action="cadastroPessoaFormulario">
                        <div class="form-group">
                            <label class="control-label" for="nome">Nome</label>
                            <input class="form-control" name="nome" required="required" 
                                placeholder="Nome" type="text">
                        </div>
                        <div class="form-group">
                            <label class="control-label">Sobrenome</label>
                            <input class="form-control" name="sobrenome" required="required" 
                                placeholder="Sobrenome" type="text">
                        </div>
                        <div class="form-group">
                            <label class="control-label">Data de nascimento</label> 
                            <input
                                name="dataNascimento" class="form-control" required="required" pattern="[0-9]{2}\/[0-9]{2}\/[0-9]{4}$" type="text" placeholder="15/12/1989">
                        </div>
                        <div class="form-group">
                            <label class="control-label">Local de nascimento</label> 
                            <input
                                class="form-control" type="text" name="localNascimento" required="required"
                                placeholder="Local de nascimento">
                        </div>
                        <div class="form-group">
                            <label class="control-label">Descrição</label>
                            <textarea class="form-control" placeholder="Descrição" name="descricao"></textarea>
                        </div>
                        <button type="submit" class="btn btn-lg btn-primary">Salvar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

</body>
</html>