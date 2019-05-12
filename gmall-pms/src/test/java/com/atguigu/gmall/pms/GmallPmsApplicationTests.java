package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    RedisTemplate<Object,Object> redisTemplateObj;
    @Test
    public void contextLoads() {
       // Product byId = productService.getById(1);
        //System.out.println(byId.getName());
//        Brand brand = new Brand();
//        brand.setName("哈哈哈哈哈！");
//        brandService.save(brand);
//        System.out.println("保存成功！");
        Brand byId = brandService.getById(53);
        System.out.println("保存成功："+byId.getName());

    }

    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("hai","nihao");  //操作redis的string类型的
        System.out.println("保存了数据！");
        String hai = redisTemplate.opsForValue().get("hai");
        System.out.println("刚才保存的值是："+hai);
    }
    @Test
    public void testRedisObj() {

        Brand brand = new Brand();
        brand.setName("小熊猫");
        redisTemplateObj.opsForValue().set("abc",brand);

        Brand abc = (Brand) redisTemplateObj.opsForValue().get("abc");
        System.out.println("刚才保存的值是："+abc.getName());
    }
}
