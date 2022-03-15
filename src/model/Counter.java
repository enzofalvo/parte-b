package model;

public class Counter {
    private int itemCount;

    public Counter(int itemCount) {
        this.itemCount = itemCount;
        zeroCounter();
    }

    private void zeroCounter() {
        setItemCount(0);
    }

    private void counterIncrement() {
        setItemCount(returnCounterValue() + 1);
    }

    public int returnCounterValue() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
