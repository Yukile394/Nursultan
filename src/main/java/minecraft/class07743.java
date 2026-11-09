package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;

class class07743 implements class07723 {
   private final class07741 N = new class07741();

   public class07743(LongArrayList var1) {
      super();
      var1.forEach(var1x -> this.N.add(class07729.N(var1x)));
   }

   public class07743(ByteArrayList var1) {
      super();
      var1.forEach(var1x -> this.N.add(class07037.N(var1x)));
   }

   public class07743(IntArrayList var1) {
      super();
      var1.forEach(var1x -> this.N.add(class07720.N(var1x)));
   }

   class07743(class07741 var1) {
      super();
      this.N.addAll(var1);
   }

   class07743() {
      super();
   }

   @Override
   public class07709 N() {
      return this.N;
   }

   @Override
   public class07723 N(class07709 var1) {
      this.N.add(var1);
      return this;
   }
}
