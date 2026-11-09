package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04098 extends class08564 implements class00873 {
   public static final MapCodec<class04098> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.N(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter(var0x -> var0x.M), t()).apply(var0, class04098::new)
   );

   public class04098(float var1, class01362 var2) {
      super(var1, var2);
   }

   @Override
   public class07209 N(class07209 var1) {
      return var1.method_10074();
   }

   @Override
   public MapCodec<class04098> N() {
      return y;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      var1.method_8652(var3.method_10074(), class04091.L(), 2);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10074()).P();
   }
}
