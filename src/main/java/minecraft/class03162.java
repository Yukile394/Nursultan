package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03162 implements class04025 {
   private final class00753 i;
   private final class07211 R;
   public static final MapCodec<class03162> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00753.method_39677(16).optionalFieldOf("offset", class00753.field_11176).forGetter(var0x -> var0x.i),
            class07211.field_29502.fieldOf("direction").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class03162::new)
   );

   public class03162(class00753 var1, class07211 var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   public boolean test(class05974 var1, class07209 var2) {
      class07209 class07209 = var2.method_10081(this.i);
      return var1.method_8320(class07209).L(var1, class07209, this.R);
   }

   @Override
   public class04054<?> N() {
      return class04054.u;
   }
}
