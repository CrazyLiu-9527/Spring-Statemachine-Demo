package per.lzy.spring.statemechine.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import per.lzy.spring.statemechine.demo.service.OrderService;

/**
 * @author liuzhiyuan
 * @date 2021-03-11 6:18 下午
 */
@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        ConfigurableApplicationContext context = SpringApplication.run(Test.class, args);
        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.create();
        orderService.create();
        orderService.pay(1);
        new Thread("客户线程") {
            @Override
            public void run() {
                orderService.deliver(1);
                orderService.receive(1);
            }
        }.start();
        orderService.pay(2);
        orderService.deliver(2);
        orderService.receive(2);
        System.out.println("全部订单状态：" + orderService.getOrders());
    }
}
