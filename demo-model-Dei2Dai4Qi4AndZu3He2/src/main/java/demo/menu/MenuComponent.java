package demo.menu;

import demo.iterator.MyIterator;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }
    public void print(String prefx){
        throw new UnsupportedOperationException();
    }
    public abstract void setPrefx(String name);

    public abstract MyIterator createIterator();
}
