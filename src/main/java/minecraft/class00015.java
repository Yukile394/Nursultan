package minecraft;

public class class00015 extends class00471<class00015> {
   private class03530<class04748> N;
   private class03556<class02195> y;
   private byte L;
   private int u;
   private boolean i;

   public class00015() {
      super();
      this.N = class00030.N;
      this.y = class00030.y;
      this.L = 2;
      this.u = 50;
      this.i = true;
   }

   @Override
   public class08122 y() {
      return new class00030(this.R(), this.N, this.y, this.L, this.u, this.i);
   }

   public class00015 N(int var1) {
      this.u = var1;
      return this;
   }

   public class00015 N(boolean var1) {
      this.i = var1;
      return this;
   }

   public class00015 N(byte var1) {
      this.L = var1;
      return this;
   }

   protected class00015 L() {
      return this;
   }

   public class00015 N(class03556<class02195> var1) {
      this.y = var1;
      return this;
   }

   public class00015 N(class03530<class04748> var1) {
      this.N = var1;
      return this;
   }
}
