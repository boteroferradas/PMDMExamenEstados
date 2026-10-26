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
            nivel_actual = Niveles.NIVEL0
        }
        is Estados.MovingUP -> {
            nivel_actual = Niveles.NIVEL2
        }
        is Estados.MovingDOWN -> {
            nivel_actual = Niveles.NIVEL2
        }
        is Estados.Error -> {
            nivel_actual = Niveles.NIVELERROR
        }
    }
}