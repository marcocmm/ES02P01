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
                <input type="text" class="form-control" placeholder="Nome do Doador" name="nome" value="Fulano" maxlength="50" required=""/>
            </div>
            <div class="form-group">
                <label for="nomedoPaiDoador">Nome do Pai</label>
                <input type="text" class="form-control" placeholder="Nome do Pai" name="nomePai" value="Firmino" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="nomedaMaeDoador">Nome da Mãe</label>
                <input type="text" class="form-control" placeholder="Nome da Mãe" name="nomeMae" value="Firmina" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="genero">Gênero</label><br>
                <input type="radio" name="genero" value="masculino" checked=""> Masculino<br>
                <input type="radio" name="genero" value="feminino"> Feminino<br>
                <input type="radio" name="genero" value="outro"> Outro
            </div>
            <div class="form-group">
                <label for="dataNasc">Data de Nascimento</label>
                <input type="date" class="form-control" name="dataNasc" value="12-07-1995" required="" />
            </div>
            <div class="form-group">
                <label for="profissao">Profissao</label>
                <input type="text" class="form-control" placeholder="Profissão" name="profissao" value="Pedreiro Civil" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="escolaridade">Escolaridade</label>
                <input type="text" class="form-control" placeholder="Escolaridade" name="escolaridade" value="Segundo Grau" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" placeholder="Email" name="email" value="teste@teste.com" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="telefone">Telefone</label>
                <input type="tel" class="form-control" placeholder="Telefone" name="telefone" value="44999478968" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="">Endereço Comercial</label>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Rua" name="rua" value="enderecoComercial" maxlength="50"/>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Número" name="numeroC" value="NumeroC" maxlength="50"/>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Bairro" name="bairro" value="bairroC" maxlength="50"/>
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
                    <input type="text" class="form-control" placeholder="Rua" name="ruaR" value="endereçoResidencial" maxlength="50" required="" />
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Número" name="numeroR" value="numero" maxlength="50" required="" />
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Bairro" name="bairroR" value="bairro" maxlength="50" required="" />
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
                <label for="estadoCivil">Estado Civil:</label>
                <select class="form-control" name="estadoCivil">
                    <option value="solteiro" >Solteiro</option>
                    <option value="casado" >Casado</option>
                    <option value="divorciado" >Divorciado</option>
                    <option value="viuvo" >Viúvo</option>
                    <option value="separado" >Separado</option>
                    <option value="companheiro" >Companheiro</option>
                </select>
            </div>
            <div class="form-group">
                <label for="trabalhoAtual">Trabalho Atual</label>
                <input type="text" class="form-control" placeholder="Trabalho Atual" name="trabalhoAtual" value="Quebrar Pedra" maxlength="50" required="" />
            </div>
            <div class="form-group">
                <label for="tipoDoc">Tipo Documento:</label>
                <select class="form-control" name="tipoDoc">
                    <option value="ssp" >SSP</option>
                    <option value="cpf" >CPF</option>
                    <option value="mt" >MT</option>
                    <option value="prf" >PRF</option>
                    <option value="oab" >OAB</option>
                    <option value="crm" >CRM</option>
                    <option value="crea" >CREA</option>
                    <option value="cnh" >CNH</option>
                </select>
            </div>
            <div class="form-group">
                <label for="numeroDocumento">Nº Documento</label>
                <input type="text" class="form-control" placeholder="Número do Documento" name="numeroDocuento" value="123.456.789-10" maxlength="50" required="" />
            </div>
            <input type="hidden" value="cadastraDoador" name="typeRequest"/>
            <input class="btn btn-success" style="width: 100%" type="submit" id="submitData" value="Cadastrar"/>
        </form>
    </body>
</html>
