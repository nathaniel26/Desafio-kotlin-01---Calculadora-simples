fun main(args: Array<String>) {

    var continuar = 0

    while (continuar == 0)
    {
        //Parte 1
        println("---------------Calculadora v1.0--------------")
        println("Voce deseja fazer qual operacao:")
        println("1 - Soma")
        println("2 - Subtracao")
        println("3 - Multiplicacao")
        println("4 - Divisao")
        println("5 - Sair")
        println("Digite o numero correpondente a operacao que voce deseja fazer e aperte enter:")
        //aqui recebemos a escolha do usuario, tranformamos em int pois mesmo que o usuario tecle
        //um numero, na verdade é considerado como uma string
        var escolha = readLine()!!.toInt()

        //Parte 2
        //aqui vamos fazer os if, sera direcionado para o if referente a escolha anterior
        if (escolha == 1){
            println("-------------------------------")
            println("Ok, Voce deseja fazer uma soma")
            println("Digite o primeiro valor e aperte enter:")
            //pegamos o valor 1
            var valors1 = readLine()!!.toInt()
            println("Agora digite o segundo valor e aperte enter:")
            //pegamos o valor 2
            var valors2 = readLine()!!.toInt()
            //criamos uma variavel e atribuimos a soma desses 2 numeros
            var soma = valors1 + valors2
            println("-------------------------------")
            println("O resultado e o seguinte:")
            //e aqui apenas mostramos
            println("${valors1}+${valors2}=${soma}")
            println("-------------------------------")
            println("O que voce deseja fazer agora:")
            println("0 - Fazer uma nova operacao")
            println("5 - Sair")
            continuar = readLine()!!.toInt()

        } else if (escolha == 2){
            println("-------------------------------")
            println("Ok, Voce deseja fazer uma subtracao")
            println("Digite o primeiro valor e aperte enter:")
            var valorsub1 = readLine()!!.toInt()
            println("Agora digite o segundo valor e aperte enter:")
            var valorsub2 = readLine()!!.toInt()
            var sub = valorsub1 - valorsub2
            println("-------------------------------")
            println("O resultado e o seguinte:")
            println("${valorsub1}-${valorsub2}=${sub}")
            println("-------------------------------")
            println("O que voce deseja fazer agora:")
            println("0 - Fazer uma nova operacao")
            println("5 - Sair")
            continuar = readLine()!!.toInt()

        } else if (escolha == 3){
            println("-------------------------------")
            println("Ok, Voce deseja fazer uma multiplicacao")
            println("Digite o primeiro valor e aperte enter:")
            var valormult1 = readLine()!!.toInt()
            println("Agora digite o segundo valor e aperte enter:")
            var valormult2 = readLine()!!.toInt()
            var mult = valormult1 * valormult2
            println("-------------------------------")
            println("O resultado e o seguinte:")
            println("${valormult1}*${valormult2}=${mult}")
            println("-------------------------------")
            println("O que voce deseja fazer agora:")
            println("0 - Fazer uma nova operacao")
            println("5 - Sair")
            continuar = readLine()!!.toInt()

        } else if (escolha == 4){
            println("-------------------------------")
            println("Ok, Voce deseja fazer uma divisao")
            println("Digite o primeiro valor e aperte enter:")
            var valordiv1 = readLine()!!.toInt()
            println("Agora digite o segundo valor e aperte enter:")
            var valordiv2 = readLine()!!.toInt()
            var div = valordiv1 / valordiv2
            println("-------------------------------")
            println("O resultado e o seguinte:")
            println("${valordiv1}/${valordiv2}=${div}")
            println("-------------------------------")

            println("O que voce deseja fazer agora:")
            println("0 - Fazer uma nova operacao")
            println("5 - Sair")
            continuar = readLine()!!.toInt()

        } else{
            continuar = 5;
        }
    }
    println("-------------------------------")
    println("Bay Bay!")
    println("-------------------------------")

}