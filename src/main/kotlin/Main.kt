fun main() {
oddNumbers()
println(nammes(arrayOf("Rebecca","Bridget","Places","Ivy","Idaya")))
    robots(5)
    robots(10)
    robots(16)
   newNumber()
    println(mixed(arrayOf(2.3,5.5,6,8,9,10.44,20.1)))
}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
    for (odd in 1..100)
        if(odd %2 !== 0){
            println(odd)
        }
        }
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)


    fun nammes(name:Array<String>):Int{
        var names = 0
        for (r in name){
            if (r.length >5){

        names++
        }
        }
            return names

    }
//You are creating a robot to serve drinks at a party. The robot is required to
////serve a glass of milk for guests under the age of 6. For guests under the age of
////15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
////else gets a bottle of coca cola. Create a function that will make these
////decisions, printing out the name of the drink each person gets according to
////their age.
fun robots(serve:Int){
    when(serve){
        in 0..6-> println("serve s glass of milk")
        in 7..14-> println("serve a bottle of fanta")
        else -> println("get a bottle of coca cola")
    }

}
// Write a function that prints each number from 1 to 100 on a new line. For each
////multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
////"Buzz" instead of the number. For numbers which are multiples of both 3 and
////5, print "FizzBuzz" instead of the number.


fun newNumber(){

    for (s in 1..100){
    when{
        s%3==0 && s%5==0 -> println("FizzBuzz")
        s%3==0 -> println("Fuzz")
        s%5==0 -> println("Buzz")


        else -> println(s)
    }    }




}
//write a function that takes in an array of
// mixed types and returns the sum of the decimal
// elements only
fun mixed(num:Array<Any>):Double {
    var sum = 0.00
    for (x in num) {

        if (x is Double) {
            sum += x
        }
    }
        return sum

    }






//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

