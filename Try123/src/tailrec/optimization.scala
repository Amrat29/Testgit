package tailrec
import scala.annotation.tailrec
import scala.util.matching.Regex

import java.io._
import scala.io.Source

import sun.security.util.Length
object optimization {
 
  
  

//def readFile(filename: String): Seq[String] = {
   //// val bufferedSource = io.Source.fromFile("demo7.txt")
    
 
  
   
     
    //val lines =(for (line <- bufferedSource.getLines()) yield line).toList
    
       
    

// bufferedSource.close
// lines
    
    // val zz = bufferedSource.flatMap(_.split("")) .map((_.length))
   //val words = zz.findAllIn(line)
  
     
 
//}
  
  
  
  /*def getLinesFromFile(file:String, linesToGet:Int): List[Char] = {
  val bufferedSource = Source.fromFile("demo1.txt")
  val lb = ListBuffer[Char](
  try {
   // bufferedSource.getLines.take(3).toList
    
     
      val lines = bufferedSource.getLines()
      var counter = 0
      while (lines.hasNext && counter < linesToGet) {
        counter += 1
        lb.append(lines.next())
      }
    
  } finally {
    bufferedSource.close
  })
   lb.toList
}
  */
 def main(args:Array[String])
  {
   //println(""+readFile(""))
   
    //val numPattern = new Regex("[A-Z]+"+"[A-Z]+")
     // val address = "123 Main Street Suite 101"
     // val match1 = numPattern.findFirstIn(address)
     // println(match1)
    
   
   
// scala.io.StdIn.readLine("What's your name? ") 
// val name = scanner.nextLine()
//var a=scala.io.StdIn.readInt()
//println("The value of a is "+ name)
  /* println("Enter your name : ")
  val a = readInt()
  val b=5
  val c=a+b
  println("My name is : "+c)
     */
    // val filename = "no-such-file.scala"
     
     
   /* val filename = "demo1.txt"
  
for (Intt <- Source.fromFile(filename).getLines) {
   // println(Intt)
  // val zz = Intt.split(" ")

      //val z=Intt.map((x=>x*2)).foreach(println)
    
    
    
    
}
    
    */    
  
    
    //
   // val filename2 = "demo1.txt"
//for (line <- Source.fromFile(filename2).getLines) {
   // println(line)

 // }
    /*val writer=new PrintWriter(new File("demo7.txt"))
  val a=scala.io.StdIn.readLine()
    val b=scala.io.StdIn.readLine()
     val c=scala.io.StdIn.readLine()
      var yes:Int=1
         var no:Int=0*/
    
     // print("you add more input enter 1 for yes and 0 for no")
    // val zx=scala.io.StdIn.readInt()
   // while(zx==1){  
   // val z=scala.io.StdIn.readLine()
   // writer.write("\n"+ z)
 
   

   // }b
 //var xx=( if(z==1)
 
 // {  val x=scala.io.StdIn.readLine()
 // }
  //else
 // { print("thanku")})
   //writer.write("This is a demo")
  /* writer.write( a)
   writer.write("\n"+  b)
   writer.write("\n"+  c)
   // writer.write("\n"+ z)
   writer.close()

 */
    
       val writer=new PrintWriter(new File("demo8.txt"))
       println("enter the value of min support")
       val s=scala.io.StdIn.readLine()
       println("enter the value of min confidence")
     val co=scala.io.StdIn.readLine() 
     println("Transcation 1 use comma to separate string")
  val a=scala.io.StdIn.readLine()
  println("Transcation 2 use comma to separate string")
    val b=scala.io.StdIn.readLine()
     println("Transcation 3 use comma to separate string")
     val c=scala.io.StdIn.readLine()
    
    /* var yes:Int=1
         var no:Int=0
    
   print("you add more input enter 1 for yes and 0 for no")
  val zx=scala.io.StdIn.readInt()

  var continueScan = true

  while(continueScan) {
   val zzx=scala.io.StdIn.readInt()

if(zzx.equals("")){
continueScan = false;

}else{
 val zXX=scala.io.StdIn.readInt()
 
 */
 

   

 


      writer.write( s)
      writer.write("\n"+  co)
       writer.write("\n"+  a)
   writer.write("\n"+  b)
   writer.write("\n"+  c)
     writer.close()


     var Data = Source.fromFile("demo8.txt").getLines.toList    
    var ListData:List[(String,String,String)]=List()
    //println(Data.length)
   //  var ListDataa:List[String]=List()
     // var count= (ListData.map(s=>s.map(t=>if(t==a)
     //count= count+1 
      //lse t) )
     
    for(i <-2 to Data.length-1)
    {
   
      var temp= Data(i).split(",").toList
      var Trimm= (temp(0).trim(),temp(1).trim(),temp(2).trim())
     ListData=Trimm::ListData
     

       
    }
        println(ListData)   
      
       
     // var count=0
    // val q=ListData.map(x => x.map(t => if(t(1+x(t)))count=count+1 else t))

//println(q)
    
      
      
      // println(Dataa)
       //var qq= Dataa.count(x => x).map(t => (t._1, t._2.length))
      //val count=Dataa.count(1)
//var qq= Dataa.count(x => (x).foreach(println)
      // var count=0
// val pp= Dataa.map(x=>x.map(t=> if(t==1)count=count+1 else t) )
   
    //val listtt = List(1,2,4,2,4,7,3,2,4)
  //ListData.count(_=="a"  )
  // println(ListData.count(_=="a"))
}
  
    
 
      
}
     
     
     
   
      
