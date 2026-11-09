package minecraft;

public record class01134(class01894 model, String layer) {
   public class01134(class01894 model, String layer) {
      super();
      this.model = model;
      this.layer = layer;
   }

   @Override
   public String toString() {
      return this.model + "#" + this.layer;
   }

   public String y() {
      return this.layer;
   }

   public class01894 N() {
      return this.model;
   }
}
