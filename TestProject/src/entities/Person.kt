package entities

import java.io.Serializable

open class Person (
    var name: String,
    var age: Int,
    var pay: Double
) : Serializable {

    override fun toString(): String {
        return this.name.plus("; ")
                        .plus(this.age)
                        .plus("; ")
                        .plus(this.pay)
    }
}