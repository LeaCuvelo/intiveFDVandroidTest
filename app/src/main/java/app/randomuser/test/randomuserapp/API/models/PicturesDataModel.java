package app.randomuser.test.randomuserapp.API.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Lea on 28/11/17.
 */

public class PicturesDataModel implements Serializable {

    @SerializedName("large")
    private String largeUrl;
    @SerializedName("medium")
    private String mediumUrl;
    @SerializedName("thumbnail")
    private String thumbnailUrl;



    public String getLargeUrl() {
        return largeUrl;
    }

    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
