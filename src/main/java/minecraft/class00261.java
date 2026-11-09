package minecraft;

public record class00261(float yRot, boolean relativeY, float xRot, boolean relativeX) implements class00381<class07280> {
   public static final class02362<class00667, class00261> N = class02362.N(
      class02389.E, class00261::N, class02389.y, class00261::y, class02389.E, class00261::L, class02389.y, class00261::u, class00261::new
   );

   public float L() {
      return this.xRot;
   }

   public class00261(float yRot, boolean relativeY, float xRot, boolean relativeX) {
      super();
      this.yRot = yRot;
      this.relativeY = relativeY;
      this.xRot = xRot;
      this.relativeX = relativeX;
   }

   public boolean u() {
      return this.relativeX;
   }

   public boolean y() {
      return this.relativeY;
   }

   public float N() {
      return this.yRot;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00261> method_65080() {
      return class04248.NP;
   }
}
