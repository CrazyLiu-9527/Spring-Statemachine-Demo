package per.lzy.spring.statemechine.demo.service;

import per.lzy.spring.statemechine.demo.entity.Order;
import per.lzy.spring.statemechine.demo.enums.OrderStatus;

import java.util.Map;

/**
 * 订单接口
 *
 * @author liuzhiyuan
 * @date 2021-03-11 6:14 下午
 */
public interface OrderService {
    /**
     * 创建订单
     */
    Order create();

    /**
     * 发起支付
     *
     * @param id
     * @return
     */
    Order pay(int id);

    /**
     * 订单发货
     *
     * @param id
     * @return
     */
    Order deliver(int id);

    /**
     * 订单收货
     *
     * @param id
     * @return
     */
    Order receive(int id);

    /**
     * 获取所有订单信息
     *
     * @return
     */
    Map<Integer, Order> getOrders();

    void addOrders(int id, OrderStatus orderStatus);
}
