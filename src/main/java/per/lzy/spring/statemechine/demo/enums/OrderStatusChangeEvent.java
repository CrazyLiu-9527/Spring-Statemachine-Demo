package per.lzy.spring.statemechine.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 驱动状态改变的事件
 *
 * @author liuzhiyuan
 * @date 2021-03-11 5:33 下午
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum OrderStatusChangeEvent {

    PAYED("payed", "支付"),
    DELIVERY("delivery", "发货"),
    RECEIVED("received", "收货");

    private String code;
    private String desc;
}
