package minecraft;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class class03525 {
   public class03525() {
      super();
   }

   static <T> class01196<T> N(class00751<T> var0, class03516 var1) {
      class05946 class05946 = var0.i();
      HashMap hashmap = new HashMap();
      var1.y.forEach((var3x, var4) -> {
         class03530 class03530 = class03530.N(class05946, var3x);
         List list = var4.intStream().mapToObj(var0::L).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         hashmap.put(class03530, list);
      });
      return new class01196<>(class05946, hashmap);
   }

   private static <T> class03516 N(class00751<T> var0) {
      HashMap hashmap = new HashMap();
      var0.U().forEach(var2 -> {
         IntArrayList intarraylist = new IntArrayList(var2.y());

         for (class03556 class03556 : var2) {
            if (class03556.R() != class03535.field_36446) {
               throw new IllegalStateException("Can't serialize unregistered value " + class03556);
            }

            intarraylist.add(var0.N(class03556.N()));
         }

         hashmap.put(var2.B().y(), intarraylist);
      });
      return new class03516(hashmap);
   }

   public static Map<class05946<? extends class00751<?>>, class03516> N(class02003<class02969> var0) {
      return class02001.y(var0)
         .map(var0x -> Pair.of(var0x.N(), N(var0x.y())))
         .filter(var0x -> !((class03516)var0x.getSecond()).N())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }
}
