package try44
import scala.annotation.tailrec
import scala.math.exp
case class Student(rollnum:Int , name:String, Subjects:List[Int]) {
  def  max() : Int={ 
    Subjects.max
   
  }
  def min() :Int={
    Subjects.min
  }

  
 /*def compare  (  That  :  Student  )  :  Student = {

  // var c1=0
  //  var c2=0
    
      var   c  =  r (Subjects,That.Subjects,(0,0))
    
   /*
    for  (  i  <-  0 to  this.Subjects.length -1 ){
      if  (  Subjects(i)  >  That.Subjects(i))
          c1+=1
      else
        c2+=1
    }
        
  *   
  */
   if (c._1>c._2)
      this
    else
      That
      
 }
 * 
 */
/*@tailrec
 private def r ( M1:List[Int], M2:List[Int], accum:(Int,Int)) :(Int,Int)={
   
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
    
  
   M1 match{
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
 
 /*
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
def ackley(List3:List[Double],summestion:Double=0,summestion2:Double=0,a:Double=20,b:Double=0.2,c:Double=6.24,d:Double=1):(Double)=

{
    List3 match{
   case Nil=>{-a * exp( -b* summestion)- exp (summestion2+a+exp(1))}
   case head::tail=>ackley(tail,summestion+Math.sqrt(Math.pow(head,2))/d,summestion2+Math.cos(head*6.28)/d)
     
   }

  
  
  }
 }
 * 
 */
}
