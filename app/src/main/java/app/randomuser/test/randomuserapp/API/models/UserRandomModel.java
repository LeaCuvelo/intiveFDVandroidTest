package app.randomuser.test.randomuserapp.API.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by Lea on 28/11/17.
 */

public class UserRandomModel implements Serializable {

    @SerializedName("name")
    private PersonalDataModel personalData;
    @SerializedName("email")
    private String eMail;
    @SerializedName("login")
    private LoginDataModel loginData;
    @SerializedName("picture")
    private PicturesDataModel pictures;


    public PersonalDataModel getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalDataModel personalData) {
        this.personalData = personalData;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public LoginDataModel getLoginData() {
        return loginData;
    }

    public void setLoginData(LoginDataModel loginData) {
        this.loginData = loginData;
    }

    public PicturesDataModel getPictures() {
        return pictures;
    }

    public void setPictures(PicturesDataModel pictures) {
        this.pictures = pictures;
    }
}
