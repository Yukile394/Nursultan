package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02824(class03556<class07468> attribute, class07471 modifier, class02834 slot, class02831 display) {
   public static final Codec<class02824> i = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07468.N.fieldOf("type").forGetter(class02824::N),
            class07471.N.forGetter(class02824::y),
            class02834.field_49226.optionalFieldOf("slot", class02834.field_49216).forGetter(class02824::L),
            class02831.N.optionalFieldOf("display", class02846.L).forGetter(class02824::u)
         )
         .apply(var0, class02824::new)
   );
   public static final class02362<class04247, class02824> R = class02362.N(
      class07468.y, class02824::N, class07471.L, class02824::y, class02834.field_49227, class02824::L, class02831.y, class02824::u, class02824::new
   );

   public class02834 L() {
      return this.slot;
   }

   public class02824(class03556<class07468> var1, class07471 var2, class02834 var3) {
      this(var1, var2, var3, class02831.N());
   }

   public class02824(class03556<class07468> attribute, class07471 modifier, class02834 slot, class02831 display) {
      this.attribute = attribute;
      this.modifier = modifier;
      this.slot = slot;
      this.display = display;
   }

   public class02831 u() {
      return this.display;
   }

   public class07471 y() {
      return this.modifier;
   }

   public class03556<class07468> N() {
      return this.attribute;
   }

   public boolean N(class03556<class07468> var1, class01894 var2) {
      return var1.equals(this.attribute) && this.modifier.N(var2);
   }
}
