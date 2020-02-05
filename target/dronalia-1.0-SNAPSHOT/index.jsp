<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="com.dronalia.dto.Dron" %>
<%@ page import="java.util.List" %>
<%@ page import="com.dronalia.dao.DronDao" %>
<%@ page import="com.dronalia.enumeradas.EnumDronCategoria" %>

<%
    // Lectura dels paràmetres
    String pCategoria = request.getParameter("categoria");

    // Validació del paràmetre i creació del valor enum de tipu Genere
    EnumDronCategoria categoria = null;
    if (pCategoria != null) {
        categoria = EnumDronCategoria.valueOf(pCategoria);
    }

    List<Dron> listaDrones = DronDao.listarDronCategoria(categoria);
    request.setAttribute("listaDrones", listaDrones);

    // També introduím el genere al request
    request.setAttribute("categoria", pCategoria);

%>

<jsp:include page="/common/header.jsp"/>

<ul class="nav nav-pills nav-fill">
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria==null?'active':''}"/>" href="index.jsp">Todos</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria=='BASICO'?'active':''}"/>" href="index.jsp?categoria=BASICO">Basico</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria=='AVANZADO'?'active':''}"/>"
           href="index.jsp?categoria=AVANZADO">Avanzado</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <c:out value="${categoria=='PROFESIONAL'?'active':''}"/>" href="index.jsp?categoria=PROFESIONAL">Profesional</a>
    </li>
</ul>

<div class="arrowdiv">
    <img src="img/arrow.png"/>
    <div class="text-over lobsterTwo">Amateur</div>
</div>

<div>
    <div class="container-fluid">
        <div class="album py-5 bg-gradient-dark">
            <div class="container">
                <div class="row">
                    <!-- card -->
                    <c:forEach var="dron" varStatus="loop" items="${listaDrones}">
                        <c:if test="${loop.index < loop.end}">
                            <div class="col-md-6">
                                <div class="card" style="width: 30rem;">
                                    <img src="<c:out value="${dron.img}"/>" class="card-img-top" alt="...">
                                    <a class="btn btn-fix text-left" data-toggle="collapse"
                                       href="#multiCollapseExample1"
                                       role="button" aria-expanded="false" aria-controls="multiCollapseExample1">
                                        <div class="card-body">
                                            <h5 class="card-title"><c:out value="${dron.nombre}"/></h5>
                                            <div>
                                                <p><c:out value="${dron.precioBase}"/></p>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="collapse multi-collapse" id="multiCollapseExample1">
                                                            <div>
                                                                <p class="card-text"><c:out value="${dron.ejes}"/></p>
                                                                <p class="card-text"><c:out value="${dron.medida}"/></p>
                                                                <button href="product.html" class="btn btn-primary">
                                                                    Añadir al
                                                                    carrito
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </c:if>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/common/footer.jsp"/>
