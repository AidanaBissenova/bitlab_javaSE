package task2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student[] students = new Student[5];
        students[0]= new Student(18, "Aidana", "Bissenova", 4.28);
        students[1]= new Student(19, "Aizh", "Gog", 4.00);
        students[2]= new Student(21, "Jony", "Bisa", 3.15);
        students[3]= new Student(23, "Alina", "DAn", 2.95);
        students[4]= new Student(22, "Ais", "Pak", 2.03);
        topStudent(students);

    }
    public static void topStudent(Student students[]){
        double max =0;
        for(int i=0; i<students.length; i++){
            if(students[i].gpa > max){
                max= students[i].gpa;
            }
        }
        for(int i=0; i<students.length; i++){
            if(students[i].gpa == max){
                System.out.println(students[i].id+ " "+students[i].name + " "+students[i].surname+ " "+students[i].gpa );
            }
        }
    }
}
