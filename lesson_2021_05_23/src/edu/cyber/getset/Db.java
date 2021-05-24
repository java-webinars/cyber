package edu.cyber.getset;

/**
 GETTER & SETTER

 The Db class will have two private instance variables. Create those variables and provide
 public getters and setters for them. Note: A constructor is provided.

 Instance variables:

 data (String)
 yint (int)
 Methods:

 - getData()
 - getYint()
 - setData()
 - setYint()

 Example:

 Db db = new Db("aaa",123);

 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123

 db.setData("zzz");
 db.setYint(200);

 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200
 */

public class Db
{
    private String data;
    private int yint;

    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
