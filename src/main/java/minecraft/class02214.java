package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class02214(class00753 offset) implements class04025 {
   public static MapCodec<class02214> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00753.field_25123.optionalFieldOf("offset", class00753.field_11176).forGetter(class02214::M)).apply(var0, class02214::new)
   );

   public class00753 M() {
      return this.offset;
   }

   class02214(class00753 offset) {
      super();
      this.offset = offset;
   }

   @Override
   public class04054<?> N() {
      return class04054.W;
   }

   public boolean test(class05974 var1, class07209 var2) {
      return var1.method_8611(null, class00389.y().method_66507(var2));
   }
}
