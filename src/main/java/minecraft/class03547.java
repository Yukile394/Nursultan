package minecraft;

public record class03547(long delay, long period, String title, String message) {

   public String L() {
      return this.title;
   }

   public class03547(long delay, long period, String title, String message) {
      this.delay = delay != 0L ? delay : period;
      this.period = period;
      this.title = title;
      this.message = message;
   }

   public String u() {
      return this.message;
   }

   public long y() {
      return this.period;
   }

   public long N() {
      return this.delay;
   }
}
