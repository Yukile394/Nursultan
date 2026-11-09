package minecraft;

public record class06668(class06889 position, float yRot, float xRot) implements class00381<class07280> {
   public static final class02362<class00667, class06668> N = class02362.N(
      class06889.y, class06668::N, class02389.E, class06668::y, class02389.E, class06668::L, class06668::new
   );

   public float L() {
      return this.xRot;
   }

   public class06668(class06889 position, float yRot, float xRot) {
      super();
      this.position = position;
      this.yRot = yRot;
      this.xRot = xRot;
   }

   public float y() {
      return this.yRot;
   }

   public static class06668 N(class07049 var0) {
      return new class06668(var0.method_73189(), var0.method_36454(), var0.method_36455());
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class06889 N() {
      return this.position;
   }

   @Override
   public class02897<class06668> method_65080() {
      return class04248.NN;
   }
}
