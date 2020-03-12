package properties

trait TableRevised{

  /**
   * Max capacity of guest that can be held
   */
  val maxCapacity: Int

  /**
   * Amount of people at the table
   */
  val numberOfGuest: Int

  /**
   * Checks if table has zero guest!
   * @return Boolean
   */
  def isEmpty(): Boolean
  /**
   * If avaliable is 'r' then it's reserved
   *
   * If avaliable is 't' then it's taken
   *
   * Anything else is free.
   */
  val available: Char

  /**
   * Value of Waiter handling the table if any.
   */
  val waiterInCharge: String
  /**
   * Grid-like Coordinates
   *
   * COULD BE REMOVED
   */
  val position: (Int,Int)

  /**
   *
   * @param tableRevised
   * @return Boolean
   */
  def equals(tableRevised: TableRevised): Boolean

  /**
   * Checks if tables can be merged together and if so returns new capacity.
   *
   * If it can't it will throw a InvalidArguementException
   * @param tableRevised
   * @return newCapacity
   */
  def merge(tableRevised: TableRevised): Int

}



