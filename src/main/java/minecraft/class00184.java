package minecraft;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.mojang.serialization.DataResult;

class class00184 extends class00173<HashCode, Hasher> {
   public class00184(class00166 var1) {
      super(var1);
      this.L = var1;
   }

   protected Hasher N() {
      return this.L.u.newHasher().putByte((byte)4);
   }

   protected DataResult<HashCode> y(Hasher var1, HashCode var2) {
      if (!y && !var2.equals(this.L.i)) {
         throw new AssertionError();
      } else {
         var1.putByte((byte)5);
         return DataResult.success(var1.hash());
      }
   }

   protected Hasher N(Hasher var1, HashCode var2) {
      return var1.putBytes(var2.asBytes());
   }
}
