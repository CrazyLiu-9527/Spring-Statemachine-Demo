package per.lzy.spring.statemechine.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import per.lzy.spring.statemechine.demo.enums.OrderStatus;
import per.lzy.spring.statemechine.demo.service.OrderService;

/**
 * @author liuzhiyuan
 * @date 2021-07-04 3:44 下午
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void testMultiThread() {
        orderService.create();
        orderService.create();

        orderService.pay(1);

        new Thread(() -> {
            orderService.deliver(1);
            orderService.receive(1);
        }).start();

        orderService.pay(2);
        orderService.deliver(2);
        orderService.receive(2);

        System.out.println(orderService.getOrders());
    }

    @Test
    public void testMiddle() {
        orderService.addOrders(100, OrderStatus.WAIT_DELIVER);
        orderService.deliver(100);

        orderService.addOrders(200, OrderStatus.WAIT_RECEIVE);
        orderService.receive(200);
    }
}
