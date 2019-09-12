package test

import shapeless._
import com.sksamuel.avro4s.RecordFormat

case class A1(s: String)
case class A2(s: String)

object A {
  type AA = A1 :+: A2 :+: CNil
}

case class As(as: Vector[A.AA])

case class Good1(
  as1: Vector[A.AA],
  as2: Vector[A.AA],
)
object Good1 {
  implicit val recordFormat = RecordFormat[Good1]
}

case class Good2(
  as1: As,
  as2: As,
)
object Good2 {
  implicit val recordFormat = RecordFormat[Good2]
}

case class Good3(
  as1: List[A.AA],
  as2: As,
)
object Good3 {
  implicit val recordFormat = RecordFormat[Good3]
}

case class Bad1(
  as1: Vector[A.AA],
  as2: As,
)
object Bad1 {
  implicit val recordFormat = RecordFormat[Bad1]
}

sealed trait B
case class B1(s: String) extends B
case class B2(s: String) extends B

case class Bs(bs: Vector[B])

case class Good4(
  bs1: Vector[B],
  bs2: Bs,
)
object Good4 {
  implicit val recordFormat = RecordFormat[Good4]
}
