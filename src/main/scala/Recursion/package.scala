package object Recursion {
  def pascal(c: Int, r: Int): Int ={
    if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

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
}
