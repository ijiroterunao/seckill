package cn.codingxiaxw.dao;

import cn.codingxiaxw.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {

    @Autowired
    private SuccessKilledDao successKilledDao;


    @Test
    public void insertSuccessKilled() {
        long seckillId=1000;
        long userPhone=13476191877L;
        int insertCount=successKilledDao.insertSuccessKilled(seckillId, userPhone);
        System.out.println("insertCount"+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        long seckillId=1000;
        long userPhone=13476191877L;
        SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}