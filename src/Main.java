public class Main {
    public static void main(String args[]){
        boolean ha1,ha2,ha3;
        Student s1 = new Student("asghar","farhadi","9731020");
//        Student s2 = new Student("angelina","jolie","9731021");
//        Student s3 = new Student("kooft","dard","pashm");
        s1.setGrade(20);
//        s2.setGrade(10);

        if ( ("asghar").equals( s1.getName())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        s1.setLastName("asghari");
        System.out.println( s1.getLastName());

        Lab haha = new Lab(6 , 2);

        haha.enrollStudent(s1);
        //haha.enrollStudent(s2);
         //haha.enrollStudent(s3);
         System.out.println(haha.getAverage());
        }

    }


