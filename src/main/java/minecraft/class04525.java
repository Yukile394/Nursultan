package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache;
import org.jspecify.annotations.Nullable;

public class class04525 extends class07955 {
   private final Long2ObjectMap<class04425> N = new Long2ObjectOpenHashMap();
   private static final float W = 1.0F;
   private static final float m = 1.1F;
   private static final int P = 10;

   private boolean L(@Nullable class01763 var1) {
      return var1 != null && !var1.Z;
   }

   public class04525() {
      super();
   }

   private boolean y(@Nullable class01763 var1) {
      return var1 != null && var1.U >= 0.0F;
   }

   @Nullable
   @Override
   protected class01763 y(int var1, int var2, int var3) {
      class01763 class01763 = null;
      class04425 class04425 = this.N(var1, var2, var3);
      float f = this.u.N(class04425);
      if (f >= 0.0F) {
         class01763 = this.L(var1, var2, var3);
         class01763.E = class04425;
         class01763.U = Math.max(class01763.U, f);
         if (class04425 == class04425.field_12) {
            class01763.U++;
         }
      }

      return class01763;
   }

   private class04425 y(class02682 var1, int var2, int var3, int var4, class04425 var5) {
      return PathNodeCache.getNodeTypeFromNeighbors(var1, var2, var3, var4, var5);
   }

   @Override
   protected boolean y(class07209 var1) {
      class04425 class04425 = this.N(var1.method_10263(), var1.method_10264(), var1.method_10260());
      return this.u.N(class04425) >= 0.0F;
   }

   @Override
   public class01763 y() {
      int i;
      if (this.R() && this.u.method_5799()) {
         i = this.u.method_31478();
         class07218 class07218 = new class07218(this.u.method_23317(), (double)i, this.u.method_23321());

         for (class00500 var3 = this.L.N(class07218); var3.N(class00869.K); var3 = this.L.N(class07218)) {
            class07218.N(this.u.method_23317(), (double)(++i), this.u.method_23321());
         }
      } else {
         i = class04995.N(this.u.method_23318() + 0.5);
      }

      class07209 class07209 = class07209.method_49637(this.u.method_23317(), i, this.u.method_23321());
      if (!this.y(class07209)) {
         for (class07209 class07209x : this.N(this.u)) {
            if (this.y(class07209x)) {
               return super.N(class07209x);
            }
         }
      }

      return super.N(class07209);
   }

   @Override
   public class04425 N(class02682 var1, int var2, int var3, int var4) {
      class04425 class04425x = var1.N(var2, var3, var4);
      if (class04425x == class04425.field_7 && var3 >= var1.N().method_31607() + 1) {
         class07209 class07209 = new class07209(var2, var3 - 1, var4);
         class04425 class04425x = var1.N(class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
         if (class04425x == class04425.field_3 || class04425x == class04425.field_14) {
            class04425x = class04425.field_3;
         } else if (class04425x == class04425.field_17) {
            class04425x = class04425.field_17;
         } else if (class04425x == class04425.field_21516) {
            class04425x = class04425.field_21516;
         } else if (class04425x == class04425.field_10) {
            if (!class07209.equals(var1.y())) {
               class04425x = class04425.field_10;
            }
         } else {
            class04425x = class04425x != class04425.field_12 && class04425x != class04425.field_7 && class04425x != class04425.field_18
               ? class04425.field_12
               : class04425.field_7;
         }
      }

      if (class04425x == class04425.field_12 || class04425x == class04425.field_7) {
         class04425x = this.y(var1, var2, var3, var4, class04425x);
      }

      return class04425x;
   }

   private Iterable<class07209> N(class07079 var1) {
      class00734 class00734x = var1.method_5829();
      if (!(class00734x.N() < 1.0)) {
         return List.of(
            class07209.method_49637(class00734x.N, var1.method_31478(), class00734x.L),
            class07209.method_49637(class00734x.N, var1.method_31478(), class00734x.R),
            class07209.method_49637(class00734x.u, var1.method_31478(), class00734x.L),
            class07209.method_49637(class00734x.u, var1.method_31478(), class00734x.R)
         );
      } else {
         double d0 = Math.max(0.0, 1.1F - class00734x.u());
         double d1 = Math.max(0.0, 1.1F - class00734x.y());
         double d2 = Math.max(0.0, 1.1F - class00734x.L());
         class00734 class00734x = class00734x.L(d1, d2, d0);
         return class07209.method_27156(
            var1.method_59922(),
            10,
            class04995.N(class00734x.N),
            class04995.N(class00734x.y),
            class04995.N(class00734x.L),
            class04995.N(class00734x.u),
            class04995.N(class00734x.i),
            class04995.N(class00734x.R)
         );
      }
   }

   @Override
   public void N(class00783 var1, class07079 var2) {
      super.N(var1, var2);
      this.N.clear();
      var2.X();
   }

   @Override
   public class04604 N(double var1, double var3, double var5) {
      return this.y(var1, var3, var5);
   }

   @Override
   public int N(class01763[] var1, class01763 var2) {
      int i = 0;
      class01763 class01763xxxxxxxxxxxxxxxxxxxxxxxxx = this.y(var2.N, var2.y, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763x = this.y(var2.N - 1, var2.y, var2.L);
      if (this.L(class01763x)) {
         var1[i++] = class01763x;
      }

      class01763 class01763xx = this.y(var2.N + 1, var2.y, var2.L);
      if (this.L(class01763xx)) {
         var1[i++] = class01763xx;
      }

      class01763 class01763xxx = this.y(var2.N, var2.y, var2.L - 1);
      if (this.L(class01763xxx)) {
         var1[i++] = class01763xxx;
      }

      class01763 class01763xxxx = this.y(var2.N, var2.y + 1, var2.L);
      if (this.L(class01763xxxx)) {
         var1[i++] = class01763xxxx;
      }

      class01763 class01763xxxxx = this.y(var2.N, var2.y - 1, var2.L);
      if (this.L(class01763xxxxx)) {
         var1[i++] = class01763xxxxx;
      }

      class01763 class01763xxxxxx = this.y(var2.N, var2.y + 1, var2.L + 1);
      if (this.L(class01763xxxxxx) && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx) && this.y(class01763xxxx)) {
         var1[i++] = class01763xxxxxx;
      }

      class01763 class01763xxxxxxx = this.y(var2.N - 1, var2.y + 1, var2.L);
      if (this.L(class01763xxxxxxx) && this.y(class01763x) && this.y(class01763xxxx)) {
         var1[i++] = class01763xxxxxxx;
      }

      class01763 class01763xxxxxxxx = this.y(var2.N + 1, var2.y + 1, var2.L);
      if (this.L(class01763xxxxxxxx) && this.y(class01763xx) && this.y(class01763xxxx)) {
         var1[i++] = class01763xxxxxxxx;
      }

      class01763 class01763xxxxxxxxx = this.y(var2.N, var2.y + 1, var2.L - 1);
      if (this.L(class01763xxxxxxxxx) && this.y(class01763xxx) && this.y(class01763xxxx)) {
         var1[i++] = class01763xxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxx = this.y(var2.N, var2.y - 1, var2.L + 1);
      if (this.L(class01763xxxxxxxxxx) && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx) && this.y(class01763xxxxx)) {
         var1[i++] = class01763xxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxx = this.y(var2.N - 1, var2.y - 1, var2.L);
      if (this.L(class01763xxxxxxxxxxx) && this.y(class01763x) && this.y(class01763xxxxx)) {
         var1[i++] = class01763xxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxx = this.y(var2.N + 1, var2.y - 1, var2.L);
      if (this.L(class01763xxxxxxxxxxxx) && this.y(class01763xx) && this.y(class01763xxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxx = this.y(var2.N, var2.y - 1, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxx) && this.y(class01763xxx) && this.y(class01763xxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxx = this.y(var2.N + 1, var2.y, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxxx) && this.y(class01763xxx) && this.y(class01763xx)) {
         var1[i++] = class01763xxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxx = this.y(var2.N + 1, var2.y, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxx) && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx) && this.y(class01763xx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxx = this.y(var2.N - 1, var2.y, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxxxxx) && this.y(class01763xxx) && this.y(class01763x)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxx = this.y(var2.N - 1, var2.y, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxx) && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx) && this.y(class01763x)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxx = this.y(var2.N + 1, var2.y + 1, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxx)
         && this.y(class01763xxx)
         && this.y(class01763xx)
         && this.y(class01763xxxx)
         && this.y(class01763xxxxxxxxx)
         && this.y(class01763xxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxx = this.y(var2.N + 1, var2.y + 1, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xx)
         && this.y(class01763xxxx)
         && this.y(class01763xxxxxx)
         && this.y(class01763xxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxxx = this.y(var2.N - 1, var2.y + 1, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxx)
         && this.y(class01763xxx)
         && this.y(class01763x)
         && this.y(class01763xxxx)
         && this.y(class01763xxxxxxxxx)
         && this.y(class01763xxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxxxx = this.y(var2.N - 1, var2.y + 1, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763x)
         && this.y(class01763xxxx)
         && this.y(class01763xxxxxx)
         && this.y(class01763xxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxxxxx = this.y(var2.N + 1, var2.y - 1, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxx)
         && this.y(class01763xxx)
         && this.y(class01763xx)
         && this.y(class01763xxxxx)
         && this.y(class01763xxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxxxxxx = this.y(var2.N + 1, var2.y - 1, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xx)
         && this.y(class01763xxxxx)
         && this.y(class01763xxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxxxxxxx = this.y(var2.N - 1, var2.y - 1, var2.L - 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxx)
         && this.y(class01763xxx)
         && this.y(class01763x)
         && this.y(class01763xxxxx)
         && this.y(class01763xxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxxxxxx;
      }

      class01763 class01763xxxxxxxxxxxxxxxxxxxxxxxxx = this.y(var2.N - 1, var2.y - 1, var2.L + 1);
      if (this.L(class01763xxxxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxxxxxxxxxxxxxxxx)
         && this.y(class01763x)
         && this.y(class01763xxxxx)
         && this.y(class01763xxxxxxxxxx)
         && this.y(class01763xxxxxxxxxxx)) {
         var1[i++] = class01763xxxxxxxxxxxxxxxxxxxxxxxxx;
      }

      return i;
   }

   @Override
   public void N() {
      this.u.a();
      this.N.clear();
      super.N();
   }

   @Override
   protected class04425 N(int var1, int var2, int var3) {
      return (class04425)this.N.computeIfAbsent(class07209.method_10064(var1, var2, var3), var4 -> this.N(this.L, var1, var2, var3, this.u));
   }
}
