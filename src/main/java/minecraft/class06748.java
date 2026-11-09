package minecraft;

public class class06748 implements class06723 {
   private final class06730 N;
   private boolean y;
   private long L;
   private long u;
   private boolean i;

   public boolean L() {
      return this.y;
   }

   class06748(class06730 var1) {
      super();
      this.N = var1;
   }

   public class06730 i() {
      return this.N;
   }

   public long u() {
      return this.u;
   }

   @Override
   public class06723 y() {
      this.i = true;
      return this;
   }

   public float N(long var1) {
      if (this.i) {
         long ix = this.u - this.L;
         long j = var1 - this.L;
         return 1.0F - class04995.N((float)j / (float)ix, 0.0F, 1.0F);
      } else {
         return 1.0F;
      }
   }

   @Override
   public class06723 N() {
      this.y = true;
      return this;
   }

   @Override
   public class06723 N(int var1) {
      this.L = class07536.L();
      this.u = this.L + var1;
      return this;
   }
}
