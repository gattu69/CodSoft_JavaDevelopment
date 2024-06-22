import java.util.Scanner;
class StudentGradeCalculater{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects :\t");
        int n = sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter marks in subject "+(i+1)+" : ");
            int marks=sc.nextInt();
            total+= marks;
        }
        int avg=total/n;
        char grade;
        if(avg>=80){
            grade='A';
        }
        else if(avg>=60){
            grade='B';
        }
        else if(avg>=40){
            grade='C';
        }
        else{
            grade='F';
        }

        System.out.println("Total Marks     : "+total);
        System.out.println("Average percent : "+avg+"%");
        System.out.println("Grade           : "+grade);
    }
}