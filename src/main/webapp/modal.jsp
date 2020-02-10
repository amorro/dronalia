<%@page contentType="text/html" pageEncoding="UTF-8"%>


  <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="header-modal">
          <!-- <h5 class="modal-title">Personalizar</h5> -->
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          </button>
          <nav style="">
            <div class="nav nav-tabs" id="nav-tab" role="tablist">
              <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Mapa</a>
              <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Logo</a>
            </div>
          </nav>
        </div>

        <div class="modal-body">
          <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
              <div>
               <h5 class="colors lobster">Mapa:
                 <span class="color orange"></span>
                 <span class="color green"></span>
                 <span class="color blue"></span>
                 <span class="color red"></span>
                 <span class="color yellow"></span>
                 <span class="color brown"></span>
                 <span class="color pink"></span>
                 <span class="color purple"></span>
               </h5>
             </div>
            </div>
            <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
              <form>
                <div class="input-group mb-3">
                  <input type="text" class="form-control" placeholder="Recipient's username" aria-label="Seleccionar Archivo" aria-describedby="basic-addon2">
                  <div class="input-group-append">
                    <button class="btn btn-primary" type="button">Explorar</button>
                  </div>
                </div>
              </form>
            </div>
          </div>
          <br>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary">Save changes</button>
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>

  <div class="modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
      <div class="modal-content">

      </div>
    </div>
  </div>
  </div>

