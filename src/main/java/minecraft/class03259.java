package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class03259 implements class03278 {
   final class06510 N;
   final class06510 y;
   final class06510 L;
   final class03556<class03246> u;
   @Nullable
   private class02754 i;

   @Override
   public class06510 M() {
      return this.y;
   }

   public class03259(class06510 var1, class06510 var2, class06510 var3, class03556<class03246> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public Optional<class06510> B() {
      return Optional.of(this.L);
   }

   public class06584 method_8116(class02934 var1, class01929 var2) {
      return N(var2, var1.u(), var1.i(), this.u);
   }

   public static class06584 N(class01929 var0, class06584 var1, class06584 var2, class03556<class03246> var3) {
      Optional<class03556<class03252>> optional = class03270.N(var0, var2);
      if (optional.isPresent()) {
         class03254 class03254x = var1.method_58694(class02484.Nu);
         class03254 class03254x = new class03254(optional.get(), var3);
         if (Objects.equals(class03254x, class03254x)) {
            return class06584.E;
         } else {
            class06584 class06584 = var1.L(1);
            class06584.N(class02484.Nu, class03254x);
            return class06584;
         }
      } else {
         return class06584.E;
      }
   }

   @Override
   public List<class00265> N() {
      class00299 class00299xx = this.y.method_64673();
      class00299 class00299x = this.L.method_64673();
      class00299 class00299xx = this.N.method_64673();
      return List.of(new class00309(class00299xx, class00299xx, class00299x, new class00286(class00299xx, class00299x, this.u), new class00330(class06570.dC)));
   }

   @Override
   public class06514<class03259> method_8119() {
      return class06514.t;
   }

   @Override
   public class02754 method_61671() {
      if (this.i == null) {
         this.i = class02754.y(List.of(this.N, this.y, this.L));
      }

      return this.i;
   }

   @Override
   public Optional<class06510> R() {
      return Optional.of(this.N);
   }
}
