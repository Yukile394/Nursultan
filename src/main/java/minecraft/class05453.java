package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class05453 extends class05439 implements class06084 {
   public static final MapCodec<class05453> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.fieldOf("height").forGetter(var0x -> var0x.i), Codec.FLOAT.fieldOf("width").forGetter(var0x -> var0x.R), t())
         .apply(var0, class05453::new)
   );
   public static final class06667 L = class06665.q;
   public static final class08064<class07211> u = class06665.F;
   private final float i;
   private final float R;
   private final Map<class07211, class00494> M;

   public class05453(float var1, float var2, class01362 var3) {
      super(var3);
      this.P(this.W().y(L, false).y(u, class07211.field_11036));
      this.M = class00389.u(class00891.L(var2, 16.0F - var1, 16.0));
      this.i = var1;
      this.R = var2;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(L) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u);
   }

   @Override
   public MapCodec<class05453> N() {
      return y;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.M.get(var1.L(u));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(L)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5 == var1.L(u).b() && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      return this.W().y(L, class07299.method_8316(class07209).N() == class04684.L).y(u, var1.method_8038());
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(u, var2.N(var1.L(u)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(u)));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211 = var1.L(u);
      class07209 class07209 = var3.method_10093(class07211.b());
      return var2.method_8320(class07209).L(var2, class07209, class07211);
   }
}
