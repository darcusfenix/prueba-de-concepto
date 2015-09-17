package prueba.de.concepto

import grails.converters.JSON
import model.Usuario

class UsuarioController {


    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        render(Usuario.list() as JSON)
    }
    def show(Integer id) {
        render(Usuario.findById(id ?: params.int("id")) as JSON)
    }
    def create(){
        render (new Usuario() as JSON)
    }
    def save(){
        Usuario usserInstance = new Usuario(request.JSON)
        if(usserInstance.validate()){
            usserInstance.save(flush: true)
            response.status = 200;
            render([usuario: usserInstance, message: "se registró un nuveo usuario"] as JSON)
        }else{
            response.status = 500;
            render(usserInstance.errors as JSON)
        }
    }
}
