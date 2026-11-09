package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03659<T>(class03530<T> tag, boolean expected) {
   public class03659(class03530<T> tag, boolean expected) {
      super();
      this.tag = tag;
      this.expected = expected;
   }

   public boolean y() {
      return this.expected;
   }

   public static <T> class03659<T> y(class03530<T> var0) {
      return new class03659<>(var0, false);
   }

   public class03530<T> N() {
      return this.tag;
   }

   public static <T> Codec<class03659<T>> N(class05946<? extends class00751<T>> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(class03530.N(var0).fieldOf("id").forGetter(class03659::N), Codec.BOOL.fieldOf("expected").forGetter(class03659::y))
            .apply(var1, class03659::new)
      );
   }

   public static <T> class03659<T> N(class03530<T> var0) {
      return new class03659<>(var0, true);
   }

   public boolean N(class03556<T> var1) {
      return var1.N(this.tag) == this.expected;
   }
}
