public class Student {
    private String name, lastName, studentNo;
    private float studenGrade;
    public Student( String name, String lastName, String studentNo){
        this.name = name;
        this.lastName = lastName;
        this.studentNo = studentNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }
    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public String getStudentNo(){
        return studentNo;
    }
    public void setGrade( int studentGrade){
        this.studenGrade = studentGrade;
    }
    public float getGrade(){
        return studenGrade;
    }
}