package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class class06682 implements class00381<class07280> {
   public static final class02362<class04247, class06682> N = class00381.N(class06682::N, class06682::new);
   private static final byte y = -128;
   private final int L;
   private final List<Pair<class07085, class06584>> u;

   public class06682(int var1, List<Pair<class07085, class06584>> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   private class06682(class04247 var1) {
      super();
      this.L = var1.E();
      this.u = Lists.newArrayList();

      byte b0;
      do {
         b0 = var1.readByte();
         class07085 class07085 = class07085.field_54086.get(b0 & 127);
         class06584 class06584 = class06584.B.decode(var1);
         this.u.add(Pair.of(class07085, class06584));
      } while ((b0 & -128) != 0);
   }

   public List<Pair<class07085, class06584>> y() {
      return this.u;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.L;
   }

   private void N(class04247 var1) {
      var1.L(this.L);
      int i = this.u.size();

      for (int j = 0; j < i; j++) {
         Pair<class07085, class06584> pair = this.u.get(j);
         class07085 class07085 = (class07085)pair.getFirst();
         boolean flag = j != i - 1;
         int k = class07085.ordinal();
         var1.writeByte(flag ? k | -128 : k);
         class06584.B.encode(var1, (class06584)pair.getSecond());
      }
   }

   @Override
   public class02897<class06682> method_65080() {
      return class04248.Nc;
   }
}
