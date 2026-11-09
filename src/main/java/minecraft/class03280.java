package minecraft;

import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class03280 implements class03278 {
   final Optional<class06510> N;
   final class06510 y;
   final Optional<class06510> L;
   final class08604 u;
   @Nullable
   private class02754 i;

   @Override
   public class06510 M() {
      return this.y;
   }

   public class03280(Optional<class06510> var1, class06510 var2, Optional<class06510> var3, class08604 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public Optional<class06510> B() {
      return this.L;
   }

   @Override
   public List<class00265> N() {
      return List.of(
         new class00309(class06510.method_64980(this.N), this.y.method_64673(), class06510.method_64980(this.L), this.u.N(), new class00330(class06570.dC))
      );
   }

   public class06584 method_8116(class02934 var1, class01929 var2) {
      return this.u.N(var1.u());
   }

   @Override
   public class06514<class03280> method_8119() {
      return class06514.n;
   }

   @Override
   public class02754 method_61671() {
      if (this.i == null) {
         this.i = class02754.N(List.of(this.N, Optional.of(this.y), this.L));
      }

      return this.i;
   }

   @Override
   public Optional<class06510> R() {
      return this.N;
   }
}
