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

<ul class="nav nav-pills nav-fill" id="nav">
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria==null?'active':''}"/>" href="index.jsp">Todos</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria=='BASICO'?'active':''}"/>"
           href="index.jsp?categoria=BASICO">Basico</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria=='AVANZADO'?'active':''}"/>"
           href="index.jsp?categoria=AVANZADO">Avanzado</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria=='PROFESIONAL'?'active':''}"/>"
           href="index.jsp?categoria=PROFESIONAL">Profesional</a>
    </li>
</ul>

<div class="arrowdiv">
    <img src="./img/arrow.png"/>
    <div class="text-over lobsterTwo">${categoria==null?'TODOS':categoria}</div>
</div>

<div class="row">
    <c:forEach var="dron" varStatus="loop" items="${listaDrones}">
        <div class="p-1">
            <div class="card" style="width: 18rem;">
                <img src="<c:out value="${dron.foto}"/>" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title"><c:out value="${dron.nombre}"/></h5>
                    <div>
                        <a href="./product.jsp?codi=<c:out value="${dron.id}"/>" class="btn btn-info">Más
                            información</a>
                        <div>
                            <p class="card-text">Ejes: <c:out value="${dron.ejes}"/></p>
                            <p class="card-text">Medida: <c:out value="${dron.medida}"/></p>
                            <p><c:out value="${dron.precioBase}"/>€</p>
                            <button class="btn btn-primary"
                                    onclick="agregarCarrito(${dron.id}, '${dron.nombre}', '${dron.foto}', '${dron.precioBase}')">
                                Añadir al carrito
                            </button>
                        </div>
                    </div>
                </div>
                </a>
            </div>
        </div>
    </c:forEach>
</div>

<jsp:include page="common/footer.jsp"/>
