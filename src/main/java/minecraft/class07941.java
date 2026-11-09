package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07941<Result>(String name, class07389<Result> schema) {
   public class07389<Result> L() {
      return this.schema;
   }

   public class07941(String name, class07389<Result> schema) {
      super();
      this.name = name;
      this.schema = schema;
   }

   public String y() {
      return this.name;
   }

   public static <Result> Codec<class07941<Result>> N() {
      return RecordCodecBuilder.create(
         var0 -> var0.group(Codec.STRING.fieldOf("name").forGetter(class07941::y), class07389.N().fieldOf("schema").forGetter(class07941::L))
            .apply(var0, class07941::new)
      );
   }
}
