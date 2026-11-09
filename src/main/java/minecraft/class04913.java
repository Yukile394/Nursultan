package minecraft;

import org.jspecify.annotations.Nullable;

public class class04913 extends class04910 {
   public class04913(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.k, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
   }

   public class04913(class07001 var1) {
      super(class04878.k, var1);
   }

   @Nullable
   public static class04913 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04913(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 4, 4, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 1, 1, 0);
      class07211 class07211 = this.i();
      if (class07211 != class07211.field_11043 && class07211 != class07211.field_11034) {
         this.N(var1, var5, 0, 1, 1, 0, 3, 3, w, w, false);
      } else {
         this.N(var1, var5, 4, 1, 1, 4, 3, 3, w, w, false);
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      class07211 class07211 = this.i();
      if (class07211 != class07211.field_11043 && class07211 != class07211.field_11034) {
         this.y((class04898)var1, var2, var3, 1, 1);
      } else {
         this.L((class04898)var1, var2, var3, 1, 1);
      }
   }
}
