package minecraft;

import Nursultan.class10667;
import Nursultan.class10673;
import com.google.common.collect.Maps;
import java.util.Map;

public class class07572 extends class02840<class08187, class06729, class06738> {
   private final Map<class07582, class06738> N;

   public class07572(class04832 var1) {
      super(var1, new class06738(var1.N(class04802.ia)), 0.7F);
      this.N(new class00207<>(this, var1.B(), class08719.field_63622, var0 -> var0.y, new class10667(var1.N(class04802.Li)), null));
      this.N(new class00207<>(this, var1.B(), class08719.field_63621, var0 -> var0.N, new class10673(var1.N(class04802.Lu)), null));
      this.N = N(var1);
   }

   public class06729 method_55269() {
      return new class06729();
   }

   private static Map<class07582, class06738> N(class04832 var0) {
      return Maps.newEnumMap(
         Map.of(class07582.field_64365, new class06738(var0.N(class04802.ia)), class07582.field_64366, new class07591(var0.N(class04802.Nj)))
      );
   }

   public class01894 N(class06729 var1) {
      return var1.L == null ? class08923.L() : var1.L.y().y().y();
   }

   public void method_3936(class06729 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.L != null) {
         this.y = this.N.get(var1.L.y().N());
         super.method_3936(var1, var2, var3, var4);
      }
   }

   public void method_62354(class08187 var1, class06729 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_6118(class07085.field_55946).t();
      var2.y = var1.NZ().t();
      var2.L = var1.o().N();
   }
}
