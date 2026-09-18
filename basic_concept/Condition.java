public class Condition {
    public static void main(String[] args) {
        int age=20;
        if(age>18){
            System.out.println("You are eligible for vote.");
        }
        
        int num=100;
        if(num%2==0){
            System.out.println("Even number.");
        }else{
            System.out.println("Odd number .");
        }

        char grade;
        int mark=85;
        if(mark>=90){
            grade='A';
        }else if(mark>80 && mark<90){
            grade='B';
        }else{
            grade='F';
        }
        System.out.println("Grade :"+grade);

        int day=2;
        String dName;
        switch(day){
            case 1:
                dName="Monday";
                break;
            case 2:
                dName="Tuesday";
                break;
            default:
                dName="Invalid day";
        }
        System.out.println(dName);

        char ch='a';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consunant");
        }
    int originalValue=21;
    
    int transformValue=switch(originalValue%2){
        case 0 -> {
            originalValue+=1;
            yield originalValue;
        }
        default -> {
            System.out.println("Invalid");
            yield -1;
        }
    };
    System.out.println(transformValue);
    }
}
