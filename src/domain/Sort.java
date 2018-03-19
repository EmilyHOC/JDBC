package domain;

public class Sort {
    private int sid;
    private String sname;
    private int sprice;
    private String sdesc;



    public Sort(int sid, String sname, int sprice, String sdesc){
        this.sid=sid;
        this.sname=sname;
        this.sprice=sprice;
        this.sdesc=sdesc;
    }
    public Sort(){

    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSprice() {
        return  sprice;
    }

    public String getSdesc() {
        return sdesc;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSprice(int  sprice) {
        this.sprice = sprice;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sprice=" + sprice +
                ", sdesc='" + sdesc + '\'' +
                '}';
    }
}
