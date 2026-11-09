package minecraft;

import java.util.Collection;

public class class05500 {
   private final class04782 N;
   private final class05492 y = class05492.N;
   private class05498 L = class04265.N();
   private class05516 u = class05516.N;
   private class05516 i = class05516.y;
   private final Collection<class05531> R;
   private boolean M = false;
   private boolean B = false;

   public class05520 L() {
      return new class05520(this.L, this.R, this.N, this.y, this.u, this.i, this.M, this.B);
   }

   private class05500(Collection<class05531> var1, class04782 var2) {
      super();
      this.R = var1;
      this.N = var2;
   }

   public class05500 y() {
      this.B = true;
      return this;
   }

   public static class05500 y(Collection<class05513> var0, class04782 var1) {
      return N(class04265.N().batch(var0), var1);
   }

   public class05500 N(class04270 var1) {
      this.u = var1;
      return this;
   }

   public class05500 N(class05516 var1) {
      this.i = var1;
      return this;
   }

   public class05500 N(class05498 var1) {
      this.L = var1;
      return this;
   }

   public static class05500 N(Collection<class05531> var0, class04782 var1) {
      return new class05500(var0, var1);
   }

   public class05500 N() {
      this.M = true;
      return this;
   }
}
