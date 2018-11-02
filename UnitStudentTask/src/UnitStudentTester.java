public class UnitStudentTester {

    public static void main(String[] args){

        Unit u1 = new Unit("101","Computing Science HND");
        Student s1 = new Student(16025716,"Alan","Mackenzie","16025716@uhi.ac.uk","01349866994");
        String result = "Pass";

        u1.addStudent(s1, result);

    }

}
