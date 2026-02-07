package Interface;

interface Database {
    void connect();
    void save(String data);
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    public void save(String data) {
        System.out.println("Saved to MySQL: " + data);
    }
}

class MongoDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }

    public void save(String data) {
        System.out.println("Saved to MongoDB: " + data);
    }
}

public class DataService {
    public static void main(String[] args) {
        Database db = new MongoDatabase();
        db.connect();
        db.save("User data");
    }
}
