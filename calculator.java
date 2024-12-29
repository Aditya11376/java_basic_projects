import java.util.Scanner;
//creating a calculator;

public class calculator {

    static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number you want to do operates : ");
        int n=sc.nextInt();

        if(n<=1){
            System.out.println("Invalid input\nBecause you entered a number which is less than or equal to 1\nNo need to operate.");
            return;
        }

        Double arr[] = new Double[n];
        System.out.println();
        System.out.println("Enter the all the numbers (with sign) you want to do operates -- ");
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+(i+1)+"th number : ");
            arr[i]=sc.nextDouble();
        }
        System.out.println();

        System.out.println("Enter the operator want to operates( + * / ) : ");
        String op = sc.next();

        switch(op){
            case "+":
                double sum=0;
                for(int i=0;i<arr.length;i++){
                    sum+=arr[i];
                }
                System.out.println("The sum of all the numbers you want to operates : "+sum);
                break;

            case "*":
                double mul = 1;
                for(int i=0;i<arr.length;i++){
                    mul*=arr[i];
                }
                System.out.println("The multiplication of all the numbers you want to operates : "+mul);
                break;

            case "/":
                if(arr.length>2 ){
                    System.out.println("Can't be operated in division method!");
                    break;
                }
                double div=arr[arr.length-1]/arr[arr.length-2];
                System.out.println("The division of all the numbers you want to operates : "+div);
                break;

            default:
                System.out.println("Invalid operator!");

        }

    }

    static void sqrtOrCbrt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("(1).Want CubeRoot?");
        System.out.println("(2).Want SquareRoot?");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the value: ");
                double a=sc.nextDouble();
                System.out.println("CubeRoot of "+a+" is "+Math.cbrt(a));
                break;

            case 2:
                System.out.println("Enter the value: ");
                double b=sc.nextDouble();
                System.out.println("SquareRoot of "+b+" is "+Math.sqrt(b));
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }

    static void powerValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent : ");
        double exp = sc.nextDouble();
        System.out.println("The power of "+base+"/"+exp+" is "+Math.pow(base,exp));
    }

    static void logOf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("(1).log base e?");
        System.out.println("(2).log base 10?");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the value: ");
                double a=sc.nextDouble();
                System.out.println("The log of "+a+" is "+Math.log(a));
                break;

            case 2:
                System.out.println("Enter the value: ");
                double b=sc.nextDouble();
                System.out.println("The log of "+b+" is "+Math.log10(b));
                break;

            default:
                System.out.println("Invalid choice!");

        }
    }

    static void roundOff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be rounded off : ");
        Double num = sc.nextDouble();
        System.out.println("Round off of "+num+" is "+Math.round(num));
    }


    static void trigoValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("(1). Want sine value?");
        System.out.println("(2). Want cosine value?");
        System.out.println("(3). Want tan value?");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the value: ");
                double a=sc.nextDouble();
                System.out.println("The sine of "+a+" is "+Math.sin(a));
                break;

            case 2:
                System.out.println("Enter the value: ");
                double b=sc.nextDouble();
                System.out.println("The cosine of "+b+" is "+Math.cos(b));
                break;

            case 3:
                System.out.println("Enter the value: ");
                double c=sc.nextDouble();
                System.out.println("The tangent of "+c+" is "+Math.tan(c));
                break;
        }
    }

    static void  arcTrigoValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("(1). Want arcSine value?");
        System.out.println("(2). Want arcCosine value?");
        System.out.println("(3). Want arcTan value?");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the value: ");
                double a=sc.nextDouble();
                System.out.println("The sine of "+a+" is "+Math.asin(a));
                break;

            case 2:
                System.out.println("Enter the value: ");
                double b=sc.nextDouble();
                System.out.println("The cosine of "+b+" is "+Math.acos(b));
                break;

            case 3:
                System.out.println("Enter the value: ");
                double c=sc.nextDouble();
                System.out.println("The tangent of "+c+" is "+Math.atan(c));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator\n");
        System.out.println("(1).Want to calculate (sum / division / multiply) ?");
        System.out.println("(2).Want SquareRoot / cubeRoot ?");
        System.out.println("(3).Want (to the power value)?");
        System.out.println("(4).Want log value?");
        System.out.println("(5).Want round off value?");
        System.out.println("(6).Want sine/cosine/tan value?");
        System.out.println("(7).Want arcSin/arcCosine/arcTan value?\n");


        System.out.print("Enter the choice you want : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:calculator();
                break;

            case 2:sqrtOrCbrt();
                break;

            case 3:powerValue();
                break;

            case 4:logOf();
                break;

            case 5:roundOff();
                break;

            case 6:trigoValue();
                break;

            case 7:arcTrigoValue();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("\nThank You! ");

    }
}
