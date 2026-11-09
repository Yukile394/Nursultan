package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class04591 {
   private class04591() {
      super();
   }

   private static List<class04613> N(String var0, List<class04638> var1) {
      return N(N(var0), var1);
   }

   private static List<class04613> N(List<String> var0, List<class04638> var1) {
      int i = 0;
      ArrayList arraylist = Lists.newArrayList();

      for (String s : var0) {
         ArrayList arraylist1 = Lists.newArrayList();

         for (String s1 : N(s, "%link")) {
            if ("%link".equals(s1)) {
               arraylist1.add((class04638)var1.get(i++));
            } else {
               arraylist1.add(class04638.N(s1));
            }
         }

         arraylist.add(new class04613(arraylist1));
      }

      return arraylist;
   }

   public static List<String> N(String var0, String var1) {
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Delimiter cannot be the empty string");
      } else {
         ArrayList arraylist = Lists.newArrayList();
         int i = 0;

         int j;
         while ((j = var0.indexOf(var1, i)) != -1) {
            if (j > i) {
               arraylist.add(var0.substring(i, j));
            }

            arraylist.add(var1);
            i = j + var1.length();
         }

         if (i < var0.length()) {
            arraylist.add(var0.substring(i));
         }

         return arraylist;
      }
   }

   public static List<class04613> N(String var0, class04638... var1) {
      return N(var0, Arrays.asList(var1));
   }

   protected static List<String> N(String var0) {
      return Arrays.asList(var0.split("\\n"));
   }
}
