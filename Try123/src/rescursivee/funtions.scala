package rescursivee
import scala.annotation.tailrec
import scala.io.Source
import scala.util.matching.Regex
import scala.math.{exp,abs,cos}
object funtions {
  
 //Sphere Function
   @tailrec
 def sphere(List1:List[Double], summestion:Double=0):Double=
  
        List1 match{
          
          case Nil=>{ summestion}
          
         
          case head::tail=>sphere(tail,summestion+Math.pow(head,2))
      
    }
   
   
   //Griewank Function
   
@tailrec
  def griewank(List2:List[Double],summestion:Double=0,pro:Double=1, i:Double=1):Double=
  
  { List2 match{
      
      case Nil=>{1+summestion-pro}
      case head::tail=>griewank(tail,summestion+Math.pow(head,2)/4000,pro*Math.cos(head)/Math.sqrt(i+1))
      
    }
  
}
//Ackley Function  

@tailrec
def ackley(List3:List[Double],listsize:Double,summestion:Double=0,summestion2:Double=0,a:Double=20,b:Double=0.2,c:Double=6.28,d:Double=1):(Double)=

{
    List3 match{
   case Nil=>{-20 * Math.exp( -0.2* Math.sqrt(summestion/listsize))- Math.exp (summestion2/listsize)+20+Math.exp(1)}
  case head::tail=>ackley(tail,listsize,summestion+Math.pow(head,2),summestion2+Math.cos(head*6.28))
   
   }

  
  
  }

def zakharov (list4:List[Double],Summestion:Double=0, Summestion2:Double=0,Summesion3:Double=0,i:Double=0):Double=

{
  list4 match{
    case Nil=>{Summestion+Math.pow(Summestion2,2)+Math.pow(Summesion3,4)}
    case head::tail=> zakharov(tail,Summestion+Math.pow(head,2),Summestion2+(0.5*i+1*head),Summesion3+(0.5*i+1*head))
  }
  
  }

def dixonprice(list5:List[Double], Summestion:Double=0,i:Double=0):Double={
  list5 match{
    case Nil=>{(Math.pow(list5.length-1,2))+Summestion}
    case head::tail=>dixonprice(tail,Summestion+i+1*Math.pow(2*Math.pow(head,2)-(list5.head),2))
  }  
  
}

def linearregression(listx:List[Double],listy:List[Double],Summestion:Double=0,theta0:Double=0,theta1:Double=0.5):Double={
  //val h=listx.map(x=>(x*0.5)*theta1).foreach(println)
  listx match{
    
    case Nil=>{(1/(2*5))*Summestion}
    case head::tail=>linearregression(listx.tail,listy.tail,Summestion+Math.pow(((theta0+theta1*listx.head)-listy.head),2))
  }  
  
}
 


def factorial(no:Int):Int={
 
 if (no==1)
  1;
 else  no * factorial(no- 1) 
  
}


//@tailrec
 //def r ( M1:List[Int], M2:List[Int], accum:(Int,Int)) :(Int,Int)={
   
/* M1 match{
     case x::Nil => { 
       if(x>M2.head) 
         (1,0)
         else
           (0,1)
           }
     case default => {
          var c  =  <> (  M1.tail,M2.tail)
          if(M1.head>M2.head)
           (c._1+1,c._2+0)
           else
              (c._1+0,c._2+1)
          
    }      
           
           */
    
  
  /* M1 match{
      case Nil => {accum}
      case default  =>  { 
        var c= if(M1.head>M2.head) 
          (1,0)
          else 
            (0,1) 
     r(  M1.tail,  M2.tail,  (c._1+accum._1,  c._2+accum._2)  )
      }

 }
 
 }
*/

  
  def main(args:Array[String])
  {
    
    
    
    
    
     
    
    
    
    
    
    
    
  val s=  Seq("apple", "oranges", "apple", "banana", "apple", "oranges", "oranges")
val q=s.groupBy(l => l).map(t => (t._1, t._2.length))
println(q)
    
    //val listtt :List[Int]= List("a","s","a")
   ////listtt.count(_=="a") 
   // println(listtt.count(_=="a"))
  
 println("Result of linearegressionk Function"+"  "+linearregression(List(1,5,6,4,5),List(1,7,3,10,5)))
    println("Result of Sphere Function" +"  " +sphere(List(1,2,3,4,5)))
       println("Result of Greiwank Function"+"  "+griewank(List(1,2,3,4,5)))
      // println("Result of Ackley Function"+"  "+ackley(List(1.0,2.0,3.0,4.0,5.0)))
     var list = List(1.0,2.0,3.0,4.0,5.0)
 
     //println(Grewank(list))
    println("Ackley Function"+ackley(list,list.length))
    println("Zakharov function"+"  "+zakharov(List(1,2,3,4,5)))
  
       println(""+ dixonprice(List(1,2,3,4)))
           //println("Result of Greiwank Function"+r(List(1,2,3,4,5),List(2,3,4,5,6))
    println(""+factorial(6))
  }
}