<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.dronalia.dto.User" %>
<%@ page import="com.dronalia.dao.OrderDao" %>
<%@page pageEncoding="UTF-8" %>

<%
    User usuario = (User) session.getAttribute("user");
    request.setAttribute("usuario", usuario);

//    if (usuari != null){
//        int numPedidos = new OrderDao().countOrdersByCustomerIdAndMonth(usuari);
//        request.setAttribute("numPedidos", numPedidos);
//    }
%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- CSS -->
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/f90d3bf50d.js" crossorigin="anonymous"></script>
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Lobster&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lobster+Two:700i&display=swap" rel="stylesheet">

    <title>Plantilla</title>
</head>
<body class="container">
<header id="main-header">
    <div class="row">
        <%--            img/header.png--%>
        <div class="col-6"><img src="/img/header.png" width="100%" alt="..."></div>
        <div class="col-6"><img src="/img/header.png" width="100%" alt="..."></div>
    </div>
    <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
        <h1 class="my-0 mr-md-auto font-weight-normal lobster"><a class="text-dark" href="/index.jsp">Dronalia</a></h1>
        <nav class="my-2 my-md-0 mr-md-3">
            <a class="p-2 text-dark" href="#"></a>
            <a class="p-2 text-dark" href="./carrito.jsp" onclick="getCarrito()">Carrito <i
                    class="fas fa-shopping-cart"></i></a>
        </nav>
        <c:if test="${usuario==null}">
            <a class="btn btn-outline-primary" href="/login/login.jsp">Log in</a>
        </c:if>
        <c:if test="${usuario!=null}">
            <div class="">
                    <form action="${pageContext.request.contextPath}/client?action=close" method="POST">
                        <c:if test="${usuario.email=='admin'}">
                        <a class="p-2 text-dark" href="/mantenimiento.jsp">Mantenimiento</a>
                    </c:if>
                        <label><c:out value="${usuario.nombre}"/> <i class="fas fa-user-circle"></i></label>
                        <button type="submit" class="btn text-danger">Cerrar Sesion</button>
                    </form>
                </div>
            </div>
        </c:if>
    </div>
</header>