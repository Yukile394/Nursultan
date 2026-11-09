package minecraft;

public record class03132(float tickRate, boolean isFrozen) implements class00381<class07280> {
   public static final class02362<class00667, class03132> N = class00381.N(class03132::N, class03132::new);

   private class03132(class00667 var1) {
      this(var1.readFloat(), var1.readBoolean());
   }

   public class03132(float tickRate, boolean isFrozen) {
      this.tickRate = tickRate;
      this.isFrozen = isFrozen;
   }

   public boolean y() {
      return this.isFrozen;
   }

   public float N() {
      return this.tickRate;
   }

   private void N(class00667 var1) {
      var1.writeFloat(this.tickRate);
      var1.writeBoolean(this.isFrozen);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public static class03132 N(class03106 var0) {
      return new class03132(var0.R(), var0.E());
   }

   @Override
   public class02897<class03132> method_65080() {
      return class04248.Ll;
   }
}
