package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class05380(boolean isValid, List<class05342> records) {
   public static final Codec<class05380> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(class05380::N), class05342.N.listOf().fieldOf("Records").forGetter(class05380::y)
         )
         .apply(var0, class05380::new)
   );

   public class05380(boolean isValid, List<class05342> records) {
      super();
      this.isValid = isValid;
      this.records = records;
   }

   public List<class05342> y() {
      return this.records;
   }

   public boolean N() {
      return this.isValid;
   }

   public class05370 N(Runnable var1) {
      return new class05370(var1, this.isValid, this.records.stream().map(var1x -> var1x.N(var1)).toList());
   }
}
