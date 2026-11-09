package minecraft;

public record class06613(double x, double y, class06595 buttonInfo) implements class06611 {
   public class06613(double x, double y, class06595 buttonInfo) {
      super();
      this.x = x;
      this.y = y;
      this.buttonInfo = buttonInfo;
   }

   public double n() {
      return this.x;
   }

   public double t() {
      return this.y;
   }

   public int v() {
      return this.G().v();
   }

   @Override
   public int y() {
      return this.G().y();
   }

   @Override
   public int N() {
      return this.v();
   }

   public class06595 G() {
      return this.buttonInfo;
   }
}
