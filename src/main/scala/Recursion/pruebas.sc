import Recursion.{pascal, balanceado}
//Pruebas triangulo de pascal
println(pascal(0, 0))
println(pascal(1, 1))
println(pascal(2, 3))

//Pruebas balanceado de parentesis
println( balanceado("(hola) como estas? ())(".toList) )
println( balanceado("(hola) como estas? ()".toList) ) 
println( balanceado("(hola) como estas? ()(".toList) ) 
println( balanceado("(hola) como estas? ())".toList) ) 



