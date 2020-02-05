<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″>
   <!--Si volen que la pàgina es carregui cada 5 segons  -->
   <!--<meta http-equiv="refresh" content="5;url=${pageContext.request.contextPath}/client">-->
   <!-- CSS -->
   <link rel="stylesheet" type="text/css" href="css/style.css">
   <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   <script src="https://kit.fontawesome.com/f90d3bf50d.js" crossorigin="anonymous"></script>
   <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
   <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
   <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
   <!-- Fonts -->
   <link href="https://fonts.googleapis.com/css?family=Lobster&display=swap" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css?family=Lobster+Two:700i&display=swap" rel="stylesheet">


   <title>Plantilla</title>
</head>

  <body>

	<div class="container">
		<div class="cardproduct">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
            <!-- imagen al hacer click -->
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1"><img src="img/product.png" /></div>
						  <div class="tab-pane" id="pic-2"><img src="img/product.png" /></div>
						  <div class="tab-pane" id="pic-3"><img src="img/product.png" /></div>
						  <div class="tab-pane" id="pic-4"><img src="img/product.png" /></div>
						  <div class="tab-pane" id="pic-5"><img src="img/product.png" /></div>
						</div>
            <!-- imagen que se ve en la pag -->
						<ul class="preview-thumbnail nav nav-tabs">
						  <li class="active"><a data-target="#pic-1" data-toggle="tab"><img src="img/product.png" /></a></li>
						  <li><a data-target="#pic-2" data-toggle="tab"><img src="img/product.png" /></a></li>
						  <li><a data-target="#pic-3" data-toggle="tab"><img src="img/product.png" /></a></li>
						  <li><a data-target="#pic-4" data-toggle="tab"><img src="img/product.png" /></a></li>
						  <li><a data-target="#pic-5" data-toggle="tab"><img src="img/product.png" /></a></li>
						</ul>

					</div>
					<div class="details col-md-6">
						<h3 class="product-title">Dron quality amateur</h3>
            <!-- Estrellas -->
            <div class="rating">
							<div class="stars">
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>
							</div>
							<span class="review-no">41 reviews</span>
						</div>
						<p class="product-description">Suspendisse quos? Tempus cras iure temporibus? Eu laudantium cubilia sem sem! Repudiandae et! Massa senectus enim minim sociosqu delectus posuere.</p>
						<h4 class="price">current price: <span>$180</span></h4>
						<p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>
						<h5>
                <button class="add-to-cart btn btn-default" type="button" data-toggle="modal" data-target=".bd-example-modal-lg">Personalizar</button>
						</h5>
						<div class="action">
							<button class="add-to-cart btn btn-default" type="button">add to cart</button>
							<button class="like btn btn-default" type="button"><span class="fa fa-heart"></span></button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

		<jsp:include page="/modal.jsp"/>

  </body>
</html>