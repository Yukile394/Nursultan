package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class07768 extends class00891 {
   private static final class00494 L = class00891.y(14.0, 0.0, 0.5);
   private static final class00494 u = class00891.y(14.0, 0.0, 1.0);
   protected static final class00734 N = class00891.y(14.0, 0.0, 4.0).method_1090().getFirst();
   protected final class01960 y;

   public class07768(class01362 var1, class01960 var2) {
      super(var1.N(var2.M()));
      this.y = var2;
   }

   protected abstract int U(class00500 var1);

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var4 == class07211.field_11036 ? this.U(var1) : 0;
   }

   protected abstract int y(class07299 var1, class07209 var2);

   protected int y() {
      return 20;
   }

   protected static int N(class07299 var0, class00734 var1, Class<? extends class07049> var2) {
      return var0.N(var2, var1, class07042.R.and(var0x -> !var0x.method_5696())).size();
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return this.U(var1);
   }

   protected void N(class07299 var1, class07209 var2) {
      var1.method_8408(var2, this);
      var1.method_8408(var2.method_10074(), this);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4 && this.U(var1) > 0) {
         this.N(var2, var3);
      }
   }

   protected abstract class00500 N(class00500 var1, int var2);

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!var2.method_8608()) {
         int i = this.U(var1);
         if (i == 0) {
            this.N(var4, var2, var3, var1, i);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      int i = this.U(var1);
      if (i > 0) {
         this.N(null, var2, var3, var1, i);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.U(var1) > 0 ? L : u;
   }

   @Override
   protected abstract MapCodec<? extends class07768> N();

   private void N(@Nullable class07049 var1, class07299 var2, class07209 var3, class00500 var4, int var5) {
      int i = this.y(var2, var3);
      boolean flag = var5 > 0;
      boolean flag1 = i > 0;
      if (var5 != i) {
         class00500 class00500 = this.N(var4, i);
         var2.method_8652(var3, class00500, 2);
         this.N(var2, var3);
         var2.method_16109(var3, var4, class00500);
      }

      if (!flag1 && flag) {
         var2.N(null, var3, this.y.E(), class04911.field_15245);
         var2.N(var1, class01194.i, var3);
      } else if (flag1 && !flag) {
         var2.N(null, var3, this.y.W(), class04911.field_15245);
         var2.N(var1, class01194.N, var3);
      }

      if (flag1) {
         var2.N(new class07209(var3), this, this.y());
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return L(var2, class07209) || N_6(var2, class07209, class07211.field_11036);
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }

   @Override
   public boolean c_(class00500 var1) {
      return true;
   }
}
