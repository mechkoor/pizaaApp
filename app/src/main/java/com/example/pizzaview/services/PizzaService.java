package com.example.pizzaview.services;

import android.util.Log;

import com.example.pizzaview.classes.Pizza;

import java.util.ArrayList;
import java.util.List;


import com.example.pizzaview.dao.IDao;

public class PizzaService implements IDao<Pizza> {

    private List<Pizza> pizzas;

    public PizzaService() {
        this.pizzas = new ArrayList<>();
    }

    @Override
    public boolean create(Pizza o) {
        Log.d("Create : ", o.toString());
        return pizzas.add(o);
    }

    @Override
    public Pizza findById(int id) {
        Log.d("FindById : ", id+"");
        for(Pizza f : pizzas)
            if(f.getId() == id)
                return f;
        return null;
    }

    @Override
    public List<Pizza> findAll() {
        Log.d("findAll : ", pizzas.size()+"");
        return pizzas;
    }

    @Override
    public boolean delete(Pizza o) {
        Log.d("Delete : ", o.toString());
        return pizzas.remove(o);
    }

    @Override
    public boolean update(Pizza o) {
        Pizza f = findById(o.getId());
        f.setNom(o.getNom());
        f.setPhoto(o.getPhoto());
        f.setDescription(o.getDescription());
        return false;
    }
}