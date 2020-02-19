<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <p class="h2 text-center">Log In</p>
                <div class="d-flex justify-content-center">
                    <form class="col-10" action="${pageContext.request.contextPath}/client?action=login" method="POST">
                        <div id="alertIncorrecto" class="alert alert-danger d-none">Usuario o contraseña incorrectos</div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="text" class="form-control" name="email" id="email" placeholder="Email"
                                   required="required">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" name="password" id="password"
                                   placeholder="Contraseña" required="required">
                        </div>
                        <button type="button" onclick="checkUser()" class="btn btn-primary">Submit</button>
                        <a href="login/register.jsp">No tienes una cuenta? Regístrate</a>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
