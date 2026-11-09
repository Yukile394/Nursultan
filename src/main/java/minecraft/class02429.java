package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class02429 {
   private final Reference2ObjectMap<class06937, class02444> N = new Reference2ObjectArrayMap();
   private final class02422 y;

   public class02429(class02422 var1) {
      super();
      this.y = var1;
   }

   protected void y(class06937 var1, class00311 var2, class00299 var3) {
      this.N(var1, var2, var3, true);
   }

   public void N(class01054 var1, class06202 var2, int var3, int var4, @Nullable class06937 var5) {
      if (var5 != null) {
         class02444 class02444 = (class02444)this.N.get(var5);
         if (class02444 != null) {
            class06584 class06584 = class02444.N(this.y.currentIndex());
            var1.N((class01590)var2.i_3, class05096.method_25408(var2, class06584), var3, var4, class06584.method_58694(class02484.V));
         }
      }
   }

   public void N(class01054 var1, class06202 var2, boolean var3) {
      this.N.forEach((var4, var5) -> {
         int i = var4.i;
         int j = var4.R;
         if (var5.y() && var3) {
            var1.N(i - 4, j - 4, i + 20, j + 20, 822018048);
         } else {
            var1.N(i, j, i + 16, j + 16, 822018048);
         }

         class06584 class06584 = var5.N(this.y.currentIndex());
         var1.y(class06584, i, j);
         var1.N(i, j, i + 16, j + 16, 822083583);
         if (var5.y()) {
            var1.N((class01590)var2.i_3, class06584, i, j);
         }
      });
   }

   public void N() {
      this.N.clear();
   }

   protected void N(class06937 var1, class00311 var2, class00299 var3) {
      this.N(var1, var2, var3, false);
   }

   private void N(class06937 var1, class00311 var2, class00299 var3, boolean var4) {
      List<class06584> list = var3.N(var2);
      if (!list.isEmpty()) {
         this.N.put(var1, new class02444(list, var4));
      }
   }
}
