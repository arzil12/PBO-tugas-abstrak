public abstract class Pembayaran {

    String color;

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    abstract double getMoney();

    }


