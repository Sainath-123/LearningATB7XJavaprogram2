package exe_21072024;

public class Lab118 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue;//after continue next code will not be executed it wil go to the loop again
            }
            System.out.println("After!!");
        }
    }
}
