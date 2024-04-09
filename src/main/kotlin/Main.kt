/*GLOSARIO (var, val, fun, class, double, String, int, false, true, null, ?:, return, constructor, init, private,
companion object, const, object, "lateinit", inner)

 */

/*fun main() {
/*
    // Nunbers
    val byte: Byte = 8 //8-bit
    val short: Short = 16 // 16-bit
    val age: Int = 31 //32-bit
    val long: Long = 192 //64-bit

    val desconto:Float = 30.90f // 32-bit
    val price: Double = 31.90 //64-bit ponto flutuante (floating point)

    //TEXT
    val product: String = "iMac"

    //BOOLEANO( TRUE | FALSE)
    val booleana = false // 1 byte(8bits)

    println(booleana::class)

    //Converter um tipo para outro
    val mediaDePreco = 22.4
    println(mediaDePreco::class)

    val resposta = mediaDePreco.toInt()
    println(resposta::class)

    println(resposta)
*/
/*
    //NUMEROS GRANDES
    val produto: Long = 1_200 // utilizar underline para numeros muito grandes, melhora a identificação
    println(produto)

    // Operadores Lógicos ( + - / * !)
    var idade = 31
    idade = idade + 10
    println(idade)

    var textoIdade = "31"
    println(textoIdade + " minha idade") //concatenar

    val booleana = true
    println(!booleana) // colocar ! no inicio inverte a resposta do Boll

 */
/*
    //Criptografia - Char

    val name = "thiago" //string é uma sequencia de caracteres (chars)
    val primeiraLetra = 'T' //quando vai se declarar apenas um caracter(char), se usa aspas simples 'T', pode usar o '\n' para pular linha ou '\t' para dar espaço TAB
    println(primeiraLetra)

     */
/*
    //continuação
    val name: String = "thiago Brito" // Objeto=tipo
    val tamanhoDoNome = name.length //length é usado para contar a quantidade de caracteres contidos na frase
    println(tamanhoDoNome)

    println("óla pessoal".length)


    val nome: String = "teste de lógica"
    val tamanhoFrase = nome.length
    val maiusculo = nome.uppercase() //usado para deixar toda frase em letra maiuscula
    println(maiusculo)
    println(tamanhoFrase)
    */
/*
    //Formatação de textos
    // 3 tipos de formatações de texto
    //1.
    val message = "olá thiago. \nSeu produto chegou!"
    println(message)

    //2.
    val welcome = """
    Olá thiago,
    Seu produto chegou!
    Obrigado pela preferencia!
        """.trimIndent() //isso ira jogar todas as linhas para a esquerda, formatando do jeito certo o texto, é util para textos muito grandes
    println(welcome)

    //3.
    val name = "thiago"
    val age = 24
    val price = 19.90
    println("Óla "+ name + ". Sua idade é " + age)

    println("Olá $name. Sua idade é ${age + 10}. Seu desconto é: $price e seu nome tem ${name.length} caracteres")//este tipo de formatação é mais
// pratico e pode-se alterar as informações pelo o println${age + 10}
     */
    //Condições Lógicas(if,else)
/*
    //Controle de fluxo
    val produto = "iPhone"

    if(produto.length < 5) { // pode se usar diversos tipos de expreções antes do 5 (<, <=, >, >=, !, !=, ==)
        println("Você não pode cadastrar podrutos com menos de cinco caracteres")
    } else {
        println("Produto cadastrado com sucesso!")
    }
 */
    /*
    val preco = 25_000
    if (preco > 30_000) {
        println("Você ganhou 30% de desconto")
    } else if (preco > 20_000) {
        println("Você ganhou 20% de desconto")
    } else if (preco > 10_000) {
        println("Você ganhou 10% de desconto")
    } else {
        println("Você não ganhou desconto")
    }
    */
    /*
    //Condições Compostas
    val preco = 49
    val produto = "teclado"
    // E = &&
    // TRUE  | TRUE  = true
    // TRUE  | FALSE = false
    // FALSE | TRUE  = false
    // FALSE | FALSE = false

    //OU = ||
    // TRUE  | TRUE  = true
    // TRUE  | FALSE = true
    // FALSE | TRUE  = true
    // FALSE | FALSE = false

    if (preco == 49 || produto == "teclado") {
        println("sucesso")}
        else println("falha")

    //Comparar String
    val produto1 = "iMac"
    val produto2 = "iphone"

    println(produto1 != produto2)

     */
    /*
    // aceita null (nullable)
    var endereco: String? = null

    // operador elvis ?:
    val qtdDeCaracteres = if (endereco != null) endereco.length else 0
    val qtdDeCaracteres = endereco?.length ?: 0
    println(qtdDeCaracteres)

     */
    // funções - ingles (functions) - blocos de codigos reutilizáveis | organizar o codigo fonte
    // ela pode ter um tipo de retorno (double, string, int, long....) caso não tenha retorno = ()
    //val resposta = somar() //call - chamar a função
    // declaração e o corpo da função
    // as funções também podem ter ou não parametros
    // parametros NOMEADOS// sobrecarga de função
    // proximo passo depois das funções é:
    // POO
    // tratar tudo como objeto
    // class (molde responsavel por criar N objetos (propriedades | comportamentos))
    //objeto é a instancia (a criação) a partir daquele molde// uma vez modificado o molde, Todos os objetos que saem vão receber a atualização

    /* olaMundo()
    //uma serie de codigos

    //println(resposta)
}
//função sem retorno
fun olaMundo() {
    println("ola mundo")
    // funções de escopo (RARO DE USAR)
    fun subtracao() {     // escopo...
        println("uma mensagem para o usuário informado que começou a execução") // ...da...
        println(2 +4)     // ...função olaMundo
    }
    subtracao()

    //fazer varias coisas neste espaço(login, registro no banco)

    subtracao()
}
//função com retorno(no caso tipo :String)
fun somar(): String {
    val resultado = 2 + 3
    return "estou somando 2 com 3 e o resultado è? $resultado"

    */
    //olaMundo()
/*
    verificacaoDeIdade(18, "Bruce")

    verificacaoDeIdade(16, "Thiago")
}

fun olaMundo() = println("ola Mundo") // se função utiliza apenas uma linha, pode decalrar ela assim

fun verificacaoDeIdade(age : Int, nome: String) {
    println("minha idade é $age e meu nome é $nome")
    if (age > 16) {
        println("pode dirigir")
    } else {
        println("não pode dirigir")
    }

 */
    /*
    financiamento("Thiago", 43854874525, 50.000,)
    financiamento("Eduardo", 45785236984, 30.000,)
    financiamento("Beatriz", 47936954870, 60.000,)

    sistemaDeLogin("Thiago Brito", 24, "ADS", false)
    sistemaDeLogin("victor", 23, "ADS", false)
    sistemaDeLogin("camila", 22, "ENG", true)
    sistemaDeLogin("Eduardo", 21, "ELN", true)
    sistemaDeLogin("Juliane", 27, "ENF", true)

     */

    val clienteA = finalciamento()


    clienteA.nome = "Thiago"
    clienteA.cpf = "47588562588"
    clienteA.email = "thiasfo@gmail"

    clienteA.imprimirCaixaAlta()
    println(clienteA.nome)
    println(clienteA.cpf)
    println(clienteA.email)
}

    /*
    fun sistemaDeLogin(nome: String, idade: Int, curso: String, situacao: Boolean)
    {
        println("nome do aluno: $nome, idade: $idade, Curso: $curso, matricula ativa: $situacao")
    }

    fun financiamento(nome:String, cpf: Long, credito: Double, aprovado: Boolean = false)
    {
     //println("Senhor(a) $nome, portador do CPF $cpf, gostariamos de informalo que seu pedido de crédito no valor de $credito foi $aprovado")
        if (credito > 50.000) {
            println("Senhor(a) $nome, portador do CPF $cpf, gostariamos de informalo que seu pedido de crédito no valor de $credito foi $aprovado")
        }
        else {
            println("Senhor(a) $nome, portador do CPF $cpf, gostariamos de informalo que seu pedido de crédito no valor de $credito foi Aprovado!")
        }
    }

     */

    class finalciamento {
        var nome: String = ""
        var cpf: String = ""
        var email: String = ""
        //responsabilidade
        fun imprimirCaixaAlta() {
            println("Olá " + nome.uppercase())
        }
    }*/
/*fun main () {
    val userA = User()

    userA.name = "Thiago"

    userA.printUpperCase()

    userA.updatename("Tiago")

    userA.printUpperCase()

    val nameLength = userA.getNameLength()
    println(nameLength)

    val userB = User()
    userB.name = "Gustavo"
    println(userB.getNameLength())
}
 */
/*
fun main () {
    val userA = User("thiago")

    val nameLength = userA.getNameLength()
    println(nameLength)
    println(userA.name)

    val userB = User("Gustavo")
    println(userB.getNameLength())
    println(userB.name)
}
 */
/*
fun main(){
    val userA = User("Thiago", isAdmin = true)

    val nameLength = userA.getNameLength()
    println(nameLength)
    println(userA.name)
    println(userA.isAdmin)

    val userB = User("Gustavo")
    println(userB.getNameLength())
    println(userB.name)
    println(userB.isAdmin)


    val userC = User()
    println(userC.getNameLength())
}
 */
/*
fun main() {
    val userA = User("thiago", true, 0)

    val namelength = userA.getNameLength()
    println(namelength)
    println(userA.name)
    println(userA.isAdmin)

    val userB = User("Gustavo", false, 45, "Maculino")
    println(userB.getNameLength())
    println(userB.name)
    println(userB.isAdmin)
    println(userB.id)
    println(userB.sex)

    val userC = User()
    println(userC.getNameLength())
}

 */

//classe -> é o molde para criar N objetos
//objetos -> é o conjunto de propriedades e comportamentos de um contexto do seu sistema(Button, loginScreen, passValidat)
//object -> é um objeto também, só que ele é unico, ou seja, não é igual a classe que sai varios objetos
//(exemplo: Banco de dados, sessão de usuario, logs)

//TIPOS DE CLASES

// 1. Classes aninhadas (Nestd Class)
// 2. classes internas (Nesed class)
// 3. Classes enumeradas (Enum)

/*fun main() {
    val creditCardAPIName = "amex"
    val card = CreditCard.valueOf(creditCardAPIName.uppercase())

    if (card == CreditCard.VISA){
        println("Dar um desconto!")
    }
    else {
        println("Avisar cliente que cartão VISA tem desconto")
        println("O cartão usado pelo cliente é: ${card.label}")
    }


 }

enum class CreditCard (val label: String,val percent: Int){
    VISA("VISA",15),
    MASTER("MASTERCARD",0),
    ELO("ELO",0),
    AMEX("AMERICAN EXPRESS",0)
}
 */
//Open class
/*
fun main() {

    val olaMundo = Textview("ola Mundo")
    olaMundo.render()

    val botaoLogin = ButtonView("Entrar", "#f00")
    botaoLogin.render()
}
open class Textview(var text: String) {
    var textColor = "#000"
    fun render() {
        //todo o codigo que desenha na tela
        println("Desenhando $text na cor $textColor")
    }
}

class ButtonView(text: String, var backgroundcolor: String) : Textview(text) {

}





open class Pessoa(var nome: String, var endereco: String) {
    protected var acessobiblioteca = false

    fun descricao() = "Meu nome é $nome e meu endereço é $endereco. nivel de acesso $acessobiblioteca"
}

class Professor(nome: String, endereco: String): Pessoa(nome, endereco) {
    init {
        acessobiblioteca = true
    }

}
class Aluno (var matriculaId: Int, nome: String, endereco: String): Pessoa(nome, endereco) {

}
 */
/*
fun main() {
    /*
    val items = intArrayOf(1, 2, 3, 4, 5)
    items.forEach { println(it)
    }

    val users = arrayOf(
        User("Thiago",true),
        User("Bruce", false)
    )

    val newList = users.plus(User("Lucas", false))

    //newList.forEach { println(it) }

    //buscar
    println(users[0])

    //novo usuario
    users[0]= User("Novo usuario", false)
    println(users[0])

     */
/*
    val users = mutableListOf<User>(
        User("Thiago",true),
        User("Bruce", false),
        User("Lucas", true)
    )
    //atualização(update)
    users[2] = User("Lucas", false)

    //adicionar
    val newUser = User("Novo usuario", false)
    users.add(newUser)
    users.forEach{ println(it) }

    //excluir
    println("==========")
    users.remove(newUser)
    users.forEach { println(it) }

 */

    /*
    // combinação 1
    val a = mutableListOf("Thiago", "Lucas")
    val b = listOf("Joao","peter","Lucy")

    b.filterTo(a, { it.contains("a") })
    println(a)

    // combinação 2
    val c = listOf("A", "B")
    val d = listOf("E", "F")
    val all = listOf(c, d)
    println(all)
    println(all.flatten())

     */

    val users = mutableListOf<User>(
        User("Thiago",true),
        User("Bruce", false),
        User("Lucas", true)
    )

    val objFiltered = users.firstOrNull{ it.name == "Joana" }
    println(objFiltered)
}

 */
/*
fun main() {
    val users = listOf(
        User("Thiago Brito", true),
        User("Lucas", true),
        User("Thiago Aguiar", true),
    )

    calc(5, 5, ::sum)
    calc(5, 5, ::minus)
    calc(5, 5, ::divid)

//    calc(5, 5, { x, y ->
//    x * y
//    })

    calc(5, 5) {x, y ->
        x * y
    }
    //filter
//    val newUsers = users.filter { user ->
//        user.name.contains("Thiago")
//    }
    //forEach
//    newUsers.forEach { user ->
//        println(user)
//    }

    //map List<User> -> List<String>
//    val listNames = users.map { user ->
//        user.name
//    }
//    listNames.forEach { println(it) }

    val listNames = users.map { it.name.uppercase() }
                        .filter { it.contains("I") }

    listNames.forEach { println(it) }
}



    fun sum(x: Int, y: Int): Int {
        return x + y

    }
    fun minus(x: Int, y: Int): Int {
    return x - y

}
    fun divid(x: Int, y: Int): Int {
    return x / y

}
    //fun mult(x: Int, y: Int): Int {
   // return x * y



fun calc(a: Int, b: Int, operation: (Int, Int) -> Int ) {
    val result = operation(a , b)
    println("Resultado da operação  $a com $b = $result")
} */

/*
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val numbers2 = listOf(1, 2, 5, 10, 12, 16)
    val result = numbers.union(numbers2)

//    result.forEachIndexed { index, el ->
//        println("index: $index, elemento id: $el") }
//}

//    for (number in numbers) {
//        println(number)
//    }

//    for(index in 0  until 3) {
//        println("index: $index, elemento id: ${numbers[index]}")
//    }
//    //pulando o indice
//    for (i in 0 until 20 step 2) {
//        println("N#$i")
//    }
    //reserve
//    for (i in 20 downTo 0 step 2) {
//        println("N#$i")
//    }

    //while
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }
}*/

    //IMUTAVEIS | MUTAVEIS
    // listOf -> mutableListOf
    // setOf -> mutableSetOf
    // mapOf -> mutableMapOf

fun main () {

    val product = mapOf(
        "Android" to "Google",
        "IOS" to "Aplle",
        "Windows" to "Microsoft"
    )

//    val resp = product.getOrDefault("Android2", "Não existe empresa para este sistema operacional")
//    val resp = product.getOrElse("Android2") {
//        "Não existe empresa para este sistema operacional"
//    }
//    println(resp)

//

//    val session = mapOf(
//        "Token" to "12345678945"
//    )
//
//    val hasToken = session.containsKey("Token")
//    if (hasToken) {
//        println("exibir a tela principal do meu app")
//    }
//    else {
//        println("exibir a tela de login para o usuario")
//    }


    val users = User.createUsers(10)
    println(users.map { it.last.uppercase() })
}