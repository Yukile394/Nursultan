package minecraft;

import com.mojang.serialization.Codec;

public record class03497(int millis) {
   public static final Codec<class03497> N = Codec.INT.xmap(class03497::new, var0 -> var0.millis);

   public class03497(int millis) {
      super();
      this.millis = millis;
   }

   public int N() {
      return this.millis;
   }
}
