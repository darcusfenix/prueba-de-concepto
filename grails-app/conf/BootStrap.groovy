import model.Usuario

class BootStrap {

    def init = { servletContext ->

        Usuario usuario = new Usuario()
        usuario.nombre = "JUAN"
        usuario.apellido = "CRISÓSTOMO"
        usuario.save(flush: true)

    }
    def destroy = {
    }
}
