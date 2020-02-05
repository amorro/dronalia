<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="com.dronalia.dao.DronDao" %>
<%@ page import="com.dronalia.dto.Dron" %>
<%@ page import="com.dronalia.enumeradas.EnumDronCategoria" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
    // Lectura dels paràmetres
    String pCategoria = request.getParameter("categoria");

    // Validació del paràmetre i creació del valor enum de tipu Genere
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

<jsp:include page="./common/header.jsp"/>

<ul class="nav nav-pills nav-fill">
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
    <img src="img/arrow.png"/>
    <div class="text-over lobsterTwo">${categoria==null?'Todos':categoria}</div>
</div>

<div class="row">
<%--    <div class="album py-5 bg-gradient-dark">--%>
        <!-- card -->
        <c:forEach var="dron" varStatus="loop" items="${listaDrones}">
                <div class="p-1">
                    <div class="card" style="width: 18rem;">
                        <img src="<c:out value="${dron.foto}"/>" class="card-img-top" alt="...">
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
                                                    <a href="./product.jsp" class="btn btn-primary">
                                                        Añadir al
                                                        carrito
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
        </c:forEach>
<%--    </div>--%>
</div>
<jsp:include page="./common/footer.jsp"/>
