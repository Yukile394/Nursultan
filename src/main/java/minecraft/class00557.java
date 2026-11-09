package minecraft;

public record class00557(class06889 position, float yRot, float xRot, boolean onGround) implements class00381<class08051> {
   public static final class02362<class00667, class00557> N = class02362.N(
      class06889.y, class00557::N, class02389.E, class00557::y, class02389.E, class00557::L, class02389.y, class00557::u, class00557::new
   );

   public float L() {
      return this.xRot;
   }

   public class00557(class06889 position, float yRot, float xRot, boolean onGround) {
      super();
      this.position = position;
      this.yRot = yRot;
      this.xRot = xRot;
      this.onGround = onGround;
   }

   public boolean u() {
      return this.onGround;
   }

   public float y() {
      return this.yRot;
   }

   public void method_65081(class08051 var1) {
      var1.method_12078(this);
   }

   public static class00557 N(class07049 var0) {
      return var0.method_66245()
         ? new class00557(var0.method_66233().method_66265(), var0.method_66233().method_66268(), var0.method_66233().method_66269(), var0.method_24828())
         : new class00557(var0.method_73189(), var0.method_36454(), var0.method_36455(), var0.method_24828());
   }

   public class06889 N() {
      return this.position;
   }

   @Override
   public class02897<class00557> method_65080() {
      return class04248.yf;
   }
}
