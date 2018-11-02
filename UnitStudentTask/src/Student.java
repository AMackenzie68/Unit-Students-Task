public class Student {

    int studentNo;
    private String studentForename;
    private String studentSurname;
    private String studentEmail;
    private String studentMobile;



    public Student(int number,String forename,String surname,String email,String mobile){
        setStudentNo(number);
        setStudentForename(forename);
        setStudentSurname(surname);
        setStudentEmail(email);
        setStudentMobile(mobile);
    }

    public void removeDetails(){
        //remove all details for student (set to null somehow)

    }

    public int getStudentNo(){
        return studentNo;
    }

    public void setStudentNo(int tempNo){
        this.studentNo = tempNo;
    }
    public String getStudentForename(){
        return this.studentForename;
    }

    public void setStudentForename(String tempName){
        this.studentForename = tempName;
    }

    public String getStudentSurname(){
        return this.studentSurname;
    }

    public void setStudentSurname(String tempName){
        this.studentSurname = tempName;
    }

    public String getStudentEmail(){
        return this.studentEmail;
    }

    public void setStudentEmail(String tempMail){
        this.studentEmail = tempMail;
    }

    public String getStudentMobile(){
        return this.studentMobile;
    }

    public void setStudentMobile(String tempMobile){
        this.studentMobile = tempMobile;
    }

    public void displayDetails(){
        System.out.println("Student Number: " +getStudentNo()+"Name: " +getStudentForename()+" "+getStudentSurname()+". Email: "+getStudentEmail()+" Mobile Number: "+getStudentMobile());
        System.out.println("");
    }
}
