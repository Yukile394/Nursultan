package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class class03569 extends class01733 {
   public static final List<String> N = List.of(
      "Text1", "Text2", "Text3", "Text4", "FilteredText1", "FilteredText2", "FilteredText3", "FilteredText4", "Color", "GlowingText"
   );
   public static final String y = "_filtered_correct";
   private static final String L = "black";

   private static <T> Dynamic<T> L(Dynamic<T> var0) {
      return var0.emptyMap().set("messages", u(var0)).set("color", var0.createString("black")).set("has_glowing_text", var0.createBoolean(false));
   }

   public class03569(Schema var1, String var2, String var3) {
      super(var1, true, var2, class06962.G, var3);
   }

   private static <T> Dynamic<T> u(Dynamic<T> var0) {
      Dynamic dynamic = class03731.N(var0.getOps());
      return var0.createList(Stream.of(dynamic, dynamic, dynamic, dynamic));
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      Dynamic dynamic = class03731.N(var0.getOps());
      List list = N(var0, "Text").map(var1x -> var1x.orElse(dynamic)).toList();
      Dynamic dynamic1 = var0.emptyMap()
         .set("messages", var0.createList(list.stream()))
         .set("color", var0.get("Color").result().orElse(var0.createString("black")))
         .set("has_glowing_text", var0.get("GlowingText").result().orElse(var0.createBoolean(false)));
      List list1 = N(var0, "FilteredText").toList();
      if (list1.stream().anyMatch(Optional::isPresent)) {
         dynamic1 = dynamic1.set("filtered_messages", var0.createList(Streams.mapWithIndex(list1.stream(), (var1x, var2x) -> {
            Dynamic dynamic2 = (Dynamic)list.get((int)var2x);
            return var1x.orElse(dynamic2);
         })));
      }

      return dynamic1;
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      var1 = var1.set("front_text", y(var1))
         .set("back_text", L(var1))
         .set("is_waxed", var1.createBoolean(false))
         .set("_filtered_correct", var1.createBoolean(true));

      for (String s : N) {
         var1 = var1.remove(s);
      }

      return var1;
   }

   private static <T> Stream<Optional<Dynamic<T>>> N(Dynamic<T> var0, String var1) {
      return Stream.of(var0.get(var1 + "1").result(), var0.get(var1 + "2").result(), var0.get(var1 + "3").result(), var0.get(var1 + "4").result());
   }
}
