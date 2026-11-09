package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public enum class07211 implements class05033 {
   field_11033(0, 1, -1, "down", class07212.field_11060, class07185.field_11052, new class00753(0, -1, 0)),
   field_11036(1, 0, -1, "up", class07212.field_11056, class07185.field_11052, new class00753(0, 1, 0)),
   field_11043(2, 3, 2, "north", class07212.field_11060, class07185.field_11051, new class00753(0, 0, -1)),
   field_11035(3, 2, 0, "south", class07212.field_11056, class07185.field_11051, new class00753(0, 0, 1)),
   field_11039(4, 5, 1, "west", class07212.field_11060, class07185.field_11048, new class00753(-1, 0, 0)),
   field_11034(5, 4, 3, "east", class07212.field_11056, class07185.field_11048, new class00753(1, 0, 0));

   public static final class05031<class07211> field_29502 = class05033.N(class07211::values);
   public static final Codec<class07211> field_35088 = field_29502.validate(class07211::y);
   public static final IntFunction<class07211> field_48449 = class02121.N(class07211::L, values(), class02126.field_41665);
   public static final class02362<ByteBuf, class07211> field_48450 = class02389.N(field_48449, class07211::L);
   @Deprecated
   public static final Codec<class07211> field_57037 = Codec.BYTE.xmap(class07211::N, var0 -> (byte)var0.L());
   @Deprecated
   public static final Codec<class07211> field_57038 = Codec.BYTE.xmap(class07211::y, var0 -> (byte)var0.u());
   public static final ImmutableList<class07185> field_61964 = ImmutableList.of(class07185.field_11052, class07185.field_11048, class07185.field_11051);
   private static final ImmutableList<class07185> field_61965 = ImmutableList.of(class07185.field_11052, class07185.field_11051, class07185.field_11048);
   private final int field_11032;
   private final int field_11031;
   private final int field_11030;
   private final String field_11046;
   private final class07185 field_11047;
   private final class07212 field_11044;
   private final class00753 field_11042;
   private final class06889 field_53685;
   private final Vector3fc field_57039;
   private static final class07211[] field_11040 = values();
   private static final class07211[] field_11038 = Arrays.stream(field_11040)
      .sorted(Comparator.comparingInt(var0 -> var0.field_11032))
      .toArray(class07211[]::new);
   private static final class07211[] field_11041 = Arrays.stream(field_11040)
      .filter(var0 -> var0.z().L())
      .sorted(Comparator.comparingInt(var0 -> var0.field_11030))
      .toArray(class07211[]::new);
   private int offsetX;
   private int offsetY;
   private int offsetZ;

   public int L() {
      return this.field_11032;
   }

   public class07211 M() {
      return switch (this) {
         case field_11043 -> field_11039;
         case field_11035 -> field_11034;
         case field_11039 -> field_11035;
         case field_11034 -> field_11043;
         default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
      };
   }

   public int P() {
      return this.offsetX;
   }

   public int T() {
      return this.offsetZ;
   }

   private class07211(int var3, int var4, int var5, String var6, class07212 var7, class07185 var8, class00753 var9) {
      this.field_11032 = var3;
      this.field_11030 = var5;
      this.field_11031 = var4;
      this.field_11046 = var6;
      this.field_11047 = var8;
      this.field_11044 = var7;
      this.field_11042 = var9;
      this.field_53685 = class06889.N(var9);
      this.field_57039 = new Vector3f(var9.method_10263(), var9.method_10264(), var9.method_10260());
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   @Override
   public String toString() {
      return this.field_11046;
   }

   public Vector3f B() {
      return new Vector3f(this.field_57039);
   }

   public String Z() {
      return this.field_11046;
   }

   public class07212 i() {
      return this.field_11044;
   }

   public class07211 b() {
      return field_11040[this.field_11031];
   }

   public int s() {
      return this.offsetY;
   }

   private class07211 n() {
      return switch (this) {
         case field_11033 -> field_11039;
         case field_11036 -> field_11034;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case field_11039 -> field_11036;
         case field_11034 -> field_11033;
      };
   }

   public Vector3fc m() {
      return this.field_57039;
   }

   private class07211 t() {
      return switch (this) {
         case field_11033 -> field_11034;
         case field_11036 -> field_11039;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case field_11039 -> field_11033;
         case field_11034 -> field_11036;
      };
   }

   private class07211 v() {
      return switch (this) {
         case field_11033 -> field_11043;
         case field_11036 -> field_11035;
         case field_11043 -> field_11036;
         case field_11035 -> field_11033;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private class07211 j() {
      return switch (this) {
         case field_11033 -> field_11035;
         case field_11036 -> field_11043;
         case field_11043 -> field_11033;
         case field_11035 -> field_11036;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   public float U() {
      return (this.field_11030 & 3) * 90;
   }

   public class07185 z() {
      return this.field_11047;
   }

   public int u() {
      return this.field_11030;
   }

   private static DataResult<class07211> y(class07211 var0) {
      return var0.z().y() ? DataResult.success(var0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public Quaternionf y() {
      return switch (this) {
         case field_11033 -> new Quaternionf().rotationX((float) Math.PI);
         case field_11036 -> new Quaternionf();
         case field_11043 -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) Math.PI);
         case field_11035 -> new Quaternionf().rotationX((float) (Math.PI / 2));
         case field_11039 -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2));
         case field_11034 -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) (-Math.PI / 2));
      };
   }

   public static ImmutableList<class07185> y(class06889 var0) {
      return Math.abs(var0.M) < Math.abs(var0.Z) ? field_61965 : field_61964;
   }

   public class07211 y(class07185 var1) {
      return switch (var1) {
         case field_11048 -> this != field_11039 && this != field_11034 ? this.v() : this;
         case field_11052 -> this != field_11036 && this != field_11033 ? this.M() : this;
         case field_11051 -> this != field_11043 && this != field_11035 ? this.t() : this;
      };
   }

   public static class07211 y(int var0) {
      return field_11041[class04995.N(var0 % field_11041.length)];
   }

   public static class07211 y(class06069 var0) {
      return field_11040[var0.y(field_11040.length)];
   }

   public class00753 E() {
      return this.field_11042;
   }

   public class07211 N(class07185 var1) {
      return switch (var1) {
         case field_11048 -> this != field_11039 && this != field_11034 ? this.j() : this;
         case field_11052 -> this != field_11036 && this != field_11033 ? this.R() : this;
         case field_11051 -> this != field_11043 && this != field_11035 ? this.n() : this;
      };
   }

   public static class07211 N(class07049 var0, class07185 var1) {
      return switch (var1) {
         case field_11048 -> field_11034.N(var0.method_5705(1.0F)) ? field_11034 : field_11039;
         case field_11052 -> var0.method_5695(1.0F) < 0.0F ? field_11036 : field_11033;
         case field_11051 -> field_11035.N(var0.method_5705(1.0F)) ? field_11035 : field_11043;
      };
   }

   public static class07211 N(Matrix4fc var0, class07211 var1) {
      Vector3f vector3f = var0.transformDirection(var1.field_57039, new Vector3f());
      return N(vector3f.x(), vector3f.y(), vector3f.z());
   }

   private static class07211[] N(class07211 var0, class07211 var1, class07211 var2) {
      return new class07211[]{var0, var1, var2, var2.b(), var1.b(), var0.b()};
   }

   public static class07211[] N(class07049 var0) {
      float f = var0.method_5695(1.0F) * (float) (Math.PI / 180.0);
      float f1 = -var0.method_5705(1.0F) * (float) (Math.PI / 180.0);
      float f2 = class04995.m(f);
      float f3 = class04995.P(f);
      float f4 = class04995.m(f1);
      float f5 = class04995.P(f1);
      boolean flag = f4 > 0.0F;
      boolean flag1 = f2 < 0.0F;
      boolean flag2 = f5 > 0.0F;
      float f6 = flag ? f4 : -f4;
      float f7 = flag1 ? -f2 : f2;
      float f8 = flag2 ? f5 : -f5;
      float f9 = f6 * f3;
      float f10 = f8 * f3;
      class07211 class07211xx = flag ? field_11034 : field_11039;
      class07211 class07211x = flag1 ? field_11036 : field_11033;
      class07211 class07211xx = flag2 ? field_11035 : field_11043;
      if (f6 > f8) {
         if (f7 > f9) {
            return N(class07211x, class07211xx, class07211xx);
         } else {
            return f10 > f7 ? N(class07211xx, class07211xx, class07211x) : N(class07211xx, class07211x, class07211xx);
         }
      } else if (f7 > f10) {
         return N(class07211x, class07211xx, class07211xx);
      } else {
         return f9 > f7 ? N(class07211xx, class07211xx, class07211x) : N(class07211xx, class07211x, class07211xx);
      }
   }

   public static class07211 N(float var0, float var1, float var2) {
      if (var0 == 0.0F && var1 == 0.0F && var2 == 0.0F) {
         return field_11043;
      } else {
         float f = Math.abs(var1);
         float f1 = Math.abs(var2);
         float f2 = Math.abs(var0);
         if (f >= f1) {
            if (f >= f2) {
               if (var1 <= 0.0F) {
                  return field_11033;
               }

               return field_11036;
            }
         } else if (f1 >= f2) {
            if (var2 <= 0.0F) {
               return field_11043;
            }

            return field_11035;
         }

         return var0 <= 0.0F ? field_11039 : field_11034;
      }
   }

   public static float N(class07211 var0) {
      return switch (var0) {
         case field_11043 -> 180.0F;
         case field_11035 -> 0.0F;
         case field_11039 -> 90.0F;
         case field_11034 -> -90.0F;
         default -> throw new IllegalStateException("No y-Rot for vertical axis: " + var0);
      };
   }

   public static Stream<class07211> N() {
      return Stream.of(field_11040);
   }

   private void N(String var1, int var2, int var3, int var4, int var5, String var6, class07212 var7, class07185 var8, class00753 var9, CallbackInfo var10) {
      this.offsetX = var9.method_10263();
      this.offsetY = var9.method_10264();
      this.offsetZ = var9.method_10260();
   }

   public static Collection<class07211> N(class06069 var0) {
      return class07536.y(values(), var0);
   }

   public static class07211 N(double var0, double var2, double var4) {
      return N((float)var0, (float)var2, (float)var4);
   }

   public static class07211 N(class06889 var0) {
      return N(var0.M, var0.B, var0.Z);
   }

   @Nullable
   public static class07211 N(int var0, int var1, int var2, @Nullable class07211 var3) {
      int i = Math.abs(var0);
      int j = Math.abs(var1);
      int k = Math.abs(var2);
      if (i > k && i > j) {
         return var0 < 0 ? field_11039 : field_11034;
      } else if (k > i && k > j) {
         return var2 < 0 ? field_11043 : field_11035;
      } else if (j > i && j > k) {
         return var1 < 0 ? field_11033 : field_11036;
      } else {
         return var3;
      }
   }

   @Nullable
   public static class07211 N(String var0) {
      return field_29502.N(var0);
   }

   public static class07211 N(class07185 var0, class07212 var1) {
      return switch (var0) {
         case field_11048 -> var1 == class07212.field_11056 ? field_11034 : field_11039;
         case field_11052 -> var1 == class07212.field_11056 ? field_11036 : field_11033;
         case field_11051 -> var1 == class07212.field_11056 ? field_11035 : field_11043;
      };
   }

   public static class07211 N(double var0) {
      return y(class04995.N(var0 / 90.0 + 0.5) & 3);
   }

   public static class07211 N(int var0) {
      return field_11038[class04995.N(var0 % field_11038.length)];
   }

   public boolean N(float var1) {
      float f = var1 * (float) (Math.PI / 180.0);
      float f1 = -class04995.m(f);
      float f2 = class04995.P(f);
      return this.field_11042.method_10263() * f1 + this.field_11042.method_10260() * f2 > 0.0F;
   }

   @Nullable
   public static class07211 N(class00753 var0, @Nullable class07211 var1) {
      return N(var0.method_10263(), var0.method_10264(), var0.method_10260(), var1);
   }

   public static class07211 N(class07212 var0, class07185 var1) {
      int i = field_11040.length;

      for (int j = 0; j < i; j++) {
         class07211 class07211 = field_11040[j];
         if (class07211.i() == var0 && class07211.z() == var1) {
            return class07211;
         }
      }

      throw new IllegalArgumentException("No such direction: " + var0 + " " + var1);
   }

   public class06889 W() {
      return this.field_53685;
   }

   public class07211 R() {
      return switch (this) {
         case field_11043 -> field_11034;
         case field_11035 -> field_11039;
         case field_11039 -> field_11043;
         case field_11034 -> field_11035;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   @Override
   public String method_15434() {
      return this.field_11046;
   }
}
