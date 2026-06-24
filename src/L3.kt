//operators >,<,>=,<=,==,!=
fun main() {
    val a = 15;
    val b = 20;
    println("Sum of $a and $b is ${a+b}")
    println("a>b:${a>b}") // a<b then false prints

    val l = 10;
    val m = 20;
    val n = 30;
    println("l>m && n>m: ${l>m && n>m}")
    println("!(l>m): ${!(l>m)}")
}

// && if both true
// || if one of them is true
// ! if false then true
// ++a phele increment
// a++ increments after