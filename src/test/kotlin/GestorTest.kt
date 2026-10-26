package org.danielcastelao.dam

import Niveles
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GestorTest {
    @AfterTest
    fun restaurarEstado() {
        Gestor.estado_actual = Estados.Idle
        Gestor.nivel_actual = Niveles.NIVEL0
    }

    @Test
    fun `estado inicial debe de ser idle con Nivel 0`() {
        assertEquals(Estados.Idle, Gestor.estado_actual)
        assertEquals(Niveles.NIVEL0, Gestor.nivel_actual)
    }

    @Test
    fun `estado inicial debe de ser idle con Nivel 1`() {
        Gestor.nivel_actual = Niveles.NIVEL1

        assertEquals(Estados.Idle, Gestor.estado_actual)
        assertEquals(Niveles.NIVEL1, Gestor.nivel_actual)
    }

    @Test
    fun `gestor establece el nivel cuando el estado es MovingUP`() {
        Gestor.estado_actual = Estados.MovingUP
        Gestor.nivel_actual = Niveles.NIVEL2

        assertEquals(Estados.MovingUP, Gestor.estado_actual)
        assertEquals(Niveles.NIVEL2, Gestor.nivel_actual)
    }

    @Test
    fun `gestor establece el nivel cuando el estado es MovingDOWN`() {
        Gestor.estado_actual = Estados.MovingUP
        Gestor.nivel_actual = Niveles.NIVEL2

        assertEquals(Estados.MovingUP, Gestor.estado_actual)
        assertEquals(Niveles.NIVEL2, Gestor.nivel_actual)
    }
}