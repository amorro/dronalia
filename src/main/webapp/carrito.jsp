<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="common/header.jsp"/>

<table class="table table-striped text-center align-middle">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Imagen</th>
        <th scope="col">Nombre</th>
        <th scope="col">Skin</th>
        <th scope="col">Quitar del carrito</th>
        <th scope="col">Precio</th>
    </tr>
    </thead>
    <tbody id="container-dron">
    </tbody>
</table>
<div class="row">
    <div class="col-10"></div>
    <button class="btn btn-success">Comprar</button>
</div>

<jsp:include page="common/footer.jsp"/>