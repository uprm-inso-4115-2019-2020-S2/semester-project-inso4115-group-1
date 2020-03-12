package properties

import scala.collection.mutable

trait Establishment {

  val typeOf: String
  val staff: Array[Employee]
  val location: String
  val taxes: Array[Double]

}
