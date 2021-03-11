package per.lzy.spring.statemechine.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 订单流转状态
 *
 * @author liuzhiyuan
 * @date 2021-03-11 5:31 下午
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum OrderStatus {

    WAIT_PAYMENT("wait_payment", "待支付"),
    WAIT_DELIVER("wait_deliver", "待发货"),
    WAIT_RECEIVE("wait_receive", "待收货"),
    FINISH("finish", "完成");

    private String code;
    private String desc;
}
