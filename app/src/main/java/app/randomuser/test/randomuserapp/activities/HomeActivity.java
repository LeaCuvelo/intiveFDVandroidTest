package app.randomuser.test.randomuserapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import app.randomuser.test.randomuserapp.API.APIService;
import app.randomuser.test.randomuserapp.API.models.APIResultModel;
import app.randomuser.test.randomuserapp.API.models.UserRandomModel;
import app.randomuser.test.randomuserapp.R;
import app.randomuser.test.randomuserapp.adapters.HomeUsersAdapter;
import app.randomuser.test.randomuserapp.utils.Callscreen;
import app.randomuser.test.randomuserapp.utils.Constants;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.main_grid_view)
    GridView mainGridView;

    private HomeUsersAdapter mAdapter;
    private Activity mActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mActivity = this;
        getRandomUsers();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void getRandomUsers() {
        APIService randomUsersAPI = APIService.retrofit.create(APIService.class);

        final Call<APIResultModel> call =
                randomUsersAPI.getRandomUsersWithQuantity(Constants.RANDOM_USER_QUANTITY);

        call.enqueue(new Callback<APIResultModel>() {
            @Override
            public void onResponse(Call<APIResultModel> call, Response<APIResultModel> response) {
                setContent(response.body().getItems());
            }

            @Override
            public void onFailure(Call<APIResultModel> call, Throwable t) {
                Toast.makeText(HomeActivity.this, Constants.ERROR_MESSAGE.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setContent(List<UserRandomModel> items) {
        mAdapter = new HomeUsersAdapter(items, this);
        mainGridView.setAdapter(mAdapter);
        setItemClickListener();

    }

    private void setItemClickListener() {
        mainGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Callscreen.goToDetail(mActivity, (UserRandomModel) mainGridView.getAdapter().getItem(position));

            }
        });
    }

}
