import entities.Developer
import entities.Person
import entities.Manager
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

fun main() {
    val bob = Person(
        name = "Bob Smith",
        age = 42,
        pay = 115000.00
    )
    val john = Manager("John Dorian", 32, Manager.Job.TEAM_LEAD,150000.00)
    val alice = Developer(
        name = "Alice Morgan",
        age = 25,
        job = Developer.Job.JUNIOR_DEV,
        pay = 80000.00
    )
    println(john.toString())
    println(alice.toString())
    writePersonToFile(bob)
    println(readPersonFromFile().toString())
    readLine()
}

fun writePersonToFile(person: Person) {
    val fileOutputStream = FileOutputStream("person.txt")
    val objectOutputStream = ObjectOutputStream(fileOutputStream)
    objectOutputStream.writeObject(person)
}

fun readPersonFromFile(): Any? {
    val fileInputStream = FileInputStream("person.txt")
    val objectInputStream = ObjectInputStream(fileInputStream)
    return objectInputStream.readObject()
}


