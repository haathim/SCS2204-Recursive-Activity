object question4 extends App{
    def isEven(n: Int) : Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n: Int):Boolean = !isEven(n)

    println(isEven(5))
    println(isEven(8))
    println(isOdd(99))
    println(isOdd(52))

}