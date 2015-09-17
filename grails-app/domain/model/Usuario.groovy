package model

class Usuario {

    String nombre
    String apellido

    static constraints = {

    }
    static mapping = {
        table 'usuario'
        id column: 'id', generator: 'identity'
        nombre column: 'nombre'
        apellido column: 'apellido'
        version true
    }
    /*
     create table usuario (
        id  bigserial not null,
        version int8 not null,
        apellido varchar(255) not null,
        nombre varchar(255) not null,
        primary key (id)
    )

     */
}
