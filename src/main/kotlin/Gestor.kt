object Gestor {

    // nivel en el que se encuentra el ascensor
    var nivel_actual: Niveles = Niveles.NIVEL0

    // estado actual del ascensor
    var estado_acual: Estados = Estados.Idle

    /**
     * Gestiona el cambio de estados
     */
    fun gestor() {
        when (estado_acual) {
            is Estados.Idle -> {
                (estado_acual as Estados.Idle).onenter()
            }

            is Estados.MovingUP -> {
                (estado_acual as Estados.MovingUP).onenter()
            }

            is Estados.MovingDOWN -> {
                (estado_acual as Estados.MovingDOWN).onenter()
            }

            is Estados.Error -> {
                println("El acensor tuvo un error ${(estado_acual as Estados.Error).mensaje}")
            }
        }
    }
}