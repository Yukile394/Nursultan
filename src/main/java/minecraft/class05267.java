package minecraft;

import com.mojang.serialization.MapCodec;

public interface class05267<P extends class05248> {
   class05267<class04872> N = N("single_pool_element", class04872.N);
   class05267<class04881> y = N("list_pool_element", class04881.N);
   class05267<class04861> L = N("feature_pool_element", class04861.N);
   class05267<class04869> u = N("empty_pool_element", class04869.N);
   class05267<class05057> i = N("legacy_single_pool_element", class05057.R);

   static <P extends class05248> class05267<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.NM, var0, () -> var1);
   }

   MapCodec<P> codec();
}
