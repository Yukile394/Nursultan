package minecraft;

public record class04175(float desiredChunksPerTick) implements class00381<class08051> {
   public static final class02362<class00667, class04175> N = class00381.N(class04175::N, class04175::new);

   private class04175(class00667 var1) {
      this(var1.readFloat());
   }

   public class04175(float desiredChunksPerTick) {
      this.desiredChunksPerTick = desiredChunksPerTick;
   }

   public float N() {
      return this.desiredChunksPerTick;
   }

   public void method_65081(class08051 var1) {
      var1.method_52278(this);
   }

   private void N(class00667 var1) {
      var1.writeFloat(this.desiredChunksPerTick);
   }

   @Override
   public class02897<class04175> method_65080() {
      return class04248.yk;
   }
}
