<%--
  Created by IntelliJ IDEA.
  User: Lluis-laptop
  Date: 03/02/2020
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="common/header.jsp"/>

<p class="h2 text-center">Log In</p>

<div class="d-flex justify-content-center">
    <form class="col-5">
        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" name="email" id="email" aria-describedby="emailHelp">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword1">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <a href="./register.jsp">No tienes una cuenta? Regístrate</a>
    </form>
</div>



<jsp:include page="common/footer.jsp"/>
