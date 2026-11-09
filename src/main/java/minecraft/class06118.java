package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06118 extends class00891 {
   public static final MapCodec<class06118> N = y(class06118::new);
   private static final class00392 L = class00392.L("container.stonecutter");
   public static final class08064<class07211> y = class07101.R;
   private static final class00494 u = class00891.y(16.0, 0.0, 9.0);

   public class06118(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8042().b());
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var4.method_17355(var1.N(var2, var3));
         var4.method_7281(class01235.Nk);
      }

      return class07082.N;
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return new class03965((var2x, var3x, var4) -> new class06146(var2x, var3x, class05880.N(var2, var3)), L);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u;
   }

   @Override
   public MapCodec<class06118> N() {
      return N;
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
