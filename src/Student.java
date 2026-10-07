public class Student {

        String firstName;
        String lastName;
        long registration;
        static long matriculation = 0;
        int grade;
        int year;

        public Student(String firstName, String lastName, int grade, int year) {
            if (!isValidName(firstName, lastName)){
                throw new IllegalArgumentException("NAME INVALID");
            }

            Student.matriculation++;
            this.registration = Student.matriculation; //1
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = (grade < 60) ? 59 : grade;
            this.year = year;
        }//Constructor Estudiantes


        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this(firstName, lastName, 59, 1);
            Student.matriculation++;
            this.registration = Student.matriculation; //1
        }

        public Student(String firstName, String lastName, int grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
            Student.matriculation++;
            this.registration = Student.matriculation; //1
        }

        public boolean isValidName(String firstName, String lastName) {
           if (firstName.isBlank() || lastName.isBlank()) {
            return false;
           }
            return true;
        }

        public String printFullName(){
                return firstName.toUpperCase() + " " + lastName.toUpperCase();
        } //TODO implement, juntar los nombres.

        public boolean isApproved(){
            if(grade >= 60){
                return true;
            } else {
                return false;
            }//else
        }//TODO implement: should return true if grade >= 60

        public int changeYearIfApproved(){
            if(isApproved()){
                year = year + 1;
                System.out.println("Congratulations!");
            } else {
                System.out.println("Not approved");
            }
                return year;
        }//TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", grade=" + grade +
                ", year=" + year +
                '}';
    }

    public void mostrarInfoStudent(){
        System.out.println("==== Detalles del alumno ====");
        System.out.println("Matricula: " + registration);
        System.out.println("Nombre Completo: " + printFullName());
        System.out.println("Aprobo: " + isApproved());
        System.out.println("Calificación: " + grade);
        System.out.println("Grado: " + changeYearIfApproved());
        System.out.println("================================");
    }//mostrarInfo
}//class Student
