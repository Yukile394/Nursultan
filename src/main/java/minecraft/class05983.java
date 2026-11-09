package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Consumer;

public class class05983 extends class04748 {
   public static final MapCodec<class05983> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(N(var0), class03855.L.fieldOf("height").forGetter(var0x -> var0x.y)).apply(var0, class05983::new)
   );
   public final class03855 y;

   public class05983(class04758 var1, class03855 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class04367<?> N() {
      return class04367.Z;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class07836 class07836 = var1.R();
      int i = var1.B().i() + class07836.y(16);
      int j = var1.B().R() + class07836.y(16);
      int k = var1.y().R();
      class06057 class06057 = new class06057(var1.y(), var1.Z());
      int l = this.y.N(class07836, class06057);
      class01376 class01376 = var1.y().N(i, j, var1.Z(), var1.u());
      class07218 class07218 = new class07218(i, l, j);

      while (l > k) {
         class00500 class00500x = class01376.N(l);
         class00500 class00500x = class01376.N(--l);
         if (class00500x.P() && (class00500x.N(class00869.iw) || class00500x.L(class00515.field_12294, class07218.method_10099(l), class07211.field_11036))) {
            break;
         }
      }

      if (l <= k) {
         return Optional.empty();
      } else {
         class07209 class07209 = new class07209(i, l, j);
         return Optional.of(new class04780(class07209, (Consumer<class03291>)(var3x -> class05998.N(var1.i(), var3x, class07836, class07209))));
      }
   }
}
