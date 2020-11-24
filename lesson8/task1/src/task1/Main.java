package task1;

public class Main {

    public static void main(String[] args) {
	    Student[] s = new Student[5];
	    s[0]= new Student(18, "Aidana", "Bissenova", 4.28);
        s[1]= new Student(19, "Aizh", "Gog", 4.00);
        s[2]= new Student(21, "Jony", "Bisa", 3.15);
        s[3]= new Student(23, "Alina", "DAn", 2.95);
        s[4]= new Student(22, "Ais", "Pak", 2.03);
        for(int i=0; i<5; i++){
            System.out.println(s[i].getStudentData()
            );
        }
    }
}
