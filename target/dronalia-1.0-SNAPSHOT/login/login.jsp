<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../common/header.jsp"/>

<p class="h2 text-center">Log In</p>

<div class="d-flex justify-content-center">
    <form class="col-5" action="${pageContext.request.contextPath}/client?action=login" method="POST">
        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" class="form-control" name="email" id="email" placeholder="Email" required="required">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" id="password" placeholder="Contraseña" required="required">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <a href="register.jsp">No tienes una cuenta? Regístrate</a>
    </form>
</div>



<jsp:include page="../common/footer.jsp"/>
