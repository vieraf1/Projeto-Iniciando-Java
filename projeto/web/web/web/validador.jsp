<%@page import="dao.AlunoDao"%>
<%@page import="model.Aluno"%>
<%
    String nome = request.getParameter("NOME");
    String sobrenome = request.getParameter("SOBRENOME");
    String curso = request.getParameter("CURSO");
    String periodo = request.getParameter("PERIODO");
    String ra = request.getParameter("RA");
    
    Aluno aluno = new Aluno(null, nome, sobrenome, curso, periodo, ra);
    AlunoDao dao = new AlunoDao();
    dao.inserirAluno(aluno);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Efetuado</title>
    </head>
    <body>
        <h1>Aluno Registrado com Sucesso!</h1>
    </body>
</html>
