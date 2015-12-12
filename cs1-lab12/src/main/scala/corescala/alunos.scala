package corescala

case class Aluno(id: Int, nome: String, idade: Int, val notas: List[Int], media: Option[Double])

object Alunos {
  
  def encontraMaiores(alunos: List[Aluno]): List[Aluno] = alunos.filter(a => a.idade >= 18  )

  def nomes(alunos: List[Aluno]): List[String] = alunos.map(a => a.nome)

  // na implementação da função abaixo, use as funções acima como base
  def nomesMaiores(alunos: List[Aluno]): List[String] = nomes(encontraMaiores(alunos))

  def calculaMedias(alunos: List[Aluno]): List[Aluno] = alunos.map(aluno => 
  { if(aluno.notas.size >= 3 ) {
      aluno.copy( media = calculaMediaAluno(aluno.notas))
    }else{
      throw new IllegalStateException() 
    }
  })
 
  def calculaMediaAluno(notas: List[Int]) : Option[Double] = {  Option(trunc(notas.sum.toDouble/ notas.size))  }
  
  // use esta função para evitar dizimas periódicas
  def trunc(x: Double) = math.round(x * 100) * 0.01
  
}
