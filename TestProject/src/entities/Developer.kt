package entities

class Developer(
    name: String,
    age: Int,
    private var job: Job,
    pay: Double
) : Person(name, age, pay) {

    fun getJob(): String {
        return when (this.job) {
            Job.JUNIOR_DEV -> "Junior developer"
            Job.MIDDLE_DEV -> "Middle developer"
            Job.SENIOR_DEV -> "Senior developer"
        }
    }

    override fun toString(): String {
        return super.toString()
                    .plus("; ")
                    .plus(this.getJob())
    }

    enum class Job {
        JUNIOR_DEV,
        MIDDLE_DEV,
        SENIOR_DEV
    }
}