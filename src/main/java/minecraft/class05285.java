package minecraft;

import java.util.Arrays;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Vector3f;
import org.joml.Vector3i;

public enum class05285 {
   field_23362(0, 1, 2),
   field_23363(1, 0, 2),
   field_23364(0, 2, 1),
   field_23366(2, 0, 1),
   field_23365(1, 2, 0),
   field_23367(2, 1, 0);

   private final int field_63625;
   private final int field_63626;
   private final int field_63627;
   private final Matrix3fc field_23369;
   private static final class05285[][] field_57036 = class07536.N(
      () -> {
         class05285[] aclass05285 = values();
         class05285[][] aclass052851 = new class05285[aclass05285.length][aclass05285.length];

         for (class05285 class05285xx : aclass05285) {
            for (class05285 class05285x : aclass05285) {
               int i = class05285xx.N(class05285x.field_63625);
               int j = class05285xx.N(class05285x.field_63626);
               int k = class05285xx.N(class05285x.field_63627);
               class05285 class05285xx = Arrays.stream(aclass05285)
                  .filter(var3 -> var3.field_63625 == i && var3.field_63626 == j && var3.field_63627 == k)
                  .findFirst()
                  .get();
               aclass052851[class05285xx.ordinal()][class05285x.ordinal()] = class05285xx;
            }
         }

         return aclass052851;
      }
   );
   private static final class05285[] field_63628 = class07536.N(
      () -> Arrays.stream(values()).map(var0 -> Arrays.stream(values()).filter(var1 -> var0.N(var1) == field_23362).findAny().get()).toArray(class05285[]::new)
   );

   private class05285(int var3, int var4, int var5) {
      this.field_63625 = var3;
      this.field_63626 = var4;
      this.field_63627 = var5;
      this.field_23369 = new Matrix3f().zero().set(this.N(0), 0, 1.0F).set(this.N(1), 1, 1.0F).set(this.N(2), 2, 1.0F);
   }

   public Matrix3fc y() {
      return this.field_23369;
   }

   public int N(int var1) {
      return switch (var1) {
         case 0 -> this.field_63625;
         case 1 -> this.field_63626;
         case 2 -> this.field_63627;
         default -> throw new IllegalArgumentException("Must be 0, 1 or 2, but got " + var1);
      };
   }

   public class05285 N() {
      return field_63628[this.ordinal()];
   }

   public class05285 N(class05285 var1) {
      return field_57036[this.ordinal()][var1.ordinal()];
   }

   public Vector3i N(Vector3i var1) {
      int i = var1.get(this.field_63625);
      int j = var1.get(this.field_63626);
      int k = var1.get(this.field_63627);
      return var1.set(i, j, k);
   }

   public Vector3f N(Vector3f var1) {
      float f = var1.get(this.field_63625);
      float f1 = var1.get(this.field_63626);
      float f2 = var1.get(this.field_63627);
      return var1.set(f, f1, f2);
   }

   public class07185 N(class07185 var1) {
      return class07185.field_23780[this.N(var1.ordinal())];
   }
}
