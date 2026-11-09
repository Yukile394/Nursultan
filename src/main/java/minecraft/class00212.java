package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Consumer;

public class class00212 extends class00201 {
   public static final MapCodec<class00212> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05946.N(class04227.NJ).fieldOf("function").forGetter(class00212::T), class00195.N.forGetter(class00201::m))
         .apply(var0, class00212::new)
   );
   private final class05946<Consumer<class05523>> L;

   @Override
   public class00392 L() {
      return this.P().y(this.N("test_instance.description.function", this.L.N().toString())).y(this.s());
   }

   private class05946<Consumer<class05523>> T() {
      return this.L;
   }

   public class00212(class05946<Consumer<class05523>> var1, class00195<class03556<class00225>> var2) {
      super(var2);
      this.L = var1;
   }

   @Override
   protected class05216 y() {
      return class00392.L("test_instance.type.function");
   }

   @Override
   public void N(class05523 var1) {
      var1.N()
         .method_30349()
         .u(this.L)
         .map(class03529::N)
         .orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + this.L.N()))
         .accept(var1);
   }

   @Override
   public MapCodec<class00212> N() {
      return N;
   }
}
