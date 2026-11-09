package minecraft;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class05913 {
   public static final Comparator<class05913> N = Comparator.<class05913, class01894>comparing(class05913::N).thenComparing(class05913::y);
   private final class01894 y;
   private final class01894 L;
   @Nullable
   private class07311 u;

   public class05913(class01894 var1, class01894 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class05913 class05913 = (class05913)var1;
         return this.y.equals(class05913.y) && this.L.equals(class05913.L);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.y + ", texture=" + this.L + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.y, this.L);
   }

   public class01894 y() {
      return this.L;
   }

   public class01391 N(class08097 var1, class01407 var2, Function<class01894, class07311> var3, boolean var4, boolean var5) {
      return var1.N(this).method_24108(class02862.N(var2, this.N(var3), var4, var5));
   }

   public class07311 N(Function<class01894, class07311> var1) {
      if (this.u == null) {
         this.u = (class07311)var1.apply(this.y);
      }

      return this.u;
   }

   public class01391 N(class08097 var1, class01407 var2, Function<class01894, class07311> var3) {
      return var1.N(this).method_24108(var2.method_73477(this.N(var3)));
   }

   public class01894 N() {
      return this.y;
   }
}
