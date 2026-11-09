package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07751 extends class07036 {
   public static final MapCodec<class07751> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05904.N.fieldOf("wood_type").forGetter(class07036::L), t()).apply(var0, class07751::new)
   );
   public static final class08071 L = class06665.yR;

   public class07751(class05904 var1, class01362 var2) {
      super(var1, var2.N(var1.u()));
      this.P(this.Q.y().y(L, 0).y(N, false));
   }

   @Override
   public float U(class00500 var1) {
      return class03795.y(var1.L(L));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(L, var2.N(var1.L(L), 16));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, N);
   }

   @Override
   public MapCodec<class07751> N() {
      return y;
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(L, class03795.N(var1.method_8044() + 180.0F)).y(N, class04688.N() == class04684.L);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !this.a_(var1, var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L), 16));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10074()).B();
   }
}
