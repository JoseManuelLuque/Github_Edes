fun main() {
    var Pikachu = Pokemon(125,"Pikachu", 200, Tipo("electrico"))
    var Charmander = Pokemon(245, "Charmander", 250, Tipo("fuego"))


    println(Pikachu.tipo.Efectividad(Tipo("electrico"), Tipo("fuego")))
}