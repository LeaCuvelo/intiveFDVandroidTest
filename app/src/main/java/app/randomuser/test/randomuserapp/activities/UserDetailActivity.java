package app.randomuser.test.randomuserapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import app.randomuser.test.randomuserapp.API.models.UserRandomModel;
import app.randomuser.test.randomuserapp.R;
import app.randomuser.test.randomuserapp.utils.Constants;
import butterknife.BindView;
import butterknife.ButterKnife;

public class UserDetailActivity extends AppCompatActivity {

    public static String USER_TAG = "User_data";
    @BindView(R.id.main_image)
    ImageView mainImage;
    @BindView(R.id.username)
    TextView username;
    @BindView(R.id.first_name)
    TextView firstName;
    @BindView(R.id.last_name)
    TextView lastName;
    @BindView(R.id.email)
    TextView email;
    @BindView(R.id.text_container)
    LinearLayout textContainer;
    private UserRandomModel dataToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getExtras();
    }

    public void getExtras() {
        dataToShow = (UserRandomModel) getIntent().getExtras().getSerializable(USER_TAG);
        if (dataToShow != null) {
            loadDetails(dataToShow);
        } else {
            Toast.makeText(this, Constants.ERROR_MESSAGE.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    private void loadDetails(UserRandomModel dataToShow) {


        Picasso.with(this)
                .load(dataToShow.getPictures().getLargeUrl())
                .resize(200,200)
                .into(mainImage);

        username.setText(dataToShow.getLoginData().getUsername());
        firstName.setText(dataToShow.getPersonalData().getFirstName());
        lastName.setText(dataToShow.getPersonalData().getLastName());
        email.setText(dataToShow.geteMail());

    }
}
