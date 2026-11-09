package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class class01436 extends class01474 {
   public static final MapCodec<class01436> N = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(class01436::new, var0 -> var0.L);
   private final float L;

   public class01436(float var1) {
      super();
      this.L = var1;
   }

   @Override
   protected class05930<?> N() {
      return class05930.i;
   }

   @Override
   public void N(class05894 var1) {
      class06069 class06069 = var1.y();
      if (!(class06069.z() >= this.L)) {
         ObjectArrayList<class07209> objectarraylist = var1.L();
         if (!objectarraylist.isEmpty()) {
            int i = ((class07209)objectarraylist.getFirst()).method_10264();
            objectarraylist.stream().filter(var1x -> var1x.method_10264() - i <= 2).forEach(var2x -> {
               for (class07211 class07211x : class07221.field_11062) {
                  if (class06069.z() <= 0.25F) {
                     class07211 class07211x = class07211x.b();
                     class07209 class07209 = var2x.method_10069(class07211x.P(), 0, class07211x.T());
                     if (var1.N(class07209)) {
                        var1.N(class07209, class00869.Mb.W().y(class00900.L, class06069.y(3)).y(class00900.R, class07211x));
                     }
                  }
               }
            });
         }
      }
   }
}
