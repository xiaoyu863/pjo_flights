package cn.qphone.MyFlight.pojo;

/**
 *
 * 用户类
 * 起飞时间/降落时间
 * 起飞机场/降落机场
 * 飞行时长
 * 终点机场
 *
 */
public class User {
   private String airline;
   private String types2;
   private String take_time;
   private String landing_time;
   private String airport_name_take;
   private String airport_name_landing;
   private String flight_time;
   private String stop_airport;
   private String a;
   private String b;
   private String c;

    public User(String airline, String types2, String take_time, String landing_time, String airport_name_take, String airport_name_landing, String flight_time, String stop_airport, String a, String b, String c) {
        this.airline = airline;
        this.types2 = types2;
        this.take_time = take_time;
        this.landing_time = landing_time;
        this.airport_name_take = airport_name_take;
        this.airport_name_landing = airport_name_landing;
        this.flight_time = flight_time;
        this.stop_airport = stop_airport;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public User() {

    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTypes2() {
        return types2;
    }

    public void setTypes2(String types2) {
        this.types2 = types2;
    }

    public String getTake_time() {
        return take_time;
    }

    public void setTake_time(String take_time) {
        this.take_time = take_time;
    }

    public String getLanding_time() {
        return landing_time;
    }

    public void setLanding_time(String landing_time) {
        this.landing_time = landing_time;
    }

    public String getAirport_name_take() {
        return airport_name_take;
    }

    public void setAirport_name_take(String airport_name_take) {
        this.airport_name_take = airport_name_take;
    }

    public String getAirport_name_landing() {
        return airport_name_landing;
    }

    public void setAirport_name_landing(String airport_name_landing) {
        this.airport_name_landing = airport_name_landing;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public String getStop_airport() {
        return stop_airport;
    }

    public void setStop_airport(String stop_airport) {
        this.stop_airport = stop_airport;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "User{" +
                "airline='" + airline + '\'' +
                ", types2='" + types2 + '\'' +
                ", take_time='" + take_time + '\'' +
                ", landing_time='" + landing_time + '\'' +
                ", airport_name_take='" + airport_name_take + '\'' +
                ", airport_name_landing='" + airport_name_landing + '\'' +
                ", flight_time='" + flight_time + '\'' +
                ", stop_airport='" + stop_airport + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
