interface Signatory {
    fun sign()
}

open class Person(val name:String, var age:Int) : Signatory {
    var isMarried:Boolean = false;
    init {
        if (age > 100) throw Exception("Invalide Age");
    }
    constructor(name:String, age:Int, isMarried:Boolean): this(name, age){
        this.isMarried = isMarried;
    };
    override fun sign () = print("$name aged $age can sign document is married : $isMarried");
}

class Student(name:String, age:Int) : Person(name, age){

}

fun main(args: Array<String>) {

    val person = Person("imdad", 20, true);
    person.sign();
}