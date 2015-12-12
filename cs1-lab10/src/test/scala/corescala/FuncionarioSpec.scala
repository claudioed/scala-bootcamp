package corescala

import org.specs2.mutable.Specification
import Funcionario._

class FuncionarioSpec extends Specification {
  "calculo de um valor aumentado" >> {
    aumentar10(100) must_== 110
    aumentar20(100) must_== 120
    aumentar30(100) must_== 130
  }

  "calculo de aumento de salario" >> {
    val func = new Funcionario(100)

    "retornar um funcionario com 10% de aumento" >> {
      func.aumentarSalario(v => aumentar10(v)) must_== Funcionario(110)
    }

    "retornar um funcionario com 20% de aumento" >> {
      func.aumentarSalario(v => aumentar20(v)) must_== Funcionario(120)
    }
  }
}
