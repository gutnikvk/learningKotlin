package entities

import java.io.Serializable

open class Person (
    var name: String,
    var age: Int,
    var job: Job,
    var pay: Double
) : Serializable {
    fun getJob(): String {
        return when (this.job) {
            Job.JUNIOR_DEV -> "Junior developer"
            Job.MIDDLE_DEV -> "Middle developer"
            Job.SENIOR_DEV -> "Senior developer"
            Job.TEAM_LEAD  -> "Team leader"
        }
    }

    override fun toString(): String {
        return this.name.plus("; ")
                        .plus(this.age)
                        .plus("; ")
                        .plus(this.getJob())
                        .plus("; ")
                        .plus(this.pay)
    }

    enum class Job {
        JUNIOR_DEV,
        MIDDLE_DEV,
        SENIOR_DEV,
        TEAM_LEAD
    }
}