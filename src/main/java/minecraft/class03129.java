package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface class03129 {
   Codec<class03129> y = class04206.NB.T().dispatch(class03129::y, Function.identity());

   MapCodec<? extends class03129> y();

   static class03120 N(class05946<class05281> var0, class04540<class05946<class05281>> var1) {
      return new class03120(var0, var1);
   }

   static class03146 N(class04540<List<class03129>> var0) {
      return new class03146(var0);
   }

   void N(class06069 var1, BiConsumer<class05946<class05281>, class05946<class05281>> var2);

   Stream<class05946<class05281>> N();

   static class03141 N(String var0, String var1) {
      return N(class01019.N(var0), class01019.N(var1));
   }

   static class03141 N(class05946<class05281> var0, class05946<class05281> var1) {
      return new class03141(var0, var1);
   }

   static class03120 N(String var0, class04540<String> var1) {
      class02136 class02136 = class04540.y();
      var1.u().forEach(var1x -> class02136.N(class01019.N((String)var1x.N()), var1x.y()));
      return N(class01019.N(var0), class02136.N());
   }
}
