package study.qa.data;

public class Application {

    private String innerId;
    private String address;
    private String slot;

    public Application(String innerId, String address, String slot) {
        this.innerId = innerId;
        this.address = address;
        this.slot = slot;
    }

    public String getInnerId() {
        return innerId;
    }

    public String getAddress() {
        return address;
    }

    public String getSlot() {
        return slot;
    }
}
