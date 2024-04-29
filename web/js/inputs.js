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
const validarCampo = (inp, minLength) => {
    inp.addEventListener('input', () => {
        const value =inp.value;

        if (value.length < minLength || !/^\d+$/.test(value)) {
            inp.setCustomValidity(`O campo deve ter no mínimo ${minLength} caracteres e conter apenas números.`);
        } else {
            inp.setCustomValidity('');
        }
    });
}

validarCampo(inputCpf, 14);
validarCampo(inputTelefone, 14);