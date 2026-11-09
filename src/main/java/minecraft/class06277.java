package minecraft;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class06277 extends class05355<class07079> {
   private static final int N = 40;
   private static final int y = 5;
   private static final int L = 20;
   private final Long2LongMap u = new Long2LongOpenHashMap();
   private int i;
   private long R;

   public class06277() {
      super(20);
   }

   protected void N(class04782 var1, class07079 var2) {
      if (var2.method_6109()) {
         this.i = 0;
         this.R = var1.N() + var1.method_8409().y(20);
         class05368 class05368 = var1.method_19494();
         Predicate predicate = var1x -> {
            long ix = var1x.method_10063();
            if (this.u.containsKey(ix)) {
               return false;
            } else if (++this.i >= 5) {
               return false;
            } else {
               this.u.put(ix, this.R + 40L);
               return true;
            }
         };
         Set set = class05368.y(var0 -> var0.N(class03927.m), predicate, var2.method_24515(), 48, class05372.field_18489).collect(Collectors.toSet());
         class00143 class00143 = class05743.N(var2, set);
         if (class00143 != null && class00143.z()) {
            class07209 class07209 = class00143.E();
            if (class05368.L(class07209).isPresent()) {
               var2.method_18868().N(class05378.l, class07209);
            }
         } else if (this.i < 5) {
            this.u.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.R);
         }
      }
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.l);
   }
}
