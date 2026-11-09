package minecraft;

import java.util.Optional;

public class class00818 {
   private class00816 N;
   private class00816 y;
   private class00816 L;
   private Optional<class03543<class00780>> u;
   private Optional<class03543<class04748>> i;
   private Optional<class05946<class07299>> R;
   private Optional<Boolean> M;
   private Optional<class01393> B;
   private Optional<class01392> Z;
   private Optional<class01415> z;
   private Optional<Boolean> U;

   public class00818 L(class00816 var1) {
      this.y = var1;
      return this;
   }

   public class00818() {
      super();
      this.N = class00816.L;
      this.y = class00816.L;
      this.L = class00816.L;
      this.u = Optional.empty();
      this.i = Optional.empty();
      this.R = Optional.empty();
      this.M = Optional.empty();
      this.B = Optional.empty();
      this.Z = Optional.empty();
      this.z = Optional.empty();
      this.U = Optional.empty();
   }

   public class00818 u(class00816 var1) {
      this.L = var1;
      return this;
   }

   public class00818 y(class03543<class04748> var1) {
      this.i = Optional.of(var1);
      return this;
   }

   public class00817 y() {
      Optional<class00848> optional = class00848.N(this.N, this.y, this.L);
      return new class00817(optional, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U);
   }

   public class00818 y(boolean var1) {
      this.U = Optional.of(var1);
      return this;
   }

   public class00818 y(class05946<class07299> var1) {
      this.R = Optional.of(var1);
      return this;
   }

   public static class00818 y(class03556<class04748> var0) {
      return N().y(class03543.N(var0));
   }

   public class00818 y(class00816 var1) {
      this.N = var1;
      return this;
   }

   public class00818 N(boolean var1) {
      this.M = Optional.of(var1);
      return this;
   }

   public class00818 N(class01398 var1) {
      this.z = Optional.of(var1.y());
      return this;
   }

   public class00818 N(class01427 var1) {
      this.Z = Optional.of(var1.y());
      return this;
   }

   public static class00818 N() {
      return new class00818();
   }

   public class00818 N(class03543<class00780> var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public static class00818 N(class00816 var0) {
      return N().L(var0);
   }

   public static class00818 N(class05946<class07299> var0) {
      return N().y(var0);
   }

   public static class00818 N(class03556<class00780> var0) {
      return N().N(class03543.N(var0));
   }

   public class00818 N(class01382 var1) {
      this.B = Optional.of(var1.y());
      return this;
   }
}
