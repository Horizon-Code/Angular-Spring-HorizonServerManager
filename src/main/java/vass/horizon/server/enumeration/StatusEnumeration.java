package vass.horizon.server.enumeration;

public enum StatusEnumeration {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;

    StatusEnumeration(String status) {
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
