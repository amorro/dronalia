let carrito = [];
window.onload = function() {
    if (localStorage.getItem('drones') === [] || null) {
        carrito = [];
    } else {
        carrito = localStorage.getItem('drones');
    }
    return carrito;
};

getCarrito();

function agregarCarrito(id, nombre, foto, precioFinal) {
    newItem = {id: id, nombre: nombre, foto: foto, precio: precioFinal};
    console.log(newItem);
    agregarLocalStorage(newItem)
}

function agregarLocalStorage(item) {
    carrito.push(item);

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
                    <th scope="row">${val.foto}</th>
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
