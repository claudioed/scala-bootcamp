package corescala

object Funcionario {

  def aumentar(porcentagem: BigDecimal)( v: BigDecimal): BigDecimal = {
      v * (1 + porcentagem / 100)
  }
  
  def aumentar10 = aumentar(10) _
  def aumentar20 = aumentar(20) _
  def aumentar30 = aumentar(30) _
  
}

case class Funcionario(salario: BigDecimal) {
  
  def aumentarSalario(f: BigDecimal => BigDecimal): Funcionario = Funcionario(f(salario))
  
}
