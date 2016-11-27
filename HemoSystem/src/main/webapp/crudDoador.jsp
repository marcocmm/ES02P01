<%-- 
    Document   : crudDoador
    Created on : 29/10/2016, 20:25:29
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>
<%
    session = request.getSession();
    if (session.getAttribute("login") == null) {
        request.setAttribute("mensagem", "Precisa estar logado!");
        RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
        dis.forward(request, response);
    }
%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastra Doador</title>
        <jsp:include page="header.jsp"></jsp:include>
    </head>
    <body>

        <div class="container">
            <form class="form" name="formCadastro" method="post" action="Doador.do">
                <p class="message" >${mensagem}</p> <br>
                <div id="form_coluna1" class="form-group">
                    <label for="nomeDoador">Nome do Doador</label>
                    <input type="text" class="form-control" placeholder="Nome do Doador" name="nome" value="Fulano" maxlength="50" required=""/>
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="numeroDocumento">Nº CPF</label>
                    <input type="text" class="form-control" placeholder="Número do CPF" name="numeroDocuento" id="cpf" value="" onblur="validarCPF(this)" onkeypress="formatar('###.###.###-##', this)" maxlength="14" required=""  />
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="nomedoPaiDoador">Nome do Pai</label>
                    <input type="text" class="form-control" placeholder="Nome do Pai" name="nomePai" value="Firmino" maxlength="50" required="" />
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="nomedaMaeDoador">Nome da Mãe</label>
                    <input type="text" class="form-control" placeholder="Nome da Mãe" name="nomeMae" value="Firmina" maxlength="50" required="" />
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="genero">Gênero</label><br>
                    <input type="radio" name="genero" value="masculino" checked=""> Masculino<br>
                    <input type="radio" name="genero" value="feminino"> Feminino<br>
                    <input type="radio" name="genero" value="outro"> Outro
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="dataNasc">Data de Nascimento</label>
                    <input type="date" class="form-control" name="dataNasc" value="" id="dataNasc" required="" onblur="validarData(formCadastro.dataNasc)" />
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="profissao">Profissao</label>
                    <input type="text" class="form-control" placeholder="Profissão" name="profissao" value="Engenheiro Civil" maxlength="50" required="" />
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="escolaridade">Escolaridade</label>
                    <input type="text" class="form-control" placeholder="Escolaridade" name="escolaridade" value="Segundo Grau" maxlength="50" required="" />
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" placeholder="Email" name="email" value="teste@teste.com" maxlength="50" required="" />
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="telefone">Telefone</label>
                    <input type="tel" class="form-control" placeholder="Telefone" name="telefone" value="44999478968" maxlength="50" required="" />
                </div>
                <div id="form_coluna2" class="form-group">
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
                        <label>Estado</label>:<select class="form-control" id="estadoC" value="PR" name="estadoC" value=></select> 
                    </div>
                    <div class="form-group">
                        <label>Cidade</label>:<select class="form-control" id="cidadeC" name="cidadeC"></select>
                    </div>
                </div>
                <div id="form_coluna2" class="form-group">
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
                        <label>Estado</label>:<select class="form-control" id="estadoR" value="PR" name="estadoR"></select> 
                    </div>
                    <div class="form-group">
                        <label>Cidade</label>:<select class="form-control" id="cidadeR" name="cidadeR"></select>
                    </div>
                </div>
                <div id="form_coluna1" class="form-group">
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
                <div id="form_coluna2" class="form-group">
                    <label for="trabalhoAtual">Trabalho Atual</label>
                    <input type="text" class="form-control" placeholder="Trabalho Atual" name="trabalhoAtual" value="Consultor de Engenharia" maxlength="50" required="" />
                </div>

                <input type="hidden" value="cadastraDoador" name="typeRequest"/>
                <input class="btn btn-success" style="width: 100%" type="submit" id="submitData" value="Cadastrar Doador"/>
            </form>
        </div>
        <script language="JavaScript" type="text/javascript" src="resources/js/mascInput.js"></script>
        <script language="JavaScript" type="text/javascript" src="resources/js/cidade_estados.js"></script>

        <script language="JavaScript" type="text/javascript" charset="utf-8">
                        new dgCidadesEstados({
                            cidade: document.getElementById('cidadeR'),
                            estado: document.getElementById('estadoR')
                        })
        </script>
        <script language="JavaScript" type="text/javascript" charset="utf-8">
            new dgCidadesEstados({
                cidade: document.getElementById('cidadeC'),
                estado: document.getElementById('estadoC')
            })
        </script>

    </body>
</html>
