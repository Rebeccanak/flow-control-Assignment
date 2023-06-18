fun main() {
oddNumbers()
println(nammes(arrayOf("Rebecca","Bridget","Places","Ivy","Idaya")))
    robots(5)
    robots(10)
    robots(16)
   newNumber()
    println(mixed(arrayOf(2.3,5.54,6,8,9,10.44,20.18)))




}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
    for (odd in 1..100)
        if(odd %2 != 0){
            println(odd)
        }
        }
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)


    fun nammes(name:Array<String>):Int{
        var names = 0
        for (r in name){
            if (r.length <=5){

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

        if (x is Double || x is  Float) {
            sum += x.toString().toDouble()
        }
    }
        return sum

    }






//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun getFirstString(str1:String,str2:String):Char{
    if(str1.length >str2.length || str1.length == str2.length){
        return str1[0]
      }
        else{
            return str2[0]





fun compareStrings(str1:String ,str2:String):Char{
    return if (str1.length >= str2.length) {
        return str1[0]
    }
    else {
        str2[0]
    }
}




//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements

//correction
data class  MinMaxAvg(var min:Int ,var max:Int, var avrg:Double)
fun Stats(age:Array<Int>) :MinMaxAvg{
    var max1 = age.max()
    var min2 = age.min()
    var average = age.average()

    val results=MinMaxAvg(min=min2,max=max1,avrg=average)
    return results


}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun splitString (word:String){

    for (x in word.split(""))
        println(x)
    //or
    word.forEach { x ->  println(x) }

}

//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun new (names: Array<String>):String{

    //var newstring=names.joinToString("")
//return newstring
//or
    var output=""
    for (word in names){
        output +=word

    }
    return output
}
        data class Statistic(var min:Int,var max:Int,var average:Double){
            fun calculateStatistic(nums:Array<Int>): Statistic{
                val min = nums.min()
                val max = nums.max()
                val avg = nums.average()
                val stats = Statistic(min,max,avg)
                return stats

            }            }

        }        }