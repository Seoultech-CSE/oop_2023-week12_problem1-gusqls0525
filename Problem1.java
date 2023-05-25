import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i = 0; i < 10; i++){
            if(i<5)
            list.add(new BigInteger(input.nextInt()));
            else
            list.add(new BIgDouble(input.nextDouble()));
        }

        sort(list);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).doubleValue() > list.get(i + 1).doubleValue())
            {
                double a = list.get(i + 1);
                list.add(list.get(i));
                list.add(a);
            }
            
        }

    }
}
