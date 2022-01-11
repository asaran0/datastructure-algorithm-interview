package algo.dynamic;

import ds.linkedList.DoublyLL;

import java.text.DecimalFormat;

public class DynamicExamples {
    public static void main(String [] ar) {

        System.out.println(getRoundOffValue(2));
        System.out.println(getRoundOffValue(20));
        System.out.println(getRoundOffValue(102));
        System.out.println(getRoundOffValue(1022));
        System.out.println(getRoundOffValue(10222.212331));
        System.out.println(getRoundOffValue("1022222222222222"));
        System.out.println(getRoundOffValue(10222.212331));

    }
    public static String getRoundOffValue(Double value){
        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,###.00");
        return df.format(value);
    }
    public static String getRoundOffValue(Long value){
        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,###");
        return df.format(value);
    }
    public static String getRoundOffValue(Integer value){
        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,###");
        return df.format(value);
    }
    public static String getRoundOffValue(String value){
        Double d = Double.parseDouble(value);
        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,###");
        return df.format(d);
    }
    private void printUglyNos(int n) {
        
    }
}
