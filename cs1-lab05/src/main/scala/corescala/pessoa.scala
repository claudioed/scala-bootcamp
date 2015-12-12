package corescala

abstract class Pessoa(nome: String) {
  def numDocumento: String
}

class PessoaFisica(val nome: String, val cpf: String) extends Pessoa(nome){
  override def numDocumento = cpf
  override def toString = s"${nome} - ${cpf}" 
  
}
class PessoaJuridica(val nome: String,val cnpj: String) extends Pessoa(nome){
  override def numDocumento = cnpj
  override def toString = s"${nome} - ${cnpj}"
  
}
                                            
object Factory{
  
  
  def criarPF(nome:String,cpf:String){
    new PessoaFisica(nome,cpf)
  }
  
  def criarPJ(nome:String,cnpj:String){
    new PessoaJuridica(nome,cnpj)
  }
  
  
}
