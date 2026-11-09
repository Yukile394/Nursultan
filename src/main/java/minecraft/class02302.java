package minecraft;

public enum class02302 implements class05033 {
   field_48899("INACTIVE", 0, "inactive", class02297.field_48911),
   field_48900("ACTIVE", 1, "active", class02297.field_48912),
   field_48901("UNLOCKING", 2, "unlocking", class02297.field_48912),
   field_48902("EJECTING", 3, "ejecting", class02297.field_48912);

   private static final int field_48903 = 20;
   private static final int field_48904 = 20;
   private static final int field_48905 = 20;
   private static final int field_48906 = 20;
   private final String field_48907;
   private final class02297 field_48908;

   class02302(String var3, class02297 var4) {
      this.field_48907 = var3;
      this.field_48908 = var4;
   }

   private static class02302 N(class04782 var0, class07209 var1, class02281 var2, class02296 var3, class02274 var4, double var5) {
      var4.N(var0, var1, var3, var2, var5);
      var3.y(var0.N() + 20L);
      return var4.L() ? field_48900 : field_48899;
   }

   protected void N(class04782 var1, class07209 var2, class02281 var3, class02274 var4) {
   }

   private void N(class04782 var1, class07209 var2, class06584 var3, float var4) {
      class07206.N(var1, var3, 2, class07211.field_11036, class06889.L(var2).N(class07211.field_11036, 1.2));
      var1.N(3017, var2, 0);
      var1.method_8396(null, var2, class04909.OD, class04911.field_15245, 1.0F, 0.8F + 0.4F * var4);
   }

   protected void N(class04782 var1, class07209 var2, class02281 var3, class02274 var4, boolean var5) {
   }

   public int N() {
      return this.field_48908.field_48913;
   }

   public class02302 N(class04782 var1, class07209 var2, class02281 var3, class02296 var4, class02274 var5) {
      return switch (this) {
         case field_48899 -> N(var1, var2, var3, var4, var5, var3.L());
         case field_48900 -> N(var1, var2, var3, var4, var5, var3.u());
         case field_48901 -> {
            var4.y(var1.N() + 20L);
            yield field_48902;
         }
         case field_48902 -> {
            if (var4.u().isEmpty()) {
               var4.i();
               yield N(var1, var2, var3, var4, var5, var3.u());
            } else {
               float f = var4.B();
               this.N(var1, var2, var4.M(), f);
               var5.N(var4.R());
               int i = var4.u().isEmpty() ? 20 : 20;
               var4.y(var1.N() + i);
               yield field_48902;
            }
         }
      };
   }

   public void N(class04782 var1, class07209 var2, class02302 var3, class02281 var4, class02274 var5, boolean var6) {
      this.N(var1, var2, var4, var5);
      var3.N(var1, var2, var4, var5, var6);
   }

   @Override
   public String method_15434() {
      return this.field_48907;
   }
}
