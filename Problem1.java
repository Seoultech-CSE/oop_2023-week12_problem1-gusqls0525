import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>(10);
        System.out.print("Enter five integers and five doubles: ");

        for(int i = 0; i < 10; i++){
            if(i<5){
                int numberInt = input.nextInt();
                list.add(numberInt);
            }
            else{
                double numberDouble = input.nextDouble();
                list.add(numberDouble);
            }
        }

        sort(list);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        
        for(int i = 0; i < list.size(); i++){
            for(int j = i; j < list.size(); j++)
            {
                if(list.get(j).doubleValue() > list.get(j + 1).doubleValue())
                {
                double a = list.get(j + 1).doubleValue();
                list.add(list.get(j));
                list.add(a);
                }
            }
            
        }

    }
}
