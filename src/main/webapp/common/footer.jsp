<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<footer id="pie-pagina">
    <!-- FOOTER -->
    <footer class="container">
        <p class="float-right"><a href="#">Back to top</a></p>
        <p>&copy; 2019-2020 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
    </footer>
</footer>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
<%--<script type="text/javascript" src="<c:url value='./js/carrito.js' />"></script>--%>
<script>
    let newItem = {[]};

    function agregarCarrito(id, nombre, foto, precioFinal) {
        newItem = {id: id, nombre: nombre, foto: foto, precio: precioFinal};
        console.log(newItem);
        agregarLocalStorage(newItem)
    }

    function agregarLocalStorage(item) {
        localStorage.setItem("drones", JSON.stringify(item));
    }

    function getCarrito() {
        let objStorage = JSON.parse(localStorage.getItem("drones"));
        $.each(drones, function (key, dron) {
            document.getElementById('container-dron').innerHTML += `
                <tr>
                    <th scope="row">${dron.foto}</th>
                    <td>${dron.nombre}</td>
                    <td><i class="fas fa-trash-alt"></i></td>
                    <td>${dron.precio}</td>
                </tr>`;
        });
    }

</script>
</body>
</html>