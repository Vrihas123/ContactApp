package com.vrihas.lenovo.contactmanager;

/**
 * Created by lenovo on 3/25/2017.
 */

public class Contact {
    private String _name,_phone,_email,_adress;
    public Contact(String name,String phone,String email,String address){
        _name = name;
        _phone = phone;
        _email = email;
        _adress = address;
    }
    public String getName(){
        return  _name;
    }
    public  String getPhone(){
        return _phone;
    }
    public String getEmail(){
        return  _email;
    }
    public String getAdress(){
        return _adress;
    }
}
