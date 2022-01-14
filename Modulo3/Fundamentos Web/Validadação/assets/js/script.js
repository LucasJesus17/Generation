nome.style.width = '100%'
email.style.width = '100%'

function validaNome(){

    let txt = document.querySelector('#txtNome')

    if(nome.value.length < 3) {
        txt.innerHTML = 'Nome Inválido'
        txt.style.color = 'red'
    }
    else{
        txt.innerHTML = 'Nome Valido'
        txt.style.color = 'green'
    }
}

function validaEmail(){

    let txtEmail = document.querySelector('#txtEmail')

    if(email.value.indexOf('@') == -1 || email.value.indexOf('.com') == -1){
        txtEmail.innerHTML = 'E-mail inválido'
        txtEmail.style.color = 'red'        
    }
    else{
        txtEmail.innerHTML = 'Nome Valido'
        txtEmail.style.color = 'green'
    }
}