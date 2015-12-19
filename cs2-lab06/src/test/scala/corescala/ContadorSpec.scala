package corescala

import org.specs2.mutable.Specification
import akka.testkit.TestActorRef
import akka.actor._

import ContadorActor._

class ContadorSpec extends Specification {
	"O ator Contador" >> {
		implicit val system = ActorSystem("CoreScala")
		val contador = TestActorRef[ContadorActor]	
		
		"contar ate 30" >> {
		//adicione aqui o código de teste solicitado
		new org.specs2.execute.Failure("o teste de contagem deve ser implementado")
		}
	}
}