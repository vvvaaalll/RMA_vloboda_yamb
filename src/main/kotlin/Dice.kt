import kotlin.random.Random

open class Dice (){
    private var num = 1
    private var rollable = true

    fun getDiceValue(): Int{

        return this.num
    }

    fun roll (){
        if (rollable) num = Random.nextInt(1,6)
    }

    fun lockDice(){
        rollable = false
    }
    fun resetDice(){

        rollable = true
    }

}