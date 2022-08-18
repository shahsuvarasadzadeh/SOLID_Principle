package _SRP;

public class Vehicle {
        public static void main(String[] args) {

                Value.calculateValue();
                Details d =new Details();
                d.printDetails();
                DataBase db=new DataBase();
                db.addVehicleToDB();
        }
}
