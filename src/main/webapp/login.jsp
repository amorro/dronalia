<%--
  Created by IntelliJ IDEA.
  User: Lluis-laptop
  Date: 03/02/2020
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="./common/header.jsp"/>

<h2>HTML Forms</h2>

<form>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="./common/footer.jsp"/>
