package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;

class class07754 implements class07723 {
   private final ByteArrayList N = new ByteArrayList();

   public class07754(byte[] var1) {
      super();
      this.N.addElements(0, var1);
   }

   @Override
   public class07723 N(class07709 var1) {
      if (var1 instanceof class07037 class07037) {
         this.N.add(class07037.z());
         return this;
      } else {
         return new class07743(this.N).N(var1);
      }
   }

   @Override
   public class07709 N() {
      return new class07029(this.N.toByteArray());
   }
}
