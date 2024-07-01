package data

class `OOP prtmuan4`{
    var firstName : String = "Azmi"
    var middleName : String = "nur"
    var lastName : String = "faq"

    //membuat sebuah function
    fun sayHello(name:String){
        println("hello $name my name is $firstName")
    }
    fun run(){
        println("I'am run")

    }
    fun getFullname() : String{
        return "$firstName $middleName $lastName"
    }

}
