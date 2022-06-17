fun main(args: Array<String>) {

    //Parte 1

    println("---------------Calculadora v1.0--------------")
    println("Seja bem vindo(a)!")
    println("Voce deseja fazer qual operacao:")
    println("1 - Soma")
    println("2 - Subtracao")
    println("Digite o numero correpondente a operacao que voce deseja fazer e aperte enter:")
    var escolha = readLine()!!.toInt()

    //Parte 2
    if (escolha == 1){
        println("-------------------------------")
        println("Ok, Voce deseja fazer uma soma")
        println("Digite o primeiro valor e aperte enter:")
        var valors1 = readLine()!!.toInt()
        println("Agora digite o segundo valor e aperte enter:")
        var valors2 = readLine()!!.toInt()
        var soma = valors1 + valors2
        println("-------------------------------")
        println("O resultado e o seguinte:")
        println("${valors1}+${valors2}=${soma}")
        println("-------------------------------")
    } else if (escolha == 2){
        println("-------------------------------")
        println("Ok, Voce deseja fazer uma subtracao")
        println("Digite o primeiro valor e aperte enter:")
        var valorsub1 = readLine()!!.toInt()
        println("Agora digite o segundo valor e aperte enter:")
        var valorsub2 = readLine()!!.toInt()
        var soma = valorsub1 + valorsub2
        println("-------------------------------")
        println("O resultado e o seguinte:")
        println("${valorsub1}-${valorsub2}=${soma}")
        println("-------------------------------")
    }
}