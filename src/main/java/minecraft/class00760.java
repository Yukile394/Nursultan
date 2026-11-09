package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import org.jspecify.annotations.Nullable;

public class class00760 {
   private final int N;
   private final Object2IntOpenHashMap<class07428> y;
   private final class05214 L;
   private final Object2IntMap<class07428> u;
   private final class03218 i;
   @Nullable
   private class07209 R;
   @Nullable
   private class07078<?> M;
   private double B;

   class00760(int var1, Object2IntOpenHashMap<class07428> var2, class05214 var3, class03218 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.i = var4;
      this.u = Object2IntMaps.unmodifiable(var2);
   }

   public Object2IntMap<class07428> y() {
      return this.u;
   }

   boolean N(class07428 var1, class07321 var2) {
      return this.i.N(var1, var2) || class07529.Nb;
   }

   boolean N(class07428 var1) {
      int ix = var1.y() * this.N / class00803.u;
      return this.y.getInt(var1) < ix;
   }

   public int N() {
      return this.N;
   }

   public void N(class07079 var1, class08050 var2) {
      class07078<?> class07078 = var1.method_5864();
      class07209 class07209 = var1.method_24515();
      double d0;
      if (class07209.equals(this.R) && class07078 == this.M) {
         d0 = this.B;
      } else {
         class01043 class01043 = class00803.N(class07209, var2).N().N(class07078);
         if (class01043 != null) {
            d0 = class01043.y();
         } else {
            d0 = 0.0;
         }
      }

      this.L.N(class07209, d0);
      class07428 class07428 = class07078.i();
      this.y.addTo(class07428, 1);
      this.i.N(new class07321(class07209), class07428);
   }

   public boolean N(class07078<?> var1, class07209 var2, class08050 var3) {
      this.R = var2;
      this.M = var1;
      class01043 class01043 = class00803.N(var2, var3).N().N(var1);
      if (class01043 == null) {
         this.B = 0.0;
         return true;
      } else {
         double d0 = class01043.y();
         this.B = d0;
         return this.L.y(var2, d0) <= class01043.N();
      }
   }
}
