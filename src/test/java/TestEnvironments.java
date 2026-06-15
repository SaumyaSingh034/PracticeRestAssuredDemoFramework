import java.util.EnumMap;

public class TestEnvironments {

    public static void main(String[] args){
        EnumMap<Environment, String> env = new EnumMap<>(Environment.class);
        env.put(Environment.QA, "qa url");


        env.put(Environment.UAT,"uat url");


        env.get(Environment.QA);

    }
}
