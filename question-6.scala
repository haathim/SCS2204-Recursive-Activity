object question6 extends App{
    def fib(n:Int):Int = n match {
        case 1 => 0
        case 2 => 1
        case x => fib(x-1) + fib(x-2) 
    }

    def printFib(n:Int):Unit = {
        if(n>1) printFib(n-1)
        println(fib(n))
    }
    

    printFib(10)
}
