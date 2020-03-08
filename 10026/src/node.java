    public class node {
        private String color;
        private boolean meet;
    int x, y;

    public node(String color, int x, int y){
        this.color = color;
        this.meet = false;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "this node/color:" + color + ",x:" + x + ",y:" + y;
    }

    public boolean isMeet() {
        return meet;
    }

    public void setMeet(boolean meet) {
        this.meet = meet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }
}
