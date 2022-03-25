class Hand {

    val dices: MutableList<Dice>
        get() {
            return dices
        }



    constructor() {

        for (i in 1..6) {

            this.dices.add(Dice())

        }
    }

    public fun lock(lock: Int){

            dices[lock].lockDice()

    }

    fun roll(){

        for(i in 1..6){

            dices[i].roll()
        }
    }

    fun getResults(): String{

        var result: String = ""
        for(i in 1..6){
            result = result + "${dices[i].getDiceValue()}"
        }

        return result
    }

}
