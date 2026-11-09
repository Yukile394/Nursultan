package minecraft;

import java.util.BitSet;
import java.util.Locale;
import java.util.Set;

public class class03476 {
   private static final int N = class07211.values().length;
   private final BitSet y = new BitSet(N * N);

   public class03476() {
      super();
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder();
      stringbuilder.append(' ');

      for (class07211 class07211x : class07211.values()) {
         stringbuilder.append(' ').append(class07211x.toString().toUpperCase(Locale.ROOT).charAt(0));
      }

      stringbuilder.append('\n');

      for (class07211 class07211 : class07211.values()) {
         stringbuilder.append(class07211.toString().toUpperCase(Locale.ROOT).charAt(0));

         for (class07211 class07211x : class07211.values()) {
            if (class07211 == class07211x) {
               stringbuilder.append("  ");
            } else {
               boolean flag = this.N(class07211, class07211x);
               stringbuilder.append(' ').append((char)(flag ? 'Y' : 'n'));
            }
         }

         stringbuilder.append('\n');
      }

      return stringbuilder.toString();
   }

   public void N(boolean var1) {
      this.y.set(0, this.y.size(), var1);
   }

   public boolean N(class07211 var1, class07211 var2) {
      return this.y.get(var1.ordinal() + var2.ordinal() * N);
   }

   public void N(Set<class07211> var1) {
      for (class07211 class07211x : var1) {
         for (class07211 class07211x : var1) {
            this.N(class07211x, class07211x, true);
         }
      }
   }

   public void N(class07211 var1, class07211 var2, boolean var3) {
      this.y.set(var1.ordinal() + var2.ordinal() * N, var3);
      this.y.set(var2.ordinal() + var1.ordinal() * N, var3);
   }
}
