package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class07076 {
   public static final int N = 100;
   public static final int y = 300;
   private static final class00405 L = class00405.N.N(new class00652(class03597.G)).N(new class00401(class00392.y("MCPE-28723")));
   private final List<class07066> u = Lists.newArrayList();
   private final class07438 i;
   private int R;
   private int M;
   private int B;
   private boolean Z;
   private boolean z;

   public void L() {
      int ix = this.Z ? 300 : 100;
      if (this.z && (!this.i.method_5805() || this.i.field_6012 - this.R > ix)) {
         boolean flag = this.Z;
         this.z = false;
         this.Z = false;
         this.B = this.i.field_6012;
         if (flag) {
            this.i.method_6044();
         }

         this.u.clear();
      }
   }

   public class07076(class07438 var1) {
      super();
      this.i = var1;
   }

   @Nullable
   private class07066 u() {
      class07066 class07066xxx = null;
      class07066 class07066x = null;
      float f = 0.0F;
      float f1 = 0.0F;

      for (int ix = 0; ix < this.u.size(); ix++) {
         class07066 class07066xx = this.u.get(ix);
         class07066 class07066xxx = ix > 0 ? this.u.get(ix - 1) : null;
         class07072 class07072 = class07066xx.N();
         boolean flag = class07072.N(class03696.j);
         float f2 = flag ? Float.MAX_VALUE : class07066xx.u();
         if ((class07072.N(class03696.W) || flag) && f2 > 0.0F && (class07066xxx == null || f2 > f1)) {
            if (ix > 0) {
               class07066xxx = class07066xxx;
            } else {
               class07066xxx = class07066xx;
            }

            f1 = f2;
         }

         if (class07066xx.L() != null && (class07066x == null || class07066xx.y() > f)) {
            class07066x = class07066xx;
            f = class07066xx.y();
         }
      }

      if (f1 > 5.0F && class07066xxx != null) {
         return class07066xxx;
      } else {
         return f > 5.0F && class07066x != null ? class07066x : null;
      }
   }

   public int y() {
      return this.Z ? this.i.field_6012 - this.M : this.B - this.M;
   }

   private class00392 N(class07049 var1, class00392 var2, String var3, String var4) {
      class06584 class06584 = var1 instanceof class07438 ? ((class07438)var1).method_6047() : class06584.E;
      return !class06584.R() && class06584.L(class02484.B)
         ? class00392.N(var3, this.i.method_5476(), var2, class06584.V())
         : class00392.N(var4, this.i.method_5476(), var2);
   }

   public void N(class07072 var1, float var2) {
      this.L();
      class04192 class04192 = class04192.N(this.i);
      class07066 class07066 = new class07066(var1, var2, class04192, (float)this.i.field_6017);
      this.u.add(class07066);
      this.R = this.i.field_6012;
      this.z = true;
      if (!this.Z && this.i.method_5805() && N(var1)) {
         this.Z = true;
         this.M = this.i.field_6012;
         this.B = this.M;
         this.i.method_6000();
      }
   }

   @Nullable
   private static class00392 N(@Nullable class07049 var0) {
      return var0 == null ? null : var0.method_5476();
   }

   public class00392 N() {
      if (this.u.isEmpty()) {
         return class00392.N("death.attack.generic", this.i.method_5476());
      } else {
         class07072 class07072 = this.u.get(this.u.size() - 1).N();
         class07066 class07066 = this.u();
         class03700 class03700 = class07072.U().i();
         if (class03700 == class03700.field_42362 && class07066 != null) {
            return this.N(class07066, class07072.u());
         } else if (class03700 == class03700.field_42363) {
            String s = "death.attack." + class07072.R();
            class05216 class05216 = class00390.N((class00392)class00392.L(s + ".link")).L(L);
            return class00392.N(s + ".message", this.i.method_5476(), class05216);
         } else {
            return class07072.N(this.i);
         }
      }
   }

   private static boolean N(class07072 var0) {
      return var0.u() instanceof class07438;
   }

   private class00392 N(class07066 var1, @Nullable class07049 var2) {
      class07072 class07072 = var1.N();
      if (!class07072.N(class03696.W) && !class07072.N(class03696.j)) {
         class00392 class00392 = N(var2);
         class07049 class07049 = class07072.u();
         class00392 class00392x = N(class07049);
         if (class00392x != null && !class00392x.equals(class00392)) {
            return this.N(class07049, class00392x, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (class00392)(class00392 != null
               ? this.N(var2, class00392, "death.fell.finish.item", "death.fell.finish")
               : class00392.N("death.fell.killer", this.i.method_5476()));
         }
      } else {
         class04192 class04192 = Objects.requireNonNullElse(var1.L(), class04192.N);
         return class00392.N(class04192.N(), this.i.method_5476());
      }
   }
}
