package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class class03514 extends class06391<class06225> {
   public class03514(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class07321 class07321 = new class07321(var1.i());
      IntArrayList intarraylist = class07536.N(IntStream.rangeClosed(class07321.i(), class07321.M()), class06069);
      IntArrayList intarraylist1 = class07536.N(IntStream.rangeClosed(class07321.R(), class07321.B()), class06069);
      class07218 class07218 = new class07218();
      IntListIterator intlistiterator = intarraylist.iterator();

      while (intlistiterator.hasNext()) {
         Integer integer = (Integer)intlistiterator.next();
         IntListIterator intlistiterator1 = intarraylist1.iterator();

         while (intlistiterator1.hasNext()) {
            Integer integer1 = (Integer)intlistiterator1.next();
            class07218.N(integer, 0, integer1);
            class07209 class07209x = class05974.N(class07830.field_13203, class07218);
            if (class05974.R(class07209x) || class05974.method_8320(class07209x).M(class05974, class07209x).method_1110()) {
               class05974.method_8652(class07209x, class00869.LA.W(), 2);
               class03136.N(class05974, class06069, class07209x, class06273.N);
               class00500 class00500 = class00869.Le.W();

               for (class07211 class07211 : class07221.field_11062) {
                  class07209 class07209x = class07209x.method_10093(class07211);
                  if (class00500.N(class05974, class07209x)) {
                     class05974.method_8652(class07209x, class00500, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
