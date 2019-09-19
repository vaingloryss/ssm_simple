import org.junit.Test;

import java.util.Properties;

public class TestUsername {
    @Test
    public void test01(){
        Properties properties = System.getProperties();
        System.out.println(properties.getProperty("user.name"));
    }
}
