package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class03928(int id, class04469 fullSignature) {
   public static Object N_0;

   private static void L() {
   }

   public class03928(class04469 var1) {
      this(-1, var1);
   }

   public class03928(int id, @Nullable class04469 fullSignature) {
      super();
      this.id = id;
      this.fullSignature = fullSignature;
   }

   public class03928(int var1) {
      this(var1, null);
   }

   static {
      L();
      i();
   }

   private static void i() {
      N_0 = -1;
   }

   @Nullable
   public class04469 y() {
      return this.fullSignature;
   }

   public static class03928 N(class00667 var0) {
      int i = var0.E() - 1;
      return i == -1 ? new class03928(class04469.N(var0)) : new class03928(i);
   }

   public int N() {
      return this.id;
   }

   public Optional<class04469> N(class03397 var1) {
      return this.fullSignature != null ? Optional.of(this.fullSignature) : Optional.ofNullable(var1.N(this.id));
   }

   public static void N(class00667 var0, class03928 var1) {
      var0.L(var1.N() + 1);
      if (var1.y() != null) {
         class04469.N(var0, var1.y());
      }
   }
}
