<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" id="dronModal" tabindex="-2" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <h3 class="text-center">Añadir Dron</h3>
                <form id="loginForm" action="${pageContext.request.contextPath}/mantenimiento?action=addDron" method="POST">
                    <div class="form-group">
                        <label for="dronName">Nombre</label>
                        <input type="text" name="dronName" class="form-control" id="dronName" placeholder="Nombre">
                    </div>
                    <div class="form-group">
	                    <label for="dronImg">Ruta a la imagen</label>
	                    <input type="text" name="dronImg" class="form-control" id="dronImg" placeholder="Ruta">
                    </div>
                    <div class="form-group">
					<label for="dronCat">Categoria:</label>
					  <select class="form-control" id="dronCat">
					    <option>BASIC</option>
					    <option>AVANZADO</option>
					    <option>PROFESIONAL</option>
					  </select>
					</div>
					<div class="form-group">
					<label for="dronAxis">Ejes:</label>
					  <select class="form-control" id="dronAxis">
					    <option>2</option>
					    <option>4</option>
					    <option>6</option>
					  </select>
					</div>
					<div class="form-group">
                        <label for="dronMesure">Medida</label>
                        <input type="text" name="dronName" class="form-control" id="dronMesure" placeholder="Medida">
                    </div>
                    <div class="col mb-4">
                        <button type="button" class="btn btn-success float-right">Añadir Dron</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>