import Recursion.{pascal, balanceado}

println(pascal(2, 3))
println( balanceado("(hola) como estas? ())(".toList) )
println( balanceado("(hola) como estas? ()".toList) ) 
println( balanceado("(hola) como estas? ()(".toList) ) 
println( balanceado("(hola) como estas? ())".toList) ) 



