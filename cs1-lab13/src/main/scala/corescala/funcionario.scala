package corescala

import scala.xml.NodeSeq

case class Funcionario(nome: String, val salario: BigDecimal)

object Funcionario {
  def totalSalarios(funcionarios: List[Funcionario]): BigDecimal = funcionarios.foldLeft(BigDecimal(0))( (tot,x)  => tot + x.salario)

  def xml(funcionarios: List[Funcionario]): NodeSeq =
    <funcionarios>
      {funcionarios.map{func =>
          <funcionario salario={func.salario.toString}>{func.nome}</funcionario>
        }
      }
    </funcionarios>
}
