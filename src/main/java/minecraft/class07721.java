package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayList;

class class07721 implements class07723 {
   private final LongArrayList N = new LongArrayList();

   public class07721(long[] var1) {
      super();
      this.N.addElements(0, var1);
   }

   @Override
   public class07723 N(class07709 var1) {
      if (var1 instanceof class07729 class07729) {
         this.N.add(class07729.M());
         return this;
      } else {
         return new class07743(this.N).N(var1);
      }
   }

   @Override
   public class07709 N() {
      return new class07757(this.N.toLongArray());
   }
}
