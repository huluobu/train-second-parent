import com.carrot.train.mapper.ProductMapper;
import com.carrot.train.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: carrot
 * @Date: 2020/10/31 09:51
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class sqltest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void productSqlTest() {
        System.out.println(("----- selectAll method test ------"));
        List<Product> list=productMapper.selectList(null);
        list.forEach(System.out::println);
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
    }

}
