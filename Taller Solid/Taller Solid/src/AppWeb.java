public class AppWeb implements Database, Authenticator{
    private final Authenticator auth;
    private final Database db;

    public AppWeb (Authenticator auth, Database db) {
        this.auth = auth;
        this.db = db;
        // Logic
    }
    
    public void start() {
        db.connect();
        auth.login();
    }

    public void connect(){

    }

    public void login(){
        
    }
}
