package com.example.pizzaview.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.pizzaview.R;
import com.example.pizzaview.classes.Pizza;

import java.util.List;



public class PizzaAdapter extends BaseAdapter {
    private List<Pizza> pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Pizza> produits, Activity activity) {
        this.pizzas =produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        return pizzas.size();
    }

    @Override
    public Object getItem(int position) {

        return pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {

        return pizzas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.ng);
        ImageView photo = convertView.findViewById(R.id.p1);
        TextView duree = convertView.findViewById(R.id.time);


        nom.setText(pizzas.get(position).getNom());
        nbrIngredients.setText(pizzas.get(position).getNbrIngredients()+"");
        photo.setImageResource(pizzas.get(position).getPhoto());
        duree.setText(pizzas.get(position).getDuree());

        return convertView;
    }
}
