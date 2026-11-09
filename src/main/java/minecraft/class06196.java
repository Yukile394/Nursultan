package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class06196 extends class04748 {
   public static final MapCodec<class06196> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(N(var0), class06187.field_24839.fieldOf("mineshaft_type").forGetter(var0x -> var0x.y)).apply(var0, class06196::new)
   );
   private final class06187 y;

   public class06196(class04758 var1, class06187 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class04367<?> N() {
      return class04367.B;
   }

   private int N(class03291 var1, class04764 var2) {
      class07321 class07321 = var2.B();
      class07836 class07836 = var2.R();
      class08088 class08088 = var2.y();
      class05168 class05168 = new class05168(0, class07836, class07321.N(2), class07321.y(2), this.y);
      var1.N(class05168);
      class05168.N(class05168, var1, class07836);
      int i = class08088.R();
      if (this.y == class06187.field_13691) {
         class07209 class07209 = var1.u().M();
         int j = class08088.N(class07209.method_10263(), class07209.method_10260(), class07830.field_13194, var2.Z(), var2.u());
         int k = (j <= i ? i : class04995.y(class07836, i, j)) - class07209.method_10264();
         var1.N(k);
         return k;
      } else {
         return var1.N(i, class08088.M(), class07836, 10);
      }
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      var1.R().U();
      class07321 class07321 = var1.B();
      class07209 class07209 = new class07209(class07321.L(), 50, class07321.R());
      class03291 class03291 = new class03291();
      int i = this.N(class03291, var1);
      return Optional.of(new class04780(class07209.method_10069(0, i, 0), Either.right(class03291)));
   }
}
