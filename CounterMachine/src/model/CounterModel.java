package model;

public class CounterModel {
    private int value;

    public CounterModel() {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void up(){
        this.value++;
    }
    public void down(){
        this.value--;
    }
    public void reset(){
        this.value =0;
    }
}
