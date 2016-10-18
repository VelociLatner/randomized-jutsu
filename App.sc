
import scala.io.Source

val rand = new java.util.Random()

def getList(name: String) = Source.fromFile(s"${name}.txt").getLines.toList.map(_.trim())

def takeRandom[A](list: List[A]): A = list(rand.nextInt(list.size))

val NAGE = getList("NAGE")
val YAWARA = getList("YAWARA")
val SHIME = getList("SHIME")

println( Seq(YAWARA, NAGE, SHIME).map(takeRandom).mkString(" -> ") )
