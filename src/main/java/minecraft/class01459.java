package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class01459 extends class01474 {
   public static final MapCodec<class01459> N = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(class01459::new, var0 -> var0.i);
   private static final class07211 L = class07211.field_11035;
   private static final class07211[] u = class07221.field_11062.N().filter(var0 -> var0 != L.b()).toArray(class07211[]::new);
   private final float i;

   public class01459(float var1) {
      super();
      this.i = var1;
   }

   @Override
   public void N(class05894 var1) {
      ObjectArrayList<class07209> objectarraylist = var1.u();
      ObjectArrayList<class07209> objectarraylist1 = var1.L();
      if (!objectarraylist1.isEmpty()) {
         class06069 class06069 = var1.y();
         if (!(class06069.z() >= this.i)) {
            int ix = !objectarraylist.isEmpty()
               ? Math.max(((class07209)objectarraylist.getFirst()).method_10264() - 1, ((class07209)objectarraylist1.getFirst()).method_10264() + 1)
               : Math.min(
                  ((class07209)objectarraylist1.getFirst()).method_10264() + 1 + class06069.y(3), ((class07209)objectarraylist1.getLast()).method_10264()
               );
            List list = objectarraylist1.stream()
               .filter(var1x -> var1x.method_10264() == ix)
               .flatMap(var0 -> Stream.of(u).map(var0::method_10093))
               .collect(Collectors.toList());
            if (!list.isEmpty()) {
               class07536.L(list, class06069);
               Optional optional = list.stream().filter(var1x -> var1.N(var1x) && var1.N(var1x.method_10093(L))).findFirst();
               if (!optional.isEmpty()) {
                  var1.N((class07209)optional.get(), class00869.Ti.W().y(class04593.y, L));
                  var1.N().N((class07209)optional.get(), class00404.field_20431).ifPresent(var1x -> {
                     int j = 2 + class06069.y(2);

                     for (int k = 0; k < j; k++) {
                        var1x.N(class05534.N(class06069.y(599)));
                     }
                  });
               }
            }
         }
      }
   }

   @Override
   protected class05930<?> N() {
      return class05930.R;
   }
}
