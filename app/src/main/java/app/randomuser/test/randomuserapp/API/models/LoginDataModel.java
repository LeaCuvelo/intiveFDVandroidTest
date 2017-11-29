package app.randomuser.test.randomuserapp.API.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Lea on 28/11/17.
 */

public class LoginDataModel implements Serializable {


    @SerializedName("username")
    private String username;

    public LoginDataModel() {
    }

    public LoginDataModel(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
