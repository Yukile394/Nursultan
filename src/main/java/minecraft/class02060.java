package minecraft;

import com.terraformersmc.modmenu.mixin.AccessorGridWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class02060 extends class02040 implements AccessorGridWidget {
   private final List<class02102> L = new ArrayList<>();
   private final List<class02068> u = new ArrayList<>();
   private final class02072 i = class02072.Z();
   private int R = 0;
   private int M = 0;

   public class02060 L(int var1) {
      return this.N(var1).y(var1);
   }

   public class02072 L() {
      return this.i;
   }

   public class02060() {
      this(0, 0);
   }

   public class02060(int var1, int var2) {
      super(var1, var2, 0, 0);
   }

   public class02080 u(int var1) {
      return new class02080(this, var1);
   }

   public class02072 y() {
      return this.i.M();
   }

   public class02060 y(int var1) {
      this.R = var1;
      return this;
   }

   public <T extends class02102> T N(T var1, int var2, int var3, int var4, int var5, Consumer<class02072> var6) {
      return this.N((T)var1, var2, var3, var4, var5, class07536.N(this.y(), var6));
   }

   @Override
   public void N(Consumer<class02102> var1) {
      this.L.forEach(var1);
   }

   @Override
   public void N() {
      super.N();
      int ix = 0;
      int j = 0;

      for (class02068 class02068xx : this.u) {
         ix = Math.max(class02068xx.L(), ix);
         j = Math.max(class02068xx.u(), j);
      }

      int[] aint = new int[j + 1];
      int[] aint1 = new int[ix + 1];

      for (class02068 class02068x : this.u) {
         int var7 = class02068x.N() - (class02068x.i - 1) * this.R;
         class02084 class02084x = new class02084(var7, class02068x.i);

         for (int l = class02068x.L; l <= class02068x.L(); l++) {
            aint1[l] = Math.max(aint1[l], class02084x.nextInt());
         }

         int l1 = class02068x.y() - (class02068x.R - 1) * this.M;
         class02084 class02084x = new class02084(l1, class02068x.R);

         for (int i1 = class02068x.u; i1 <= class02068x.u(); i1++) {
            aint[i1] = Math.max(aint[i1], class02084x.nextInt());
         }
      }

      int[] aint2 = new int[j + 1];
      int[] aint3 = new int[ix + 1];
      aint2[0] = 0;

      for (int j1 = 1; j1 <= j; j1++) {
         aint2[j1] = aint2[j1 - 1] + aint[j1 - 1] + this.M;
      }

      aint3[0] = 0;

      for (int k1 = 1; k1 <= ix; k1++) {
         aint3[k1] = aint3[k1 - 1] + aint1[k1 - 1] + this.R;
      }

      for (class02068 class02068 : this.u) {
         int i2 = 0;

         for (int j2 = class02068.u; j2 <= class02068.u(); j2++) {
            i2 += aint[j2];
         }

         i2 += this.M * (class02068.R - 1);
         class02068.N(this.method_46426() + aint2[class02068.u], i2);
         int k2 = 0;

         for (int l2 = class02068.L; l2 <= class02068.L(); l2++) {
            k2 += aint1[l2];
         }

         k2 += this.R * (class02068.i - 1);
         class02068.y(this.method_46427() + aint3[class02068.L], k2);
      }

      this.N = aint2[j] + aint[j];
      this.y = aint3[ix] + aint1[ix];
   }

   public <T extends class02102> T N(T var1, int var2, int var3, Consumer<class02072> var4) {
      return this.N((T)var1, var2, var3, 1, 1, class07536.N(this.y(), var4));
   }

   public <T extends class02102> T N(T var1, int var2, int var3, int var4, int var5) {
      return this.N((T)var1, var2, var3, var4, var5, this.y());
   }

   public <T extends class02102> T N(T var1, int var2, int var3, int var4, int var5, class02072 var6) {
      if (var4 < 1) {
         throw new IllegalArgumentException("Occupied rows must be at least 1");
      } else if (var5 < 1) {
         throw new IllegalArgumentException("Occupied columns must be at least 1");
      } else {
         this.u.add(new class02068(var1, var2, var3, var4, var5, var6));
         this.L.add(var1);
         return (T)var1;
      }
   }

   public <T extends class02102> T N(T var1, int var2, int var3) {
      return this.N((T)var1, var2, var3, this.y());
   }

   public class02060 N(int var1) {
      this.M = var1;
      return this;
   }

   public <T extends class02102> T N(T var1, int var2, int var3, class02072 var4) {
      return this.N((T)var1, var2, var3, 1, 1, var4);
   }
}
