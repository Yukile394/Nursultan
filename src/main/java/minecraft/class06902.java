package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06902 extends class07768 {
   public static final MapCodec<class06902> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01960.N.fieldOf("block_set_type").forGetter(var0x -> var0x.y), t()).apply(var0, class06902::new)
   );
   public static final class06667 u = class06665.k;

   public class06902(class01960 var1, class01362 var2) {
      super(var2, var1);
      this.P(this.Q.y().y(u, false));
   }

   @Override
   protected int U(class00500 var1) {
      return var1.L(u) ? 15 : 0;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected int y(class07299 var1, class07209 var2) {
      Class<class07049> oclass = switch (this.y.R()) {
         case field_11361 -> class07049.class;
         case field_11362 -> class07438.class;
      };
      return N(var1, N.N(var2), oclass) > 0 ? 15 : 0;
   }

   @Override
   public MapCodec<class06902> N() {
      return L;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u);
   }

   @Override
   protected class00500 N(class00500 var1, int var2) {
      return var1.y(u, var2 > 0);
   }
}
