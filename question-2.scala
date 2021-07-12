object question2 extends App{
    def GCD(a: Int, b: Int): Int = b match {

        case 0 => a
        case x if x>a => GCD(x,a)
        case _ => GCD(b,a%b)
    }
    
    def isPrime(p: Int, n:Int = 2): Boolean = n match {
        case x if (x==p) => true
        case x if GCD(p,n) > 1 => false
        case x => isPrime(p,x+1)
    }

    def primeSeq(n: Int): Unit = n match {
        case 2 => println(2)
        case _ => primeSeq(n-1);if (isPrime(n)) println(n)
    }
    
    primeSeq(10)
}