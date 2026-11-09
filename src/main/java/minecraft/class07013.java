package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07013 extends class00864 implements class00873 {
   public static final MapCodec<class07013> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03707.N.fieldOf("tree").forGetter(var0x -> var0x.L), t()).apply(var0, class07013::new)
   );
   public static final class08071 y = class06665.Nh;
   private static final class00494 u = class00891.y(12.0, 0.0, 12.0);
   protected final class03707 L;

   public class07013(class03707 var1, class01362 var2) {
      super(var2);
      this.L = var1;
      this.P(this.Q.y().y(y, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.U(var3.method_10084()) >= 9 && var4.y(7) == 0) {
         this.N(var2, var3, var1, var4);
      }
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      this.N(var1, var3, var4, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public MapCodec<? extends class07013> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u;
   }

   public void N(class04782 var1, class07209 var2, class00500 var3, class06069 var4) {
      if (var3.L(y) == 0) {
         var1.method_8652(var2, var3.N(y), 260);
      } else {
         this.L.N(var1, var1.method_14178().U(), var2, var3, var4);
      }
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return true;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return var1.field_9229.z() < 0.45;
   }
}
