package Wlmt;

public enum FulfillmentPickStatusEnum {



    WFR(1,"Waiting For Replenishment"),
    ATR(2,"Available To Release"),
    RELEASE_IN_PROGRESS (4,"Release In Progress"),
    ATP(8,"Available To Pick"),
    ASSIGNED(16,"Pick Assigned"),
    PICKED (32,"Picked");

    int code;
    String description;

    FulfillmentPickStatusEnum(int code, String description) {
        this.code=code;
        this.description=description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static FulfillmentPickStatusEnum getPickStatusCodeEnum(int code){
        for(FulfillmentPickStatusEnum pe: FulfillmentPickStatusEnum.values()){
            if(pe.getCode()==code){
                return pe;
            }
        }
        return FulfillmentPickStatusEnum.PICKED;
    }

}
