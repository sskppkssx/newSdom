package com.csits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/** 
 * @Author ssk 
 * @Date 2018年10月15日
 * @Description  项目启动入口
 */
@RestController
@SpringBootApplication 
public class newSdomStartApplication extends SpringBootServletInitializer {

	/**
	 * SpringBoot启动入口
	 * @param String[] args
	 * @return void
	 */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(newSdomStartApplication.class, args);
        System.out.println("SpringBoot 启动成功 \n" +
                " ______                        _     ______            			\n" +
                "|_   _ \\                    _ / |_  |_   _ `.          			\n" +
                "  | |_) |    .--.     .--.  `-| |-'   | | `. \\   .--.   		\n" +
                "  |  __'.  / .'`\\ \\ / .'`\\ \\  | |     | |  | | / .'`\\ \\ 	\n" +
                " _| |__) | | \\__. | | \\__. |  | |_   _| |_.' / | \\__. | 		\n" +
                "|_______/   '.__.'   '.__.'   \\__/  |______.'   '.__.'  ");
        
    }
    
 
    /**
	 * 外置Web服务器启动入口
	 * @param SpringApplicationBuilder
	 * @return void
	 */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(newSdomStartApplication.class);
    }
    
    /**
	 * 项目启动测试
	 */
    @RequestMapping("/test")
    public String test() {    
    	System.out.println("Hello SpringBoot Test");
        return "Hello SpringBoot Test";
    }

}
