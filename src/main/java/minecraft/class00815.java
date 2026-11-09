package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class00815(class05957 term) implements class05957 {
   public static final MapCodec<class00815> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05957.L.fieldOf("term").forGetter(class00815::L)).apply(var0, class00815::new)
   );

   public class05957 L() {
      return this.term;
   }

   public class00815(class05957 term) {
      super();
      this.term = term;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.term.y();
   }

   public static class05952 N(class05952 var0) {
      return () -> var0x;
   }

   public boolean test(class05908 var1) {
      return !this.term.test(var1);
   }

   @Override
   public class05955 N() {
      return class07693.N;
   }

   @Override
   public void N(class05561 var1) {
      class05957.super.N(var1);
      this.term.N(var1);
   }
}
