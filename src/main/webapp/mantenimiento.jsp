<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8" %>
<%@ page import="com.dronalia.dao.DronDao" %>
<%@ page import="com.dronalia.dto.Dron" %>
<%@ page import="com.dronalia.enumeradas.EnumDronCategoria" %>
<%@ page import="java.util.List" %>
<%@ page import="com.dronalia.dao.AlmacenDao" %>
<%@ page import="com.dronalia.dto.Almacen" %>
<%@ page import="com.dronalia.dao.StockDao" %>
<%@ page import="com.dronalia.dto.Stock" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
    DronDao listDron = new DronDao();
    AlmacenDao listAlmacen = new AlmacenDao();
    StockDao listStock = new StockDao();

    List<Dron> listaDrones = listDron.listarDronCategoria(null);
    List<Almacen> listaAlmacen = listAlmacen.listarAlmacenes();
    List<Stock> listaStock = listStock.listarStock();

    request.setAttribute("listaDrones", listaDrones);
    request.setAttribute("listaAlmacen", listaAlmacen);
    request.setAttribute("listaStock", listaStock);

%>

<jsp:include page="common/header.jsp"/>

<p class="h1">Drones disponibles</p>

<div class="row">
    <ul class="list-group">
        <c:forEach var="dron" varStatus="loop" items="${listaDrones}">
            <li class="list-group-item">ID: <c:out value="${dron.id}"/> - <c:out value="${dron.nombre}"/> - Precio base:
                <c:out value="${dron.precioBase}"/></li>
        </c:forEach>
    </ul>
</div>
<button class="btn btn-primary m-3" data-toggle="modal" data-target="#dronModal">Añadir Drones</button>
<button class="btn btn-primary m-3" data-toggle="modal" data-target="#skinsModal">Añadir skins</button>

<p class="h1">Almacenes</p>

<div class="">
<c:forEach var="alm" varStatus="loop" items="${listaAlmacen}">
    <p class="h4">${alm.name}</p>
    <p>${alm.descripcion}</p>
    <table class="table table-striped">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Modelo</th>
            <th scope="col">Disponibles</th>
            <th scope="col">Num estantería</th>
            <th scope="col">Estante</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="stock" varStatus="loop" items="${listaStock}">
            <c:if test="${alm.id == stock.alm_id}">
                <tr>
                    <th scope="row">${stock.modelo}</th>
                    <td>${stock.disponibles}</td>
                    <td>${stock.estanteria}</td>
                    <td>${stock.estante}</td>
                </tr>
            </c:if>
        </c:forEach>
        </tbody>
    </table>
    </div>
</c:forEach>
</div>

<jsp:include page="anadirSkin.jsp"/>
<jsp:include page="anadirDron.jsp"/>

<jsp:include page="common/footer.jsp"/>