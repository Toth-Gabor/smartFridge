package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Shelf
{
    protected int limit;
    protected List<Food> foods;
    private int buffer;
    
    
    public Shelf() {
        this.limit = 5;
        this.foods = new ArrayList<>();
    }
    
    public boolean isFull() {
        if (foods.size() == limit){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty(){
        if (foods.size() == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public int getLimit() {
        return this.limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public List<Food> getFoods() {
        return this.foods;
    }
    
    public void removeFoodById(int id){
        
        for (int i = 0; i < this.foods.size(); i++) {
            if (this.foods.get(i).getId() == id){
                buffer = i;
            }
        }
        this.foods.remove(buffer);
    }
    
    @Override
    public String toString() {
        if (isEmpty()){
            return "The shelf is empty!";
        } else {
            String result = "shelf: \n";
            for (Food food : foods) {
                result += food + "\n";
            }
            return result;
        }
    }
}
