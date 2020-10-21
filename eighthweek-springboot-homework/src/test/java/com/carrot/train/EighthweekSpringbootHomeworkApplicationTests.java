package com.carrot.train;

import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONObjectIter;
import com.carrot.train.entity.User;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class EighthweekSpringbootHomeworkApplicationTests {

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;
    @Autowired
    private RedisTemplate<String, Serializable> serializableRedisTemplate;

    @Test
    public void testString() {
        strRedisTemplate.opsForValue().set("springbootredis", "jedis");
        System.out.println(strRedisTemplate.opsForValue().get("springbootredis"));
    }

    @Test
    public void testSerializable() throws JSONException {
        User user=new User();
        user.setId(18);
        user.setUsername("朝雾轻寒");
        user.setStatus("Y");
//        JSONObject jsonObject= new JSONObject(user);

        Map<String, String> map = new HashMap<>();
        serializableRedisTemplate.opsForValue().set("user", user);
        serializableRedisTemplate.opsForHash("user1", user.getId());
        User user2 = (User) serializableRedisTemplate.opsForValue().get("user");
        System.out.println("user2:"+user2.getId()+","+user2.getUsername()+","+user2.getStatus());
    }


}
