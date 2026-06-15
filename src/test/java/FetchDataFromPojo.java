import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

public class FetchDataFromPojo {
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper() {
            @Override
            public Object deserialize(ObjectMapperDeserializationContext objectMapperDeserializationContext) {
               // Interview1 interview = mapper.deserialize()
                return  new Object();
            }

            @Override
            public Object serialize(ObjectMapperSerializationContext objectMapperSerializationContext) {
                return null;
            }
        };

    }
}
