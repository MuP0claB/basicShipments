package christmass;

//Създайте софтуер за спедиторска компания, който да изпълнява следните функционалности:
//
//        Създаване на товарителница
//        Показване на всички товарителници
//        Проследяване на товарителница
//        Пренасочване на товарителница
//        Забавяне на доставка на товарителница
//        Отказване на товарителница
//        ----------------------------------------------------------

public class Shipment {

    private int number;
    private String recipient;
    private String recipientNumber;
    private String senderName;
    private int weight;
    private String location;
    private String deliveryDate;


    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipientNumber() {
        return recipientNumber;
    }

    public void setRecipientNumber(String recipientNumber) {
        this.recipientNumber = recipientNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
}
