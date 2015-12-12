package corescala

import org.specs2.mutable.Specification

class AlunoDAOSpec extends Specification {
  "o dao de alunos" >> {
    val alunoDAO = new AlunoDAO

    "retornar None se o aluno para o email especificado nao existir" >> {
      alunoDAO.findAlunoByEmail("test@globalcode.com") must_== None
    }

    "retornar Some com o aluno" >> {
      alunoDAO.findAlunoByEmail("p@p.com") must_== Some(Aluno(1, "paulo", "p@p.com", 13))
    }
    
    "retornar Some com o aluno (ID) " >> {
      alunoDAO.findAlunoById(1) must_== Some(Aluno(4, "jose", "jo@jo.com", 19))
    }
    
    
  }
}
