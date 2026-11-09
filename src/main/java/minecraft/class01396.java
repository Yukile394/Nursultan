package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public abstract class class01396<T extends class01425> implements class06583<T> {
   private final Map<class03704, Set<class06588<T>>> N = Maps.newIdentityHashMap();

   public class01396() {
      super();
   }

   @Override
   public final void y(class03704 var1, class06588<T> var2) {
      Set set = this.N.get(var1);
      if (set != null) {
         set.remove(var2);
         if (set.isEmpty()) {
            this.N.remove(var1);
         }
      }
   }

   @Override
   public final void N(class03704 var1, class06588<T> var2) {
      this.N.computeIfAbsent(var1, var0 -> Sets.newHashSet()).add(var2);
   }

   protected void N_27(class04770 var1, Predicate<T> var2) {
      class03704 class03704 = var1.method_14236();
      Set set = this.N.get(class03704);
      if (set != null && !set.isEmpty()) {
         class05908 class05908 = class00821.y(var1, var1);
         ArrayList arraylist = null;

         for (class06588 class06588x : set) {
            class01425 class01425 = (class01425)class06588x.N();
            if (var2.test(class01425)) {
               Optional<class05196> optional = class01425.N();
               if (optional.isEmpty() || optional.get().N(class05908)) {
                  if (arraylist == null) {
                     arraylist = Lists.newArrayList();
                  }

                  arraylist.add(class06588x);
               }
            }
         }

         if (arraylist != null) {
            for (class06588 class06588x : arraylist) {
               class06588x.N(class03704);
            }
         }
      }
   }

   @Override
   public final void N(class03704 var1) {
      this.N.remove(var1);
   }
}
