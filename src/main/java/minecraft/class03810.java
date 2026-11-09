package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class03810 {
   private final Map<class03831, List<class06889>> N;

   public class06889 L(class03831 var1, int var2, float var3) {
      List list = this.N.get(var1);
      if (list.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + var1);
      } else {
         return N((class06889)list.get(class04995.N(var2, 0, list.size() - 1)), var3);
      }
   }

   class03810(Map<class03831, List<class06889>> var1) {
      super();
      this.N = var1;
   }

   public class06889 y(class03831 var1, int var2, float var3) {
      class06889 class06889 = this.N(var1, var2, var3);
      if (class06889 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + var1 + " for index: " + var2);
      } else {
         return class06889;
      }
   }

   public class06889 N(class03831 var1) {
      List list = this.N.get(var1);
      if (list != null && !list.isEmpty()) {
         class06889 class06889x = class06889.L;

         for (class06889 class06889x : list) {
            class06889x = class06889x.i(class06889x);
         }

         return class06889x.L((double)(1.0F / list.size()));
      } else {
         throw new IllegalStateException("No attachment points of type: PASSENGER");
      }
   }

   public static class03810 N(float var0, float var1) {
      return N().N(var0, var1);
   }

   private static class06889 N(class06889 var0, float var1) {
      return var0.y(-var1 * (float) (Math.PI / 180.0));
   }

   public static class03839 N() {
      return new class03839();
   }

   @Nullable
   public class06889 N(class03831 var1, int var2, float var3) {
      List list = this.N.get(var1);
      return var2 >= 0 && var2 < list.size() ? N((class06889)list.get(var2), var3) : null;
   }

   public class03810 N(float var1, float var2, float var3) {
      return new class03810(class07536.N_74(class03831.class, var4 -> {
         ArrayList arraylist = new ArrayList();

         for (class06889 class06889 : this.N.get(var4)) {
            arraylist.add(class06889.u(var1, var2, var3));
         }

         return arraylist;
      }));
   }
}
