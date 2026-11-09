package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

public class class02856 extends class02795<class07641, class08448, class01098> {
   private static final Map<class07631, class01894> N = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put(class07631.field_18110, class01894.y("textures/entity/cow/brown_mooshroom.png"));
      var0.put(class07631.field_18109, class01894.y("textures/entity/cow/red_mooshroom.png"));
   });

   public class02856(class04832 var1) {
      super(var1, new class01098(var1.N(class04802.yS)), new class01098(var1.N(class04802.yx)), 0.7F);
      this.N(new class02729(this, var1.u()));
   }

   public class08448 method_55269() {
      return new class08448();
   }

   public class01894 N(class08448 var1) {
      return N.get(var1.N);
   }

   public void method_62354(class07641 var1, class08448 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.W();
   }
}
