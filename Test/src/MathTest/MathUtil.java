package MathTest;

import java.math.BigDecimal;

public class MathUtil {
    /**
     * 瀵筪ouble鏁版嵁杩涜鍙栫簿搴�.
     * @param value  double鏁版嵁.
     * @param scale  绮惧害浣嶆暟(淇濈暀鐨勫皬鏁颁綅鏁�).
     * @param roundingMode  绮惧害鍙栧�兼柟寮�.
     * @return 绮惧害璁＄畻鍚庣殑鏁版嵁.
     */
    public static double round(double value, int scale,
                               int roundingMode) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, roundingMode);
        double d = bd.doubleValue();
        bd = null;
        return d;
    }


    /**
     * double 鐩稿姞
     * @param d1
     * @param d2
     * @return
     */
    public static double sum(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).doubleValue();
    }

    /**
     * double 鐩稿姞
     * @param d1
     * @param d2
     * @return
     */
    public static String sumToString(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).toString();
    }


    /**
     * double 鐩稿噺
     * @param d1
     * @param d2
     * @return
     */
    public static double sub(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.subtract(bd2).doubleValue();
    }

    /**
     * double 涔樻硶
     * @param d1
     * @param d2
     * @return
     */
    public static double mul(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.multiply(bd2).doubleValue();
    }


    /**
     * double 闄ゆ硶
     * @param d1
     * @param d2
     * @param scale 鍥涜垗浜斿叆 灏忔暟鐐逛綅鏁�
     * @return
     */
    public static double div(double d1,double d2,int scale){
        //  褰撶劧鍦ㄦ涔嬪墠锛屼綘瑕佸垽鏂垎姣嶆槸鍚︿负0锛�
        //  涓�0浣犲彲浠ユ牴鎹疄闄呴渶姹傚仛鐩稿簲鐨勫鐞�

        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.divide
                (bd2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
