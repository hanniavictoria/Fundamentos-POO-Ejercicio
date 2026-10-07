public class Main {
    static void main(String[] args) {
        Student student1 = new Student("Juan", "Rojas", 85, 1);
        Student student2 = new Student("Karla", "Lopez", 55, 1);
        Student student3 = new Student("Sofia", "Cain", 98, 1);
        Student student4 = new Student("Victor", "Perez");
        Student student5 = new Student("Karina", "Marquez", 72, 2);
        Student student6 = new Student("Elena", "Petrova", 95, 4);
        Student student7 = new Student("Luis", "Rodríguez", 58, 3);
        Student student8 = new Student("Chloe", "Dupont", 73, 5);
        Student student9 = new Student("Min-ho", "Kim", 91, 1);
        Student student10 = new Student("Olivia", "Wilson", 82, 4);

        Student[] students = {student1, student2, student6, student7, student8, student9, student10};

        Course course1 = new Course("Math", "Daniel", 1);
        Course course2 = new Course("Physics", "Joasin", 2);
        Course course3 = new Course("Science", "Leopoldo", 3);
        Course course4 = new Course("Computer Science", "Miriam", 4);
        Course course5 = new Course("JavaScript", "Fernando", 2);
        Course course6 = new Course("Biologic", "Elizabeth", 3);
        Course course7 = new Course("Chemical", "Melissa", 4);
        Course course8 = new Course("Spanish", "Toribio", 1);


        System.out.println(student1);
        System.out.println(course1);

        System.out.println("\n=========== Student methods");
        student7.printFullName();
        System.out.println("Estudiante 7 aprobado?: " + student7.isApproved());
        student7.changeYearIfApproved();
        System.out.println("===========================");

        System.out.println("\n=========== Courses methods");
        course5.enroll(student2); // Un solo estudiante
        course5.enroll(student3);
        course5.enroll(student4);
        course5.enroll(student5);
        System.out.println("Estudiantes en el curso 5: " + course5.countStudents());
        course5.unEnroll(student2);
        System.out.println("Estudiantes restantes en el curso 5: " + course5.countStudents());
        System.out.println("Calificación más alta: " + course5.bestGrade());
        course5.enroll(students); // Método sobrecargado: array de estudiantes
        System.out.println("Estudiantes en el curso 5: " + course5.countStudents());
        System.out.println(course5.average());
        course5.isAboveAverage();
        course5.ranking();
    }//main
}//classMain
