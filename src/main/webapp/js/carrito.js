let newItem = {};
window.onload = function () {

};


function agregarCarrito(id, nombre, foto, precioFinal) {
    newItem = {id: id, nombre: nombre, foto: foto, precio: precioFinal};
    console.log(newItem);
    agregarLocalStorage()
}

function agregarLocalStorage() {
    localStorage.setItem('drones', newItem);
}

function getCarrito() {
    let objStorage = JSON.parse(localStorage.getItem('drones'));
    $.each (objStorage, function (key, dron) {
        document.getElementById('container-dron').innerHTML += `
    <tr>
        <th scope="row">dron.foto</th>
        <td>dron.nombre</td>
        <td><i class="fas fa-trash-alt"></i></td>
        <td>dron.precio</td>
    </tr>`;
    });
}
