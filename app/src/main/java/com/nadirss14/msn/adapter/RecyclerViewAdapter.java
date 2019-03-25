package com.nadirss14.msn.adapter;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.nadirss14.msn.R;
import com.nadirss14.msn.model.SimpleCard;

import java.net.URL;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<SimpleCard> _simpleCard;
    private int _resource;
    private Activity _activity;

    public RecyclerViewAdapter(ArrayList<SimpleCard> _simpleCard, int _resource, Activity _activity) {
        this._simpleCard = _simpleCard;
        this._resource = _resource;
        this._activity = _activity;
    }


    //Se trabajara la creacion de los objetos
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup _viewGroup, int i) {
        //inflate es similar al include del XML y al replace de los fragmentos
        View view= LayoutInflater.from(_viewGroup.getContext()).inflate(_resource,_viewGroup,false);
        //Se retorna la vista en la clase inner
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder _myViewHolder, int _position) {
        SimpleCard simpleCard=_simpleCard.get(_position);

        _myViewHolder._card_title.setText(simpleCard.getCard_title());
        _myViewHolder._first_word.setText(simpleCard.getFirst_word());
        _myViewHolder._num_like.setText(simpleCard.getNum_like());
        _myViewHolder._time_img.setText(simpleCard.getTime_img());
      // _myViewHolder._img_card.setImageURI (new );

    }

    @Override
    public int getItemCount() {
        return _simpleCard.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView _img_card;
        private TextView _card_title;
        private TextView _first_word;
        private TextView _time_img;
        private TextView _num_like;

        private CheckBox _check_like;

        public MyViewHolder(@NonNull View _itemView) {
            super(_itemView);

            _img_card=(ImageView) _itemView.findViewById(R.id.img_card);
            _card_title=(TextView) _itemView.findViewById(R.id.card_title);
            _first_word=(TextView) _itemView.findViewById(R.id.first_word);
            _time_img=(TextView) _itemView.findViewById(R.id.time_img);
            _num_like=(TextView) _itemView.findViewById(R.id.num_like);
            _check_like=(CheckBox) _itemView.findViewById(R.id.check_like);


        }
    }
}
