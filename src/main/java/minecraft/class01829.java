package minecraft;

public record class01829(int version, String series) {
   public static final String N = "main";

   public String L() {
      return this.series;
   }

   public class01829(int version, String series) {
      this.version = version;
      this.series = series;
   }

   public int y() {
      return this.version;
   }

   public boolean N() {
      return !this.series.equals("main");
   }

   public boolean N(class01829 var1) {
      return class07529.v ? true : this.L().equals(var1.L());
   }
}
