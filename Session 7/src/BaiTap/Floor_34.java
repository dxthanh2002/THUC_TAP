package BaiTap;

public class Floor_34 {

    public static class Floor {
        private double length;
        private double width;
        public Floor(double length,double width){
            this.length = (length<0)?0:length;
            this.width = (width<0)?0:width;
        }
        public double getArea(){
            return(this.length*this.width) ;
        }
    }
    public static class Carpet {
        private double cost;
        public Carpet(double cost){
            this.cost = (cost<0)?0:cost;
        }
        public double getCost(){
            return cost;
        }
    }
    public static class Calculator {
        private Floor floor;
        private Carpet carpet;
        public Calculator(Floor floor,Carpet carpet){
            this.floor = floor;
            this.carpet = carpet;
        }
        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }



}
