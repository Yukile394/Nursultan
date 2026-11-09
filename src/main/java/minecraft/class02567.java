package minecraft;

import java.util.List;

public class class02567 implements class06357 {
   private static final int N = 10;
   private static final int y = 2;
   private final List<class07923> L;

   public class02567(class02590 var1) {
      super();
      this.L = var1.N();
   }

   private static String N(class07923 var0) {
      return var0.N().name();
   }

   @Override
   public void method_32666(class01590 var1, int var2, int var3, int var4, int var5, class01054 var6) {
      for (int i = 0; i < this.L.size(); i++) {
         class07923 class07923 = this.L.get(i);
         int j = var3 + 2 + i * 12;
         class03933.N(var6, class07923.y(), var2 + 2, j, 10);
         var6.y(var1, N(class07923), var2 + 10 + 4, j + 2, -1);
      }
   }

   @Override
   public int method_32664(class01590 var1) {
      int i = 0;

      for (class07923 class07923 : this.L) {
         int j = var1.y(N(class07923));
         if (j > i) {
            i = j;
         }
      }

      return i + 10 + 6;
   }

   @Override
   public int method_32661(class01590 var1) {
      return this.L.size() * 12 + 2;
   }
}
