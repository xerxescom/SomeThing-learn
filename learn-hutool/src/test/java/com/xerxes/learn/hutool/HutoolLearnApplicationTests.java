package com.xerxes.learn.hutool;


import cn.hutool.core.convert.Convert;
import cn.hutool.log.StaticLog;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


//@RunWith(SpringRunner.class)
@SpringBootTest
public class HutoolLearnApplicationTests {
    /**
     * 类型转换工具类-Convert
     */
    @Test
    public void convertTest() {
        // 转换成字符串
        int a = 12312;
        String s = Convert.toStr(a);
        long[] a1 = {3,432,43,4543,54};
        String s1 = Convert.toStr(a1);
        System.out.println(s);
        System.out.println(s1);
        // 转换成指定类型数组
        String[] b = { "4", "2345", "543", "644" };
        Integer[] intArray = Convert.toIntArray(b);
        long[] c = {1,2,3,4,5};
        String[] intArray2 = Convert.toStrArray(c);
        //转换为日期对象
        String s2 = "2021-08-27";
        Date value = Convert.toDate(a);
        System.out.println(value);
        //转换为集合
        Object[] b2 = {"哈喽", "你", "好", "", 1};
        List<?> list = Convert.toList(b2);
        System.out.println(list);
    }


}
