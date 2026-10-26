object Gestor {

    // nivel en el que se encuentra el ascensor
    var nivel_actual: Niveles = Niveles.NIVEL0

    // estado actual del ascensor
    var estado_actual: Estados = Estados.Idle
    /**
     * Gestiona el cambio de estados
     */
    fun gestor() {
        when (estado_actual) {
            is Estados.Idle -> {
                (estado_actual as Estados.Idle).onenter()
            }

            is Estados.MovingUP -> {
                (estado_actual as Estados.MovingUP).onenter()
            }

            is Estados.MovingDOWN -> {
                (estado_actual as Estados.MovingDOWN).onenter()
            }

            is Estados.Error -> {
                println("El ascensor tuvo un error: ${(estado_actual as Estados.Error).mensaje}")
            }
        }
    }
}