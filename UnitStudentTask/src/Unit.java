public class Unit {

    private String unitNumber;
    private String unitTitle;
    private Student classlist[] = new Student[10];
    private String result[] = new String[10];

    public Unit(String uNos, String uTitle){
        unitNumber = uNos;
        unitTitle = uTitle;
    }

    public void addStudent(Student tempStudent,String tempResult){

        boolean hasRoom = false;

        for (int x=0;x<classlist.length;x++){

            if(classlist[x] == null){

                classlist[x] = tempStudent;
                result[x] = tempResult;
                hasRoom = true;
                break;
            }
        }

        if (hasRoom == true){
            System.out.println("Student inserted");
        }else{
            System.out.println("No space available in class list");
        }
    }

    public void displayStudents(){
        for (int x=0;x<classlist.length;x++){
            classlist[x].displayDetails();
        }
    }

    public void displayPassedStudents(){
        for (int x=0;x<classlist.length;x++){
            if (result[x] == "P"){
                classlist[x].displayDetails();
            }
        }
    }

    public void displaySpecificStudent(int searchNo){
        for (int x=0;x<classlist.length;x++){
            if (classlist[x].getStudentNo() == searchNo){
                classlist[x].displayDetails();
            }
        }
    }

    public void displaySuccessRate(){
        int noPasses = 0;
        int successPercentage = 0;
        for (int x=0;x<classlist.length;x++){
            if (result[x] == "P"){
                noPasses++;
            }
        }
        successPercentage = ((noPasses/classlist.length)*100);

        System.out.println("Success Rate of Class: " +successPercentage+"%");
    }

    public void removeStudent(int tempNo){
        for (int x=0;x<classlist.length;x++){
            if (classlist[x].getStudentNo() == tempNo){
                classlist[x].displayDetails();
            }
        }
    }
}
