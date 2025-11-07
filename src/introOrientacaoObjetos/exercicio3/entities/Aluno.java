package introOrientacaoObjetos.exercicio3.entities;

public class Aluno {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double totalGrade;

    public boolean approved=false;
    public double missingPoints;

    public void approvation(){
        totalGrade = grade1 + grade2 + grade3;
        if (totalGrade > 60){
            approved = true;
        }
        else {
            missingPoints = 60.0 - totalGrade;
        }
    }


    public String toString(){
        if (approved){
            return "FINAL GRADE = " + totalGrade + " \nPASS";
        }
        else {
            return  "FINAL GRADE = " + totalGrade + " \nFAILED\nMISSING " + missingPoints + " POINTS";
        }
    }


}
