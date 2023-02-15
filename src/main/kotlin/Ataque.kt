class Ataque(nombre: String, tipo: String, fuerza: Int) {

    var nombre: String = ""

    var tipo: String = ""

    var fuerza: Int = 0
        set(value) {
            if(value < 0){
                throw Exception("El ataque no puede ser menor que 0")
            }
            field = value
        }
    init {
        this.nombre = nombre
        this.tipo = tipo
        this.fuerza = fuerza
    }
    override fun toString(): String {
        return "Ataque $nombre de tipo $tipo con una fuerza de $fuerza"
    }
}