<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
  <head>
    <title>${pessoa.nome} ${pessoa.sobrenome}</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
    rel="stylesheet" type="text/css">
  </head>
  
  <body>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png"
            class="img-responsive">
          </div>
          <div class="col-md-6">
            <h1>${pessoa.nome} ${pessoa.sobrenome}</h1>
            <h3>
              <b>Data de Nascimento:</b>${pessoa.dataNascimento}
                <br>País:</b>${pessoa.localNascimento}</h3>
            <p>${pessoa.descricao}</p>
          </div>
        </div>
      </div>
    </div>
    <h1>Lista de Filmes</h1>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <ol>
              <li>One</li>
              <li>Two</li>
              <li>Three</li>
            </ol>
          </div>
        </div>
      </div>
    </div>
  </body>

</html>