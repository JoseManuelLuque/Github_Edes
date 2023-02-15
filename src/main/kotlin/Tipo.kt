class Tipo(tipo: String) {

    val tiposValidos = setOf("acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador")

    var tipo: String = ""

        get() = field

        set(value) {
            if (tiposValidos.contains(value)) {
                field = value
            } else {
                throw IllegalArgumentException("El tipo $value no es válido")
            }
        }
    init {
        this.tipo = tipo
    }

}