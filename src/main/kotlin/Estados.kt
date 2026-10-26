sealed class Estados {
    object Idle : Estados() {
        fun onenter() {
            if (nivel_actual == Niveles.NIVEL0) {
                println("Se encuentra en" + nivel_actual)
                nivel_actual = Niveles.NIVEL2
                estado_acual = MovingUP
            } else {
                println("Se encuentra en" + nivel_actual)
                nivel_actual = Niveles.NIVEL2
                estado_acual = MovingDOWN
            }
        }
    }
    object MovingUP : Estados() {
        fun onenter() {
            print("Subiendo a Plaza de Compostela")
            Thread.sleep(2000)
            estado_acual = Idle
            nivel_actual = Niveles.NIVEL1
        }
    }
    object MovingDOWN : Estados() {
        fun onenter() {
            println("Bajando a Avenida Garcia Borbon")
            Thread.sleep(2000)
            estado_acual = Idle
            nivel_actual = Niveles.NIVEL1
        }
    }
    data class Error(val mensaje: String) : Estados(){
        override fun toString(): String {
            return "Error: $mensaje"
        }
    }
}