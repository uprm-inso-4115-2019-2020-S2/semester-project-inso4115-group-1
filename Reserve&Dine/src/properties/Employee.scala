package properties

trait Employees {

  val name: String
  val score: Int
  val typeOfEmployee: String
  val quantityOfShifts: Int
  val perHourRate: Double
  val working: Boolean

}


class Employee(val name: String, val score: Int, val typeOfEmployee: String, val quantityOfShifts: Int, val perHourRate: Double, val working: Boolean) extends Employees {


}


