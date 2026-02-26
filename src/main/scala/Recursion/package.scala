package object Recursion {

  /* 
    * Ejercicio 1: potencia
    * */
  def potencia(m: Int, n: Int): Int = {
    if (n == 0) 1 else m * potencia(m, n - 1)
  }

  /* 
   * Ejercicio 2: pascal
   * */
  def pascal(c: Int, r: Int): Int ={
    if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /* 
    * Ejercicio 3: balanceado
    * */
  def balanceado(chars: List [Char]):Boolean = {
    def balanceadoAux(chars: List[Char], count: Int):Boolean ={
     if(count != 0 && chars.isEmpty) false else true
    }

      def validar(chars: List[Char], count: Int): Boolean = {
      if(chars.isEmpty) balanceadoAux(chars, count)
      else if(chars.head == '(') validar(chars.tail, count + 1)
      else if(chars.head == ')' && count > 0) validar(chars.tail, count - 1)
      else if (chars.head == ')' && count <= 0) false
      else validar(chars.tail, count)
    }
      validar(chars, 0)
  }

  /* 
    * Ejercicio 4: Cambio de monedas
    * */
    def cambioMonedas(total: Int, denom: List[Int]): Int = {
    if(total < 0) 0
    else if(total == 0) 1
    else(
        if(total >0 && denom.isEmpty) 0  
        else cambioMonedas(total - denom.head, denom) + cambioMonedas(total, denom.tail)
        )
  }

}
