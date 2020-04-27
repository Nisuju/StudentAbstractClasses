package epam;

public  class Student {
    private String name;
    private Double averageScore;

    public Student(String name, Double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAvergaeScore() {
        return this.averageScore;
    }//
    public void setAverageScore(double AverageScore) {
        this.averageScore = AverageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
