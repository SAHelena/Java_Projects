package entities;

public class Student {

    public Double gr;
    public Double gr1;
    public Double gr2;

    public double Grades() {
        return gr + gr1 + gr2;
    }
    
    public String toString() {
        return "FINAL GRADE = "
        + String.format("%.2f", Grades());
    }
}
