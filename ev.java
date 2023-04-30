public class ev {
    int odaSayisi;
    int metreKare;
    int kira;

    public ev() {
        this.odaSayisi=1;
        this.metreKare=50;
        this.kira=4500;

    }
    public ev(int odaSayisi,int kira){
        this.odaSayisi=odaSayisi;
        this.kira=kira;
    }
    public ev(int odaSayisi,int metreKare,int kira){
        this.odaSayisi=odaSayisi;
        this.metreKare=metreKare;
        this.kira=kira;
    }

}
