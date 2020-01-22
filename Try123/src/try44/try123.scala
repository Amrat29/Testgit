package try44

object try123 {
  def main(args:Array[String]){
    
    var t:(Int,String)  =(1,"Shayan") 
    
   var b:Int= 20;
    println(t._2)
    println(""+b)
     
    var myList:List[Int]=List(1,3,5)
           println("...display first element of list...!")
    println( ""+ myList(0))
        println("...multiply 5 with the list...!")
    myList.map(x=>(x*5)).foreach(println)//
    
    println("....list tuple int and string")
    var myList2:List[(Int,String)]=List((2,"Aymi"),(3,"amrat"))
    println(""+ myList2(0))
    myList2.map((x=>(x._1*2, x._2*3))).foreach(println)
    myList2.map(x=>x._1*2).foreach(println)
    myList2.map(x=>x._2*2).foreach(println)
  
    
  var myListt:List[Student] =  List(  Student( 2, "Amrat", List(1,1,20) ),
                                   Student( 3, "Anmol", List(8,9,30) ),
                                       Student( 5,"Shayan", List(8,89,87))) 
                                           
                                         
                          
               println(".....ADDing 1 in roll numbers.....!")
         myListt.map(x=>x.rollnum+1).foreach(println)
         
         
           println("......Finding Maximum no in list.....!")
         myListt.map(_.max()).foreach(println)
         
           println("......Finding Maximum no in list with name.....!")
          myListt.map(x=>x.name +"->"+x.max()).foreach(println)
          
          println(".......Finding Minimum no in list.....!")
         myListt.map(_.min()).foreach(println)
             
         
/*var myList:List[Student] =  List(  Student(  1,"Ali",  List(2,5,7,9,10,4)  )  ,
                                   Student(  2,"Usman",  List(1,8,4,7,6,20)  )  ,
                                     Student(  3,"Saleem",  List(2,4,6,8,20,9)  )  ) 
                                     * 
                                     */
                                    
                  /*  println(".....comparsion between 2 list on the basis of subjects.....!")
            var winner  =  myListt(1).compare(  myListt(0)  )
              println(  winner.rollnum +"  "+ winner.name )
            
            */
              println("....sphere Function....")
              var myListtt:List[Int]=List(1,2,3,4,5)
        //  println( List.tabulate(Sphere.length)(x=>Math.pow(Sphere(x),2)).sum)
              //  println( List.tabulate(3)(x=>Math.pow(Sphere(x),3)).sum)
          
              
           
           
             
             
             
}
  
}