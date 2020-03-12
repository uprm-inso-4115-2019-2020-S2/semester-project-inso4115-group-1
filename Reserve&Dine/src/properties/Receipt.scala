package properties

trait Receipt[MenuItem] {

  val receipt: Array[MenuItem]

  def clear()

  //def clone(): Receipt[MenuItem]

  def find(target: MenuItem): Int

  def remove(target: MenuItem)

  def add(target: MenuItem)

  /**
   *
   * @param target
   * @return Int
   */
  def quantityOf(target: MenuItem): Int

  /**
   *
   * @param target
   * @return Index of the value in the List
   */
  def get(target: MenuItem): MenuItem

  /**
   *
   * @param target
   * @return Index of the value in the List
   */
  def contains(target: MenuItem): Boolean

  /**
   *
   * @return total in order
   */
  def total(): Double




}
