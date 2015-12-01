package com.jamqer.bwaaak.bwaaak.Adapters;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jamqer.bwaaak.bwaaak.Model.Photo;
import com.jamqer.bwaaak.bwaaak.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;


/**
 * Created by Piotras on 2015-11-29.
 */
public class CustomGridViewAdapter extends BaseAdapter {


        private final Context context;
        private final List<Photo> ListOfPictures;

        public CustomGridViewAdapter(Context context, List<Photo> listOfImages) {
            this.context = context;
            ListOfPictures = listOfImages;

        }


        @Override
        public int getCount() {
            return ListOfPictures.size();
        }

        @Override
        public Object getItem(int position) {
            return ListOfPictures.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view;

            if(convertView == null){
                view = LayoutInflater.from(context).inflate(R.layout.customgrid_item, parent, false);
            }else view = convertView;

            ImageView imageView = (ImageView) view.findViewById(R.id.icon);

            Picasso.with(context).load(ListOfPictures.get(position).getImageUrl()).resize(50,50).into(imageView);


            return view;
        }

}
