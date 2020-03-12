import properties.TableRevised
//package properties

//noinspection ScalaDocMissingParameterDescription
abstract class Table(override val maxCapacity: Int, override val numberOfGuest: Int, override val available: Char, override val position: (Int, Int), override val waiterInCharge: String) extends TableRevised {


  def toArray() = Array(this.maxCapacity, this.numberOfGuest, this.available, this.position, this.waiterInCharge)


  /**
   * Checks if table has zero guest!
   *
   * @return Boolean
   */
  override def isEmpty(): Boolean = {
    this.numberOfGuest.equals(0)
  }

  /**
   *
   * @param tableRevised
   * @return Boolean
   */
  override def equals(tableRevised: TableRevised): Boolean = {

    if (!tableRevised.available.equals(this.available)) {
      return false
    }

    if (!tableRevised.maxCapacity.equals(this.maxCapacity)) {
      return false
    }

    if (!tableRevised.numberOfGuest.equals(this.numberOfGuest)) {
      return false
    }

    if (!tableRevised.position.equals(this.position)) {
      return false
    }

    if (tableRevised.waiterInCharge.equals(this.waiterInCharge)) {
      return false
    }

    return true

  }


  //  def merge(tableRevised: TableRevised): Int = this.maxCapacity = this.maxCapacity + tableRevised.maxCapacity

}


//trait Table {
//
//
//  private var designation = null
//  private var state = null
//  var chairs = 0
//
//  object State extends Enumeration {
//    type State = Value
//    val FREE, TAKEN, RESERVED = Value
//  }
//
//  def this {
//    this()
//    this.designation: String = ""
//    this.state = State.FREE
//    this.chairs = 0
//  }
//
//  def this(designation: Nothing) {
//    this()
//    this.designation = designation
//    this.state = State.FREE
//    this.chairs = 0
//  }
//
//  def this(designation: Nothing, chairs: Int) {
//    this()
//    this.designation = designation
//    this.state = State.FREE
//    this.chairs = chairs
//  }
//
//  def getDesignation: Nothing = designation
//
//  def getState: Table.State = state
//
//  def setState(state: Table.State): Unit = {
//    this.state = state
//  }
//
//  def setDesignation(designation: Nothing): Unit = {
//    this.designation = designation
//  }
//
//  def getChairs: Int = this.chairs
//
//  def setChairs(chairs: Int): Unit = {
//    this.chairs = chairs
//  }
//
//  @Override def equals(obj: Nothing): Boolean = {
//    if (this eq obj) return true
//    if (obj == null) return false
//    if (getClass ne obj.getClass) return false
//    val other = obj.asInstanceOf[Table]
//    if (designation == null) if (other.designation != null) return false
//    else if (!designation.equals(other.designation)) return false
//    true
//  }
//
//}
//
