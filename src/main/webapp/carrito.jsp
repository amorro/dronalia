<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="./common/header.jsp"/>

<table class="table table-striped">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Imagen</th>
        <th scope="col">Nombre</th>
        <th scope="col">Quitar del carrito</th>
        <th scope="col">Precio</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td><i class="fas fa-trash-alt"></i></td>
        <td>@mdo</td>
    </tr>
    </tbody>
</table>

<jsp:include page="./common/footer.jsp"/>