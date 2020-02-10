let items = [];
getCarrito();

function agregarCarrito(id, nombre, foto, precioFinal) {
    newItem = {id: id, nombre: nombre, foto: foto, precio: precioFinal};
    console.log(newItem);
    agregarLocalStorage(newItem)
}

function agregarLocalStorage(item) {
    items.push(item);
    localStorage.setItem("drones", JSON.stringify(items));
}

function getCarrito() {
    if (localStorage.getItem('drones')) {
        let drones = JSON.parse(localStorage.getItem("drones"));
        let container = document.getElementById('container-dron');
        container.innerHTML = null;
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
    newCarrito = items.filter(e => e.id !== id);
    localStorage.setItem("drones", JSON.stringify(newCarrito));
    getCarrito();
}
