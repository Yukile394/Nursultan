package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Optional;

public class class00317 extends class01474 {
   public static final MapCodec<class00317> N = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(class00317::new, var0 -> var0.L);
   private final float L;

   public class00317(float var1) {
      super();
      this.L = var1;
   }

   @Override
   protected class05930<?> N() {
      return class05930.u;
   }

   @Override
   public void N(class05894 var1) {
      class06069 class06069 = var1.y();
      ObjectArrayList<class07209> objectarraylist = var1.L();
      if (!objectarraylist.isEmpty()) {
         if (!(class06069.z() >= this.L)) {
            ArrayList arraylist = new ArrayList(objectarraylist);
            class07536.L(arraylist, class06069);
            Optional optional = arraylist.stream().filter(var1x -> {
               for (class07211 class07211 : class07211.values()) {
                  if (!var1.N(var1x.method_10093(class07211), var0x -> var0x.N(class01210.g))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!optional.isEmpty()) {
               var1.N((class07209)optional.get(), class00869.Lp.W().y(class00325.L, class08630.field_55832).y(class00325.u, true));
            }
         }
      }
   }
}
