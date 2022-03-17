package model;

public class Counter {
    private static int itemCount;

    public Counter(int itemCount) {
        itemCount = itemCount;
        zeroCounter();
    }

    public void zeroCounter() {
        setItemCount(0);
    }

    public void counterIncrement() {
        setItemCount(returnCounterValue() + 1);
    }

    public int returnCounterValue() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
