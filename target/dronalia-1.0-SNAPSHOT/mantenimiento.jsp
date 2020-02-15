<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8" %>
<%@ page import="com.dronalia.dao.DronDao" %>
<%@ page import="com.dronalia.dto.Dron" %>
<%@ page import="com.dronalia.enumeradas.EnumDronCategoria" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
    // Lectura dels paràmetres
    String pCategoria = request.getParameter("categoria");

    EnumDronCategoria categoria = null;
    if (pCategoria != null) {
        categoria = EnumDronCategoria.valueOf(pCategoria);
    }

    DronDao listDron = new DronDao();
    List<Dron> listaDrones = listDron.listarDronCategoria(categoria);
    request.setAttribute("listaDrones", listaDrones);

    // També introduím el genere al request
    request.setAttribute("categoria", pCategoria);
%>

<jsp:include page="common/header.jsp"/>

<p class="h1">Drones disponibles</p>

<div class="row">
    <ul class="list-group">
        <c:forEach var="dron" varStatus="loop" items="${listaDrones}">
            <li class="list-group-item">ID: <c:out value="${dron.id}"/> - <c:out value="${dron.nombre}"/> - Cantidad:
                <c:out value="${dron.precioBase}"/></li>
        </c:forEach>
    </ul>
</div>

<button class="btn btn-primary m-3" data-toggle="modal" data-target="#skinsModal">Añadir skins</button>

<p class="h1">Almacenes</p>


<jsp:include page="anadirSkin.jsp"/>

<jsp:include page="common/footer.jsp"/>