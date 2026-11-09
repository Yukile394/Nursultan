package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04304 implements class04025 {
   public static final MapCodec<class04304> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00753.method_39677(16).optionalFieldOf("offset", class07209.field_10980).forGetter(var0x -> var0x.i))
         .apply(var0, class04304::new)
   );
   private final class00753 i;

   public class04304(class00753 var1) {
      super();
      this.i = var1;
   }

   @Override
   public class04054<?> N() {
      return class04054.B;
   }

   public boolean test(class05974 var1, class07209 var2) {
      return !var1.method_31606(var2.method_10081(this.i));
   }
}
