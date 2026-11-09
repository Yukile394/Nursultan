package minecraft;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumMap;
import org.jspecify.annotations.Nullable;

public class class00461 extends class02119 {
   private final boolean N;
   private final Long2ObjectMap<class04425> y = new Long2ObjectOpenHashMap();

   public class00461(boolean var1) {
      super();
      this.N = var1;
   }

   @Override
   public class01763 y() {
      return this.L(class04995.N(this.u.method_5829().N), class04995.N(this.u.method_5829().y + 0.5), class04995.N(this.u.method_5829().L));
   }

   private static boolean y(@Nullable class01763 var0) {
      return var0 != null && var0.U >= 0.0F;
   }

   protected class04425 y(int var1, int var2, int var3) {
      return (class04425)this.y.computeIfAbsent(class07209.method_10064(var1, var2, var3), var4 -> this.N(this.L, var1, var2, var3));
   }

   @Override
   public class04425 N(class02682 var1, int var2, int var3, int var4) {
      return this.N(var1, var2, var3, var4, this.u);
   }

   @Nullable
   protected class01763 N(int var1, int var2, int var3) {
      class01763 class01763 = null;
      class04425 class04425 = this.y(var1, var2, var3);
      if (this.N && class04425 == class04425.field_16 || class04425 == class04425.field_18) {
         float f = this.u.N(class04425);
         if (f >= 0.0F) {
            class01763 = this.L(var1, var2, var3);
            class01763.E = class04425;
            class01763.U = Math.max(class01763.U, f);
            if (this.L.N().method_8316(new class07209(var1, var2, var3)).W()) {
               class01763.U += 8.0F;
            }
         }
      }

      return class01763;
   }

   @Override
   public class04425 N(class02682 var1, int var2, int var3, int var4, class07079 var5) {
      class07218 class07218 = new class07218();

      for (int i = var2; i < var2 + this.R; i++) {
         for (int j = var3; j < var3 + this.M; j++) {
            for (int k = var4; k < var4 + this.B; k++) {
               class00500 class00500x = var1.N(class07218.N(i, j, k));
               class04688 class04688 = class00500x.Y();
               if (class04688.W() && class00500x.N(class08791.field_48) && class00500x.P()) {
                  return class04425.field_16;
               }

               if (!class04688.N(class01231.N)) {
                  return class04425.field_22;
               }
            }
         }
      }

      class00500 class00500x = var1.N(class07218);
      return class00500x.N(class08791.field_48) ? class04425.field_18 : class04425.field_22;
   }

   @Override
   public void N(class00783 var1, class07079 var2) {
      super.N(var1, var2);
      this.y.clear();
   }

   @Override
   public void N() {
      super.N();
      this.y.clear();
   }

   @Override
   public class04604 N(double var1, double var3, double var5) {
      return this.y(var1, var3, var5);
   }

   @Override
   public int N(class01763[] var1, class01763 var2) {
      int i = 0;
      EnumMap enummap = Maps.newEnumMap(class07211.class);

      for (class07211 class07211xx : class07211.values()) {
         class01763 class01763x = this.N(var2.N + class07211xx.P(), var2.y + class07211xx.s(), var2.L + class07211xx.T());
         enummap.put(class07211xx, class01763x);
         if (this.N(class01763x)) {
            var1[i++] = class01763x;
         }
      }

      for (class07211 class07211x : class07221.field_11062) {
         class07211 class07211xx = class07211x.R();
         if (y((class01763)enummap.get(class07211x)) && y((class01763)enummap.get(class07211xx))) {
            class01763 class01763 = this.N(var2.N + class07211x.P() + class07211xx.P(), var2.y, var2.L + class07211x.T() + class07211xx.T());
            if (this.N(class01763)) {
               var1[i++] = class01763;
            }
         }
      }

      return i;
   }

   protected boolean N(@Nullable class01763 var1) {
      return var1 != null && !var1.Z;
   }
}
