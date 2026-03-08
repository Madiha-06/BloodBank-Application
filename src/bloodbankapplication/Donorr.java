/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodbankapplication;

/**
 *
 * @author Madiha
 */
import java.time.LocalDate;

public class Donorr extends User {
    private String donorid;
    private String bloodtype;
    private LocalDate lastDonationDate;

    public Donorr(String donorid,String name,long num,String bloodtype, LocalDate lastDonationDate) {
        super(name,num);
        this.donorid = donorid;
        this.bloodtype = bloodtype;
        this.lastDonationDate = lastDonationDate;
    }
   public String getdonorid(){return donorid;}
   public String getbloodtype(){return bloodtype;}
   public LocalDate getlastdate(){return lastDonationDate;}
    
    }