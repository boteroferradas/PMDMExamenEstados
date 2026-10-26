import Gestor.estado_actual
import Gestor.nivel_actual

sealed class Estados {
    object Idle : Estados() {
        fun onenter() {
            if (nivel_actual == Niveles.NIVEL0) {
                println("Se encuentra en $nivel_actual")
                nivel_actual = Niveles.NIVEL2
                estado_actual = MovingUP
            }
            else if (nivel_actual == Niveles.NIVEL1) {
                println("Se encuentra en $nivel_actual")
                nivel_actual = Niveles.NIVEL2
                estado_actual = MovingDOWN
            }
        }
    }
    object MovingUP : Estados() {
        fun onenter() {
            println(nivel_actual)
            println("Subiendo a Plaza de Compostela")
            Thread.sleep(2000)
            println("Destino alcanzado")
            estado_actual = Idle
            nivel_actual = Niveles.NIVEL1
        }
    }
    object MovingDOWN : Estados() {
        fun onenter() {
            println(nivel_actual)
            println("Bajando a Avenida Garcia Borbón")
            Thread.sleep(2000)
            estado_actual = Idle
            nivel_actual = Niveles.NIVEL1
        }
    }
    data class Error(val mensaje: String) : Estados(){
        override fun toString(): String {
            return "Error: $mensaje"
        }
    }
}