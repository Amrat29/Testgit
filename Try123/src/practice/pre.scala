package practice
import scala.annotation.tailrec
object pre {
  
  
 /*  @tailrec
 def comparsion(M1:List[Int],M2:List[Int],acumm:(Int,Int) ):(Int,Int)={
    
    M1 match{
      
      case Nil=>{acumm }
     // case head::tail=> {var c = comparsion(M1.tail,M2.tail,)
        //if(M1.head>M2.head)
         //// (c._1+1 c._2+0)
          //       (c._1+0 c._2+1)
          
                 
      case head::tail=> { var c= if(M1.head>M2.head)
        (1,0)
        else
          (0,1) 
          comparsion(M1.tail,M2.tail,(c._1+acumm._1,c._2+acumm._2))
      
      }}
   
    
  }
  * 
  */
  
  def main(args:Array[String])
  {
    var a:Int=40
     println(""+a)
    //tuple
    var b:(Int,String)=(20,"amrat")
   println(b._2)
   println(b._1)
    println(""+b)
     var myList:List[Int]=List(1,2,3)
    println(""+myList)
    println(""+myList(1))
   //myList.map(x=>(x*5)).foreach(println)
    myList.map(_*5).foreach(println)
    
    // myList.map(x=>x._1*2).foreach(println)
    //tupleList
    var mylist2:List[(Int,String)]=List((100,"Shayan"),(200,"aymi"))
    println(""+mylist2(0))
     mylist2.map(x=>x._1*2).foreach(println)
 
     var multilist:List[cls]=List(cls (10,"amat",List(2,3,4)),
                                 cls (30,"anmol",List(5,6,7)),
                                   cls   (40,"aymi",List(4,9,8)))
         multilist.map(_.max()).foreach(println)
       multilist.map(x=>x.name +"->"+x.min()).foreach(println)
       multilist.map(_.min()).foreach(println)
     multilist.map(x=>x.rollno+1).foreach(println)
        //var winner  = multilist(1).comparsion(multilist(0))
           //   println(  winner.rollno +"  "+ winner.name )
  //println(""+winner)
  }
  

}

