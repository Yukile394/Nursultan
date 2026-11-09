package minecraft;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import net.caffeinemc.mods.lithium.common.shapes.OffsetVoxelShapeCache;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public abstract class class00494 implements OffsetVoxelShapeCache {
   public final class07739 field_1401;
   @Nullable
   private class00494[] field_19318;
   private volatile class00494[] offsetAndSimplified;
   private static final double POSITIVE_EPSILON = 1.0E-7;
   private static final double NEGATIVE_EPSILON = -1.0E-7;

   public class00494 method_66507(class00753 var1) {
      return this.method_1096(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public abstract DoubleList method_1109(class07185 var1);

   public class00494(class07739 var1) {
      super();
      this.field_1401 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @Override
   public String toString() {
      return this.method_1110() ? "EMPTY" : "VoxelShape[" + this.method_1107() + "]";
   }

   public class00494 method_64034(class06889 var1) {
      return this.method_1096(var1.M, var1.B, var1.Z);
   }

   public double method_1108(class07185 var1, class00734 var2, double var3) {
      return this.method_1103(class07214.N(var1, class07185.field_11048), var2, var3);
   }

   public List<class00734> method_1090() {
      ArrayList arraylist = Lists.newArrayList();
      this.method_1089((var1x, var3, var5, var7, var9, var11) -> arraylist.add(new class00734(var1x, var3, var5, var7, var9, var11)));
      return arraylist;
   }

   public boolean method_1110() {
      return this.field_1401.method_1056();
   }

   public class00734 method_1107() {
      if (this.method_1110()) {
         throw (UnsupportedOperationException)class07536.y(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new class00734(
            this.method_1091(class07185.field_11048),
            this.method_1091(class07185.field_11052),
            this.method_1091(class07185.field_11051),
            this.method_1105(class07185.field_11048),
            this.method_1105(class07185.field_11052),
            this.method_1105(class07185.field_11051)
         );
      }
   }

   public Optional<class06889> method_33661(class06889 var1) {
      if (this.method_1110()) {
         return Optional.empty();
      } else {
         MutableObject mutableobject = new MutableObject();
         this.method_1089((var2x, var4, var6, var8, var10, var12) -> {
            double d0 = class04995.N(var1.N(), var2x, var8);
            double d1 = class04995.N(var1.y(), var4, var10);
            double d2 = class04995.N(var1.L(), var6, var12);
            class06889 class06889 = (class06889)mutableobject.get();
            if (class06889 == null || var1.L(d0, d1, d2) < var1.M(class06889)) {
               mutableobject.setValue(new class06889(d0, d1, d2));
            }
         });
         return Optional.of(Objects.requireNonNull((class06889)mutableobject.get()));
      }
   }

   @Nullable
   public class06183 method_1092(class06889 var1, class06889 var2, class07209 var3) {
      if (this.method_1110()) {
         return null;
      } else {
         class06889 class06889x = var2.u(var1);
         if (class06889x.B() < 1.0E-7) {
            return null;
         } else {
            class06889 class06889x = var1.i(class06889x.L(0.001));
            return this.field_1401
                  .method_1044(
                     this.method_1100(class07185.field_11048, class06889x.M - var3.method_10263()),
                     this.method_1100(class07185.field_11052, class06889x.B - var3.method_10264()),
                     this.method_1100(class07185.field_11051, class06889x.Z - var3.method_10260())
                  )
               ? new class06183(class06889x, class07211.N(class06889x.M, class06889x.B, class06889x.Z).b(), var3, true)
               : class00734.N(this.method_1090(), var1, var2, var3);
         }
      }
   }

   public double method_1105(class07185 var1) {
      int i = this.field_1401.method_1045(var1);
      return i <= 0 ? Double.NEGATIVE_INFINITY : this.method_1099(var1, i);
   }

   public class00494 method_20538(class07211 var1) {
      if (!this.method_1110() && this != class00389.y()) {
         if (this.field_19318 != null) {
            class00494 class00494x = this.field_19318[var1.ordinal()];
            if (class00494x != null) {
               return class00494x;
            }
         } else {
            this.field_19318 = new class00494[6];
         }

         class00494 class00494 = this.method_1098(var1);
         this.field_19318[var1.ordinal()] = class00494;
         return class00494;
      } else {
         return this;
      }
   }

   protected boolean method_61897() {
      int i = class07185.field_23780.length;

      for (int j = 0; j < i; j++) {
         class07185 class07185 = class07185.field_23780[j];
         if (!this.method_61896(class07185)) {
            return false;
         }
      }

      return true;
   }

   public int method_1100(class07185 var1, double var2) {
      DoubleList doublelist = this.method_1109(var1);
      int i = this.field_1401.method_1051(var1);
      int j = 0;
      int k = i + 1 - j;

      while (k > 0) {
         int l = k / 2;
         int i1 = j + l;
         if (i1 < 0 || i1 <= i && !(var2 < doublelist.getDouble(i1))) {
            j = i1 + 1;
            k -= l + 1;
         } else {
            k = l;
         }
      }

      return j - 1;
   }

   public void method_1104(class00406 var1) {
      this.field_1401
         .method_1064(
            (var2, var3, var4, var5, var6, var7) -> var1.consume(
               this.method_1099(class07185.field_11048, var2),
               this.method_1099(class07185.field_11052, var3),
               this.method_1099(class07185.field_11051, var4),
               this.method_1099(class07185.field_11048, var5),
               this.method_1099(class07185.field_11052, var6),
               this.method_1099(class07185.field_11051, var7)
            ),
            true
         );
   }

   protected double method_1099(class07185 var1, int var2) {
      return this.method_1109(var1).getDouble(var2);
   }

   public double method_35593(class07185 var1, double var2, double var4) {
      class07185 class07185x = class07214.field_10963.N(var1);
      class07185 class07185x = class07214.field_10965.N(var1);
      int i = this.method_1100(class07185x, var2);
      int j = this.method_1100(class07185x, var4);
      int k = this.field_1401.method_35592(var1, i, j);
      return k >= this.field_1401.method_1051(var1) ? Double.POSITIVE_INFINITY : this.method_1099(var1, k);
   }

   private class00494 method_1098(class07211 var1) {
      class07185 class07185 = var1.z();
      if (this.method_61896(class07185)) {
         return this;
      } else {
         class07212 class07212 = var1.i();
         int i = this.method_1100(class07185, class07212 == class07212.field_11056 ? 0.9999999 : 1.0E-7);
         class07260 class07260 = new class07260(this, class07185, i);
         if (class07260.method_1110()) {
            return class00389.N();
         } else {
            return (class00494)(class07260.method_61897() ? class00389.y() : class07260);
         }
      }
   }

   private boolean method_61896(class07185 var1) {
      DoubleList doublelist = this.method_1109(var1);
      return doublelist.size() == 2
         && DoubleMath.fuzzyEquals(doublelist.getDouble(0), 0.0, 1.0E-7)
         && DoubleMath.fuzzyEquals(doublelist.getDouble(1), 1.0, 1.0E-7);
   }

   public double method_1091(class07185 var1) {
      int i = this.field_1401.method_1055(var1);
      return i >= this.field_1401.method_1051(var1) ? Double.POSITIVE_INFINITY : this.method_1099(var1, i);
   }

   public double method_1103(class07214 var1, class00734 var2, double var3) {
      if (this.method_1110()) {
         return var3;
      } else if (Math.abs(var3) < 1.0E-7) {
         return 0.0;
      } else {
         class07214 class07214 = var1.N();
         class07185 class07185xx = class07214.N(class07185.field_11048);
         class07185 class07185x = class07214.N(class07185.field_11052);
         class07185 class07185xx = class07214.N(class07185.field_11051);
         int i = Integer.MIN_VALUE;
         int j = Integer.MIN_VALUE;
         int k = Integer.MIN_VALUE;
         int l = Integer.MIN_VALUE;
         if (var3 > 0.0) {
            double d1 = var2.y(class07185xx);
            int l1 = this.method_1100(class07185xx, d1 - 1.0E-7);
            int i2 = this.field_1401.method_1051(class07185xx);

            for (int i1 = l1 + 1; i1 < i2; i1++) {
               i = i == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class07185x, var2.N(class07185x) + 1.0E-7)) : i;
               j = j == Integer.MIN_VALUE
                  ? Math.min(this.field_1401.method_1051(class07185x), this.method_1100(class07185x, var2.y(class07185x) - 1.0E-7) + 1)
                  : j;

               for (int j1 = i; j1 < j; j1++) {
                  k = k == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class07185xx, var2.N(class07185xx) + 1.0E-7)) : k;
                  l = l == Integer.MIN_VALUE
                     ? Math.min(this.field_1401.method_1051(class07185xx), this.method_1100(class07185xx, var2.y(class07185xx) - 1.0E-7) + 1)
                     : l;

                  for (int k1 = k; k1 < l; k1++) {
                     if (this.field_1401.method_1062(class07214, i1, j1, k1)) {
                        double d0 = this.method_1099(class07185xx, i1) - d1;
                        if (d0 >= -1.0E-7) {
                           var3 = Math.min(var3, d0);
                        }

                        return var3;
                     }
                  }
               }
            }
         } else if (var3 < 0.0) {
            double d3 = var2.N(class07185xx);
            int i3 = this.method_1100(class07185xx, d3 + 1.0E-7);

            for (int j2 = i3 - 1; j2 >= 0; j2--) {
               i = i == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class07185x, var2.N(class07185x) + 1.0E-7)) : i;
               j = j == Integer.MIN_VALUE
                  ? Math.min(this.field_1401.method_1051(class07185x), this.method_1100(class07185x, var2.y(class07185x) - 1.0E-7) + 1)
                  : j;

               for (int k2 = i; k2 < j; k2++) {
                  k = k == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class07185xx, var2.N(class07185xx) + 1.0E-7)) : k;
                  l = l == Integer.MIN_VALUE
                     ? Math.min(this.field_1401.method_1051(class07185xx), this.method_1100(class07185xx, var2.y(class07185xx) - 1.0E-7) + 1)
                     : l;

                  for (int l2 = k; l2 < l; l2++) {
                     if (this.field_1401.method_1062(class07214, j2, k2, l2)) {
                        double d2 = this.method_1099(class07185xx, j2 + 1) - d3;
                        if (d2 <= 1.0E-7) {
                           var3 = Math.max(var3, d2);
                        }

                        return var3;
                     }
                  }
               }
            }
         }

         return var3;
      }
   }

   public class00494 method_52620() {
      return this.method_1110()
         ? class00389.N()
         : class00389.N(
            this.method_1091(class07185.field_11048),
            this.method_1091(class07185.field_11052),
            this.method_1091(class07185.field_11051),
            this.method_1105(class07185.field_11048),
            this.method_1105(class07185.field_11052),
            this.method_1105(class07185.field_11051)
         );
   }

   public class00494 method_1097() {
      class00494[] aclass00494 = new class00494[]{class00389.N()};
      this.method_1089(
         (var1x, var3, var5, var7, var9, var11) -> aclass00494[0] = class00389.y(
            aclass00494[0], class00389.N(var1x, var3, var5, var7, var9, var11), class07003.P
         )
      );
      return aclass00494[0];
   }

   public void method_1089(class00406 var1) {
      DoubleList doublelist = this.method_1109(class07185.field_11048);
      DoubleList doublelist1 = this.method_1109(class07185.field_11052);
      DoubleList doublelist2 = this.method_1109(class07185.field_11051);
      this.field_1401
         .method_1053(
            (var4x, var5, var6, var7, var8, var9) -> var1.consume(
               doublelist.getDouble(var4x),
               doublelist1.getDouble(var5),
               doublelist2.getDouble(var6),
               doublelist.getDouble(var7),
               doublelist1.getDouble(var8),
               doublelist2.getDouble(var9)
            ),
            true
         );
   }

   public void lithium$setShape(float var1, class07211 var2, class00494 var3) {
      if (var3 == null) {
         throw new IllegalArgumentException("offsetShape must not be null!");
      } else {
         int i = getIndexForOffsetSimplifiedShapes(var1, var2);
         class00494[] aclass00494 = this.offsetAndSimplified;
         if (aclass00494 == null) {
            aclass00494 = new class00494[13];
         } else {
            aclass00494 = (class00494[])aclass00494.clone();
         }

         aclass00494[i] = var3;
         this.offsetAndSimplified = aclass00494;
      }
   }

   public double method_1102(class07185 var1, double var2, double var4) {
      class07185 class07185x = class07214.field_10963.N(var1);
      class07185 class07185x = class07214.field_10965.N(var1);
      int i = this.method_1100(class07185x, var2);
      int j = this.method_1100(class07185x, var4);
      int k = this.field_1401.method_1058(var1, i, j);
      return k <= 0 ? Double.NEGATIVE_INFINITY : this.method_1099(var1, k);
   }

   public class00494 method_1096(double var1, double var3, double var5) {
      return (class00494)(this.method_1110()
         ? class00389.N()
         : new class06864(
            this.field_1401,
            new class07255(this.method_1109(class07185.field_11048), var1),
            new class07255(this.method_1109(class07185.field_11052), var3),
            new class07255(this.method_1109(class07185.field_11051), var5)
         ));
   }

   private static int getIndexForOffsetSimplifiedShapes(float var0, class07211 var1) {
      if (var0 != 0.0F && var0 != 0.5F && var0 != 1.0F) {
         throw new IllegalArgumentException("offset must be one of {0f, 0.5f, 1f}");
      } else {
         return var0 == 0.0F ? 0 : (int)(2.0F * var0) + 2 * var1.L();
      }
   }

   public class00494 lithium$getOffsetSimplifiedShape(float var1, class07211 var2) {
      class00494[] aclass00494 = this.offsetAndSimplified;
      if (aclass00494 == null) {
         return null;
      } else {
         int i = getIndexForOffsetSimplifiedShapes(var1, var2);
         return aclass00494[i];
      }
   }
}
