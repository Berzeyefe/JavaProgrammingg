import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {


    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

            //TODO. Write your code below this line.
            int day = 0;
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
            int[] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            while(true){
                int sum = 0;
                for(int i=0; i<inhabitants.length; i++){
                    if(temp[i]==0){
                        if(i==0){
                            inhabitants[i+1] /= 2;
                        }else if(i==inhabitants.length-1){
                            inhabitants[i-1] /= 2;
                        }else{
                            inhabitants[i-1] /= 2;
                            inhabitants[i+1] /= 2;
                        }
                    }
                }
                for(int i=0; i<inhabitants.length; i++){
                    sum += inhabitants[i];
                }
                temp = Arrays.copyOf(inhabitants, inhabitants.length);
                day++;
                System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
                if(sum==0){
                    System.out.println("---- EXTINCT ----");
                    break;
                }
            }
        }
    }

