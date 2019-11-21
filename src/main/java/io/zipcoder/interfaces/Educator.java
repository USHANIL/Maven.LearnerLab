package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Kris(1, "Kris"),
    Dolio (2, "Dolio"),
    Froilan(3, "Frolian"),
    Chris (4, "Chris"),
    Rob(5,"Rob");

    private final Instructor instructor;
    private int timeWorked;

    Educator(long id, String name){
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(this.instructor);
        this.timeWorked = 0;
    }

    public int getTimeWorked() {
        return this.timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numOfHrsPerLearner = numberOfHours / learners.length;
        for (Learner learner: learners) {
            //learner.learn(numOfHrsPerLearner);
            //this.timeWorked += numberOfHours;
            teach(learner,numOfHrsPerLearner); // this will add the timeworked as well
        }

    }
}
