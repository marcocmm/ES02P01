//adiciona mascara ao CPF
function mascaraCPF(cpf) {
    if (mascaraInteiro(cpf) == false) {
        event.returnValue = false;
    }
    return formataCampo(cpf, '000.000.000-00', event);
}

//valida o CPF digitado
function validarCPF(Objcpf) {
    var cpf = Objcpf.value;
    exp = /\.|\-/g
    cpf = cpf.toString().replace(exp, "");
    var digitoDigitado = eval(cpf.charAt(9) + cpf.charAt(10));
    var soma1 = 0, soma2 = 0;
    var vlr = 11;

    for (i = 0; i < 9; i++) {
        soma1 += eval(cpf.charAt(i) * (vlr - 1));
        soma2 += eval(cpf.charAt(i) * vlr);
        vlr--;
    }
    soma1 = (((soma1 * 10) % 11) == 10 ? 0 : ((soma1 * 10) % 11));
    soma2 = (((soma2 + (2 * soma1)) * 10) % 11);

    var digitoGerado = (soma1 * 10) + soma2;
    if (digitoGerado != digitoDigitado)
        alert('CPF Invalido!');
}

function validarData(dataNasc) {
    var data = dataNasc.value;
    exp = /\-/g;
    data = data.toString().replace(exp, "");
    ano = data.charAt(0) + data.charAt(1) + data.charAt(2) + data.charAt(3);
    mes = data.charAt(4) + data.charAt(5);
    dia = data.charAt(6) + data.charAt(7);

    //define as duas datas base...
    var actualDate = new Date();
    //validando 25/09/2000 que ainda nao completou 15 anos
    var birthDate = new Date(ano, mes-1, dia, "0", "0", "0");

    // pega o milisegundo de cada uma
    var actualMili = actualDate.getTime();
    var selectMili = birthDate.getTime();

    // 15 anos em milisegundos
    var timeToTest = 1000 * 60 * 60 * 24 * 365 * 16; //15 anos em mili segundos...

    //faz a diferença entre as datas e o tempo calculado
    if ((actualMili - selectMili) <= timeToTest) {
        alert("O doador deve ser maior de 16 anos!");
        document.getElementById("dataNasc").value="0000-00-00";
    }
}

function test(estado){
    alert("estado selecionado: " + estado.value);
    var e = estado.value;
    
}

