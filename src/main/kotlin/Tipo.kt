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



    fun Efectividad(tipoAtaque: Tipo, tipoRecibe: Tipo): Double {

        when(tipoAtaque.tipo == "acero"){
            (tipoRecibe.tipo == "hielo" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "hada") -> return 2.0
            (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "electrico" || tipoRecibe.tipo == "fuego") -> return 0.5
            (tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "fantasma" || tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "normal" || tipoRecibe.tipo =="planta" || tipoRecibe.tipo == "psiquico" || tipoRecibe.tipo == "siniestro" || tipoRecibe.tipo == "tierra" || tipoRecibe.tipo == "veneno" || tipoRecibe.tipo == "volador") -> return 1.0
            else -> print("")
        }

        when(tipoAtaque.tipo == "agua"){
            (tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "tierra" || tipoRecibe.tipo == "roca") -> return 2.0
        }
    }

}