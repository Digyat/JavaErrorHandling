public class UseStudent {

    public static void main(String[] args) {
    	try {

        Student s = null;
        printStudent(s);

        Student[] students = new Student[2];
        Student s1 = new Student("Student1", 20);
        Student s2 = new Student("Student2", 21);
        students[0] = s1;
        students[1] = s2;
        listStudents(students);
    	thisIsRisky();
        } catch(NullPointerException e) {
        	System.out.println("Error 1: "+ e.getMessage());
        }
    }

    private static void printStudent(Student student) {
    	try {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    	}
    	catch(NullPointerException e) {
    		System.out.println("We are in catch block " + e.getMessage());
    	}
    }

    private static void listStudents(Student[] students) {
    	try {
        for (int i = 0; i <= students.length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getAge());
        }}
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Try catch Successful " + e.getMessage());
    	}
    }

    private static void thisIsRisky() {
    	try {
        int priceTag = 50;
        int discount = 0;
        System.out.println("Total = " + (priceTag/discount));
    	}
    	catch(ArithmeticException e) {
    		System.out.println("Catch block again for divide by zero?" + e.getMessage());
    	}

    }



}
