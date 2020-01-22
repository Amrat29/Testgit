package practice
import scala.annotation.tailrec

case class cls (rollno:Int,name:String,marks:List[Int]){
  
  def max():Int = {
    marks.max
  }
  
  def min():Int= {
    marks.min
  }
  }

 