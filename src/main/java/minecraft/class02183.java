package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class02183(class01894 storage, class07793 path) implements class06378 {
   public static final MapCodec<class02183> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("storage").forGetter(class02183::L), class07793.N.fieldOf("path").forGetter(class02183::u))
         .apply(var0, class02183::new)
   );

   public class01894 L() {
      return this.storage;
   }

   public class02183(class01894 storage, class07793 path) {
      super();
      this.storage = storage;
      this.path = path;
   }

   public class07793 u() {
      return this.path;
   }

   @Override
   public float y(class05908 var1) {
      return this.N(var1, 0.0F).floatValue();
   }

   private Number N(class05908 var1, Number var2) {
      class07001 class07001 = var1.u().method_8503().yZ().N(this.storage);

      try {
         List list = this.path.N(class07001);
         if (list.size() == 1) {
            Object object = list.getFirst();
            if (object instanceof class07737) {
               return ((class07737)object).W();
            }
         }
      } catch (CommandSyntaxException commandsyntaxexception) {
      }

      return var2;
   }

   @Override
   public int N(class05908 var1) {
      return this.N(var1, 0).intValue();
   }

   @Override
   public class06341 N() {
      return class06339.R;
   }
}
