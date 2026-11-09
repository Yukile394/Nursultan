package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01965 extends class00394 {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "LootTable";
   private static final String L = "LootTableSeed";
   private static final String u = "hit_direction";
   private static final String i = "item";
   private static final int R = 10;
   private static final int M = 40;
   private static final int B = 10;
   private int Z;
   private long m;
   private long P;
   private class06584 s = class06584.E;
   @Nullable
   private class07211 T;
   @Nullable
   private class05946<class05074> b;
   private long j;

   private void L(class04782 var1, class07438 var2, class06584 var3) {
      this.N(var1, var2, var3);
      if (!this.s.R()) {
         double d0 = class07078.Nt.z();
         double d1 = 1.0 - d0;
         double d2 = d0 / 2.0;
         class07211 class07211 = Objects.requireNonNullElse(this.T, class07211.field_11036);
         class07209 class07209 = this.U.method_10079(class07211, 1);
         double d3 = class07209.method_10263() + 0.5 * d1 + d2;
         double d4 = class07209.method_10264() + 0.5 + class07078.Nt.U() / 2.0F;
         double d5 = class07209.method_10260() + 0.5 * d1 + d2;
         class00717 class00717 = new class00717(var1, d3, d4, d5, this.s.N(var1.field_9229.y(21) + 10));
         class00717.method_18799(class06889.L);
         var1.method_8649(class00717);
         this.s = class06584.E;
      }
   }

   @Nullable
   public class07211 L() {
      return this.T;
   }

   public class01965(class07209 var1, class00500 var2) {
      super(class00404.field_42780, var1, var2);
   }

   private boolean B(class08329 var1) {
      if (this.b == null) {
         return false;
      } else {
         var1.N("LootTable", class05074.N, this.b);
         if (this.j != 0L) {
            var1.N("LootTableSeed", this.j);
         }

         return true;
      }
   }

   private boolean u(class08299 var1) {
      this.b = var1.<class05946<class05074>>N("LootTable", class05074.N).orElse(null);
      this.j = var1.N("LootTableSeed", 0L);
      return this.b != null;
   }

   public class06584 u() {
      return this.s;
   }

   private void y(class04782 var1, class07438 var2, class06584 var3) {
      this.L(var1, var2, var3);
      class00500 class00500 = this.w();
      var1.N(3008, this.d(), class00891.W(class00500));
      class00891 class00891x = this.w().i();
      class00891 class00891x;
      if (class00891x instanceof class01979) {
         class00891x = ((class01979)class00891x).y();
      } else {
         class00891x = class00869.N;
      }

      var1.method_8652(this.U, class00891x.W(), 3);
   }

   public class07269 i() {
      return class07269.N(this);
   }

   public boolean N(long var1, class04782 var3, class07438 var4, class07211 var5, class06584 var6) {
      if (this.T == null) {
         this.T = var5;
      }

      this.m = var1 + 40L;
      if (var1 < this.P) {
         return false;
      } else {
         this.P = var1 + 10L;
         this.N(var3, var4, var6);
         int ix = this.R();
         if (++this.Z >= 10) {
            this.y(var3, var4, var6);
            return true;
         } else {
            var3.N(this.d(), this.w().i(), 2);
            int jx = this.R();
            if (ix != jx) {
               class00500 class00500 = this.w().y(class06665.yk, jx);
               var3.method_8652(this.d(), class00500, 3);
            }

            return false;
         }
      }
   }

   public void N(class05946<class05074> var1, long var2) {
      this.b = var1;
      this.j = var2;
   }

   public void N(class04782 var1) {
      if (this.Z != 0 && var1.N() >= this.m) {
         int ix = this.R();
         this.Z = Math.max(0, this.Z - 2);
         int jx = this.R();
         if (ix != jx) {
            var1.method_8652(this.d(), this.w().y(class06665.yk, jx), 3);
         }

         byte b0 = 4;
         this.m = var1.N() + 4L;
      }

      if (this.Z == 0) {
         this.T = null;
         this.m = 0L;
         this.P = 0L;
      } else {
         var1.N(this.d(), this.w().i(), 2);
      }
   }

   @Override
   public class07001 N(class01929 var1) {
      class07001 class07001 = super.N(var1);
      class07001.y("hit_direction", class07211.field_57037, this.T);
      if (!this.s.R()) {
         class03519 class03519 = var1.N(class07713.N);
         class07001.N("item", class06584.y, class03519, this.s);
      }

      return class07001;
   }

   private void N(class04782 var1, class07438 var2, class06584 var3) {
      if (this.b != null) {
         class05074 class05074 = var1.method_8503().yd().N(this.b);
         if (var2 instanceof class04770 class04770) {
            class06912.F.N(class04770, this.b);
         }

         class04162 class04162 = new class04160(var1)
            .N(class06551.B, class06889.y(this.U))
            .N(var2.method_7292())
            .N(class06551.N, var2)
            .N(class06551.U, var3)
            .N(class06925.z);
         ObjectArrayList<class06584> objectarraylist = class05074.N(class04162, this.j);

         this.s = switch (objectarraylist.size()) {
            case 0 -> class06584.E;
            case 1 -> (class06584)objectarraylist.getFirst();
            default -> {
               N.warn("Expected max 1 loot from loot table {}, but got {}", this.b.N(), objectarraylist.size());
               yield (class06584)objectarraylist.getFirst();
            }
         };
         this.b = null;
         this.method_5431();
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      if (!this.u(var1)) {
         this.s = var1.<class06584>N("item", class06584.y).orElse(class06584.E);
      } else {
         this.s = class06584.E;
      }

      this.T = var1.<class07211>N("hit_direction", class07211.field_57037).orElse(null);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.B(var1) && !this.s.R()) {
         var1.N("item", class06584.y, this.s);
      }
   }

   private int R() {
      if (this.Z == 0) {
         return 0;
      } else if (this.Z < 3) {
         return 1;
      } else {
         return this.Z < 6 ? 2 : 3;
      }
   }
}
