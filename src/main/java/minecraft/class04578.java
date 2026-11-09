package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class class04578 implements class04555 {
   private final class03063 N;
   private final Set<class04530> y = new ObjectOpenHashSet();
   private final class04587 L = new class04587();

   public class04578(LongSupplier var1, class03063 var2) {
      super();
      this.N = var2;
      this.y.add(class04553.N(var1));
      this.N();
   }

   private void N() {
      this.y.addAll(class04553.N());
      this.y.add(class04530.N("totalChunks", class02253.field_33879, this.N, class03063::R));
      this.y.add(class04530.N("renderedChunks", class02253.field_33879, this.N, class03063::d));
      this.y.add(class04530.N("lastViewDistance", class02253.field_33879, this.N, class03063::M));
      class03365 class03365 = this.N.i();
      if (class03365 != null) {
         this.y.add(class04530.N("toUpload", class02253.field_33880, class03365, class03365::M));
         this.y.add(class04530.N("freeBufferCount", class02253.field_33880, class03365, class03365::B));
         this.y.add(class04530.N("compileQueueSize", class02253.field_33880, class03365, class03365::R));
      }

      this.y.add(class04530.N("gpuUtilization", class02253.field_37416, class06202.Nq(), class06202::yE));
   }

   @Override
   public Set<class04530> N(Supplier<class04657> var1) {
      this.y.addAll(this.L.N(var1));
      return this.y;
   }
}
