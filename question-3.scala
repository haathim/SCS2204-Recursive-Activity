object question3 extends App{
    def sumTillN(n: Int) : Int = n match{
        case 0 => 0
        case _ => n + sumTillN(n-1)
    }

    println(sumTillN(5))
}