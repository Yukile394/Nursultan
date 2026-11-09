package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07920<Param>(String name, class07389<Param> schema, boolean required) {
   public class07389<Param> L() {
      return this.schema;
   }

   public class07920(String var1, class07389<Param> var2) {
      this(var1, var2, true);
   }

   public class07920(String name, class07389<Param> schema, boolean required) {
      this.name = name;
      this.schema = schema;
      this.required = required;
   }

   public boolean u() {
      return this.required;
   }

   public String y() {
      return this.name;
   }

   public static <Param> MapCodec<class07920<Param>> N() {
      return RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.STRING.fieldOf("name").forGetter(class07920::y),
               class07389.N().fieldOf("schema").forGetter(class07920::L),
               Codec.BOOL.fieldOf("required").forGetter(class07920::u)
            )
            .apply(var0, class07920::new)
      );
   }
}
