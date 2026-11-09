package minecraft;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class class05993<S extends class00394> implements class06029<S, Int2IntFunction> {
   public class05993() {
      super();
   }

   public Int2IntFunction N(S var1, S var2) {
      return var2x -> {
         int i = class03063.N(var1.G(), var1.d());
         int j = class03063.N(var2.G(), var2.d());
         int k = class03042.N(i);
         int l = class03042.N(j);
         int i1 = class03042.y(i);
         int j1 = class03042.y(j);
         return class03042.N(Math.max(k, l), Math.max(i1, j1));
      };
   }

   public Int2IntFunction N(S var1) {
      return var0 -> var0;
   }

   public Int2IntFunction y() {
      return var0 -> var0;
   }
}
