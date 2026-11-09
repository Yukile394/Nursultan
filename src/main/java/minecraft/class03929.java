package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class class03929 {
   public class03929() {
      super();
   }

   public static <T> List<class03923> N(List<T> var0, Function<T, List<class03543<class04336>>> var1, boolean var2) {
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      MutableInt mutableint = new MutableInt(0);
      Comparator comparator = Comparator.comparingInt(class03947::y).thenComparingInt(class03947::N);
      TreeMap treemap = new TreeMap(comparator);
      int i = 0;

      for (Object object : var0) {
         ArrayList arraylist = Lists.newArrayList();
         List list = (List)var1.apply(object);
         i = Math.max(i, list.size());

         for (int j = 0; j < list.size(); j++) {
            for (class03556 class03556 : (class03543)list.get(j)) {
               class04336 class04336 = (class04336)class03556.N();
               arraylist.add(new class03947(object2intopenhashmap.computeIfAbsent(class04336, var1x -> mutableint.getAndIncrement()), j, class04336));
            }
         }

         for (int k = 0; k < arraylist.size(); k++) {
            Set set = treemap.computeIfAbsent((class03947)arraylist.get(k), var1x -> new TreeSet(comparator));
            if (k < arraylist.size() - 1) {
               set.add((class03947)arraylist.get(k + 1));
            }
         }
      }

      TreeSet treeset = new TreeSet(comparator);
      TreeSet treeset1 = new TreeSet(comparator);
      ArrayList arraylist1 = Lists.newArrayList();

      for (class03947 class03947 : treemap.keySet()) {
         if (!treeset1.isEmpty()) {
            throw new IllegalStateException("You somehow broke the universe; DFS bork (iteration finished with non-empty in-progress vertex set");
         }

         if (!treeset.contains(class03947) && class04581.N(treemap, treeset, treeset1, arraylist1::add, class03947)) {
            if (!var2) {
               throw new IllegalStateException("Feature order cycle found");
            }

            ArrayList arraylist2 = new ArrayList(var0);

            int j1;
            do {
               j1 = arraylist2.size();
               ListIterator listiterator = arraylist2.listIterator();

               while (listiterator.hasNext()) {
                  Object object1 = listiterator.next();
                  listiterator.remove();

                  try {
                     N(arraylist2, var1, false);
                  } catch (IllegalStateException illegalstateexception) {
                     continue;
                  }

                  listiterator.add(object1);
               }
            } while (j1 != arraylist2.size());

            throw new IllegalStateException("Feature order cycle found, involved sources: " + arraylist2);
         }
      }

      Collections.reverse(arraylist1);
      Builder builder = ImmutableList.builder();

      for (int l = 0; l < i; l++) {
         int i1 = l;
         List list1 = arraylist1.stream().filter(var1x -> var1x.y() == i1).map(class03947::L).collect(Collectors.toList());
         builder.add(new class03923(list1));
      }

      return builder.build();
   }
}
