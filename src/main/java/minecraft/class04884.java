package minecraft;

import com.mojang.serialization.MapCodec;

public class class04884 extends class00891 implements class01137, class07190 {
   public static final MapCodec<class04884> N = y(class04884::new);
   public static final class08064<class05288> y = class06665.x;

   public static class07211 T(class00500 var0) {
      return var0.L(y).y();
   }

   public class04884(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class05288.field_23391));
   }

   public static class07211 U(class00500 var0) {
      return var0.L(y).N();
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class04858 && var4.method_7338()) {
         var4.method_16354((class04858)class00394);
         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   public static boolean N(class01203 var0, class01203 var1) {
      class07211 class07211xxx = U(var0.N().y());
      class07211 class07211x = U(var1.N().y());
      class07211 class07211xx = T(var0.N().y());
      class07211 class07211xxx = T(var1.N().y());
      boolean flag = var0.y() == class04853.field_23329;
      return class07211xxx == class07211x.b() && (flag || class07211xx == class07211xxx) && var0.i().equals(var1.L());
   }

   @Override
   public MapCodec<class04884> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N().N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(y, var2.N().N(var1.L(y)));
   }

   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211x = var1.method_8038();
      class07211 class07211x;
      if (class07211x.z() == class07185.field_11052) {
         class07211x = var1.method_8042().b();
      } else {
         class07211x = class07211.field_11036;
      }

      return this.W().y(y, class05288.N(class07211x, class07211x));
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class04858(var1, var2);
   }
}
