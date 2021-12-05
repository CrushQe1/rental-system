package entity;

import tasks.*;

public class RegisteredRenter extends User{

    private PropertyListings reference;
    private Preferences notificationPreferences; // must declare as a task

    public RegisteredRenter(String firstName, String lastName, String password, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = password;
        this.email = email;
        this.userID = increment();
        this.userType = "renter";
    }

    public void update() {

    }

   public void setPreferences(int bedrooms, int bathrooms, String type, Bool isFurnished , String quadrant){
       this.notificationPreferences = new Preferences(); // constructor must define this as well
   }

    
}
