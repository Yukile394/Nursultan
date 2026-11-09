package minecraft;

import Nursultan.class11647;
import java.util.Optional;

public class class08703 {
   private final class07085 N;
   private class03556<class04891> y = class04909.Nj;
   private Optional<class05946<class11647>> L = Optional.empty();
   private Optional<class01894> u = Optional.empty();
   private Optional<class03543<class07078<?>>> i = Optional.empty();
   private boolean R = true;
   private boolean M = true;
   private boolean B = true;
   private boolean Z;
   private boolean z;
   private class03556<class04891> U = class04206.y.i(class04909.wd);

   public class08703 L(boolean var1) {
      this.B = var1;
      return this;
   }

   class08703(class07085 var1) {
      super();
      this.N = var1;
   }

   public class08703 i(boolean var1) {
      this.z = var1;
      return this;
   }

   public class08703 u(boolean var1) {
      this.Z = var1;
      return this;
   }

   public class08703 y(boolean var1) {
      this.M = var1;
      return this;
   }

   public class08703 y(class03556<class04891> var1) {
      this.U = var1;
      return this;
   }

   public class08725 N() {
      return new class08725(this.N, this.y, this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U);
   }

   public class08703 N(class03556<class04891> var1) {
      this.y = var1;
      return this;
   }

   public class08703 N(class05946<class11647> var1) {
      this.L = Optional.of(var1);
      return this;
   }

   public class08703 N(class01894 var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public class08703 N(class07078<?>... var1) {
      return this.N(class03543.N(class07078::T, var1));
   }

   public class08703 N(class03543<class07078<?>> var1) {
      this.i = Optional.of(var1);
      return this;
   }

   public class08703 N(boolean var1) {
      this.R = var1;
      return this;
   }
}
