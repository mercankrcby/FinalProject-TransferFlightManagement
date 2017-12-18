package com.mercankrcby;

import java.util.ArrayList;

/**
 * Created by Mercan on 18.12.2017.
 */
public class AbroadToUnbondedDomesticFilghts extends FlightType{
    public GatesAndOperationCenters goc;
    public ArrayList<GatesAndOperationCenters> gocList;
    public AbroadToUnbondedDomesticFilghts(int arrivalGateNumber,int departureGateNumber) {
        this.gateNumberArrival=arrivalGateNumber;
        this.gateNumberDeparture=departureGateNumber;
    }
    public void Operation()
    {
        int distance=0;
        goc=new GatesAndOperationCenters();
        gocList=new ArrayList<GatesAndOperationCenters>();
        gocList=goc.fillGateOCList();
        for(int i=0;i<gocList.size();++i)
        {
            if(gocList.get(i).gateNumber==gateNumberArrival && gocList.get(i).operationCenterName=="PasaportControlCenter")
            {
                distance+=gocList.get(i).distance;
            }
        }
        distance+=goc.pasaportToCheckIn;
        distance+=goc.checkInToLuggage;
        for(int i=0;i<gocList.size();++i)
        {
            if(gocList.get(i).gateNumber==gateNumberDeparture && gocList.get(i).operationCenterName=="LuggageTakingCenter")
            {
                distance+=gocList.get(i).distance;
            }
        }

    }
}
