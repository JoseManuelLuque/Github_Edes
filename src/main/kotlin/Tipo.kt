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

        if (tipoAtaque.tipo == "acero"){
        when(tipoAtaque.tipo == "acero"){
            (tipoRecibe.tipo == "hielo" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "hada") -> return 2.0
            (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "electrico" || tipoRecibe.tipo == "fuego") -> return 0.5
            else -> return 1.0
        }}

        if(tipoAtaque.tipo == "agua"){
        when(tipoAtaque.tipo == "agua") {
            (tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "tierra") -> return 2.0
            (tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "planta" || tipoRecibe.tipo == "dragon") -> return 0.5
            else -> return 1.0
        }}

       if (tipoAtaque.tipo == "bicho"){
        when(tipoAtaque.tipo == "bicho") {
            (tipoRecibe.tipo == "siniestro" || tipoRecibe.tipo == "psiquico" || tipoRecibe.tipo == "planta") -> return 2.0
            (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "veneno" || tipoRecibe.tipo == "volador" || tipoRecibe.tipo == "fantasma" || tipoRecibe.tipo == "hada") -> return 0.5
            else -> return 1.0
        }}


        if (tipoAtaque.tipo == "dragon"){
        when(tipoAtaque.tipo == "dragon") {
            (tipoRecibe.tipo == "dragon") -> return 2.0
            (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "hada" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "planta") -> return 0.5
            else -> return 1.0
        }}

        if (tipoAtaque.tipo == "electrico"){
        when(tipoAtaque.tipo == "electrico") {
            (tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "volador") -> return 2.0
            (tipoRecibe.tipo == "dragon" || tipoRecibe.tipo == "electrico" || tipoRecibe.tipo == "planta") -> return 0.5
            (tipoRecibe.tipo == "tierra") -> return 0.0
            else -> return 1.0
        }}

        if (tipoAtaque.tipo == "fantasma"){
            when(tipoAtaque.tipo == "fantasma"){
                (tipoRecibe.tipo == "fantasma" || tipoRecibe.tipo == "psiquico") -> return 2.0
                (tipoRecibe.tipo == "siniestro") -> return 0.5
                (tipoRecibe.tipo == "normal") -> return 0.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "fuego"){
            when(tipoAtaque.tipo == "fuego"){
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "planta" || tipoRecibe.tipo == "hielo") -> return 2.0
                (tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "dragon" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "roca") -> return 0.5
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "hada"){
            when(tipoAtaque.tipo == "hada"){
                (tipoRecibe.tipo == "dragon" || tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "siniestro") ->return 2.0
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "veneno") -> return 0.5
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "hielo"){
            when(tipoAtaque.tipo == "hielo"){
                (tipoRecibe.tipo == "dragon" || tipoRecibe.tipo == "planta" || tipoRecibe.tipo == "tierra" || tipoRecibe.tipo == "volador") -> return 2.0
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "hielo") -> return 0.5
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "lucha"){
            when(tipoAtaque.tipo == "lucha"){
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "hielo" || tipoRecibe.tipo == "normal" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "siniestro") -> return 2.0
                (tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "hada" || tipoRecibe.tipo == "psiquico" || tipoRecibe.tipo == "veneno" || tipoRecibe.tipo == "volador") -> return 0.5
                (tipoRecibe.tipo == "fantasma") -> return 0.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "normal"){
            when(tipoAtaque.tipo == "normal"){
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "roca") -> return 0.5
                (tipoRecibe.tipo == "fantasma") -> return 0.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "planta"){
            when(tipoAtaque.tipo == "planta"){
                (tipoRecibe.tipo == "agua" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "tierra") -> return 2.0
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "dragon" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "planta" || tipoRecibe.tipo == "veneno" || tipoRecibe.tipo == "volador") -> return 0.5
                else -> return 0.0
            }
        }

        if (tipoAtaque.tipo == "psiquico"){
            when(tipoAtaque.tipo == "psiquico"){
                (tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "veneno") -> return 2.0
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "psiquico") -> return 0.5
                (tipoRecibe.tipo == "siniestro") -> return 0.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "roca"){
            when(tipoAtaque.tipo == "roca"){
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "tierra") -> return 0.5
                (tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "hielo" || tipoRecibe.tipo == "volador") -> return 2.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "siniestro"){
            when(tipoAtaque.tipo == "siniestro"){
                (tipoRecibe.tipo == "fantasma" || tipoRecibe.tipo == "psiquico") -> return 2.0
                (tipoRecibe.tipo == "hada" || tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "siniestro") -> return 0.5
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "tierra"){
            when(tipoAtaque.tipo == "tierra"){
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "fantasma" || tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "veneno") -> return 2.0
                (tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "planta") -> return 0.5
                (tipoRecibe.tipo == "volador") -> return 0.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "veneno"){
            when(tipoAtaque.tipo == "veneno"){
                (tipoRecibe.tipo == "fuego" || tipoRecibe.tipo == "planta") -> return 2.0
                (tipoRecibe.tipo == "fantasma" || tipoRecibe.tipo == "roca" || tipoRecibe.tipo == "tierra" || tipoRecibe.tipo == "veneno") -> return 0.5
                (tipoRecibe.tipo == "acero") -> return 0.0
                else -> return 1.0
            }
        }

        if (tipoAtaque.tipo == "volador"){
            when(tipoAtaque.tipo == "volador"){
                (tipoRecibe.tipo == "bicho" || tipoRecibe.tipo == "lucha" || tipoRecibe.tipo == "planta") -> return 2.0
                (tipoRecibe.tipo == "acero" || tipoRecibe.tipo == "electrico" || tipoRecibe.tipo == "roca") -> return 0.5
                else -> return 1.0
            }
        }

        else{
            return 0.0
        }

    }

}