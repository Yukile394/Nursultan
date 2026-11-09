package minecraft;

import java.util.Arrays;

public class class04698 extends class05914 {
   private static final class00392 N = class00392.L("options.sounds.title");

   public class04698(class05096 var1, class05630 var2) {
      super(var1, var2, N);
   }

   private class04370<?>[] N() {
      return Arrays.stream(class04911.values()).filter(var0 -> var0 != class04911.field_15250).map(this.field_21336::L).toArray(class04370[]::new);
   }

   @Override
   protected void method_60325() {
      this.field_51824.N(this.field_21336.L(class04911.field_15250));
      this.field_51824.N(this.N());
      this.field_51824.N(this.field_21336.Ne());
      this.field_51824.N(this.field_21336.NU(), this.field_21336.NE());
      this.field_51824.N(this.field_21336.Nc(), this.field_21336.NX());
   }
}
