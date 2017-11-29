package app.randomuser.test.randomuserapp.API.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lea on 28/11/17.
 */

public class APIResultModel implements Serializable{


    @SerializedName("results")
    private List<UserRandomModel> items;

    public APIResultModel() {
    }

    public APIResultModel(List<UserRandomModel> items) {
        this.items = items;
    }

    public List<UserRandomModel> getItems() {
        return items;
    }

    public void setItems(List<UserRandomModel> items) {
        this.items = items;
    }


}
