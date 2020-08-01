package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    /**
     * 递推算法
     * 月初1个兔子
     */
    @Test
    public void contextLoads() {
        int month = 13;
        int[] count = new int[13];
        count[0] = 1;
        count[1] = 1;
        System.out.println();
        System.out.println("0个月的兔子数量是:" + 1);
        System.out.println("1个月的兔子数量是:" + 1);
        for (int i = 2; i < month; i++) {
            count[i] = count[i - 1] + count[i - 2];
            System.out.println(i + "个月的兔子数量是:" + count[i]);
        }
    }

    /**
     * 整存零取4年  利率0.0171   每月取1000   求最初存多少
     * 思路:第48个月取1000                            求47个月时有多少   1000/(1+0.0171/12)
     *      第47个月取1000剩1000/(1+0.0171/12)          46            (第47个月剩余+1000)/(1+0.0171/12)
     *      .
     *      .
     *      .
     *
     */
    @Test
    public void getMony(){
        final double fetch = 1000.00;
        final double rate = 0.0171;
        double[] corpus = new double[49];
        corpus[48] = fetch;
        System.out.println();
        for (int i=47;i>0;i--){
            corpus[i] = (corpus[i+1]+fetch)/(1+rate/12);
            System.out.println("第"+i+"个月末本利合计"+corpus[i]);
        }
    }

}
