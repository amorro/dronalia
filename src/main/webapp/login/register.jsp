<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../common/header.jsp"/>

<p class="h2 text-center">Registro</p>

<div class="d-flex justify-content-center">
    <form class="col-5" name="register" action="${pageContext.request.contextPath}/client?action=create" method="POST">
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" name="email" id="exampleInputEmail1" placeholder="Email" required="required">
        </div>
        <div class="form-group">
            <label for="name">Nombre</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="Nombre" required="required">
            <label for="surname">Appellidos</label>
            <input type="text" class="form-control" name="surname" id="surname" placeholder="Apellidos" required="required">
        </div>
        <div class="form-group">
            <label for="password1">Password</label>
            <input type="password" class="form-control" name="password" id="password1" placeholder="Contraseña" required="required">
            <small id="emailHelp" class="form-text text-muted">Repite la contraseña.</small>
            <input type="password" class="form-control" id="password2" placeholder="Contraseña" required="required">

        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<jsp:include page="../common/footer.jsp"/>