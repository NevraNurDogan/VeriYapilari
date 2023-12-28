
class Calisan {
    int id;
    String isim;
    String soyisim;
    int yas;
    int maas;
    Calisan next;

    public Calisan(int id, String isim, String soyisim, int yas, int maas) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.maas = maas;
        this.next = null;
    }
    public String toString() {
        return  + getId() + "\t"+ getIsim() + "\t"+ getSoyisim() + "\t"+ getYas() + "\t"+ getMaas() + "\t";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public Calisan getNext() {
        return next;
    }

    public void setNext(Calisan next) {
        this.next = next;
    }
}