import io.restassured.path.json.JsonPath;

import java.util.List;

public class TestJune {
    public static void main(String[] args){
            String response = "{\"orders\":[{\"id\":1,\"amount\":500},{\"id\":2,\"amount\":700}]}";
            JsonPath js = new JsonPath(response);
            List<Integer> data = js.getList("orders.id");
            System.out.println(data);
            List<Integer> amount = js.getList("orders.amount");
            int sum = 0;
            for(int i : amount){
                sum += i;
            }
            if(sum == 1200){
                System.out.println("Perfect Amount");
            } else{
                System.out.println("Check the Amount again");
            }
           int sumStream = amount.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumStream);
        System.out.println(js.getList("orders").size());

    }
}
