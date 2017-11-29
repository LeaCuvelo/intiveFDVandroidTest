package app.randomuser.test.randomuserapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import app.randomuser.test.randomuserapp.API.models.UserRandomModel;
import app.randomuser.test.randomuserapp.R;

/**
 * Created by Lea on 28/11/17.
 */

public class HomeUsersAdapter extends BaseAdapter {

    private List<UserRandomModel> mDataset;
    private Context context;
    private LayoutInflater inflater;


    public HomeUsersAdapter(List<UserRandomModel> mDataset, Context context) {
        this.mDataset = mDataset;
        this.context = context;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public Object getItem(int i) {
        return mDataset.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = inflater.inflate(R.layout.user_random_item, null);
        }


        ImageView thumbnail = (ImageView) view.findViewById(R.id.thumbnail);

        Picasso.with(context)
                .load(mDataset.get(i).getPictures().getThumbnailUrl().toString())
                .resize(200,200)
                .into(thumbnail);

        return view;
    }

    // ViewHolder //




}
