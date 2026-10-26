enum class Niveles(val nombre: String) {
    NIVEL0("Nivel 0"),
    NIVEL1("Nivel 1"),
    NIVEL2( "Nivel 2"),
    NIVELERROR("Nivel -1"), ;

    override fun toString(): String {
        return "Nivel actual: $nombre)"
    }


}