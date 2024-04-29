//autor luiz//
const inputCpf = document.querySelector('#cpf');
const inputTelefone = document.querySelector('#telefone');

inputCpf.addEventListener('keypress', () => {
    let tamanho = inputCpf.value.length;

    if (tamanho == 3 || tamanho == 7) {
        inputCpf.value += '.';
    } else if (tamanho == 11) {
        inputCpf.value += '-';
    }
});

inputTelefone.addEventListener('keypress', () => {
    let tamanho = inputTelefone.value.length;

    if (tamanho == 0) {
        inputTelefone.value += '(';
    } else if (tamanho == 3) {
        inputTelefone.value += ')';
    } else if (tamanho == 9) {
        inputTelefone.value += '-';
    }
});
//fim  //
function numeros(evt) {
    var number = (evt.which) ? evt.which : event.keyCode;
    if (number > 31 && (number < 48 || number > 57))
        return false;
    return true;
}