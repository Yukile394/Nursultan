package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public interface class04376 {
   class07211[] N = new class07211[]{
      class07211.field_11039, class07211.field_11034, class07211.field_11033, class07211.field_11036, class07211.field_11043, class07211.field_11035
   };

   static void N(class07284 var0, class07211 var1, class07209 var2, class07209 var3, class00500 var4, int var5, int var6) {
      class00500 class00500x = var0.method_8320(var2);
      if ((var5 & 128) == 0 || !class00500x.N(class00869.Lf)) {
         class00500 class00500x = class00500x.N(var0, var0, var2, var1, var3, var4, var0.method_8409());
         class00891.N(class00500x, class00500x, var0, var2, var5, var6);
      }
   }

   static void N(class07299 var0, class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5) {
      try {
         var1.N(var0, var2, var3, var4, var5);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Exception while updating neighbours");
         class07074 class07074 = class07080.N("Block being updated");
         class07074.N("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", class04206.i.y(var3), var3.w(), var3.getClass().getCanonicalName());
            } catch (Throwable throwable1) {
               return "ID #" + class04206.i.y(var3);
            }
         });
         class07074.N(class07074, var0, var2, var1);
         throw new class07878(class07080);
      }
   }

   void N(class07211 var1, class00500 var2, class07209 var3, class07209 var4, int var5, int var6);

   default void N(class07209 var1, class00891 var2, @Nullable class07211 var3, @Nullable class02733 var4) {
      for (class07211 class07211 : N) {
         if (class07211 != var3) {
            this.N(var1.method_10093(class07211), var2, null);
         }
      }
   }

   void N(class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5);

   void N(class07209 var1, class00891 var2, @Nullable class02733 var3);
}
