package JavaCodes.SingletonClass;

public class Database1 {
    private static Database1 dbObject;

    private Database1() {

    }

    public static Database1 getInstance() {
        //  create object if it's not already created
        if (dbObject == null) {
            dbObject = new Database1();
        }
        //  returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("Now connected to Database");
    }
}

class Main {
    public static void main(String[] args) {
        Database1 db1 = Database1.getInstance();
        db1.getConnection();
    }
}
