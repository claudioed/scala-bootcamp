import akka.actor._

case class Participante(nome:String,email:String){

}
case class EnviarEmail(destino:String,mensagem:String){

}

case object GetParticipantes{
}

class ColetorParticipante extends Actor {
  
  var participantes: Array[String] = Array.empty[String]
  
  val enviadorAtor = context.actorOf(Props[EnviadorEmails])
  
  def receive = {
    case Participante(nome,email) => {
      participantes = participantes :+ nome
      enviadorAtor ! EnviarEmail(email,s"NOVA MENSAGEM para $nome")
    }
    case GetParticipantes => sender ! participantes
  }
  
}

class EnviadorEmails extends Actor {
  
  def receive = {
    case EnviarEmail(destino,mensagem) => println(mensagem)
  }
  
}
