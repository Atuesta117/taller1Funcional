

final class pruebas$_ {
def args = pruebas_sc.args$
def scriptPath = """pruebas.sc"""
/*<script>*/
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














/*</script>*/ /*<generated>*//*</generated>*/
}

object pruebas_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new pruebas$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export pruebas_sc.script as `pruebas`

