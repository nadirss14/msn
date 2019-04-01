package com.nadirss14.msn.views.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nadirss14.msn.R;
import com.nadirss14.msn.adapter.RecyclerViewAdapter;
import com.nadirss14.msn.model.SimpleCard;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar(getResources().getString(R.string.menu_option_home),false,view);

        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.recycler_card);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(buildPicture(),R.layout.cardview_simple,getActivity());

        recyclerView.setAdapter(adapter);

        return view;
    }

    public ArrayList<SimpleCard> buildPicture(){
         ArrayList<SimpleCard> _simpleCard=new ArrayList<>();
         _simpleCard.add(new SimpleCard("https://i.ytimg.com/vi/hW9PUzl7j9w/maxresdefault.jpg","Paisaje 1","","1 dia","10"));
        _simpleCard.add(new SimpleCard("https://mott.pe/noticias/wp-content/uploads/2016/11/Janette-Asche.jpg","Paisaje 2","","2 dia","20"));
        _simpleCard.add(new SimpleCard("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7B_XkmN1JqS-d5rh70xwycsTCEPS8TcZFEQ3qKI2jmDFh_opE","Paisaje 3","","1 dia","10"));
        _simpleCard.add(new SimpleCard("https://cronicaglobal.elespanol.com/uploads/s1/36/29/99/6/paisaje-bonito-playa-de-las-catedrales-lugo.png","Paisaje 4","","1 dia","10"));

         return _simpleCard;
    }

    public void showToolbar(String _title,boolean _backUp,View view){
        Toolbar tollbar=(Toolbar) view.findViewById(R.id.my_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(tollbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(_title);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(_backUp);

    }
}
