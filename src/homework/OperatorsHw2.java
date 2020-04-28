package homework;

/* 2) Implement code to convert temperature values using below formulae:
°F = 9/5 ( °C) + 32
°F = 9/5 (K - 273) + 32
K = °C + 273
°C = K - 273
K = 5/9 (° F - 32) + 273

 */
public class OperatorsHw2 {
    public static void main(String[] args) {
      /**°F = 9/5 ( °C) + 32
    */
        double cTemp = 24.0;
        double fTemp = (9 * cTemp)/5.0 + 32;

        System.out.println("Celsius to Fahrenheit -> " + fTemp + " F ");


     /** °F = 9/5 (K - 273) + 32
     */
        double kTemp = 34.0 ;
        double fTem = 9 * (kTemp - 273) / 5.0 + 32;
        System.out.println("Kelvin to Fahrenheit -> " + fTem + " F ");


        /**  K = °C + 273

         */
        double celTem = 44.0 ;
        double kTem = celTem + 273.0 ;
        System.out.println("Celsius to Kelvin -> " + kTem + " K ");


        /** °C = K - 273

         */
        double kemTem = 21.0;
        double cemTem = kemTem - 273.0 ;
        System.out.println("Kelvin to Celsius -> " + cemTem  + " C ");


        /**  K = 5/9 (° F - 32) + 273

         */

        double fernTemp = 55 ;
        double kelvinTemp = 5 * ( fernTemp -32 ) /9 + 273 ;
        System.out.println("Fahrenheit to Kelvin -> " + kelvinTemp + " K " );





    }



}
