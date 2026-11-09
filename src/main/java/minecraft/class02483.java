package minecraft;

import com.mojang.serialization.Codec;

public record class02483(class00809 value) implements class02500 {
   public static final Codec<class02483> N = class00809.N.xmap(class02483::new, class02483::N);

   public class02483(class00809 value) {
      super();
      this.value = value;
   }

   @Override
   public boolean N(class02666 var1) {
      return this.value.N(var1);
   }

   public class00809 N() {
      return this.value;
   }

   public static class02483 N(class00809 var0) {
      return new class02483(var0);
   }
}
