/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodbankapplication;

/**
 *
 * @author Madiha
 */
public class Recipientt extends User {
    private String recipientId;
    private String bloodTypeNeeded;
    private String hospital;

    public Recipientt(String recipientId,String name,long num, String bloodTypeNeeded, String hospital) {

        super( name,num);
        this.recipientId = recipientId;
        this.bloodTypeNeeded = bloodTypeNeeded;
        this.hospital = hospital;
    }
    public String getRecipientId(){return recipientId;}
    public String getbloodtype(){return bloodTypeNeeded;}
    public String gethospital(){return hospital;}
    }