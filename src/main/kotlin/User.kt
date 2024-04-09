import java.awt.Label

//OPÇÃO 01 - SEM VALOR PADRÃO + PALAVRA CONSTRUCTION EXPLICITA
//class User constructor(var name: String = "") {

// OPÇÃO 02 - valor padrão
// class User(var name: String = "") {

//OPÇÂO 3 - espera que o construtor receba o valor (var)

//data class User (var name: String, var isAdmin: Boolean) {
    /*
    lateinit var lastName: String


    fun output() = println("Meu nome é: $name $lastName, sou admin: $isAdmin")

    fun printUpperCase() {
        println("Olá " + name.uppercase())
    }
    fun getnameLength() : Int {
        return name.length
    }

     */

data class User(var name: String, var last: String) {
    companion object {
        private val users = mutableListOf<User>()
        fun createUsers(count: Int) : List<User> {
            for (i in 0 .. count) {
                users.add(User("$i", "desconhecido"))
            }
            return users
        }
    }
}