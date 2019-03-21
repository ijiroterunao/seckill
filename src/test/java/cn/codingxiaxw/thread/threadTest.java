package cn.codingxiaxw.thread;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class threadTest {
//    @Test(threadPoolSize = 5001, invocationCount = 5002, timeOut = 1000000)
//    public void testExecute() {
//        RestTemplate template = new RestTemplate();
//
//        HttpHeaders headers = new HttpHeaders();
//        List<String> cookies = new ArrayList<>();
//        cookies.add("userPhone=" + "1737467" + Phone++);
//        headers.put(HttpHeaders.COOKIE, cookies);
//        HttpEntity request = new HttpEntity(null, headers);
//
//        long start = System.currentTimeMillis();
//        String s = template.postForObject("http://localhost/seckill/1000/bf204e2683e7452aa7db1a50b5713bae/execution", request, String.class);
//        long end = System.currentTimeMillis();
//
//        log.info("{}|{}ms ,res|{}",Thread.currentThread().getId(),(end - start),s);
//    }
}
