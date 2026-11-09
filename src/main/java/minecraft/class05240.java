package minecraft;

import com.mojang.serialization.MapCodec;

public interface class05240<P extends class05261> {
   class05240<class05243> N = N("always_true", class05243.N);
   class05240<class05244> y = N("block_match", class05244.N);
   class05240<class05256> L = N("blockstate_match", class05256.N);
   class05240<class05271> u = N("tag_match", class05271.N);
   class05240<class05258> i = N("random_block_match", class05258.N);
   class05240<class05263> R = N("random_blockstate_match", class05263.N);

   static <P extends class05261> class05240<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.m, var0, () -> var1);
   }

   MapCodec<P> codec();
}
