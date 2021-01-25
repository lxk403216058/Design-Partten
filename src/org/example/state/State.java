package org.example.state;

/**
 * @description 状态抽象类
 * @author: lxk
 * @date: 2021-01-25 15:00
 **/
public abstract class State {
    /**
     * 扣除积分 - 50
     */
    public abstract void deductMoney();

    /**
     * 是否抽中奖品
     *
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();
}
