package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public enum class07185 implements class05033, Predicate<class07211> {
   field_11048("X", 0, "x"),
   field_11052("Y", 1, "y"),
   field_11051("Z", 2, "z");

   public static final class07185[] field_23780 = values();
   public static final class05031<class07185> field_25065 = class05033.N(class07185::values);
   private final String field_11053;

   public boolean L() {
      return this == field_11048 || this == field_11051;
   }

   public class07221 M() {
      return switch (this) {
         case field_11048, field_11051 -> class07221.field_11062;
         case field_11052 -> class07221.field_11064;
      };
   }

   class07185(String var3) {
      this.field_11053 = var3;
   }

   @Override
   public String toString() {
      return this.field_11053;
   }

   public abstract class07211 i();

   public abstract class07211 u();

   public boolean y() {
      return this == field_11052;
   }

   public abstract int N(int var1, int var2, int var3);

   public abstract double N(double var1, double var3, double var5);

   public abstract boolean N(boolean var1, boolean var2, boolean var3);

   public String N() {
      return this.field_11053;
   }

   public boolean test(@Nullable class07211 var1) {
      return var1 != null && var1.z() == this;
   }

   public static class07185 N(class06069 var0) {
      return class07536.N((class07185[])field_23780, var0);
   }

   @Nullable
   public static class07185 N(String var0) {
      return field_25065.N(var0);
   }

   public class07211[] R() {
      return new class07211[]{this.u(), this.i()};
   }

   @Override
   public String method_15434() {
      return this.field_11053;
   }
}
