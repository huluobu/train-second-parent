package com.carrot.emall.generation;

import com.carrot.emall.entity.UserMid;
import org.junit.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ResultMapUtilTest {

    @Test
    public void getResultMap() {
        String resultmaps = ResultMapUtil.getResultMap(UserMid.class);
        System.out.println(resultmaps);
    }
}