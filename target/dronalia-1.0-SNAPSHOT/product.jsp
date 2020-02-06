<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.dronalia.dao.DronDao" %>
<%@ page import="com.dronalia.dto.Dron" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%
    // Lectura de paràmetres: codi de la pel·lícula
    int idDron = Integer.parseInt(request.getParameter("codi"));
    System.out.println("Codi film: " + idDron);

    // Recuperam l'objecte pel·lícula
    DronDao uniqueDron = new DronDao();
    Dron dron = uniqueDron.listarDron(idDron);

    // Necessari per ser processat per JSLT
    request.setAttribute("dron", dron);

    // Variable per determinar si mostra la fitxa html de la pel·lícula o no
    boolean trobada = (dron != null);
    request.setAttribute("exist", trobada);
%>

<jsp:include page="./common/header.jsp"/>

<c:if test="${exist}">

    <div class="cardproduct">
        <div class="wrapper row">
            <div class="preview col-md-6">
                <!-- imagen al hacer click -->
                <div class="preview-pic tab-content">
                    <div class="tab-pane active" id="pic-1"><img src="img/product.png"/></div>
                    <div class="tab-pane" id="pic-2"><img src="img/product.png"/></div>
                    <div class="tab-pane" id="pic-3"><img src="img/product.png"/></div>
                    <div class="tab-pane" id="pic-4"><img src="img/product.png"/></div>
                    <div class="tab-pane" id="pic-5"><img src="img/product.png"/></div>
                </div>
                <!-- imagen que se ve en la pag -->
                <ul class="preview-thumbnail nav nav-tabs">
                    <li class="active"><a data-target="#pic-1" data-toggle="tab"><img src="${dron.foto}"/></a>
                    </li>
                    <li><a data-target="#pic-2" data-toggle="tab"><img src="img/product.png"/></a></li>
                    <li><a data-target="#pic-3" data-toggle="tab"><img src="img/product.png"/></a></li>
                    <li><a data-target="#pic-4" data-toggle="tab"><img src="img/product.png"/></a></li>
                    <li><a data-target="#pic-5" data-toggle="tab"><img src="img/product.png"/></a></li>
                </ul>

            </div>
            <div class="details col-md-6">
                <h3 class="product-title">Dron ${dron.nombre}</h3>
                <p>Categoria: ${fn:toLowerCase(dron.dronCategoriaEnum)}</p>
                <!-- Estrellas -->
                <div class="rating">
                    <div class="stars">
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star"></span>
                        <span class="fa fa-star"></span>
                    </div>
                    <p class="review-no">41 reviews</p>
                </div>
                <div class="row">
                    <div class="col-4">
                        <p class="product-description">Número de ejes: ${dron.ejes}</p>
                        <p class="product-description">Medida: ${dron.medida}cm</p>
                    </div>
                    <h4 class="price">Precio: <span>${dron.precioBase}€</span></h4>
                </div>
                <p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>
                <h5>
                    <button class="add-to-cart btn btn-default" type="button" data-toggle="modal"
                            data-target=".bd-example-modal-lg">Personalizar
                    </button>
                </h5>
                <div class="action">
                    <button class="add-to-cart btn btn-success" type="button">Añadir al carrito <i
                            class="fas fa-cart-plus"></i></button>
                    <button class="like btn btn-default" type="button"><span class="fa fa-heart"></span></button>
                </div>
            </div>
        </div>
    </div>

</c:if>

<c:if test="${!exist}">
    <jsp:forward page="./error.jsp"/>
</c:if>

<jsp:include page="/modal.jsp"/>

<jsp:include page="./common/footer.jsp"/>