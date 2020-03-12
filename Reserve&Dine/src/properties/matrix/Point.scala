package properties.matrix

class Point(x: Int, y: Int){

  val this.x = x
  val this.y = y

  def apply(x: Int = 0, y: Int = 0){
    this(x,y)
  }

  def apply(coord: (Int, Int)){
    this(coord._1, coord._2)
  }


}
