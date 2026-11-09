package minecraft;

import Nursultan.class10305;
import java.util.Optional;

public class class04090 {
   public static final class04072[] N = new class04072[]{class04072.field_37598, class04072.field_37599, class04072.field_37600};
   private final class04099 y;

   public class04090(class05543 var1) {
      this(new class04082(var1));
   }

   public class04090(class04099 var1) {
      super();
      this.y = var1;
   }

   public Optional<class04089> N(class07284 var1, class04089 var2, boolean var3) {
      class00500 class00500 = var1.method_8320(var2.N());
      return this.y.N(var1, var2, class00500, var3) ? Optional.of(var2) : Optional.empty();
   }

   private long N(class00500 var1, class07284 var2, class07209 var3, class07211 var4, boolean var5) {
      return class07211.N().map(var6 -> this.N(var1, var2, var3, var4, var6, var5)).filter(Optional::isPresent).count();
   }

   public Optional<class04089> N(class00500 var1, class07284 var2, class07209 var3, class07211 var4, class06069 var5, boolean var6) {
      return class07211.N(var5)
         .stream()
         .map(var6x -> this.N(var1, var2, var3, var4, var6x, var6))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long N(class00500 var1, class07284 var2, class07209 var3, boolean var4) {
      return class07211.N().filter(var2x -> this.y.y(var1, var2x)).map(var5 -> this.N(var1, var2, var3, var5, var4)).reduce(0L, Long::sum);
   }

   public Optional<class04089> N(class00500 var1, class07284 var2, class07209 var3, class06069 var4) {
      return class07211.N(var4)
         .stream()
         .filter(var2x -> this.y.y(var1, var2x))
         .map(var5 -> this.N(var1, var2, var3, var5, var4, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public boolean N(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return class07211.N().anyMatch(var5 -> this.N(var1, var2, var3, var4, var5, this.y::N).isPresent());
   }

   public Optional<class04089> N(class00500 var1, class07290 var2, class07209 var3, class07211 var4, class07211 var5, class10305 var6) {
      if (var5.z() == var4.z()) {
         return Optional.empty();
      } else if (this.y.N(var1) || this.y.N(var1, var4) && !this.y.N(var1, var5)) {
         class04072[] aclass04072 = this.y.N();
         int i = aclass04072.length;

         for (int j = 0; j < i; j++) {
            class04089 class04089 = aclass04072[j].N(var3, var5, var4);
            if (var6.test(var2, var3, class04089)) {
               return Optional.of(class04089);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<class04089> N(class00500 var1, class07284 var2, class07209 var3, class07211 var4, class07211 var5, boolean var6) {
      return this.N(var1, var2, var3, var4, var5, this.y::N).flatMap(var3x -> this.N(var2, var3x, var6));
   }
}
