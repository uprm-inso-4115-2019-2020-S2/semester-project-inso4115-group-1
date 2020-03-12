package properties.matrix

import scala.collection.mutable.ArraySeq



abstract class Grid[TableRevised](val array:ArraySeq[ArraySeq[TableRevised]], val rows: Int, val columns: Int) {




  /**
   * Construrctor
   * @param grid
   */
  def this(grid: ArraySeq[ArraySeq[TableRevised]]){
    this(grid, grid.length, grid(0).length)
  }

  /**
   * @return dimensions of grid as a tuple (rows, columns)
   */
  def dim: Tuple2[Int, Int] = (rows,columns)

  /**
   * @return String
   */
  override def toString() = {
    array.map(_.map(_.toString).mkString(" ")).mkString("\n")
  }

  /**
   * Same as toString(), but each entry is padded with whitespace to be of length fieldSize;
   * this improves the appearance
   */
  def toString(fieldSize: Int) = {
    val format = "%" + fieldSize + "s"
    array.map(_.map(_.toString).map(s => format.format(s)).mkString(" ")).mkString("\n")
  }

  /**
   *  Entrywise Operations for the Grid
   */

  def apply(xy: (Int, Int)) = this.array(xy._1)(xy._2)

  def apply(x: Int, y: Int) =  this.array(x)(y)

  def apply(t: Int) = this.array(t)

  def update(point: (Int,Int), value: TableRevised): Unit ={
      this.array(point._1)(point._2) = value
    }



  def update(x: Int,y: Int, value: TableRevised) {
    this.array(x)(y) = value
  }
  //////////

  def row(i :Int): ArraySeq[TableRevised] = this.array(i)

  def column(j:Int): ArraySeq[TableRevised] = {ArraySeq.range[Int](0,rows).map( i => this.array(i)(j))}

  /**
   * @return the first index that satisfies the given predicate
   * The matrix is searched in row-first order.
   */
  def findIndex(p : TableRevised): (Int, Int) = {
    for (i <- 0 until this.rows; j <- 0 until this.columns){
      if(this.array(i)(j).equals(p)){
        return (i,j)
      }
    }
    (-1,-1)
  }

  def livesInGrid(point: (Int, Int)): Boolean = {
    val (x, y) = point
    return ((x >= 0) && (x < this.rows) && (y >= 0) && (y < this.columns))
  }

  /**
   * NEEDS FURTHER IMPL
   * @param point
   */
  def group(point: (Int, Int)): Unit = {
    val (x, y) = point
    val temp = Iterator(
      (x + 1, y),
      (x + 1, y + 1),
      (x, y + 1),
      (x - 1, y + 1),
      (x - 1, y),
      (x - 1, y - 1),
      (x, y - 1),
      (x + 1, y - 1)
    )
  }

  def allIndices = {
    for (i <- 0 until this.rows; j <- 0 until this.columns) yield (i,j)
  }


  def iterator: Iterator[TableRevised] = array.map(_.iterator).iterator.flatten





}

