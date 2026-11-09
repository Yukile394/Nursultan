package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07000 extends class07688 {
   public static final MapCodec<class07000> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07030.y.fieldOf("kind").forGetter(class07688::y), t()).apply(var0, class07000::new)
   );
   public static final int u = class03795.N();
   private static final int y = u + 1;
   public static final class08071 i = class06665.yR;
   private static final class00494 R = class00891.y(8.0, 0.0, 8.0);
   private static final class00494 M = class00891.y(10.0, 0.0, 8.0);

   public class07000(class07030 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.W().y(i, 0));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      super.N(var1);
      var1.N(i);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(i, var2.N(var1.L(i), y));
   }

   @Override
   public MapCodec<? extends class07000> N() {
      return L;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(i, var2.N(var1.L(i), y));
   }

   @Override
   public class00500 N(class06942 var1) {
      return super.N(var1).y(i, class03795.N(var1.method_8044()));
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.y() == class07032.field_41313 ? M : R;
   }
}
