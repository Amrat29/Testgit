package apriori
import scala.annotation.tailrec
import scala.util.matching.Regex

import java.io._
import scala.io.Source

import sun.security.util.Length
object assignment {
  
  
  
  
  def main(args:Array[String])
  {
   val writer=new PrintWriter(new File("demo9.txt"))
       println("enter the value of min support")
       val s=scala.io.StdIn.readLine()
       var st=""
       println("enter the value of min confidence")
     val co=scala.io.StdIn.readLine() 
     println("Enter the number of Transcations ") 
  var a=scala.io.StdIn.readInt()    
      writer.write( s)
      writer.write("\n"+  co+"\n")
       val r= scala.util.Random
       var abc=Array("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
       var xyz=new Array[Int](26)
       for (i <- 0 to 25)
       {
         xyz(i)=r.nextInt(2)
       }
   for (i <- 0 to a-1)
   {
     for (j <- 0 to 25)
     {
       if(xyz(j)==1)
         st=st+abc(j)+","
     }
     st=st+"\n"
   }
   writer.write(st)
     writer.close()


     var Data = Source.fromFile("demo9.txt").getLines.toList    
    var ListData:List[List[String]]=List()
   
     
    for(i <-2 to Data.length-1)
    {
   
      var temp= Data(i).split(",").toList
     
      ListData=temp::ListData
     
     
    }
  
        println(ListData)   
      
 
  }
}


