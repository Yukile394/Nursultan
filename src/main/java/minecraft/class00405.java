package minecraft;

import Nursultan.class09360;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class class00405 {
   public static final class00405 N = new class00405(null, null, null, null, null, null, null, null, null, null, null);
   public static final int y = 0;
   @Nullable
   final class05194 L;
   @Nullable
   final Integer u;
   @Nullable
   final Boolean i;
   @Nullable
   final Boolean R;
   @Nullable
   final Boolean M;
   @Nullable
   final Boolean B;
   @Nullable
   final Boolean Z;
   @Nullable
   final class00647 z;
   @Nullable
   final class00395 U;
   @Nullable
   final String E;
   @Nullable
   final class00949 W;

   public boolean L() {
      return this.i == Boolean.TRUE;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class00405 L(class06541 var1) {
      class05194 class05194 = this.L;
      Boolean obool = this.i;
      Boolean obool1 = this.R;
      Boolean obool2 = this.B;
      Boolean obool3 = this.M;
      Boolean obool4 = this.Z;
      switch (var1) {
         case field_1051:
            obool4 = true;
            break;
         case field_1067:
            obool = true;
            break;
         case field_1055:
            obool2 = true;
            break;
         case field_1073:
            obool3 = true;
            break;
         case field_1056:
            obool1 = true;
            break;
         case field_1070:
            return N;
         default:
            obool4 = false;
            obool = false;
            obool2 = false;
            obool3 = false;
            obool1 = false;
            class05194 = class05194.N(var1);
      }

      return new class00405(class05194, this.u, obool, obool1, obool3, obool2, obool4, this.z, this.U, this.E, this.W);
   }

   public class00405 L(@Nullable Boolean var1) {
      return Objects.equals(this.M, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, var1, this.B, this.Z, this.z, this.U, this.E, this.W), this.M, var1);
   }

   public boolean M() {
      return this.Z == Boolean.TRUE;
   }

   private class00405(
      @Nullable class05194 var1,
      @Nullable Integer var2,
      @Nullable Boolean var3,
      @Nullable Boolean var4,
      @Nullable Boolean var5,
      @Nullable Boolean var6,
      @Nullable Boolean var7,
      @Nullable class00647 var8,
      @Nullable class00395 var9,
      @Nullable String var10,
      @Nullable class00949 var11
   ) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.U = var9;
      this.E = var10;
      this.W = var11;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class00405 class00405)
            ? false
            : this.i == class00405.i
               && Objects.equals(this.N(), class00405.N())
               && Objects.equals(this.y(), class00405.y())
               && this.R == class00405.R
               && this.Z == class00405.Z
               && this.B == class00405.B
               && this.M == class00405.M
               && Objects.equals(this.z, class00405.z)
               && Objects.equals(this.U, class00405.U)
               && Objects.equals(this.E, class00405.E)
               && Objects.equals(this.W, class00405.W);
      }
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder("{");
      class09360 class09360 = new class09360(this, stringbuilder);
      class09360.N("color", this.L);
      class09360.N("shadowColor", this.u);
      class09360.N("bold", this.i);
      class09360.N("italic", this.R);
      class09360.N("underlined", this.M);
      class09360.N("strikethrough", this.B);
      class09360.N("obfuscated", this.Z);
      class09360.N("clickEvent", this.z);
      class09360.N("hoverEvent", this.U);
      class09360.N("insertion", this.E);
      class09360.N("font", this.W);
      stringbuilder.append("}");
      return stringbuilder.toString();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E);
   }

   public boolean B() {
      return this == N;
   }

   @Nullable
   public class00647 Z() {
      return this.z;
   }

   public class00405 i(@Nullable Boolean var1) {
      return Objects.equals(this.Z, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, var1, this.z, this.U, this.E, this.W), this.Z, var1);
   }

   public boolean i() {
      return this.B == Boolean.TRUE;
   }

   @Nullable
   public String U() {
      return this.E;
   }

   @Nullable
   public class00395 z() {
      return this.U;
   }

   public class00405 u(@Nullable Boolean var1) {
      return Objects.equals(this.B, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, this.M, var1, this.Z, this.z, this.U, this.E, this.W), this.B, var1);
   }

   public boolean u() {
      return this.R == Boolean.TRUE;
   }

   public class00405 y(@Nullable Boolean var1) {
      return Objects.equals(this.R, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, var1, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.R, var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class00405 y(class06541 var1) {
      class05194 class05194 = this.L;
      Boolean obool = this.i;
      Boolean obool1 = this.R;
      Boolean obool2 = this.B;
      Boolean obool3 = this.M;
      Boolean obool4 = this.Z;
      switch (var1) {
         case field_1051:
            obool4 = true;
            break;
         case field_1067:
            obool = true;
            break;
         case field_1055:
            obool2 = true;
            break;
         case field_1073:
            obool3 = true;
            break;
         case field_1056:
            obool1 = true;
            break;
         case field_1070:
            return N;
         default:
            class05194 = class05194.N(var1);
      }

      return new class00405(class05194, this.u, obool, obool1, obool3, obool2, obool4, this.z, this.U, this.E, this.W);
   }

   public class00405 y(int var1) {
      return Objects.equals(this.u, var1)
         ? this
         : N(new class00405(this.L, var1, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.u, var1);
   }

   @Nullable
   public Integer y() {
      return this.u;
   }

   public class00949 E() {
      return (class00949)(this.W != null ? this.W : class00949.y);
   }

   public class00405 N(@Nullable String var1) {
      return Objects.equals(this.E, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, var1, this.W), this.E, var1);
   }

   private static <T> class00405 N(class00405 var0, @Nullable T var1, @Nullable T var2) {
      return var1 != null && var2 == null && var0.equals(N) ? N : var0;
   }

   public static class00405 N(
      Optional<class05194> var0,
      Optional<Integer> var1,
      Optional<Boolean> var2,
      Optional<Boolean> var3,
      Optional<Boolean> var4,
      Optional<Boolean> var5,
      Optional<Boolean> var6,
      Optional<class00647> var7,
      Optional<class00395> var8,
      Optional<String> var9,
      Optional<class00949> var10
   ) {
      class00405 class00405 = new class00405(
         (class05194)var0.orElse(null),
         (Integer)var1.orElse(null),
         (Boolean)var2.orElse(null),
         (Boolean)var3.orElse(null),
         (Boolean)var4.orElse(null),
         (Boolean)var5.orElse(null),
         (Boolean)var6.orElse(null),
         (class00647)var7.orElse(null),
         (class00395)var8.orElse(null),
         (String)var9.orElse(null),
         (class00949)var10.orElse(null)
      );
      return class00405.equals(N) ? N : class00405;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class00405 N(class06541... var1) {
      class05194 class05194 = this.L;
      Boolean obool = this.i;
      Boolean obool1 = this.R;
      Boolean obool2 = this.B;
      Boolean obool3 = this.M;
      Boolean obool4 = this.Z;

      for (class06541 class06541 : var1) {
         switch (class06541) {
            case field_1051:
               obool4 = true;
               break;
            case field_1067:
               obool = true;
               break;
            case field_1055:
               obool2 = true;
               break;
            case field_1073:
               obool3 = true;
               break;
            case field_1056:
               obool1 = true;
               break;
            case field_1070:
               return N;
            default:
               class05194 = class05194.N(class06541);
         }
      }

      return new class00405(class05194, this.u, obool, obool1, obool3, obool2, obool4, this.z, this.U, this.E, this.W);
   }

   public class00405 N(class00405 var1) {
      if (this == N) {
         return var1;
      } else {
         return var1 == N
            ? this
            : new class00405(
               this.L != null ? this.L : var1.L,
               this.u != null ? this.u : var1.u,
               this.i != null ? this.i : var1.i,
               this.R != null ? this.R : var1.R,
               this.M != null ? this.M : var1.M,
               this.B != null ? this.B : var1.B,
               this.Z != null ? this.Z : var1.Z,
               this.z != null ? this.z : var1.z,
               this.U != null ? this.U : var1.U,
               this.E != null ? this.E : var1.E,
               this.W != null ? this.W : var1.W
            );
      }
   }

   @Nullable
   public class05194 N() {
      return this.L;
   }

   public class00405 N(@Nullable class06541 var1) {
      return this.N(var1 != null ? class05194.N(var1) : null);
   }

   public class00405 N(int var1) {
      return this.N(class05194.N(var1));
   }

   public class00405 N(@Nullable Boolean var1) {
      return Objects.equals(this.i, var1)
         ? this
         : N(new class00405(this.L, this.u, var1, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.i, var1);
   }

   public class00405 N(@Nullable class00949 var1) {
      return Objects.equals(this.W, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, var1), this.W, var1);
   }

   public class00405 N(@Nullable class00395 var1) {
      return Objects.equals(this.U, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, var1, this.E, this.W), this.U, var1);
   }

   public class00405 N(@Nullable class00647 var1) {
      return Objects.equals(this.z, var1)
         ? this
         : N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, var1, this.U, this.E, this.W), this.z, var1);
   }

   public class00405 N(@Nullable class05194 var1) {
      return Objects.equals(this.L, var1)
         ? this
         : N(new class00405(var1, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.L, var1);
   }

   public class00405 W() {
      return this.y(0);
   }

   public boolean R() {
      return this.M == Boolean.TRUE;
   }
}
