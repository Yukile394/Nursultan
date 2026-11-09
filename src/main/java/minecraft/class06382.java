package minecraft;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class class06382 extends class04347 {
   public static final MapCodec<class06382> N = N(class06382::new);

   public class06382(class04758 var1) {
      super(class05171::new, 21, 21, var1);
   }

   @Override
   public class04367<?> N() {
      return class04367.y;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class03300 var7) {
      class05905 class05905 = class05905.N(class00753::compareTo);

      for (class04890 class04890 : var7.L()) {
         if (class04890 instanceof class05171 class05171) {
            class05905.addAll(class05171.N());
            N(var5, var1, class05171.y());
         }
      }

      ObjectArrayList objectarraylist = new ObjectArrayList(class05905.stream().toList());
      class06069 class06069 = class06069.y(var1.method_8412()).L().N(var7.y().M());
      class07536.L(objectarraylist, class06069);
      int i = Math.min(class05905.size(), class06069.y(5, 8));
      ObjectListIterator objectlistiterator = objectarraylist.iterator();

      while (objectlistiterator.hasNext()) {
         class07209 class07209 = (class07209)objectlistiterator.next();
         if (i > 0) {
            i--;
            N(var5, var1, class07209);
         } else if (var5.y(class07209)) {
            var1.method_8652(class07209, class00869.e.W(), 2);
         }
      }
   }

   private static void N(class05163 var0, class05974 var1, class07209 var2) {
      if (var0.y(var2)) {
         var1.method_8652(var2, class00869.H.W(), 2);
         var1.N(var2, class00404.field_42780).ifPresent(var1x -> var1x.N(class06273.yU, var2.method_10063()));
      }
   }
}
