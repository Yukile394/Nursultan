package minecraft;

import Nursultan.class10096;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03005(class01894 randomName, class06055 trueAtAndBelow, class06055 falseAtAndAbove) implements class04017 {
   static final class03979<class03005> N = class03979.N(
      RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class01894.N.fieldOf("random_name").forGetter(class03005::y),
               class06055.N.fieldOf("true_at_and_below").forGetter(class03005::L),
               class06055.N.fieldOf("false_at_and_above").forGetter(class03005::u)
            )
            .apply(var0, class03005::new)
      )
   );

   public class06055 L() {
      return this.trueAtAndBelow;
   }

   class03005(class01894 randomName, class06055 trueAtAndBelow, class06055 falseAtAndAbove) {
      super();
      this.randomName = randomName;
      this.trueAtAndBelow = trueAtAndBelow;
      this.falseAtAndAbove = falseAtAndAbove;
   }

   public class06055 u() {
      return this.falseAtAndAbove;
   }

   public class01894 y() {
      return this.randomName;
   }

   @Override
   public class03979<? extends class04017> N() {
      return N;
   }

   public class04018 apply(class04039 var1) {
      int i = this.L().N(var1.B);
      int j = this.u().N(var1.B);
      class01818 class01818 = var1.R.N(this.y());
      return new class10096(this, var1, i, j, class01818);
   }
}
