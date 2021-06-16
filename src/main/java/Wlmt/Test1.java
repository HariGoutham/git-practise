package Wlmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        ArrayList<PickTicketTo> pickTickets = new ArrayList<>();

        PickTicketTo pt1 = getPickTicket("ABCD", Arrays.asList("Z1", "Z5"), "hazmat1",1,2,3,1,-34);
        PickTicketTo pt2 = getPickTicket("EFGH", Arrays.asList("Z1", "Z3"), "hazmat2",5,2,8,2,-45);
        PickTicketTo pt3 = getPickTicket("POUY", Arrays.asList("Z6", "Z2"), "hazmat3",1,7,3,0,45);
        PickTicketTo pt4 = getPickTicket("PIYS", Arrays.asList("Z3", "Z7"), "hazmat4",5,6,7,0,98);
        PickTicketTo pt5 = getPickTicket("PIYS", Arrays.asList("Z3", "Z7"), "hazmat4",5,6,7,1,12);

        pickTickets.add(pt1);
        pickTickets.add(pt2);
        pickTickets.add(pt3);
        pickTickets.add(pt4);
        pickTickets.add(pt5);
        
        for(PickTicketTo pickTicketTo :pickTickets) {
            System.out.println(pickTicketTo.getZoneDiff() + "*****************" + pickTicketTo.getUtilization());
        }
        
        List<PickTicketTo> pickTickets1 = pickTickets.stream()
                .sorted(Comparator.comparingDouble(PickTicketTo::getUtilization).reversed())
                .sorted(Comparator.comparingInt(PickTicketTo::getZoneDiff).reversed()).collect(Collectors.toList());
        
        for(PickTicketTo pickTicketTo :pickTickets1) {
            System.out.println(pickTicketTo.getZoneDiff() + "*****************" + pickTicketTo.getUtilization());
        }

    }
    
    private static PickTicketTo getPickTicket(String pickTicketId, List<String> pickZones, String processPathName,int width, int height, int length,int zoneDiff, double utilisation) {
        PickTicketTo pickTicketTo = new PickTicketTo();
        pickTicketTo.setPickTicketId(pickTicketId);
        pickTicketTo.setPickZones(pickZones);
        pickTicketTo.setProcessPathName(processPathName);
        pickTicketTo.setWidth(width);
        pickTicketTo.setHeight(height);
        pickTicketTo.setLength(length);
        pickTicketTo.setZoneDiff(zoneDiff);
        pickTicketTo.setUtilization(utilisation);
        return pickTicketTo;
    }

}