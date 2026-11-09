package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class05990 extends class00864 implements class00873 {
   public static final MapCodec<class05990> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class05946.N(class04227.Nh).fieldOf("feature").forGetter(var0x -> var0x.i), class04206.i.T().fieldOf("grows_on").forGetter(var0x -> var0x.u), t()
         )
         .apply(var0, class05990::new)
   );
   private static final double y = 0.4;
   private static final class00494 L = class00891.y(8.0, 0.0, 9.0);
   private final class00891 u;
   private final class05946<class03238<?, ?>> i;

   public class05990(class05946<class03238<?, ?>> var1, class00891 var2, class01362 var3) {
      super(var3);
      this.i = var1;
      this.u = var2;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      this.N(var1).ifPresent(var3x -> var3x.N().N(var1, var1.method_14178().U(), var2, var3));
   }

   @Override
   public MapCodec<class05990> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class01210.Nr) || var1.N(class00869.RC) || var1.N(class00869.ik) || super.N(var1, var2, var3);
   }

   private Optional<? extends class03556<class03238<?, ?>>> N(class05487 var1) {
      return var1.method_30349().L(class04227.Nh).N(this.i);
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10074()).N(this.u);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return var2.z() < 0.4;
   }
}
