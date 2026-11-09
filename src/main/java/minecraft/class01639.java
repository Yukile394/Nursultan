package minecraft;

import org.jspecify.annotations.Nullable;

public class class01639 {
   public final class03345 N;
   private byte u;
   byte y;
   public final int L;

   class01639(class03345 var1, @Nullable class07211 var2, int var3) {
      super();
      this.N = var1;
      if (var2 != null) {
         this.y(var2);
      }

      this.L = var3;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class01639 class01639) ? false : this.N.M() == class01639.N.M();
   }

   @Override
   public int hashCode() {
      return Long.hashCode(this.N.M());
   }

   void y(class07211 var1) {
      this.u = (byte)(this.u | this.u | 1 << var1.ordinal());
   }

   boolean N() {
      return this.u != 0;
   }

   public boolean N(int var1) {
      return (this.u & 1 << var1) > 0;
   }

   void N(byte var1, class07211 var2) {
      this.y = (byte)(this.y | var1 | 1 << var2.ordinal());
   }

   boolean N(class07211 var1) {
      return (this.y & 1 << var1.ordinal()) > 0;
   }
}
