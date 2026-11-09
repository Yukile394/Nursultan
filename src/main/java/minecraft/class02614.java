package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class class02614 {
   private final class01999 N;
   private final class03579 y;

   public class02614(class01999 var1, class03579 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   private <E extends class00394> void N(class02586 var1, E var2) {
      class03358 class03358 = this.y.N(var2);
      if (class03358 != null && !class03358.t_()) {
         var1.N.add(var2);
      }
   }

   private class07331 N(Map<class08743, class07331> var1, class03950 var2, class08743 var3) {
      class07331 class07331 = (class07331)var1.get(var3);
      if (class07331 == null) {
         class02579 class02579 = var2.N(var3);
         class07331 = new class07331(class02579, DrawMode.QUADS, class07835.y);
         var1.put(var3, class07331);
      }

      return class07331;
   }

   public class02586 N(class01296 var1, class03498 var2, class03337 var3, class03950 var4) {
      class02586 class02586 = new class02586();
      class07209 class07209xx = var1.z();
      class07209 class07209x = class07209xx.method_10069(15, 15, 15);
      class03503 class03503 = new class03503();
      class01421 class01421 = new class01421();
      class02020.N();
      EnumMap enummap = new EnumMap<>(class08743.class);
      class06069 class06069 = class06069.u();
      ObjectArrayList objectarraylist = new ObjectArrayList();

      for (class07209 class07209xx : class07209.method_10097(class07209xx, class07209x)) {
         class00500 class00500 = var2.method_8320(class07209xx);
         if (class00500.t()) {
            class03503.N(class07209xx);
         }

         if (class00500.k()) {
            class00394 class00394 = var2.method_8321(class07209xx);
            if (class00394 != null) {
               this.N(class02586, class00394);
            }
         }

         class04688 class04688 = class00500.Y();
         if (!class04688.W()) {
            class08743 class08743xx = class05885.N(class04688);
            class07331 class07331x = this.N(enummap, var4, class08743xx);
            this.N.N(class07209xx, var2, class07331x, class00500, class04688);
         }

         if (class00500.b() == class06898.field_11458) {
            class08743 class08743 = class05885.N(class00500);
            class07331 class07331 = this.N(enummap, var4, class08743);
            class06069.N(class00500.y(class07209xx));
            this.N.N(class00500).method_68513(class06069, objectarraylist);
            class01421.N();
            class01421.N(
               (float)class01296.y(class07209xx.method_10263()),
               (float)class01296.y(class07209xx.method_10264()),
               (float)class01296.y(class07209xx.method_10260())
            );
            this.N.N(class00500, class07209xx, var2, class01421, class07331, true, objectarraylist);
            class01421.y();
            objectarraylist.clear();
         }
      }

      for (Entry entry : enummap.entrySet()) {
         class08743 class08743x = (class08743)entry.getKey();
         class02609 class02609 = ((class07331)entry.getValue()).N();
         if (class02609 != null) {
            if (class08743x == class08743.field_60926) {
               class02586.u = class02609.N(var4.N(class08743x), var3);
            }

            class02586.y.put(class08743x, class02609);
         }
      }

      class02020.y();
      class02586.L = class03503.N();
      return class02586;
   }
}
