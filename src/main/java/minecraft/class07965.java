package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

record class07965(class01894 id, class03556<class07468> attribute, class07463 operation, class06378 amount, List<class02834> slots) {
   private static final Codec<List<class02834>> M = class06338.y(class06338.N(class02834.field_49226));
   public static final Codec<class07965> R = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01894.N.fieldOf("id").forGetter(class07965::N),
            class07468.N.fieldOf("attribute").forGetter(class07965::y),
            class07463.field_45742.fieldOf("operation").forGetter(class07965::L),
            class06339.N.fieldOf("amount").forGetter(class07965::u),
            M.fieldOf("slot").forGetter(class07965::i)
         )
         .apply(var0, class07965::new)
   );

   public class07463 L() {
      return this.operation;
   }

   class07965(class01894 id, class03556<class07468> attribute, class07463 operation, class06378 amount, List<class02834> slots) {
      super();
      this.id = id;
      this.attribute = attribute;
      this.operation = operation;
      this.amount = amount;
      this.slots = slots;
   }

   public List<class02834> i() {
      return this.slots;
   }

   public class06378 u() {
      return this.amount;
   }

   public class03556<class07468> y() {
      return this.attribute;
   }

   public class01894 N() {
      return this.id;
   }
}
