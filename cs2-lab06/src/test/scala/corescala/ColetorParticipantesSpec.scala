package corescala

import org.specs2.mutable.{Specification,After}
import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import ColetorParticipantes._
import scala.collection.mutable._

abstract class AkkaTestkitSpecs2Support extends TestKit(ActorSystem()) 
                                           with After 
                                           with ImplicitSender {
  def after = system.terminate()
}

class ColetorParticipantesSpec extends Specification {

	"Ator Coletor Participantes" >> {
		"deve retornar a lista de participantes correta" >> {
			//escreva aqui o código de testes
			new org.specs2.execute.Failure("o teste de retorno de lista deve ser implementado")
		}
	}
}