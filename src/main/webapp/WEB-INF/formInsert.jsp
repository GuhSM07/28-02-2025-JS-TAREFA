<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Nova Tarefa</title>
    </head>
        <body>
            <h1>Nova Tarefas!</h1>
           <from acion="/tarefas/insert" method="post">
            <label>Descrição</label>
            <input> type+"text" name="descrição" />
            <button type=""submite">Salvar</button>
           </from>
        </body>
</html>