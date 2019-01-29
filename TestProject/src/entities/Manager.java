package entities;

public class Manager extends Person {
    private Job job;

    public Manager(String name, int age, Job job, double pay) {
        super(name, age, pay);
        this.job = job;
    }

    String getJob() {
        String job;
        switch(this.job) {
            case TEAM_LEAD:
                job = "Team leader";
                break;
            case FIN_DIRECTOR:
                job = "Financial director";
                break;
            case TECH_DIRECTOR:
                job = "Technical director";
                break;
            default: job = null;
        }
        return job;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.getJob();
    }

    public enum Job {
        TEAM_LEAD,
        TECH_DIRECTOR,
        FIN_DIRECTOR
    }
}
