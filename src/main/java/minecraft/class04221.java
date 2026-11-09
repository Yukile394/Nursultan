package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.function.BiConsumer;
import net.irisshaders.iris.pbr.texture.PBRType;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN6;

public record class04221(String sourcePath, String idPrefix) implements class04233 {
   public static final MapCodec<class04221> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("source").forGetter(class04221::y), Codec.STRING.fieldOf("prefix").forGetter(class04221::L))
         .apply(var0, class04221::new)
   );

   public String L() {
      return this.idPrefix;
   }

   public class04221(String sourcePath, String idPrefix) {
      this.sourcePath = sourcePath;
      this.idPrefix = idPrefix;
   }

   public String y() {
      return this.sourcePath;
   }

   private void N(Args var1, class01089 var2, class04205 var3) {
      BiConsumer biconsumer = (BiConsumer)var1.get(0);
      BiConsumer biconsumer1 = (var2x, var3x) -> {
         String s = PBRType.removeSuffix(var2x.N());
         if (s != null) {
            class01894 class01894 = var2x.i(s);
            if (var2.method_14486(class01894).isPresent()) {
               return;
            }
         }

         biconsumer.accept(var2x, var3x);
      };
      var1.set(0, biconsumer1);
   }

   @Override
   public void N(class01089 var1, class04205 var2) {
      class03069 class03069 = new class03069("textures/" + this.sourcePath, ".png");
      Map map = class03069.N(var1);
      ArgsN6 argsn6 = ArgsN6.of((var3x, var4) -> {
         class01894 class01894 = class03069.y(var3x).R(this.idPrefix);
         var2.N(class01894, var4);
      });
      this.N(argsn6, var1, var2);
      map.forEach(argsn6.$0());
   }

   @Override
   public MapCodec<class04221> N() {
      return y;
   }
}
