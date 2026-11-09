package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07285 {
   private final class03734 N;
   @Nullable
   private final class07285 y;
   @Nullable
   private final class07285 L;
   private final int u;
   private final List<class07285> i = Lists.newArrayList();
   private class07285 R;
   @Nullable
   private class07285 M;
   private int B;
   private float Z;
   private float z;
   private float U;
   private float E;

   @Nullable
   private class07285 L() {
      if (this.M != null) {
         return this.M;
      } else {
         return !this.i.isEmpty() ? this.i.get(0) : null;
      }
   }

   public class07285(class03734 var1, @Nullable class07285 var2, @Nullable class07285 var3, int var4, int var5) {
      super();
      if (var1.N().L().isEmpty()) {
         throw new IllegalArgumentException("Can't position an invisible advancement!");
      } else {
         this.N = var1;
         this.y = var2;
         this.L = var3;
         this.u = var4;
         this.R = this;
         this.B = var5;
         this.Z = -1.0F;
         class07285 class07285 = null;

         for (class03734 class03734 : var1.i()) {
            class07285 = this.N(class03734, class07285);
         }
      }
   }

   private void i() {
      this.N.N().L().ifPresent(var1x -> var1x.N(this.B, this.Z));
      if (!this.i.isEmpty()) {
         Iterator<class07285> iterator = this.i.iterator();

         while (iterator.hasNext()) {
            iterator.next().i();
         }
      }
   }

   @Nullable
   private class07285 u() {
      if (this.M != null) {
         return this.M;
      } else {
         return !this.i.isEmpty() ? this.i.get(this.i.size() - 1) : null;
      }
   }

   private void y() {
      float f = 0.0F;
      float f1 = 0.0F;

      for (int ix = this.i.size() - 1; ix >= 0; ix--) {
         class07285 class07285 = this.i.get(ix);
         class07285.Z += f;
         class07285.z += f;
         f1 += class07285.U;
         f += class07285.E + f1;
      }
   }

   @Nullable
   private class07285 N(class03734 var1, @Nullable class07285 var2) {
      if (var1.N().L().isPresent()) {
         var2 = new class07285(var1, this, var2, this.i.size() + 1, this.B + 1);
         this.i.add(var2);
      } else {
         for (class03734 class03734 : var1.i()) {
            var2 = this.N(class03734, var2);
         }
      }

      return var2;
   }

   private class07285 N(class07285 var1, class07285 var2) {
      return this.R != null && var1.y.i.contains(this.R) ? this.R : var2;
   }

   private void N(class07285 var1, float var2) {
      float f = var1.u - this.u;
      if (f != 0.0F) {
         var1.U -= var2 / f;
         this.U += var2 / f;
      }

      var1.E += var2;
      var1.Z += var2;
      var1.z += var2;
   }

   public static void N(class03734 var0) {
      if (var0.N().L().isEmpty()) {
         throw new IllegalArgumentException("Can't position children of an invisible root!");
      } else {
         class07285 class07285 = new class07285(var0, null, null, 1, 0);
         class07285.N();
         float f = class07285.N(0.0F, 0, class07285.Z);
         if (f < 0.0F) {
            class07285.N(-f);
         }

         class07285.i();
      }
   }

   private void N(float var1) {
      this.Z += var1;
      Iterator<class07285> iterator = this.i.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1);
      }
   }

   private float N(float var1, int var2, float var3) {
      this.Z += var1;
      this.B = var2;
      if (this.Z < var3) {
         var3 = this.Z;
      }

      Iterator<class07285> iterator = this.i.iterator();

      while (iterator.hasNext()) {
         var3 = iterator.next().N(var1 + this.z, var2 + 1, var3);
      }

      return var3;
   }

   private void N() {
      if (this.i.isEmpty()) {
         if (this.L != null) {
            this.Z = this.L.Z + 1.0F;
         } else {
            this.Z = 0.0F;
         }
      } else {
         class07285 class07285x = null;

         for (class07285 class07285x : this.i) {
            class07285x.N();
            class07285x = class07285x.N(class07285x == null ? class07285x : class07285x);
         }

         this.y();
         float f = (this.i.get(0).Z + this.i.get(this.i.size() - 1).Z) / 2.0F;
         if (this.L != null) {
            this.Z = this.L.Z + 1.0F;
            this.z = this.Z - f;
         } else {
            this.Z = f;
         }
      }
   }

   private class07285 N(class07285 var1) {
      if (this.L == null) {
         return var1;
      } else {
         class07285 class07285xxx = this;
         class07285 class07285x = this;
         class07285 class07285xx = this.L;
         class07285 class07285xxx = this.y.i.get(0);
         float f = this.z;
         float f1 = this.z;
         float f2 = class07285xx.z;

         float f3;
         for (f3 = class07285xxx.z; class07285xx.u() != null && class07285xxx.L() != null; f1 += class07285x.z) {
            class07285xx = class07285xx.u();
            class07285xxx = class07285xxx.L();
            class07285xxx = class07285xxx.L();
            class07285x = class07285x.u();
            class07285x.R = this;
            float f4 = class07285xx.Z + f2 - (class07285xxx.Z + f) + 1.0F;
            if (f4 > 0.0F) {
               class07285xx.N(this, var1).N(this, f4);
               f += f4;
               f1 += f4;
            }

            f2 += class07285xx.z;
            f += class07285xxx.z;
            f3 += class07285xxx.z;
         }

         if (class07285xx.u() != null && class07285x.u() == null) {
            class07285x.M = class07285xx.u();
            class07285x.z += f2 - f1;
         } else {
            if (class07285xxx.L() != null && class07285xxx.L() == null) {
               class07285xxx.M = class07285xxx.L();
               class07285xxx.z += f - f3;
            }

            var1 = this;
         }

         return var1;
      }
   }
}
