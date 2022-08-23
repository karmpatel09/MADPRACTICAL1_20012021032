open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Karm","Patel",21,20012021032,"IT","C","AB9")
    var s2=Student("Yash","Patel",20,20012021033,"CE","A","AB7")
    var s3=Student("Kapil","Bhavsar",23,20012021034,"CS","D","AB9")
    var s4=Student("Manav","Patel",20,20012021035,"Mechanical","B","AB5")
    var s5=Student("Keyuri","Rabadia",20,20012021036,"IT","E","AB6")

}
