fun main(args: Array<String>) {

    val hand :Hand = Hand()

    hand.roll()

    println(hand.getResults())

    println("Pick dices to lock them. When finished enter 0")

    var lock = 9
    var counter = 0;

    while(lock != 0 && counter < 7){
        lock = readLine()?.toInt()!!
        if(lock>=1 || lock<=6) hand.lock(lock)
    }


    hand.roll()
    println(hand.getResults())

}