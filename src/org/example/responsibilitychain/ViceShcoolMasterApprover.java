package org.example.responsibilitychain;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 15:33
 **/
public class ViceShcoolMasterApprover extends Approver {
    public ViceShcoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 30000 && purchaseRequest.getPrice() > 10000) {
            System.out.println("请求编号，id=" + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
