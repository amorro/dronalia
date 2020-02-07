<%@ page contentType = "application/javascript" pageEncoding="UTF-8" %>
let newItem = {'items': []};

function agregarCarrito(id, nombre, foto, precioFinal) {
    newItem = {dron: {id: id, nombre: nombre, foto: foto, precio: precioFinal}};
    agregarLocalStorage(newItem)
}

function agregarLocalStorage(item) {
    localStorage.setItem("drones", JSON.stringify(item));
}

function getCarrito() {
    if (localStorage.getItem('drones')) {
        let objStorage = JSON.parse(localStorage.getItem('drones'));
        let container = document.getElementById('container-dron');
        $.each(objStorage.dron, function(key, val) {
            container.innerHTML += `
            <tr>
                <th scope="row">${val.foto}</th>
                <td>${val.nombre}</td>
                <td><i class="fas fa-trash-alt"></i></td>
                <td>${val.precio}</td>
            </tr>`;
        });
        <%--} else {--%>
        <%--    document.getElementById('container-dron').innerHTML = "El carrito está vacío";--%>
    }
}