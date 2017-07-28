package com.dvinfosys.cardviewdemo;

public class Contact {
    public Contact(int img_id,String name,String desc)
    {
        this.setImg(img_id);
        this.setName(name);
        this.setDesc(desc);
    }
    private int img;
    private String name,desc;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
