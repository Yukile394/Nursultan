package minecraft;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class03013(class04017 ifTrue, class03028 thenRun) implements class03028 {
   static final class03979<class03013> N = class03979.N(
      RecordCodecBuilder.mapCodec(
         var0 -> var0.group(class04017.L.fieldOf("if_true").forGetter(class03013::y), class03028.y.fieldOf("then_run").forGetter(class03013::L))
            .apply(var0, class03013::new)
      )
   );

   public class03028 L() {
      return this.thenRun;
   }

   class03013(class04017 ifTrue, class03028 thenRun) {
      this.ifTrue = ifTrue;
      this.thenRun = thenRun;
   }

   public class04017 y() {
      return this.ifTrue;
   }

   @Override
   public class03979<? extends class03028> N() {
      return N;
   }

   public class03003 apply(class04039 var1) {
      return new class03029(this.ifTrue.apply(var1), this.thenRun.apply(var1));
   }
}
