package minecraft;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.BitSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01832 {
   private static final class02362<ByteBuf, byte[]> N = class02389.N(2048);
   private final BitSet y;
   private final BitSet L;
   private final BitSet u;
   private final BitSet i;
   private final List<byte[]> R;
   private final List<byte[]> M;

   public List<byte[]> L() {
      return this.R;
   }

   public class01832(class07321 var1, class05795 var2, @Nullable BitSet var3, @Nullable BitSet var4) {
      super();
      this.y = new BitSet();
      this.L = new BitSet();
      this.u = new BitSet();
      this.i = new BitSet();
      this.R = Lists.newArrayList();
      this.M = Lists.newArrayList();

      for (int ix = 0; ix < var2.L(); ix++) {
         if (var3 == null || var3.get(ix)) {
            this.N(var1, var2, class00772.field_9284, ix, this.y, this.u, this.R);
         }

         if (var4 == null || var4.get(ix)) {
            this.N(var1, var2, class00772.field_9282, ix, this.L, this.i, this.M);
         }
      }
   }

   public class01832(class00667 var1, int var2, int var3) {
      super();
      this.y = var1.t();
      this.L = var1.t();
      this.u = var1.t();
      this.i = var1.t();
      this.R = var1.N_16(N);
      this.M = var1.N_16(N);
   }

   public BitSet i() {
      return this.i;
   }

   public BitSet u() {
      return this.L;
   }

   public BitSet y() {
      return this.u;
   }

   public BitSet N() {
      return this.y;
   }

   private void N(class07321 var1, class05795 var2, class00772 var3, int var4, BitSet var5, BitSet var6, List<byte[]> var7) {
      class00536 class00536 = var2.N(var3).N(class01296.N(var1, var2.u() + var4));
      if (class00536 != null) {
         if (class00536.u()) {
            var6.set(var4);
         } else {
            var5.set(var4);
            var7.add(class00536.y().N());
         }
      }
   }

   public void N(class00667 var1) {
      var1.N(this.y);
      var1.N(this.L);
      var1.N(this.u);
      var1.N(this.i);
      var1.N_12(this.R, N);
      var1.N_12(this.M, N);
   }

   public List<byte[]> R() {
      return this.M;
   }
}
