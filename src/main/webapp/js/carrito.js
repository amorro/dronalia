window.onload = function() {
    cargarCarrito();
    getCarrito();
};

function cargarCarrito() {
    if (localStorage.getItem('drones') === null || []) {
        return carrito = [];
    } else {
        let carrito = localStorage.getItem('drones');
        return carrito;
    }

}


function agregarCarrito(id, nombre, foto, precioFinal) {
    newItem = {id: id, nombre: nombre, foto: foto, precio: precioFinal};
    console.log(newItem);
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
        $.each(drones, function (key, val) {
            container.innerHTML += `
                <tr>
                    <th scope="row"><img src="${val.foto}" class="col-2" alt=""></th>
                    <td>${val.nombre}</td>
                    <td><a href="#" onclick="quitarCarrito(${val.id})" class="btn"><i class="fas fa-trash-alt"></i></a></td>
                    <td>${val.precio}</td>
                </tr>`;
        });
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
