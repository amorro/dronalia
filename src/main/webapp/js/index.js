function activarSkin() {
    if (document.getElementById('tipoSkin').hasAttribute('disabled') ) {
        document.getElementById('tipoSkin').removeAttribute('disabled');
        document.getElementById('temaSkin').removeAttribute('disabled');
    } else {
        document.getElementById('tipoSkin').setAttribute('disabled', '');
        document.getElementById('temaSkin').setAttribute('disabled', '');
    }
}

function checkUser(){
    let pageContext = document.getElementById('contextPath').value;
    let email = document.getElementById('email').value;
    let password = document.getElementById('password').value;
    $.ajax({
        type : 'POST',
        url : pageContext + '/client?action=login&email=' + email +'&password=' + password,
        timeout : 100000,
        success : function() {
            console.log('SUCCESS: ');
            document.getElementById('loginForm').submit();
        },
        error : function(e) {
            console.log('ERROR: ', e);
            document.getElementById('alertIncorrecto').className='alert alert-danger';
        },
        done : function(e) {
            console.log('DONE');
        }
    });
}