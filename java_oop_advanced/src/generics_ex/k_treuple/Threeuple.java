package generics_ex.k_treuple;

public class Threeuple<A, B, C > {
    private A item1;
    private B item2;
    private C item3;

    public Threeuple(A item1, B item2, C item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public A getItem1() {
        return item1;
    }

    public void setItem1(A item1) {
        this.item1 = item1;
    }

    public B getItem2() {
        return item2;
    }

    public void setItem2(B item2) {
        this.item2 = item2;
    }

    public C getItem3() {
        return item3;
    }

    public void setItem3(C item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",
                String.valueOf(this.getItem1()),
                String.valueOf(this.getItem2()),
                String.valueOf(this.getItem3()));
    }
}
