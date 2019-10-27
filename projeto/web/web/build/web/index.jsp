<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Aluno</title>
    </head>
    <body>
        <div>
        <h1>Inserir Aluno!</h1>
        <form name="formulario aluno" action="validador.jsp" method="post">
            Nome: <input type="text" name="NOME" value="seu nome"> <br>
            Sobrenome: <input type="text" name="SOBRENOME" value="seu sobrenome"> <br>
            Curso: <input type="text" name="CURSO" value="seu curso"> <br>
            Periodo: <input type="text" name="PERIODO" value="seu periodo"> <br>
            RA: <input type="text" name="RA" value="seu RA"> <br>
            <input type="submit" name="Enviar" value="Ok">
        </form>
        </div>
    </body>
</html>
