package app.randomuser.test.randomuserapp.API.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lea on 28/11/17.
 */

public class PersonalDataModel implements Serializable {


    @SerializedName("first")
    private String firstName;
    @SerializedName("last")
    private String lastName;

    public PersonalDataModel() {
    }

    public PersonalDataModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
