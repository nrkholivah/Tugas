class Pegawai{
    private String nama;
    private int gaji;

    public Pegawai (String nama, int gaji){
    this.nama = nama;
    this.gaji = gaji;
    }
    public int infoGaji(){
        return gaji;
    }
}
class Manajer extends Pegawai{
    private int tunjangan;
    public int infoTunjangan;
    public Manajer(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
}
class Programmer extends Pegawai{
    private int bonus;
    public Programmer (String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    public int infoBonus(){
        return bonus;
    }
}