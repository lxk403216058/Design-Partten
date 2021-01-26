package org.example.responsibilitychain;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 15:32
 **/
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 10000 && purchaseRequest.getPrice() > 5000) {
            System.out.println("请求编号，id=" + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
