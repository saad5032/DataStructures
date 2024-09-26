import java.util.Scanner;
public class Array07Project {
    Scanner sc = new Scanner(System.in);
    int arr[] = null;
    double avg;

    public void GetTemperatures(int days){
        arr = new int[days];
        for(int i=0;i<days;i++){
            System.out.println(" Days "+ (i+1) + "'s high temperature : ");
            int temp = sc.nextInt();
            arr[i] = temp;
        }
    }

    public double averageTemp(){
        int sum =0;
        for (int i=0; i< arr.length;i++){
            // average formula : elemets added / no of elements
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    public int aboveAvg(){
        int NumberOfDays = 0;
        for (int i=0;i<arr.length;i++){
            // I need to that every element is above the avg or not
            if (arr[i] > avg){
                NumberOfDays +=1;
            }
        }
        return NumberOfDays;
    }


    public static void main(String[] args) {
        Array07Project obj = new Array07Project();
        System.out.println("How many days of temperature ? ");
        int days = obj.sc.nextInt();
        // Get temperature of the bumber of days 
        
        obj.GetTemperatures(days);
        System.out.println("Average : "+obj.averageTemp());
        System.out.println(obj.aboveAvg() + " days above average");
        
    }
}
