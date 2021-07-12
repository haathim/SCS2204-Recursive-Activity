object question5 extends App{
    def isEven(n: Int) : Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n: Int):Boolean = !isEven(n)

    def addAllEven(n:Int):Int = n match {
        case 0 => 0
        case x if(isEven(x-1)) => x-1 + addAllEven(x-1)
        case _ => addAllEven(n-1)
    }

    println(addAllEven(5))

}