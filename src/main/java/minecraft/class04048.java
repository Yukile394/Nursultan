package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04048 implements class04025 {
   public static final MapCodec<class04048> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00753.method_39677(16).optionalFieldOf("offset", class00753.field_11176).forGetter(var0x -> var0x.i),
            class00500.N.fieldOf("state").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class04048::new)
   );
   private final class00753 i;
   private final class00500 R;

   protected class04048(class00753 var1, class00500 var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   public boolean test(class05974 var1, class07209 var2) {
      return this.R.N(var1, var2.method_10081(this.i));
   }

   @Override
   public class04054<?> N() {
      return class04054.M;
   }
}
