<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" id="skinsModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <h3 class="text-center">Añadir Skin</h3>
                <form id="loginForm" action="${pageContext.request.contextPath}/mantenimiento?action=addSkin" method="POST">
                    <div class="form-group">
                        <label for="skinName">Nombre</label>
                        <input type="text" name="skinName" class="form-control" id="skinName" placeholder="Nombre">
                    </div>
                    <div class="form-group">
                        <div class="form-group">
                            <label for="skinImg">Ruta a la imagen</label>
                            <input type="text" name="skinImg" class="form-control" id="skinImg" placeholder="Ruta">
                        </div>
                    </div>
                    <div class="col mb-4">
                        <button type="button" class="btn btn-success float-right">Añadir skin</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>