import java.util.ArrayList;

public class Course {

    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName.toUpperCase();
        this.professorName = professorName.toUpperCase();
        this.year = year;

        this.students = new ArrayList<>();
    }

    public void enroll(Student student){
       students.add(student);
    } //TODO add the student to the collection

    public void enroll(Student [] students){
        for(Student student : students){
            enroll(student);
        }
    }//Agregar estudiantes a la lista

    public void unEnroll(Student student){
        Student tempStudent = student;

        for (Student std: students){
            if(tempStudent.equals(std)){
                tempStudent = std;
                break;
            }
        }
        students.remove(student);
    }//TODO remove this student from the collection
    // Hint: check if that really is this student

    public int countStudents(){
        return students.size();
    }//TODO implement contar estudiantes

    public int bestGrade(){
        int bestGrade = 0;

        for (Student student : students){
            if (student.grade > bestGrade){
                bestGrade = student.grade;
            }//If
        }//for
        return bestGrade;
    }//TODO implement

    //TAREA
    public double average() {
        if (students.isEmpty()) {
            return 0;
        }
        double sumProm = 0;

        for (Student student : students) {
            sumProm += student.grade;
        }
        return sumProm / students.size();
    }

    public void ranking() {
        ArrayList<Student> ranking = new ArrayList<>(students);

        ranking.sort((student1, student2) ->
                Integer.compare(student2.grade, student1.grade)
        );
        System.out.println("===== RANKING =====");
        int position = 1;
        for (Student student : ranking) {
            System.out.println(position + ". " + student.printFullName() + " - " + student.grade);
            position++;
        }
    }

    public void isAboveAverage() {
        double average = average();
        System.out.println("Promedio: " + average);
        for (Student student : students) {
            if (student.grade > average) {
                System.out.println(
                        student.printFullName() + " está por encima del promedio");
            } else {
                System.out.println(student.printFullName() + " NO está por encima del promedio");
            }
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", professorName='" + professorName + '\'' +
                ", year=" + year +
                ", students=" + students +
                '}';
    }

    public void mostrarInfoClass() {
        System.out.println("==== Detalles de la clase ====");
        System.out.println("Clase: " + courseName);
        System.out.println("Nombre Profesor: " + professorName);
        System.out.println("Año: " + year);
        System.out.println("Alumnos en la clase: " + countStudents());
        System.out.println("Grado más alto: " + bestGrade());
        System.out.println("================================");
    }//Mostrar Info

}//class Course
