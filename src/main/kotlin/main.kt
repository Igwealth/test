fun main(args: Array<String>) {
        println(lovemeter(23, 26))
}
fun lovemeter(flower1:Int, flower2:Int): Boolean {
    if (flower1 % 2 === 0 && flower2 % 2 === 0 || flower1 % 2 !== 0 && flower2 % 2 !== 0) {
        return false;
    } else {
        return true;
    }
}