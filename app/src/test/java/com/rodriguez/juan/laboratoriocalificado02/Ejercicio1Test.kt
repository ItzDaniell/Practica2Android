package com.rodriguez.juan.laboratoriocalificado02

import org.junit.Test

class Ejercicio1Test{
    @Test
    fun main() {
        val agenda = Agenda()
        agenda.agregarContacto(Contacto("Juan Daniel", "123456789", "juandaniel@gmail.com"))
        agenda.agregarContacto(Contacto("Carlos Aguirre", "987654321", "carlosaguirre@gmail.com"))
        agenda.listarContactos()
        agenda.buscarPorNombre("Juan")
    }
}