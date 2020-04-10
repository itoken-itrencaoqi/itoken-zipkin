package cn.itren.itoken.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @program: itoken
 * @description: 分布式链路追踪启动类
 * @author: Mr.Ren
 * @create: 2020-04-10 20:45
 **/
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipKinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }

}
