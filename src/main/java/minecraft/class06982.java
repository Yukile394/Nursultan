package minecraft;

public record class06982(class07211 direction, double distance) {

   public class06982(class07211 direction, double distance) {
      this.direction = direction;
      this.distance = distance;
   }

   public double y() {
      return this.distance;
   }

   public class07211 N() {
      return this.direction;
   }
}
