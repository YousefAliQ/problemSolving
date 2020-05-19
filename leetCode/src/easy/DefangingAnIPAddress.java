package easy;

import java.util.stream.Stream;

public class DefangingAnIPAddress {

    public static  String  defangIPaddr(String address) {


    if (address == null) return "";
    if (address.length() == 0) return "";
    if (!address.contains(".")) return "";

    String retVal = "";
    int current = address.indexOf('.');
    while (address.length() != 0 && current > 0){
        retVal += address.substring(0,current);
        retVal += "[.]";
        address = address.substring(current+1, address.length());
        current = address.indexOf('.');
    }
    retVal += address;
    return retVal;

    }
}
