package Wlmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        ArrayList<PickTicketTo> pickTickets = new ArrayList<>();

        PickTicketTo pt1 = getPickTicket("ABCD", Arrays.asList("Z1", "Z5"), "hazmat1", 1, 2, 3);
        PickTicketTo pt2 = getPickTicket("EFGH", Arrays.asList("Z1", "Z3"), "hazmat2", 5, 2, 8);
        PickTicketTo pt3 = getPickTicket("POUY", Arrays.asList("Z6", "Z2"), "hazmat3", 1, 7, 3);
        PickTicketTo pt4 = getPickTicket("PIYS", Arrays.asList("Z3", "Z7"), "hazmat4", 5, 6, 7);

        pickTickets.add(pt1);
        pickTickets.add(pt2);
        pickTickets.add(pt3);
        pickTickets.add(pt4);

        System.out.println(FulfillmentPickStatusEnum.ATP.getCode());

        
          ArrayList<PutWallConfigEO> putWallConfigEOs = new ArrayList<>();
          
          PutWallConfigEO putWallConfigEO1 = getPutwallEos(50.0,'A'); PutWallConfigEO
          putWallConfigEO2 = getPutwallEos(35.0,'B'); PutWallConfigEO putWallConfigEO3
          = getPutwallEos(20.0,'C');
          
          putWallConfigEOs.add(putWallConfigEO1);
          putWallConfigEOs.add(putWallConfigEO2);
          putWallConfigEOs.add(putWallConfigEO3);
         

        for (PickTicketTo pickTicketTo : pickTickets) {
            System.out.println(pickTicketTo.getUtilization() + "******" + pickTicketTo.getZoneDiff());
        }

        PickTicketTo pickTicketInRequest = getPickTicket("FINA", Arrays.asList("Z3", "Z6"), "hazmat5", 4, 2, 3);

        for (PickTicketTo pickTicketTo : pickTickets.stream().collect(Collectors.toList())) {
            calculateZoneDiffByReplacing(pickTickets, pickTicketTo, pickTicketInRequest);
        }

        for (PickTicketTo pickTicketTo : pickTickets) {
            System.out.println(pickTicketTo.getUtilization() + "******" + pickTicketTo.getZoneDiff());
        }

    }

    private static PutWallConfigEO getPutwallEos(double volume, char type) {
        PutWallConfigEO putWallConfigEO = new PutWallConfigEO();
        putWallConfigEO.setVolume(volume);
        putWallConfigEO.setCubbyType(type);
        return putWallConfigEO;
    }

    private static void calculateZoneDiffByReplacing(ArrayList<PickTicketTo> pickTickets,
            PickTicketTo pickTicketOfExistingBatch, PickTicketTo pickTicketInRequest) {
        Set<String> uniquePickZonesBefore = pickTickets.stream().map(PickTicketTo::getPickZones).flatMap(List::stream)
                .collect(Collectors.toSet());

        pickTickets.remove(pickTicketOfExistingBatch);
        pickTickets.add(pickTicketInRequest);

        Set<String> uniquePickZonesAfterReplacing = pickTickets.stream().map(PickTicketTo::getPickZones)
                .flatMap(List::stream).collect(Collectors.toSet());

        pickTicketOfExistingBatch.setZoneDiff(uniquePickZonesBefore.size() - uniquePickZonesAfterReplacing.size());

        pickTickets.remove(pickTicketInRequest);
        pickTickets.add(pickTicketOfExistingBatch);
    }

    private static PickTicketTo getPickTicket(String pickTicketId, List<String> pickZones, String processPathName,
            int width, int height, int length) {
        PickTicketTo pickTicketTo = new PickTicketTo();
        pickTicketTo.setPickTicketId(pickTicketId);
        pickTicketTo.setPickZones(pickZones);
        pickTicketTo.setProcessPathName(processPathName);
        pickTicketTo.setWidth(width);
        pickTicketTo.setHeight(height);
        pickTicketTo.setLength(length);
        return pickTicketTo;
    }

}