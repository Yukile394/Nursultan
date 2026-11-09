package minecraft;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

class class05201 {
   final List<class05204> N;
   private String y;

   public class05201(List<class05204> var1) {
      super();
      this.N = var1;
      this.y = var1.stream().map(var0 -> var0.N).collect(Collectors.joining());
   }

   @Nullable
   public class05936 N() {
      class05199 class05199 = new class05199();
      this.N.forEach(class05199::N);
      this.N.clear();
      return class05199.N();
   }

   public class05936 N(int var1, int var2, class00405 var3) {
      class05199 class05199 = new class05199();
      ListIterator listiterator = this.N.listIterator();
      int i = var1;
      boolean flag = false;

      while (listiterator.hasNext()) {
         class05204 class05204 = (class05204)listiterator.next();
         String s = class05204.N;
         int j = s.length();
         if (!flag) {
            if (i > j) {
               class05199.N(class05204);
               listiterator.remove();
               i -= j;
            } else {
               String s1 = s.substring(0, i);
               if (!s1.isEmpty()) {
                  class05199.N(class05936.N(s1, class05204.y));
               }

               i += var2;
               flag = true;
            }
         }

         if (flag) {
            if (i <= j) {
               String s2 = s.substring(i);
               if (s2.isEmpty()) {
                  listiterator.remove();
               } else {
                  listiterator.set(new class05204(s2, var3));
               }
               break;
            }

            listiterator.remove();
            i -= j;
         }
      }

      this.y = this.y.substring(var1 + var2);
      return class05199.y();
   }

   public char N(int var1) {
      return this.y.charAt(var1);
   }
}
