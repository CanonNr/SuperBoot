//package com.example.lksun.web.service.impl;
//
//
//import com.example.lksun.web.service.SentinelService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//public class SentinelServiceImpl implements SentinelService {
//
//    /**
//     * blockHandler 和  fallback 的区别
//     * blockHandler针对降级熔断后执行的兜底方法
//     * fallback代码中的异常的兜底方法
//     * 两者可以共存互不影响
//     */
//
//
//
//
//    @SentinelResource(value = "DemoService#getCurrentTime",
//            blockHandler = "XxxBlockHandler",
//            fallback = "XxxFallback"
//    )
//    public String getCurrentTime() {
//        return "当前时间:"+System.currentTimeMillis();
//    }
//
//    /**
//     * BlockHandler 方法可以写参数,如果参数不对就会报参数格式的错误
//     */
//    public String XxxBlockHandler(String str,BlockException blockException){
//        System.out.println("执行了 XxxBlockHandler "+str);
//        return "...";
//    }
//
//
//    // 在控制台设置限流后,超过设置的阈值就会执行XxxFallback方法
//    @SentinelResource(value = "DemoService#getName",
//            blockHandler = "XxxBlockHandler",
//            fallback = "XxxFallback"
//    )
//    public String getName(String name) {
//        if ("tom".equals(name)){
//            // 控制台不会出现异常代码,直接被fallback捕获
//            throw new RuntimeException("你的名字有问题");
//        }else if("tom1".equals(name)){
//            int[] array = new int[5];
//            // fallback
//            System.out.println(array[6]);
//            return "嘿嘿";
//        }else{
//            return "你好,"+name+"同志!";
//        }
//    }
//
//    public String XxxFallback(String str){
//        System.out.println("执行了 XxxFallback");
//        return "接口异常,请稍后重试";
//    }
//}
