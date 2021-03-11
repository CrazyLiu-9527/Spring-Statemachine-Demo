package per.lzy.spring.statemechine.demo.entity;

import lombok.Data;
import per.lzy.spring.statemechine.demo.enums.OrderStatus;

/**
 * 订单类
 *
 * @author liuzhiyuan
 * @date 2021-03-11 5:40 下午
 */
@Data
public class Order {
    /**
     * 订单号
     */
    private Integer id;
    /**
     * 订单状态
     */
    private OrderStatus status;
}
