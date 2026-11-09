package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;

class class07731 implements class07723 {
   private final IntArrayList N = new IntArrayList();

   public class07731(int[] var1) {
      super();
      this.N.addElements(0, var1);
   }

   @Override
   public class07723 N(class07709 var1) {
      if (var1 instanceof class07720 class07720) {
         this.N.add(class07720.B());
         return this;
      } else {
         return new class07743(this.N).N(var1);
      }
   }

   @Override
   public class07709 N() {
      return new class06995(this.N.toIntArray());
   }
}
