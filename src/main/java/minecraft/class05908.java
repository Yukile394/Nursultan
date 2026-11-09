package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class05908 {
   private final class04162 N;
   private final class06069 y;
   private final class02063 L;
   private final Set<class05925<?>> u = Sets.newLinkedHashSet();

   @Nullable
   public <T> T L(class07491<T> var1) {
      return this.N.y().L(var1);
   }

   public float L() {
      return this.N.L();
   }

   public void L(class05925<?> var1) {
      this.u.remove(var1);
   }

   class05908(class04162 var1, class06069 var2, class02063 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class04782 u() {
      return this.N.N();
   }

   public class06069 y() {
      return this.y;
   }

   public <T> T y(class07491<T> var1) {
      return this.N.y().y(var1);
   }

   public boolean y(class05925<?> var1) {
      return this.u.add(var1);
   }

   public static class05925<class08122> N(class08122 var0) {
      return new class05925<>(class03347.y, var0);
   }

   public static class05925<class05074> N(class05074 var0) {
      return new class05925<>(class03347.L, var0);
   }

   public static class05925<class05957> N(class05957 var0) {
      return new class05925<>(class03347.N, var0);
   }

   public boolean N(class05925<?> var1) {
      return this.u.contains(var1);
   }

   public class02063 N() {
      return this.L;
   }

   public void N(class01894 var1, Consumer<class06584> var2) {
      this.N.N(var1, var2);
   }

   public boolean N(class07491<?> var1) {
      return this.N.y().N(var1);
   }
}
