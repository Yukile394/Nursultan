package minecraft;

import Nursultan.class10667;
import Nursultan.class10673;

public class class06746<T extends class08156> extends class02795<T, class06729, class06738> {
   private static final class01894 N = class01894.y("textures/entity/nautilus/nautilus.png");
   private static final class01894 i = class01894.y("textures/entity/nautilus/nautilus_baby.png");

   public class06746(class04832 var1) {
      super(var1, new class06738(var1.N(class04802.Ly)), new class06738(var1.N(class04802.LL)), 0.7F);
      this.N(new class00207<>(this, var1.B(), class08719.field_63622, var0 -> var0.y, new class10667(var1.N(class04802.Li)), null));
      this.N(new class00207<>(this, var1.B(), class08719.field_63621, var0 -> var0.N, new class10673(var1.N(class04802.Lu)), null));
   }

   public class06729 method_55269() {
      return new class06729();
   }

   public class01894 N(class06729 var1) {
      return var1.NB ? i : N;
   }

   public void method_62354(T var1, class06729 var2, float var3) {
      super.method_62354((T)var1, var2, var3);
      var2.N = var1.method_6118(class07085.field_55946).t();
      var2.y = var1.NZ().t();
   }
}
