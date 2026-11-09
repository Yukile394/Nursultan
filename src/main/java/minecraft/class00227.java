package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Arrays;
import java.util.List;

public record class00227(List<class03556<class00225>> definitions) implements class00225 {
   public static final MapCodec<class00227> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00225.y.listOf().fieldOf("definitions").forGetter(class00227::y)).apply(var0, class00227::new)
   );

   public class00227(class00225... var1) {
      this(Arrays.stream(var1).map(class03556::N).toList());
   }

   public class00227(List<class03556<class00225>> definitions) {
      super();
      this.definitions = definitions;
   }

   public List<class03556<class00225>> y() {
      return this.definitions;
   }

   @Override
   public void y(class04782 var1) {
      this.definitions.forEach(var1x -> var1x.N().y(var1));
   }

   @Override
   public MapCodec<class00227> N() {
      return L;
   }

   @Override
   public void N(class04782 var1) {
      this.definitions.forEach(var1x -> var1x.N().N(var1));
   }
}
