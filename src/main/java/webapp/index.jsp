<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″>
     <!-- CSS -->
     <link rel="stylesheet" type="text/css" href="css/style.css">
     <!-- Bootstrap CSS -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
     <script src="https://kit.fontawesome.com/f90d3bf50d.js" crossorigin="anonymous"></script>
     <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
     <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
     <!-- Fonts -->
     <link href="https://fonts.googleapis.com/css?family=Lobster&display=swap" rel="stylesheet">
     <link href="https://fonts.googleapis.com/css?family=Lobster+Two:700i&display=swap" rel="stylesheet">


     <title>Plantilla</title>
 </head>
  <body>
<!-- HEADER -->
  <jsp:include page="/common/header.jsp" />

 <!-- Body -->
   <div class="arrowdiv">
     <img src="img/arrow.png" />
     <div class="text-over lobsterTwo">Amateur</div>
   </div>

 <div>
 <div class="container-fluid">
   <div class="album py-5 bg-gradient-dark">
     <div class="container">


       <div class="row">
 <!-- card -->
         <div class="col-md-6">
           <div class="card" style="width: 30rem; margin-left: 0px;">
             <img src="img/product.png" class="card-img-top" alt="...">
             <a class="btn btn-fix text-left" data-toggle="collapse" href="#multiCollapseExample1" role="button" aria-expanded="false" aria-controls="multiCollapseExample1">
             <div class="card-body">
               <h5 class="card-title">Dron 1</h5>
               <div>
                 <p>3,40€</p>
                 <div class="row">
                   <div class="col">
                     <div class="collapse multi-collapse" id="multiCollapseExample1">
                       <div>
                       <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                       <button href="product.html" class="btn btn-primary">Añadir al carrito</button>
                       </div>
                     </div>
                   </div>
                 </div>
               </div>
             </div>
             </a>
           </div>
         </div>
       </div>
     </div>
   </div>
 </div>
</div>
<!-- footer -->
<jsp:include page="/common/footer.jsp" />
   </body>
 </html>
