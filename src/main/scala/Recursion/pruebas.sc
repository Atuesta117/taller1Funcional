import Recursion.{potencia, pascal, balanceado, cambioMonedas}


//Pruebas potencia
println(potencia(2, 3))
println(potencia(5, 0))
println(potencia(3, 4))

//Pruebas triangulo de pascal
println(pascal(0, 0))
println(pascal(1, 1))
println(pascal(2, 3))

//Pruebas balanceado de parentesis
println( balanceado("(hola) como estas? ())(".toList) )
println( balanceado("(hola) como estas? ()".toList) ) 
println( balanceado("(hola) como estas? ()(".toList) ) 
println( balanceado("(hola) como estas? ())".toList) ) 

//Pruebas cambio de monedas
println(cambioMonedas(4, List(1, 2)))
println(cambioMonedas(4000000,List(200,500)))
println(cambioMonedas(300, List(5,10,20,50,100,200,500)))
println(cambioMonedas(301,List(5,10,20,50,100,200,500)))
