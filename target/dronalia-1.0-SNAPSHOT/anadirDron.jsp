<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" id="dronModal" tabindex="-2" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <h3 class="text-center">Añadir Dron</h3>
                <form id="loginForm" action="${pageContext.request.contextPath}/mantenimiento?action=addDron"
                      method="POST">
                    <div class="form-group">
                        <label for="dronName">Nombre</label>
                        <input type="text" name="dronName" class="form-control" id="dronName" placeholder="Nombre">
                    </div>
                    <div class="form-group">
                        <label for="dronImg">Nombre de la imagen</label>
                        <input type="text" name="dronImg" class="form-control" id="dronImg" placeholder="Nombre">
                    </div>
                    <div class="form-group">
                        <label for="dronCat">Categoria:</label>
                        <select class="form-control" name="dronCat" id="dronCat">
                            <option value="BASICO">Basico</option>
                            <option value="AVANZADO">Avanzado</option>
                            <option value="PROFESIONAL">Profesional</option>
                        </select>

                        <label for="dronColor">Color:</label>
                        <select class="form-control" name="dronColor" id="dronColor">
                            <option value="NEGRO">Negro</option>
                            <option value="BLANCO">Blanco</option>
                            <option value="ROJO">Rojo</option>
                        </select>

                        <label for="dronAxis">Ejes:</label>
                        <select class="form-control" name="dronAxis" id="dronAxis">
                            <option value="2">2</option>
                            <option value="4">4</option>
                            <option value="6">6</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="dronMesure">Medida</label>
                        <input type="text" class="form-control" name="dronMesure" id="dronMesure" placeholder="Medida">
                        <label for="dronPrice">Precio base</label>
                        <input type="number" class="form-control" name="dronPrice" id="dronPrice" placeholder="Precio">
                    </div>
                    <div class="col mb-4">
                        <button type="submit" class="btn btn-success float-right">Añadir Dron</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>