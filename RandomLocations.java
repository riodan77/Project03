import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class RandomLocations {


    public static int randomHouseNumber(int min, int max){
        int[] numberOf10s = {10,20,30,40,50,60,70,80,90};
        int x= (int)((Math.random()*((max-min)+1))+min);

        int idx = new Random().nextInt(numberOf10s.length);
        int randomHouseNumber = (numberOf10s [idx]);


        if (x == 0){
            return Integer.parseInt(randomHouseNumber+"");}
        else{
            return Integer.parseInt(x +""+ randomHouseNumber);}
    }


    public static String randomStreetName(){
        String[] mystring = {"South", "East"};
        int idx = new Random().nextInt(mystring.length);
        String randomStreat = (mystring [idx]);
        return randomStreat;
    }

    public static String randomStreetNumber(int min, int max){
        int num = (int)((Math.random()*((max-min)+1))+min);

        if (num ==1)
            return num + "st";
        else if (num ==2)
            return num + "nd";
        else if (num ==3)
            return num + "rd";
        else
            return num + "th";
    }

    public static void main(String[] args) throws Exception{

        int min = 0;
        int max = 10;
        BufferedWriter out = new BufferedWriter(new FileWriter("100RandomLocations.txt"));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int howManyBlock = (int) ((Math.random() * ((max - min) + 1)) + min);
                out.write(randomHouseNumber(0, 19) + " " + randomStreetName() + " " + randomStreetNumber(1, 19) + " " + howManyBlock);
                out.newLine();
            }
        }
        out.close();

    }
}



