package com.cdth17pm.doraiq;

public class LinhVuc {
    private String tenLinhVuc;

    public String getTenLinhVuc() {
        return tenLinhVuc;
    }

    public void setTenLinhVuc(String tenLinhVuc) {
        this.tenLinhVuc = tenLinhVuc;
    }
    public LinhVuc(){
    this.setTenLinhVuc("");
    }


    public LinhVuc(String tenLinhVuc){
     this.tenLinhVuc=tenLinhVuc;
    }

}
