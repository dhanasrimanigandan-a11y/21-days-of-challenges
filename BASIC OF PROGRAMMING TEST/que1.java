public class que1{
    public static void main(String[] args){
        int credit_score=780,income=50000,emi=10000;
        String employment="Salaried";
        if(employment.equals("Salaried") || employment.equals("Self-employed")){
            System.out.println("Employment status: eligible");
        }
        else{
            System.out.println("Employment status: not eligible");
        }
        if(credit_score>=750 && income>=25000){
            System.out.println("Status : approved");
             if(emi<=income/2){
                 System.out.println("Status : accepted");
             }
            else{
                System.out.println("Status : rejected");
             }
            if(credit_score>=800){
                System.out.println("Interest rate:7%");
            }
            else if(credit_score>=750&&credit_score<799){
                System.out.println("Interest rate:8%");
            }
        }
        else if(credit_score>=600&&credit_score<750 && income>=25000){
            System.out.println("Status : pending");
        }
        else if(credit_score<600 && income<25000){
            System.out.println("Status : rejected");
        }
        else{
            System.out.println("Status : not eligible for loan");
        }
    }
}