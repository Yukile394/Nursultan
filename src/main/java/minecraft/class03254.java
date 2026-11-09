package minecraft;

import Nursultan.class11647;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record class03254(class03556<class03252> material, class03556<class03246> pattern) implements class02694 {
   public static final Codec<class03254> N = RecordCodecBuilder.create(
      var0 -> var0.group(class03252.L.fieldOf("material").forGetter(class03254::N), class03246.L.fieldOf("pattern").forGetter(class03254::y))
         .apply(var0, class03254::new)
   );
   public static final class02362<class04247, class03254> y = class02362.N(class03252.u, class03254::N, class03246.u, class03254::y, class03254::new);
   private static final class00392 i = class00392.L(class07536.N("item", class01894.y("smithing_template.upgrade"))).N(class06541.field_1080);

   public class03254(class03556<class03252> material, class03556<class03246> pattern) {
      super();
      this.material = material;
      this.pattern = pattern;
   }

   public class03556<class03246> y() {
      return this.pattern;
   }

   public class01894 N(String var1, class05946<class11647> var2) {
      class08569 class08569 = this.N().N().N().N(var2);
      return this.y().N().N().N((UnaryOperator<String>)(var2x -> var1 + "/" + var2x + "_" + class08569.N()));
   }

   public class03556<class03252> N() {
      return this.material;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      var2.accept(i);
      var2.accept(class05220.N().y(this.pattern.N().N(this.material)));
      var2.accept(class05220.N().y(this.material.N().y()));
   }
}
