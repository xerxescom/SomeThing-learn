package com.xerxes.learn.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuavaLearnApplicationTests {
    @Test
    public void basicUtilities() {

    }

    /**
     * 列表相关
     * com.google.common.collect.Lists
     */
    @Test
    public void listsTest() {
        List<Object> list = Lists.newArrayList();
        List<Integer> integerList = Lists.newArrayList(3, 32, 3423);
        List<String> stringList = Lists.newArrayList("32", "2323", "24242");
        System.out.println(list);
        System.out.println(integerList);
        System.out.println(stringList);

        //返回一个不可修改的列表，包含指定的第一个元素并加上指定的其他元素的数组
        List<Integer> integerS1 = Lists.asList(2, integerList.toArray(new Integer[0]));

        //返回一个不可修改的列表，包含指定的第一个元素、第二个元素并加上指定的其他元素的数组
        List<Integer> integerS2 = Lists.asList(2, 32, integerList.toArray(new Integer[0]));
        System.out.println(integerS1);
        System.out.println(integerS2);
        
        //返回一个连续的列表，每个子列表大小相同，最终那个子列表可能更小
        // （相当于将stringList以size等于2进行划分）
        List<List<String>> partition = Lists.partition(stringList, 2);
        System.out.println(partition);
    }

    /**
     * Map相关
     * import com.google.common.collect.Maps;
     */
    @Test
    public void mapTest() {
        //创建一个ConcurrentHashMap实例  注：效率比Hashtable高，并发性比hashMap好
        ConcurrentMap<String, String> concurrentMap = Maps.newConcurrentMap();
        /**
         * 如果指定的键尚未关联,与一个值，将其与给定的值相关联。这相当于:
         *     <pre> {@code
         *    if (!map.containsKey(key))
         *      return map.put(key, value);
         *    else
         *      return map.get(key);
         *    }</pre>
         */
        String s1 = concurrentMap.putIfAbsent("x", "xxx");
        String s2 = concurrentMap.putIfAbsent("x", "xxx");
        System.out.println(s1);
        System.out.println(s2);
    }
}
