/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects.Adress;

/**
 *
 * @author Usuário
 */
public class Adress {
    
    private String adress = "";
    private String street = "";
    private String bairro = "";
    private String number = "";
    
    public Adress(String adress, String street, String bairro, String number) {
        setAdress(adress);
        setStreet(street);
        setBairro(bairro);
        setNumber(number);
    }
        
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



}
