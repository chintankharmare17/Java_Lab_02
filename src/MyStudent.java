class StudentPCU
{
    String Name;
      int Roll;
    String PRN;
    String DOB;
    String  BloodGrp;
    char   Gen;

    public StudentPCU(String name, int roll, String prn, String dob, String bg, char gen, String sepcail) {
        this.Name = name;
        this.Roll = roll;
        this.PRN = prn;
        this.DOB = dob;
        this.BloodGrp = bg;
        this.Gen = gen;
        this.special = special;
    }

    String special;

    public StudentPCU() {
        System.out.println("Default Constructor : ");
    }

    void register() {

    }
    void cgpa() {

    }

}
public class MyStudent {
    public static void main(String[] args) {
        System.out.println( );
        StudentPCU  studentPCU = new StudentPCU();
        System.out.println("Welcome");
        studentPCU.Name="Chintan";
        studentPCU.Roll =21;
        studentPCU.PRN="SOE23201010413";
        studentPCU.BloodGrp="A+ve";
        studentPCU.Gen='M';
        System.out.println("Name :"+ studentPCU.Name+" , Gender: "+studentPCU.Gen+" , Blood Groop :"+studentPCU.BloodGrp);




    }

}
