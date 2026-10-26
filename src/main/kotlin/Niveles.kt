enum class Niveles(val nombre: String) {
    NIVEL0("Nivel 0: Avenida Garcia Borbón"),
    NIVEL1("Nivel 1: Plaza de Compostela"),
    NIVEL2( "Nivel 2: Moviéndose"),
    NIVELERROR("Nivel -1: Error"), ;

    override fun toString(): String {
        return nombre
    }


}