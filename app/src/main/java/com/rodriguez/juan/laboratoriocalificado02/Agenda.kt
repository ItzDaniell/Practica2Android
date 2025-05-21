package com.rodriguez.juan.laboratoriocalificado02

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }
    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { contacto ->
                println("Nombre: ${contacto.nombre}, Teléfono: ${contacto.telefono}, Email: ${contacto.email}")
            }
        }
    }
    fun buscarPorNombre(nombre: String) {
        val list = contactos.filter { contacto ->
            contacto.nombre.contains(nombre, ignoreCase = true)
        }
        if (list.isEmpty()) {
            println("No se encontraron contactos con el nombre \"$nombre\".")
        } else {
            println("Resultados de búsqueda:")
            for (contacto in list) {
                println("Nombre: ${contacto.nombre}, Teléfono: ${contacto.telefono}, Email: ${contacto.email}")
            }
        }
    }
}