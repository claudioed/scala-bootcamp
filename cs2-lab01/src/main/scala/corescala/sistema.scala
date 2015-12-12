import akka.actor._ 
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.concurrent.ExecutionContext.Implicits.global

object SistemaColetor extends App {

  val system = ActorSystem("corescala-system")
  val ator = system.actorOf(Props[ColetorParticipante])
  
  ator ! Participante("Joao","jao@gmail")
  ator ! Participante("Carlos","carlos@gmail")
  
  implicit val timeout = Timeout(5 seconds)
  
  val future = ator ? GetParticipantes
  
  future onSuccess {
    case part: Array[_] => part foreach println
  }
  
  future onFailure {
    case ex: Exception => println("Erro") 
  }
  
  system.stop(ator)
  system.terminate
  
}
