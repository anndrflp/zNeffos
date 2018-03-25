/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects.People;

/**
 *
 * @author Usuário
 */
public class People {
    
    private String name = "";
    private String cpf = "";
    private String phone = "";
    private String email = "";
    
    public People(String name, String cpf, String phone, String email){
        setName(name);
        setCpf(cpf);
        setPhone(phone);
        setEmail(email);    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
