<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="common/header.jsp"/>

<button onclick="getCarrito()">getCarrito</button>

<table class="table table-striped">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Imagen</th>
        <th scope="col">Nombre</th>
        <th scope="col">Quitar del carrito</th>
        <th scope="col">Precio</th>
    </tr>
    </thead>
    <tbody id="container-dron">
    </tbody>
</table>

<jsp:include page="common/footer.jsp"/>