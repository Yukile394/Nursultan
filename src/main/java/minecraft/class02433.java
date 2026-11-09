package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public record class02433(
   class01894 vertexShaderId, class01894 fragmentShaderId, List<class02435> inputs, class01894 outputTarget, Map<String, List<class00069>> uniforms
) {
   private static final Codec<List<class02435>> M = class02435.N.listOf().validate(var0 -> {
      ObjectArraySet objectarrayset = new ObjectArraySet(var0.size());

      for (class02435 class02435 : var0) {
         if (!objectarrayset.add(class02435.N())) {
            return DataResult.error(() -> "Encountered repeated sampler name: " + class02435.N());
         }
      }

      return DataResult.success(var0);
   });
   private static final Codec<Map<String, List<class00069>>> B = Codec.unboundedMap(Codec.STRING, class00069.N.listOf());
   public static final Codec<class02433> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01894.N.fieldOf("vertex_shader").forGetter(class02433::y),
            class01894.N.fieldOf("fragment_shader").forGetter(class02433::L),
            M.optionalFieldOf("inputs", List.of()).forGetter(class02433::u),
            class01894.N.fieldOf("output").forGetter(class02433::i),
            B.optionalFieldOf("uniforms", Map.of()).forGetter(class02433::R)
         )
         .apply(var0, class02433::new)
   );

   public class01894 L() {
      return this.fragmentShaderId;
   }

   public class02433(
      class01894 vertexShaderId, class01894 fragmentShaderId, List<class02435> inputs, class01894 outputTarget, Map<String, List<class00069>> uniforms
   ) {
      this.vertexShaderId = vertexShaderId;
      this.fragmentShaderId = fragmentShaderId;
      this.inputs = inputs;
      this.outputTarget = outputTarget;
      this.uniforms = uniforms;
   }

   public class01894 i() {
      return this.outputTarget;
   }

   public List<class02435> u() {
      return this.inputs;
   }

   public class01894 y() {
      return this.vertexShaderId;
   }

   public Stream<class01894> N() {
      return Stream.concat(this.inputs.stream().flatMap(var0 -> var0.y().stream()), Stream.of(this.outputTarget));
   }

   public Map<String, List<class00069>> R() {
      return this.uniforms;
   }
}
