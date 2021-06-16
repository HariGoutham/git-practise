package Wlmt;

import java.util.List;

public class PickTicketTo {

    private String pickTicketId;
    private List<String> pickZones;
    private String processPathName;
    private int zoneDiff;
    private double utilization;
    private int width;
    private int height;
    private int length;

    public int getZoneDiff() {
        return zoneDiff;
    }

    public void setZoneDiff(int zoneDiff) {
        this.zoneDiff = zoneDiff;
    }

    public double getUtilization() {
        return utilization;
    }

    public void setUtilization(double utilization) {
        this.utilization = utilization;
    }

    public String getPickTicketId() {
        return pickTicketId;
    }

    public void setPickTicketId(String pickTicketId) {
        this.pickTicketId = pickTicketId;
    }

    public List<String> getPickZones() {
        return pickZones;
    }

    public void setPickZones(List<String> pickZones) {
        this.pickZones = pickZones;
    }

    public String getProcessPathName() {
        return processPathName;
    }

    public void setProcessPathName(String processPathName) {
        this.processPathName = processPathName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
