package dao;

public class VertragspartnerDAO {
    private final String CLASSNAME = "org.sqlitte.JDBC";
    private final  String CONNECTIONSTRING=    "   jbdc:sqlite:Kaufvertrag/src/data/Java Datenbank.db  "   ;
    public VertragspartnerDAO() throws ClassCastException, ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
}
