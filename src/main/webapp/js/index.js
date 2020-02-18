function activarSkin() {
    if (document.getElementById('tipoSkin').hasAttribute('disabled') ) {
        document.getElementById('tipoSkin').removeAttribute('disabled');
        document.getElementById('temaSkin').removeAttribute('disabled');
    } else {
        document.getElementById('tipoSkin').setAttribute('disabled', '');
        document.getElementById('temaSkin').setAttribute('disabled', '');
    }
}