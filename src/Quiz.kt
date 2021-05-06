import java.util.*
fun introduction(name:String,age:Int){
    println("My name is $name and i am $age years old")

}

fun machine(age:Int){
    if (age<6){
        println("Served Milk")
    }
    else if((age>6)&&(age<15)){
        println("Served Fanta")
    }
    else{
        println("Served Cocacola")
    }
}
fun lenNames(names:Array<String>):Int{
    var count=0
    for(name in names){
        if (name.length>4)
            count+=1
    }
    return count

}

fun multiply(a:Int,b:Int):Int{
    return a*b
}
fun divide(a:Int,b:Int):Int{
    return a/b
}
fun modul(a:Int,b:Int):Int{
    return a%b
}

//5. Create a class called Human with these attributes: name, age, weight. It has the following functions:
////- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food” and increments the human’s
// weight by the weight of the food eaten - speak(speech: String) :Prints the string passed to it
////- birthday( ) :Increments the human’s age by 1
class Human(var name:String, var age:Int, var weight:Float){
    fun eat(foodWeight:Int){
        println("I am eating ${foodWeight} kgs of food")
        weight=weight+foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }
}

//6..Create a function  called comparison. The function takes two numbers
// as parameters and the function should return the lesser of the true
fun comparison(num1:Int, num2:Int):Int{
    if (num1>num2){

    }

    return num1
}

//7. Create a function to simulate the rock-paper-scissors game.
// It takes in player 1 and player 2’s choice, either of which might be “rock”,
// “paper” or “scissors”. According to the rules of the game:
//- Paper covers Rock and therefore wins
//- Rock beats Scissors and therefore wins
//- Scissors cuts rock and therefore wins
//- If both players have the same choice it’s a draw
//Print out the result of each round e.g “Player 1 wins”, “Player 2 wins” or “It’s a draw”.

fun game(choice1:String, choice2:String){
//    while ((choice1==))
    if ((choice1=="paper")&&(choice2=="rock")){
        println("Player1 Wins")
    }
    else if (choice1==choice2){
        println("Its a draw")
    }

}

//8.Create a function that takes in 5  names and returns a string array containing all 5 names.
fun allnames(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
    var newnames= arrayOf(name1,name2,name3,name4,name5)
    return newnames

}

fun main(){
    introduction("Hellen",19)

    machine(14)
    machine(6)
    machine(24)

    println((lenNames(Arrays.toString(arrayOf("Shadya","Gard","Brenda","Joy"))))

    println(multiply(3,2))
    println(divide(3,2))
    println(modul(3,2))

    var human=Human("Hellen",19,0.3f)
    println(human.eat(5))
    println(human.birthday())
    println(human.speak("I am talking"))

    println(allnames(Arrays.toString("Shadya","Gard","Obuya","Wendy","Vallary")))
}



