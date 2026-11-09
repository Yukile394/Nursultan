package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class04192(String id) {
   public static final class04192 N = new class04192("generic");
   public static final class04192 y = new class04192("ladder");
   public static final class04192 L = new class04192("vines");
   public static final class04192 u = new class04192("weeping_vines");
   public static final class04192 i = new class04192("twisting_vines");
   public static final class04192 R = new class04192("scaffolding");
   public static final class04192 M = new class04192("other_climbable");
   public static final class04192 B = new class04192("water");

   public class04192(String id) {
      this.id = id;
   }

   public String y() {
      return this.id;
   }

   @Nullable
   public static class04192 N(class07438 var0) {
      Optional<class07209> optional = var0.method_24832();
      if (optional.isPresent()) {
         return N(var0.method_73183().method_8320(optional.get()));
      } else {
         return var0.method_5799() ? B : null;
      }
   }

   public static class04192 N(class00500 var0) {
      if (var0.N(class00869.uW) || var0.N(class01210.X)) {
         return y;
      } else if (var0.N(class00869.Rc)) {
         return L;
      } else if (var0.N(class00869.sl) || var0.N(class00869.sd)) {
         return u;
      } else if (var0.N(class00869.sw) || var0.N(class00869.sk)) {
         return i;
      } else {
         return var0.N(class00869.Pa) ? R : M;
      }
   }

   public String N() {
      return "death.fell.accident." + this.id;
   }
}
