package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public class class07800 extends class07685 {
   public static final MapCodec<class07800> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class07685::y), t()).apply(var0, class07800::new)
   );
   public static final class08071 y = class06665.yR;
   private static final Map<class06563, class00891> L = Maps.newHashMap();
   private static final class00494 u = class00891.y(8.0, 0.0, 16.0);

   public class07800(class06563 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.Q.y().y(y, 0));
      L.put(var1, this);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   public static class00891 N(class06563 var0) {
      return L.getOrDefault(var0, class00869.zY);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(y, var2.N(var1.L(y), 16));
   }

   @Override
   public MapCodec<class07800> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u;
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, class03795.N(var1.method_8044() + 180.0F));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y), 16));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10074()).B();
   }
}
