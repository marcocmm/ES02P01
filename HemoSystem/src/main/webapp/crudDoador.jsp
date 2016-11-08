<%-- 
    Document   : crudDoador
    Created on : 29/10/2016, 20:25:29
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastra Doador</title>
        <jsp:include page="header.jsp"></jsp:include>
    </head>
    <body>
        <form class="form" method="post" action="Doador.do">
            <div class="form-group">
                <label for="nomeDoador">Nome do Doador</label>
                <input type="text" class="form-control" placeholder="Nome do Doador" id="nome" name="nome" value="" maxlength="50" required=""/>
            </div>
            <div class="form-group">
                <label for="nomedoPaiDoador">Nome do Pai</label>
                <input type="text" class="form-control" placeholder="Nome do Pai" name="nomePai" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="nomedaMaeDoador">Nome da Mãe</label>
                <input type="text" class="form-control" placeholder="Nome da Mãe" name="nomeMae" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="genero">Gênero</label><br>
                <input type="radio" name="masculino" value="masculino" checked=""> Masculino<br>
                <input type="radio" name="feminino" value="feminino"> Feminino<br>
                <input type="radio" name="outro" value="outro"> Outro
            </div>
            <div class="form-group">
                <label for="dataNasc">Data de Nascimento</label>
                <input type="date" class="form-control" name="dataNasc" value="" required="" />
            </div>
            <div class="form-group">
                <label for="profissao">Profissao</label>
                <input type="text" class="form-control" placeholder="Profissão" name="profissao" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="escolaridade">Escolaridade</label>
                <input type="text" class="form-control" placeholder="Escolaridade" name="escolaridade" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" placeholder="Email" name="email" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="telefone">Telefone</label>
                <input type="tel" class="form-control" placeholder="Telefone" name="telefone" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="">Endereço Comercial</label>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Rua" name="rua" value="" maxlength="50"/>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Número" name="numeroC" value="" maxlength="50"/>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Bairro" name="bairro" value="" maxlength="50"/>
                </div>
                <div class="form-group">
                    <label for="estado">Estado:</label>
                    <select class="form-control" name="estadoC">
                        <option>PR</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="cidade">Cidade:</label>
                    <select class="form-control" name="cidadeC">
                        <option>Campo Mourao</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="">Endereço Residencial</label>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Rua" name="ruaR" value="" maxlength="50" required="" />
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Número" name="numeroR" value="" maxlength="50" required="" />
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Bairro" name="bairroR" value="" maxlength="50" required="" />
                </div>
                <div class="form-group">
                    <label for="estadoR">Estado:</label>
                    <select class="form-control" name="estadoR">
                        <option>PR</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="cidadeR">Cidade:</label>
                    <select class="form-control" name="cidadeR">
                        <option>Campo Mourao</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="tipoDoc">Estado Civil:</label>
                <select class="form-control" name="estadoCivil">
                    <option>Solteiro</option>
                    <option>Casado</option>
                    <option>Divorciado</option>
                    <option>Viúvo</option>
                    <option>Separado</option>
                    <option>Companheiro</option>
                </select>
            </div>
            <div class="form-group">
                <label for="trabalhoAtual">Trabalho Atual</label>
                <input type="text" class="form-control" placeholder="Trabalho Atual" id="trabalhoAtual" value="" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="tipoDoc">Tipo Documento:</label>
                <select class="form-control" name="tipoDoc">
                    <option>SSP</option>
                    <option>MT</option>
                    <option>PRF</option>
                    <option>OAB</option>
                    <option>CRM</option>
                    <option>CREA</option>
                    <option>CNH</option>
                    <option>CPF</option>
                </select>
            </div>
            <div class="form-group">
                <label for="numeroDocumento">Nº Documento</label>
                <input type="text" class="form-control" placeholder="Número do Documento" id="numeroDocuento" value="" maxlength="50" required="" />
            </div>

            <input class="btn btn-success" style="width: 100%" type="submit" id="submitData" value="Cadastrar"/>
        </form>
    </body>
</html>
