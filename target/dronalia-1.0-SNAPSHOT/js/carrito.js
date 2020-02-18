window.onload = function () {
    let carrito = [];
    cargarCarrito();
    getCarrito();
};

function cargarCarrito() {
    if (localStorage.getItem('drones') != null) {
        return carrito = JSON.parse(localStorage.getItem('drones'));
    } else {
        return carrito = [];
    }

}


function agregarCarrito(id, nombre, foto, precioFinal) {
    newItem = {id: id, nombre: nombre, foto: foto, skin: null, precio: precioFinal};
    carrito.push(newItem);
    agregarLocalStorage()
}

function agregarLocalStorage() {
    localStorage.setItem("drones", JSON.stringify(carrito));
}

function getCarrito() {
    let container = document.getElementById('container-dron');
    container.innerHTML = null;
    if (localStorage.getItem('drones')) {
        let drones = JSON.parse(localStorage.getItem("drones"));
        let total = 0;
        $.each(drones, function (key, val) {
            if (val.skin === undefined) val.skin = 'Sin Skin';
            container.innerHTML += `
                <tr>
                    <th scope="row"><img src="${val.foto}" style="width: 8vw;" alt=""></th>
                    <td>${val.nombre}</td>
                    <td>${val.skin}</td>                    
                    <td><a href="#" onclick="quitarCarrito(${val.id})" class="btn"><i class="fas fa-trash-alt"></i></a></td>
                    <td>${val.precio}</td>
                </tr>`;
            total = total + parseFloat(val.precio);
        });
        container.innerHTML += `
                <tr>
                    <th scope="row"></th>
                    <td></td>
                    <td></td>                    
                    <td></td>
                    <td>Total: ${total}€</td>
                </tr>`;
    } else {
        document.getElementById('container-dron').innerHTML = "El carrito está vacío";
    }
}

function quitarCarrito(id) {
    let carrito = JSON.parse(localStorage.getItem("drones"));
    carrito = carrito.filter(e => e.id !== id);
    localStorage.setItem("drones", JSON.stringify(carrito));
    getCarrito();
}

function comprado() {
    let container = document.getElementById('container-dron');
    container.innerHTML = null;
    if (localStorage.getItem('drones')) {
        let drones = JSON.parse(localStorage.getItem("drones"));
        let total = 0;
        $.each(drones, function (key, val) {
            if (val.skin === undefined) val.skin = 'Sin Skin';
            container.innerHTML += `
                <tr>
                    <th scope="row"><img src="${val.foto}" style="width: 8vw;" alt=""></th>
                    <td>${val.nombre}</td>
                    <td>${val.skin}</td>
                    <td>${val.precio}</td>
                </tr>`;
            total = total + parseFloat(val.precio);
        });
        container.innerHTML += `
                <tr>
                    <th scope="row"></th>
                    <td></td>
                    <td></td>                    
                    <td></td>
                    <td>Total: ${total}€</td>
                </tr>`;
    } else {
        document.getElementById('container-dron').innerHTML = "El carrito está vacío";
    }
}
