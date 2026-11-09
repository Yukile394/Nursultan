package minecraft;

import Nursultan.class10712;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;

public class class07074 {
   private final String N;
   private final List<class10712> y = Lists.newArrayList();
   private StackTraceElement[] L = new StackTraceElement[0];

   public class07074(String var1) {
      super();
      this.N = var1;
   }

   public void y(int var1) {
      StackTraceElement[] astacktraceelement = new StackTraceElement[this.L.length - var1];
      System.arraycopy(this.L, 0, astacktraceelement, 0, astacktraceelement.length);
      this.L = astacktraceelement;
   }

   public StackTraceElement[] N() {
      return this.L;
   }

   public void N(StringBuilder var1) {
      var1.append("-- ").append(this.N).append(" --\n");
      var1.append("Details:");

      for (class10712 class10712 : this.y) {
         var1.append("\n\t");
         var1.append(class10712.N());
         var1.append(": ");
         var1.append(class10712.y());
      }

      if (this.L != null && this.L.length > 0) {
         var1.append("\nStacktrace:");

         for (StackTraceElement stacktraceelement : this.L) {
            var1.append("\n\tat ");
            var1.append(stacktraceelement);
         }
      }
   }

   public static String N(double var0, double var2, double var4) {
      return String.format(Locale.ROOT, "%.2f,%.2f,%.2f", var0, var2, var4);
   }

   public boolean N(StackTraceElement var1, StackTraceElement var2) {
      if (this.L.length != 0 && var1 != null) {
         StackTraceElement stacktraceelement = this.L[0];
         if (stacktraceelement.isNativeMethod() == var1.isNativeMethod()
            && stacktraceelement.getClassName().equals(var1.getClassName())
            && stacktraceelement.getFileName().equals(var1.getFileName())
            && stacktraceelement.getMethodName().equals(var1.getMethodName())) {
            if (var2 != null != this.L.length > 1) {
               return false;
            } else if (var2 != null && !this.L[1].equals(var2)) {
               return false;
            } else {
               this.L[0] = var1;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void N(class07074 var0, class05474 var1, class07209 var2, class00500 var3) {
      var0.N("Block", var3::toString);
      N(var0, var1, var2);
   }

   public static class07074 N(class07074 var0, class05474 var1, class07209 var2) {
      return var0.N("Block location", () -> N(var1, var2));
   }

   public int N(int var1) {
      StackTraceElement[] astacktraceelement = Thread.currentThread().getStackTrace();
      if (astacktraceelement.length <= 0) {
         return 0;
      } else {
         this.L = new StackTraceElement[astacktraceelement.length - 3 - var1];
         System.arraycopy(astacktraceelement, 3 + var1, this.L, 0, this.L.length);
         return this.L.length;
      }
   }

   public static String N(class05474 var0, class07209 var1) {
      return N(var0, var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public static String N(class05474 var0, int var1, int var2, int var3) {
      StringBuilder stringbuilder = new StringBuilder();

      try {
         stringbuilder.append(String.format(Locale.ROOT, "World: (%d,%d,%d)", var1, var2, var3));
      } catch (Throwable throwable2) {
         stringbuilder.append("(Error finding world loc)");
      }

      stringbuilder.append(", ");

      try {
         int i = class01296.N(var1);
         int j = class01296.N(var2);
         int k = class01296.N(var3);
         int l = var1 & 15;
         int i1 = var2 & 15;
         int j1 = var3 & 15;
         int k1 = class01296.L(i);
         int l1 = var0.method_31607();
         int i2 = class01296.L(k);
         int j2 = class01296.L(i + 1) - 1;
         int k2 = var0.method_31600();
         int l2 = class01296.L(k + 1) - 1;
         stringbuilder.append(
            String.format(
               Locale.ROOT, "Section: (at %d,%d,%d in %d,%d,%d; chunk contains blocks %d,%d,%d to %d,%d,%d)", l, i1, j1, i, j, k, k1, l1, i2, j2, k2, l2
            )
         );
      } catch (Throwable throwable1) {
         stringbuilder.append("(Error finding chunk loc)");
      }

      stringbuilder.append(", ");

      try {
         int i3 = var1 >> 9;
         int j3 = var3 >> 9;
         int k3 = i3 << 5;
         int l3 = j3 << 5;
         int i4 = (i3 + 1 << 5) - 1;
         int j4 = (j3 + 1 << 5) - 1;
         int k4 = i3 << 9;
         int l4 = var0.method_31607();
         int i5 = j3 << 9;
         int j5 = (i3 + 1 << 9) - 1;
         int k5 = var0.method_31600();
         int l5 = (j3 + 1 << 9) - 1;
         stringbuilder.append(
            String.format(
               Locale.ROOT, "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,%d,%d to %d,%d,%d)", i3, j3, k3, l3, i4, j4, k4, l4, i5, j5, k5, l5
            )
         );
      } catch (Throwable throwable) {
         stringbuilder.append("(Error finding world loc)");
      }

      return stringbuilder.toString();
   }

   public class07074 N(String var1, class07455<String> var2) {
      try {
         this.N(var1, var2.call());
      } catch (Throwable throwable) {
         this.N(var1, throwable);
      }

      return this;
   }

   public class07074 N(String var1, Object var2) {
      this.y.add(new class10712(var1, var2));
      return this;
   }

   public void N(String var1, Throwable var2) {
      this.N(var1, (Object)var2);
   }

   public static String N(class05474 var0, double var1, double var3, double var5) {
      return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", var1, var3, var5, N(var0, class07209.method_49637(var1, var3, var5)));
   }
}
