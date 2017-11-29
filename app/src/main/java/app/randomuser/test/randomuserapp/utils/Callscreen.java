package app.randomuser.test.randomuserapp.utils;

import android.app.Activity;
import android.content.Intent;

import app.randomuser.test.randomuserapp.API.models.UserRandomModel;
import app.randomuser.test.randomuserapp.activities.UserDetailActivity;

/**
 * Created by Lea on 28/11/17.
 */

public class Callscreen {


    public static void goToDetail(Activity mActivity, UserRandomModel data) {
        Intent i = new Intent(mActivity, UserDetailActivity.class);
        i.putExtra(UserDetailActivity.USER_TAG, data);
        mActivity.startActivity(i);
    }

}
