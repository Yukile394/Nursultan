package minecraft;

import com.google.common.hash.HashCode;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractUniversalBuilder;
import java.util.ArrayList;
import java.util.List;

final class class00172 extends AbstractUniversalBuilder<HashCode, List<Pair<HashCode, HashCode>>> {
   public class00172(class00166 var1) {
      super(var1);
      this.y = var1;
   }

   protected List<Pair<HashCode, HashCode>> append(HashCode var1, HashCode var2, List<Pair<HashCode, HashCode>> var3) {
      var3.add(Pair.of(var1, var2));
      return var3;
   }

   protected DataResult<HashCode> build(List<Pair<HashCode, HashCode>> var1, HashCode var2) {
      if (!N && !this.y.u(var2)) {
         throw new AssertionError();
      } else {
         return DataResult.success(class00166.N(this.y.u.newHasher(), var1.stream()).hash());
      }
   }

   protected List<Pair<HashCode, HashCode>> initBuilder() {
      return new ArrayList<>();
   }
}
