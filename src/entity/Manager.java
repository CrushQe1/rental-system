package entity;

import tasks.*;

public class Manager extends User{

    private SummaryReport Summary;
    private PropertyController propertyController;

    public Manager(String firstName, String lastName, String password, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = password;
        this.email = email;
        this.userID = increment();
        this.userType = "manager";
    }

    public void getSummary(int start, int end) {

        this.Summary = new SummaryReport();

    }

    public void updateProperty(String status, PropertyController propertyController) {

        propertyController.updateStatus(status);
    }

    public void updateFee(int fee, int period) {
       // fee function
    }


    
}
