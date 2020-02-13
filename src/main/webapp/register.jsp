<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="common/header.jsp"/>

<p class="h2 text-center">Registro</p>

<div class="d-flex justify-content-center">
    <form class="col-5">
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" name="mail" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class="form-group">
            <label for="password1">Password</label>
            <input type="password" class="form-control" name="password" id="password1">
            <small id="emailHelp" class="form-text text-muted">Repite la contraseña.</small>
            <input type="password" class="form-control" id="password2">

        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<jsp:include page="common/footer.jsp"/>