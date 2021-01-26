package org.example.responsibilitychain;

/**
 * @description 责任链模式
 * @author: lxk
 * @date: 2021-01-26 15:35
 **/
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);

        //创建审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceShcoolMasterApprover viceShcoolMasterApprover = new ViceShcoolMasterApprover("熊副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");

        //需要将各个审批级别的下一个准备好(处理人构成环形)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceShcoolMasterApprover);
        viceShcoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
