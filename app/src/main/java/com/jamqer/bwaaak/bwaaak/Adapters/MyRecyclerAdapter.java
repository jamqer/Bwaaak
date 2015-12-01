package com.jamqer.bwaaak.bwaaak.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jamqer.bwaaak.bwaaak.Model.Photo;
import com.jamqer.bwaaak.bwaaak.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
    private final Context context;
    private final List<Photo> ListOfPictures;

    public MyRecyclerAdapter(Context context, List<Photo> listOfImages) {
        this.context = context;
        ListOfPictures = listOfImages;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customgrid_item, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        Picasso.with(context).load(ListOfPictures.get(position).getImageUrl()).resize(160,160).into(viewHolder.imgViewIcon);


    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {


        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.icon);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return ListOfPictures.size();
    }
}
