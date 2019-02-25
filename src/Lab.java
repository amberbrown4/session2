

public class Lab {
    private Student[] students;
    private int dayOfTheWeek;
    private int currentCapacity;
    private int capacity;


    public Lab (int dayOftheWeek, int capacity){
        this.capacity = capacity;
        students = new Student[capacity];

    }
    public void enrollStudent(Student std){
        if( currentCapacity < capacity){
        students[currentCapacity] = std;
        currentCapacity++;
        System.out.println("student added");
    }else{
            System.out.println("capacity is full");
        }
    }
    public Student[] getStudents(){
        return students;
    }
    public float getAverage(){
        int sum = 0;
        float average;
        for( int i=0 ; i<currentCapacity; i++){
            sum += students[i].getGrade();
        }
        average = sum/ currentCapacity;
        return average;
    }
   // public int getCurrentCapacity(){}
   // public int getDayOfTheWeek(){}
}
