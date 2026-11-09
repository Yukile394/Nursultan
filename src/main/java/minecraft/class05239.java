package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class05239 extends class01219 {
   public static final MapCodec<class05239> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07830.field_24772.fieldOf("heightmap").orElse(class07830.field_13194).forGetter(var0x -> var0x.y),
            Codec.INT.fieldOf("offset").orElse(0).forGetter(var0x -> var0x.L)
         )
         .apply(var0, class05239::new)
   );
   private final class07830 y;
   private final int L;

   public class05239(class07830 var1, int var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      class07830 class07830;
      if (var1 instanceof class04782) {
         if (this.y == class07830.field_13194) {
            class07830 = class07830.field_13202;
         } else if (this.y == class07830.field_13195) {
            class07830 = class07830.field_13200;
         } else {
            class07830 = this.y;
         }
      } else {
         class07830 = this.y;
      }

      class07209 class07209 = var5.N();
      int i = var1.method_8624(class07830, class07209.method_10263(), class07209.method_10260()) + this.L;
      int j = var4.N().method_10264();
      return new class01228(new class07209(class07209.method_10263(), i + j, class07209.method_10260()), var5.y(), var5.L());
   }

   @Override
   protected class05235<?> N() {
      return class05235.M;
   }
}
